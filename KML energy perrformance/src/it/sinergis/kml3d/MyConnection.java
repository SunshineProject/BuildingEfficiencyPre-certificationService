package it.sinergis.kml3d;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	public static Connection get_connection() {
		Connection connection = null;
		try {
			Class.forName("org.postgresql.Driver");
			
			connection = DriverManager.getConnection(Constant.DB_JDBC, Constant.DB_USER, Constant.DB_PASSWORD);
			
			connection.setAutoCommit(false);
			return connection;
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
}
