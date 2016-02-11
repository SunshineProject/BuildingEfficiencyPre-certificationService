package it.sinergis.kml3d;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class KMLGeneration {
	public static void main(String args[]) throws FileNotFoundException, UnsupportedEncodingException {
		
		String name = args[0];
		String path = args[1];
		String table = args[2];
		String idPilot = args[3];
		String energyField = args[4];
		
		ArrayList<Build_object> albo = generateBuildingObject(table, idPilot, energyField);
		if (albo == null) {
			System.out.println("error");
		}
		File file = new File(path);
		file.getParentFile().mkdirs();
		
		//String kml = generateKML(albo, name);
		PrintWriter writer = new PrintWriter(file, "UTF-8");
		generateKMLOptimize(albo, name, writer);
		//writer.print(kml);
		writer.close();
		System.out.println("OK!");
	}
	
	public static String generateKML(ArrayList<Build_object> buildings, String pilot) {
		StringBuilder placemarks = new StringBuilder("");
		for (Build_object bo : buildings) {
			//System.out.println(bo.getHeight());
			if (bo.getHeight() <= 1)
				continue;
			System.out.println(bo.getHeight());
			String object = XML_CODE.PLACEMARK;
			
			placemarks.append(String.format(object, bo.getGid() + "_" + pilot, bo.getGid() + "_" + pilot,
					bo.getStyleClass(), bo.getGeomModified()));
		}
		String folder = String.format(XML_CODE.FOLDER, placemarks.toString());
		String kmlString = String.format(XML_CODE.HEADER, XML_CODE.STYLE, folder);
		return kmlString;
		
	}
	
	public static void generateKMLOptimize(ArrayList<Build_object> buildings, String pilot, PrintWriter writer) {
		//StringBuilder placemarks = writer
		writer.println(XML_CODE.HEADER_TOP);
		writer.println(XML_CODE.STYLE);
		writer.println(XML_CODE.FOLDER_TOP);
		for (Build_object bo : buildings) {
			if (bo.getHeight() <= 1)
				continue;
			String object = XML_CODE.PLACEMARK;
			
			String placemarks = (String.format(object, bo.getGid() + "_" + pilot, bo.getGid() + "_" + pilot,
					bo.getStyleClass(), bo.getGeomModified()));
			writer.println(placemarks);
		}
		
		writer.println(XML_CODE.FOLDER_DOWN);
		writer.println(XML_CODE.HEADER_DOWN);
		
	}
	
	public static ArrayList<Build_object> generateBuildingObject(String table, String idPilot, String energyField) {
		MyConnection mc = new MyConnection();
		Connection psqlC = mc.get_connection();
		try {
			
			Statement stmt = null;
			stmt = psqlC.createStatement();
			/*
			 * ResultSet rs = stmt .executeQuery("" +
			 * "select gid,ST_AsKML(St_translate(st_force_3d(ST_Transform(geom,4326)),0,0,height_val) ) as geom,epgl,residential "
			 * + "from " + table + " where geom is not null and geom <> ''");
			 */
			String query = ""
					+ "with my_pilot as (select * from configurations.pilots where id = "
					+ idPilot
					+ " ), "
					+ "my_tb as ("
					+ "select t2.* from my_pilot as t1, "
					+ table
					+ " as t2 "
					//	+ "where ST_Intersects(t1.spatial_constraint, t2.geom) or t1.spatial_constraint is null "
					+ ")"
					+ "select gid,ST_AsKML(St_translate(st_force_3d(ST_Transform(geom,4326)),0,0,height_val) ) as geom, "
					+ energyField + " as epgl,residential,height_val "
					+ "from my_tb where geom is not null and geom <> '' and perf_value > 0 ";
			System.out.println(query);
			ResultSet rs = stmt.executeQuery(query);
			
			ArrayList<Build_object> buildings = new ArrayList<Build_object>();
			
			while (rs.next()) {
				int id = rs.getInt("gid");
				String geom = rs.getString("geom");
				double epgl = rs.getDouble("epgl");
				double height = rs.getDouble("height_val");
				boolean residential = rs.getBoolean("residential");
				//System.out.println(id);
				buildings.add(new Build_object(id, geom, epgl, residential, height));
			}
			psqlC.close();
			return buildings;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}
}
