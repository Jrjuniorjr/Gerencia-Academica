package util;

import java.sql.*;
import java.util.Properties;

public class JDBCConnectionUtil {
	private static String url;
	private static String pass;
	private static String userName;
	private static Connection con;
	private static Properties properties;
	
	
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, userName, pass);
			
		} catch (ClassNotFoundException e) {
			System.out.println("Arquivo do driver não encontrado.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException{
		if(con == null || con.isClosed()){
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, userName, pass);
		}
		return con;
	}
}
