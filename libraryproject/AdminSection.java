//ADMIN SECTION
package libraryproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AdminSection {

	public AdminSection(){
		JFrame as = new JFrame();
		as.setVisible(true);
		as.setSize(800, 800);
		as.setLayout(null);   as.setResizable(false);
		as.getContentPane().setBackground(Color.pink);
		
		JLabel l1 = new JLabel("ADMIN SECTION");
		l1.setBounds(250, 100, 250, 20);
		l1.setFont(new Font("title",Font.BOLD,26));
		l1.setForeground(Color.GRAY);
		as.add(l1);
		
		JButton addlibrarian, viewlibrarian, deletelibrarian, logout;
		
		addlibrarian = new JButton("Add Librarian");
		addlibrarian.setBounds(280, 180, 150, 50);
		addlibrarian.setBackground(Color.WHITE);
		addlibrarian.setFont(new Font("add",Font.PLAIN,14));
		as.add(addlibrarian);
//		action
		addlibrarian.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				LibrarianAddSection.main(null);
				as.dispose();
			}
		});
		
		viewlibrarian = new JButton("View Librarian");
		viewlibrarian.setBounds(280, 280, 150, 50);
		viewlibrarian.setBackground(Color.WHITE);
		viewlibrarian.setFont(new Font("add",Font.PLAIN,14));
		as.add(viewlibrarian);
//		action
		viewlibrarian.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ViewLibrarian.main(null);
//				as.dispose();
			}
		});
		
		deletelibrarian = new JButton("Delete Librarian");
		deletelibrarian.setBounds(280, 380, 150, 50);
		deletelibrarian.setBackground(Color.WHITE);
		deletelibrarian.setFont(new Font("add",Font.PLAIN,14));
		as.add(deletelibrarian);
//		action
		deletelibrarian.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				DeleteLibrarian.main(null);
				as.dispose();
			}
		});
		
		logout = new JButton("LOGOUT");
		logout.setBounds(280, 480, 150, 50);
		logout.setBackground(Color.WHITE);
		logout.setFont(new Font("add",Font.BOLD,14));
		as.add(logout);
		
		logout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Launch.main(null);
				as.dispose();
			}
		});
	}
	
	public static void main(String args []) {
		new AdminSection();
	}
}
