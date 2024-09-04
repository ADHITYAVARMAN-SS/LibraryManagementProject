//LIBRARIAN DATABASE
package libraryproject;
import java.sql.*;

public class LibrarianDataBase {
	public static int add(int id ,String name ,String password,String email,String contactno,String address) {
		int status =0;
		try {
			Connection con =DataBase.getConnection();
			PreparedStatement ps = con.prepareStatement("insert INTO combobox.librariandata(id,name,password,email,contactno,address)VALUES(?,?,?,?,?,?)"); 
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, password);
			ps.setString(4, email);
			ps.setString(5, contactno);
			ps.setString(6, address);
//			ps.setString(6, name);
			
			status = ps.executeUpdate();
			con.close();
		}catch(Exception w){
			System.out.println(w);
		}
		return status;
	}
	
	public static int delete(int id) {
		int status = 0 ;
		try {
			Connection con = DataBase.getConnection();
			PreparedStatement ps = con.prepareStatement("delete  FROM combobox.librariandata where id=?");
			ps.setInt(1, id);
			status = ps.executeUpdate();
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		return status;
		
	}

	public static boolean  check(String Name , String PassWord) {
		boolean status = true;
		try {
			Connection con = DataBase.getConnection();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM combobox.librariandata where name =? and password =?");
			ps.setString(1, Name);
			ps.setString(2, PassWord);
			System.out.println(1);
			ResultSet rs = ps.executeQuery();
			status = rs.next();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}
