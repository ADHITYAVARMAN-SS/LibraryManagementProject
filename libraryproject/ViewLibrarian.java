//VIEW LIBRARIAN CODE
package libraryproject;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ViewLibrarian {

	public ViewLibrarian() {
		JFrame f = new JFrame("view section");

		
		String data[][]=null;
		String column[]=null;
		try{
			Connection con=DataBase.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from librariandata",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
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
		table.setBounds(40, 170, 530, 80);
		
		DefaultTableCellRenderer rightrendered = new DefaultTableCellRenderer();
		rightrendered.setHorizontalAlignment(SwingConstants.CENTER);
		table.getColumnModel().getColumn(0).setCellRenderer(rightrendered);
		f.add(table);
		
		JScrollPane sp=new JScrollPane(table);
		f.add(sp);
		table.setBackground(Color.CYAN);
		sp.setBackground(Color.BLACK);
//		f.setResizable(false);
		
//		JButton n = new JButton("back");
//		n.setBounds(100,100,100,40);
//		f.add(n);
//		
		f.setSize(400, 400);
		f.setVisible(true);
		f.setLayout(null);
	}
	public static void main(String args[]) {
		new ViewLibrarian();
	}
}
