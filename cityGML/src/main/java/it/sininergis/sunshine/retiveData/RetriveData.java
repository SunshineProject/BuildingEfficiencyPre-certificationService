package it.sininergis.sunshine.retiveData;

import it.sinergis.modelloBuilding.MyBuilding;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.StringTokenizer;

import org.postgis.MultiPolygon;
import org.postgis.PGgeometry;

public class RetriveData {
	
	public static LinkedList<MyBuilding> getBuildingList(String pilot) {
		Connection psqlC = MyConnection.get_connection();
		LinkedList<MyBuilding> buildings = new LinkedList<MyBuilding>();
		
		try {
			String query = "select *,  st_area(geom) as area_computed from " + pilot
					+ ".building where height_val is not null " + "limit 10 ";
			
			query = "select *,  st_area(geom) as area_computed from ferrara.building where height_val is not null \r\n"
					+ "and u_wall is not null  and floors > 0\r\n" + "order by geom,refurbishm\r\n" + "limit 20  ";
			
			query = "with uses as (	"
					+ "select id_building, string_agg(use_value::character varying,'|') as usi  from ferrara.currentuse "
					+ "group by id_building ) "
					+ "select *,  st_area(geom) as area_computed , usi from ferrara.building as building"
					+ "	left join uses on  building.gid= uses.id_building " +
					
					"	where height_val is not null and u_wall is not null  and floors >0" + "	limit 20";
			
			//cambiare la query per leggere l'area della tabllea invece che farsela ritornare come valore 
			Statement stmt = null;
			stmt = psqlC.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			System.out.print("e");
			//mb.set
			
			while (rs.next()) {
				MyBuilding mb = new MyBuilding();
				mb.setId(rs.getLong("gid"));
				mb.setMultiPolygon((MultiPolygon) ((PGgeometry) rs.getObject("geom")).getGeometry());
				mb.setNature(rs.getString("nature"));
				mb.setBegin((Integer) rs.getObject("begin"));
				mb.setEnd((Integer) rs.getObject("end"));
				mb.setRefurbishmentlevel((String) rs.getObject("refurbishm"));
				mb.setHeight_val((Double) rs.getObject("height_val"));
				mb.setElev_val((Double) rs.getObject("elev_val"));
				mb.setFloor((Integer) rs.getObject("floors"));
				mb.setBdg_units((Integer) rs.getObject("bdg_units"));
				mb.setTypology((String) rs.getObject("typology"));
				mb.setU_wall((Double) rs.getObject("u_wall"));
				mb.setU_roof((Double) rs.getObject("u_roof"));
				mb.setU_floor((Double) rs.getObject("u_floor"));
				mb.setDelta_u((Double) rs.getObject("delta_u"));
				mb.setArea((Double) rs.getObject("area_computed"));
				
				StringTokenizer token = new StringTokenizer((String) rs.getObject("usi"), "|");
				LinkedList<String> usi = new LinkedList<String>();
				while (token.hasMoreTokens()) {
					String t = token.nextToken().trim();
					if (t.length() > 0) {
						usi.add(t);
					}
				}
				mb.setUsages(usi);;
				
				System.out.println(mb.getU_wall());
				buildings.add(mb);
				//mb.set				
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
		return buildings;
		
	}
	
	public static void main(String args[]) {
		getBuildingList("ferrara");
		
	}
	
}
