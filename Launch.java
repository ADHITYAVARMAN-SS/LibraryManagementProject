//LAUNCH START OF PROGRAM
package libraryproject;
//av
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Launch extends JFrame{
	static JFrame frame; 
	
	public Launch() {
		// TODO Auto-generated constructor stub
		frame = new JFrame("library managemrnent");
		frame.setVisible(true);
		frame.setSize(800, 800);
		frame.setLayout(null);
		
		frame.getContentPane().setBackground(Color.pink);
		
		JButton b1,b2;
		b1 = new JButton();
	    b1.setText("Admin Login");
		b1.setBounds(300, 200, 200, 100);
		b1.setFont(new Font("button1", Font.BOLD, 15));
		frame.add(b1);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			    AdminLogin.main(null);
			    frame.dispose();
			}
		});
		b1.setBackground(Color.WHITE);
		
		
		b2 = new JButton();
		b2.setText("Librarian Login");
		b2.setBounds(300, 400, 200, 100);
		b2.setFont(new Font("button2",Font.BOLD , 15));
		frame.add(b2);   b2.setBackground(Color.WHITE);
		b2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						LibrarianLogin.main(null);
					    frame.dispose();
					}
				});
		
		JLabel l = new JLabel();
		l.setText("Library Management System");l.setFont(new Font("title", Font.PLAIN,26));
		l.setBounds(250,100,400,40);l.setForeground(Color.BLACK);
		frame.add(l);
		
	}
	public static void main(String args []) {
		new Launch();
	}
}
