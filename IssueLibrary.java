//ISSUE LIBRARY
package libraryproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class IssueLibrary {
	
	public static boolean checkBook(int bookcallno){
		boolean status=false;
		try{
			Connection con=DataBase.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from books where bookcallno=?");
			ps.setInt(1,bookcallno);
		    ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
		}catch(Exception e){System.out.println("jooooo");}
		return status;
	}

	public static int save(int bookcallno,int studentid,String studentname,int studentcontact){
		int status=0;
		try{
			Connection con=DataBase.getConnection();
			
			status=updatebook(bookcallno);//updating quantity and issue
			
			if(status>=0){
			PreparedStatement ps=con.prepareStatement("insert into issuebooks(bookcallno,studentid,studentname,studentcontact) values(?,?,?,?)");
			ps.setInt(1, bookcallno);
			ps.setInt(2,studentid);
			ps.setString(3,studentname);
			ps.setInt(4,studentcontact);
			status=ps.executeUpdate();
			}
			
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static int updatebook(int bookcallno){
		int status=0;
		int quantity=0,issued=0;
		try{
			Connection con=DataBase.getConnection();
			
			PreparedStatement ps=con.prepareStatement("select quantity,issued from books where bookcallno=?");
			ps.setInt(1,bookcallno);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				quantity=rs.getInt("quantity");
				issued=rs.getInt("issued");
			}
			
			if(quantity>0){
			PreparedStatement ps2=con.prepareStatement("update books set quantity=?,issued=? where bookcallno=?");
			ps2.setInt(1,quantity-1);
			ps2.setInt(2,issued+1);
			ps2.setInt(3,bookcallno);
			
			status=ps2.executeUpdate();
			}
			con.close();
		}catch(Exception e){System.out.println("aaaaaaa");}
		return status;
	}
}