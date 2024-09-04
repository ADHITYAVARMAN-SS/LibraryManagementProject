//DATABASE
package libraryproject;
import java.sql.Connection;
import java.sql.DriverManager;

public class DataBase {

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/combobox", "root", "av@siva2004");
		}
		catch(Exception e){
			e.printStackTrace();
		}		
		return con;
	}
}
