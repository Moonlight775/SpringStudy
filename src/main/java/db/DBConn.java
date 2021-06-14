package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	String user = "hr";
	String pwd = "2654";
	Connection conn = null;
	
	public Connection getConn() {
		try {
			System.out.println("driver loading...");
			Class.forName(driver);
			System.out.println("connection ok");
			conn = DriverManager.getConnection(url, user, pwd);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return conn;
	}
	
	public static void main(String[] args) {
		new DBConn().getConn();
	}
	
}
