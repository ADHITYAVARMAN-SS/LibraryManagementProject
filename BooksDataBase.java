//BOOK DATABASE
package libraryproject;
import java.sql.*;

public class BooksDataBase {
	public static int insert(int BookId,String Title,String Author,String Genre,String SubGenre,String Height,String Publisher) {
		int status =0;
		try {
			Connection con = DataBase.getConnection();
			PreparedStatement ps = con.prepareStatement("insert INTO books(bookcallno,Title,Author,Genre,SubGenre,]"
					+ "Height,Publisher,quantity,issued)values(?,?,?,?,?,?,?,5,5)");
			ps.setString(7, Publisher);
			ps.setInt(1, BookId);
			ps.setString(2, Title);
			ps.setString(3, Author);
			ps.setString(4, Genre);
			ps.setString(5, Publisher);
			ps.setString(6, Height);
			
			status = ps.executeUpdate();
			con.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return status; 
	}

}
