package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCConnectionUtil {
	private static String url;
	private static String pass;
	private static String userName;
	private static Connection con;
	private static Properties properties;
	private static String driver;

	static {

		properties = new Properties();
		try {
			properties.load(new FileInputStream("PropertiesJDBC.properties"));
		} catch (FileNotFoundException ex) {
			System.out.println("Arquivo nao encontrado");
		} catch (IOException ex) {
			System.out.println("Erro ao ler PropertiesJDBC.properties");
		}
		driver = properties.getProperty("jdbc.driver");
		url = properties.getProperty("jdbc.url");
		userName = properties.getProperty("jdbc.user");
		pass = properties.getProperty("jdbc.pass");

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, userName, pass);

		} catch (ClassNotFoundException e) {
			System.out.println("Arquivo do driver não encontrado.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		if (con == null || con.isClosed()) {
			if (properties == null) {
				openFile();
			}
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydb", "root", "MySql.321#");
		}
		return con;
	}

	private static void openFile() {
		if (properties == null || driver == null || userName == null || url == null) {
			properties = new Properties();
			try {
				properties.load(new FileInputStream("PropertiesJDBC.properties"));
			} catch (FileNotFoundException ex) {
				System.out.println("Arquivo nao encontrado");
			} catch (IOException ex) {
				System.out.println("Erro ao ler PropertiesJDBC.properties");
			}
			driver = properties.getProperty("jdbc.driver");
			url = properties.getProperty("jdbc.url");
			userName = properties.getProperty("jdbc.user");
			pass = properties.getProperty("jdbc.pass");
		}
	}
}
