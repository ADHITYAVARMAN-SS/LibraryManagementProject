//LIBRARIAN ADD SECTION
package libraryproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
public class LibrarianAddSection {
	public LibrarianAddSection() {
		// TODO Auto-generated constructor stub

		JFrame s = new JFrame();
		s.setVisible(true);
		s.setSize(800, 800); s.setLayout(null);
		s.getContentPane().setBackground(Color.pink);
		
		JLabel id,addlibrarian,name,password,email,address,contactno;
		id = new JLabel("ID");
		id.setBounds(100, 150, 250, 40);
		s.add(id);

		addlibrarian = new JLabel("ADD LIBRARIAN");
		addlibrarian.setBounds(250, 80, 250, 40);
		addlibrarian.setFont(new Font("title", Font.BOLD, 26));
		s.add(addlibrarian);
		
		name = new JLabel("Name");
		name.setBounds(100, 200, 100, 40);
		s.add(name);
		
		password = new JLabel("password");
		password.setBounds(100, 250, 100, 40);
		s.add(password);
		
		email = new JLabel("email");
		email.setBounds(100, 300, 100, 40);
		s.add(email);
		
	    address = new JLabel("address");
		address.setBounds(100, 350, 100, 40);
		s.add(address);

		contactno = new JLabel("contactno");
		contactno.setBounds(100, 400, 100, 40);
		s.add(contactno);
		
		JTextField i1, n1,e1,a1,c1;
		JPasswordField p1 ;
		
		i1 = new JTextField();
		i1.setBounds(180, 156, 150, 20);
		s.add(i1);
		
		n1 = new JTextField();
		n1.setBounds(180, 206, 150, 20);
		s.add(n1);
		
		p1 = new JPasswordField();
		p1.setBounds(180, 256, 150, 20);
		s.add(p1);
		
		e1 = new JTextField();
		e1.setBounds(180, 306, 150, 20);
		s.add(e1);
		
		a1 = new JTextField();
		a1.setBounds(180, 356, 150, 20);
		s.add(a1);
		
		c1 = new JTextField();
		c1.setBounds(180, 406, 150, 20);
		s.add(c1);
		
		JButton b1 ,add;
		add = new JButton("Add Librarian");
		add.setBounds(250, 450, 150, 40);
		s.add(add);
		add.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
	            String i = i1.getText();
				int id =Integer.parseInt(i);
				String name =n1.getText();
				String password = p1.getText();
				String email = e1.getText();
				String contactno =c1.getText();
				String address = a1.getText();
				int a =LibrarianDataBase.add(id ,name, password, email, contactno, address);
				if(a>0) {
					JOptionPane.showMessageDialog(s, "Librariab Added Successfully");
				}
				else {
					JOptionPane.showMessageDialog(s, "can't add librarian into database");
				}
				
			}
		});
		b1 = new JButton("back");
		b1.setBounds(100, 500 , 100,40);
		s.add(b1);
		b1.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
			new AdminSection();
			s.dispose();
			}
		});
		
		s.setResizable(false);
	}
	public static void main(String [] args) {
		new LibrarianAddSection();
		
		
		
	}
}
