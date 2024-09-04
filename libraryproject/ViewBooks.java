//VIEWBOOKS
package libraryproject;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.*;

public class ViewBooks {

	public ViewBooks() {
		JFrame f = new JFrame("book section");
		f.setResizable(false);
		f.setSize(700, 400);
		f.setVisible(true);
//		f.setLayout(null);
		
		String data[][]=null;
		String column[]=null;
		try{
			Connection con=DataBase.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from books",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
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
//		table.setBounds(100, 200, 400, 300);
		f.add(table);
		
		JScrollPane sp=new JScrollPane(table);f.add(sp);
		table.setBackground(Color.CYAN);
		sp.setBackground(Color.BLACK);
		
//		JButton back = new JButton("BACK");
//		back.setBounds(600, 600, 100, 40);
//		f.add(back);
//		
//	

	}
	public static void main(String args[]) {
		new ViewBooks();
	}
}
