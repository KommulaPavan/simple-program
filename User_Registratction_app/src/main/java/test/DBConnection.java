package test;
import java.sql.*;
import static test.DBinfo.*;
public class DBConnection {
	private static Connection con;
	private DBConnection() {}
	static
	{
		try {
			Class.forName(Driver);
			con=DriverManager.getConnection(dburl,uName,pWord);
			
		}catch(Exception e) {e.printStackTrace();}
	}
	public static Connection getcon() {
		return con;
	}
	
	

}
