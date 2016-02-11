package it.sininergis.sunshine.retiveData;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RetriveInformationTest {
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
			String query = "" + "with my_pilot as (select * from configurations.pilots where id = " + idPilot + " ), "
					+ "my_tb as (" + "select t2.* from my_pilot as t1, " + table + " as t2 "
					+ "where ST_Intersects(t1.spatial_constraint, t2.geom) or t1.spatial_constraint is null " + ")"
					//+ "select gid,ST_AsKML(St_translate(st_force_3d(ST_Transform(geom,4326)),0,0,height_val) ) as geom, "
					
					+ energyField + " as epgl,residential,height_val "
					+ "from my_tb where geom is not null and geom <> ''";
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
