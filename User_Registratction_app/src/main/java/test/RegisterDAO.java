package test;
import java.sql.*;
public class RegisterDAO {
	public int k=0;
	public int register(UserBean ub) {
		try {
			Connection con=DBConnection.getcon();
			PreparedStatement ps=con.prepareStatement
					("insert into UserReg54 values(?,?,?,?,?,?,?)");
			ps.setString(1, ub.getuName());
			ps.setString(2, ub.getpWord());
			ps.setString(3, ub.getfName());
			ps.setString(4, ub.getlName());
			ps.setString(5, ub.getAddr());
			ps.setString(6, ub.getmId());
			ps.setLong(7, ub.getPhno());
			k=ps.executeUpdate();
			
		}catch(Exception e) {e.printStackTrace();}
		
		
		
		
		return k;
	}

}
