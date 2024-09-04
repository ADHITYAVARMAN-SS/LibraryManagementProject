//VIEW ISSUED BOOKS
package libraryproject;
import javax.swing.*;

import java.awt.Color;
import java.sql.*;

public class ViewIssuedBook {

	public ViewIssuedBook() {
		// TODO Auto-generated constructor stub
		JFrame f = new JFrame();
		f.setVisible(true);
//		f.setLayout(null);
		f.setResizable(false);
		f.setSize(400, 400);
		
		String data[][]=null;
		String column[]=null;
		try{
			Connection con=DataBase.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from issuebooks",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=ps.executeQuery();
			
			ResultSetMetaData rsmd=rs.getMetaData();
			int cols=rsmd.getColumnCount();
			column=new String[cols];
			for(int i=1;i<=cols;i++){
				column[i-1]=rsmd.getColumnName(i);
			}
			
			rs.last();
			int rows=rs.getRow();
			rs.beforeFirst();

			data=new String[rows][cols];
			int count=0;
			while(rs.next()){
				for(int i=1;i<=cols;i++){
					data[count][i-1]=rs.getString(i);
				}
				count++;
			}
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		JTable table = new JTable(data,column);
		table.setBounds(100, 200, 400, 300);
		f.add(table);
		
		JScrollPane sp=new JScrollPane(table);f.add(sp);
		table.setBackground(Color.CYAN);
		sp.setBackground(Color.BLACK);

		
	}
	public static void main(String args[]) {
		new ViewIssuedBook();
	}
}
