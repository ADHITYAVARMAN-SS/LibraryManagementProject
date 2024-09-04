//LIBRARIAN SECTION
package libraryproject;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LibrarianSection {

	public LibrarianSection() {
		JFrame f  = new JFrame("Librarian section");
		f.setSize(800, 800);
		f.setVisible(true);
		f.setLayout(null);
		f.getContentPane().setBackground(Color.pink);
		
		JLabel title = new JLabel("LIBRARIAN SECTION");
		title.setFont(new Font("Title",Font.BOLD ,26));
		title.setBounds(210, 50, 300, 50);
		f.add(title);
		
		JButton addbk,viewbk,issuebk,viewissuebk,returnbk,logout;
		
		addbk =  new JButton("Add Book");
		addbk.setBounds(260, 150, 150, 60);
		f.add(addbk);
		addbk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AddBooks.main(null);
				f.dispose();
			}
		});
		
		viewbk = new JButton("View Books");
		viewbk.setBounds(260, 250, 150, 60);
		f.add(viewbk);
		viewbk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ViewBooks.main(null); 
			}
		});
		
		issuebk = new JButton("Issue Book");
		issuebk.setBounds(260, 350, 150, 60);
		f.add(issuebk);
		issuebk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Issuebooks.main(null);
				f.dispose();
			}
		});
		
		viewissuebk = new JButton("View Issued Book");
		viewissuebk.setBounds(260, 450, 150, 60);
		f.add(viewissuebk);
		viewissuebk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ViewIssuedBook.main(null);
//				f.dispose();
			}
		});
		
		returnbk = new JButton("Return Book");
		returnbk.setBounds(260, 550, 150, 60);
		f.add(returnbk);
		returnbk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ReturnBookform.main(null);
				f.dispose();
			}
		});
		logout = new JButton("LOGOUT");
		logout.setBounds(260, 650, 150, 60);
		f.add(logout);
		
		logout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Launch.main(null);
				f.dispose();
			}
		});
	}
	public static void main(String args[]) {
		new LibrarianSection();	}
}
