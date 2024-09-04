//ADMIN LOGIN
package libraryproject;
//av
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class AdminLogin {

	public AdminLogin() {
		// TODO Auto-generated constructor stub
		

			JFrame f = new JFrame("Admin login form");
			f.setFont(new Font("title",Font.BOLD,20));
			f.setSize(800,800);
			f.setLayout(null);
			f.setVisible(true);
			f.getContentPane().setBackground(Color.pink);
			
			JLabel user,pass,head;
			
			head = new JLabel();
			head.setText("Admin Login Page");head.setFont(new Font("head", Font.PLAIN,26));
			head.setBounds(250,100,400,40);head.setForeground(Color.GRAY);

			user = new JLabel();
			user.setText("Username : ");
			user.setBounds(100, 200, 1500, 40);
			user.setFont(new Font("user", Font.BOLD, 20));
			
			pass = new JLabel();
			pass.setText("Password : ");
			pass.setBounds(100, 300, 1500, 40);
			pass.setFont(new Font("pass", Font.BOLD, 20));
			

			JTextField j1 = new JTextField();
			j1.setBounds(250, 200, 150, 40);
			
			JPasswordField p1 = new JPasswordField();
			p1.setBounds(250, 300, 150, 40);
			
			
			JButton loign ,back;
			
			loign = new JButton("Login");
			loign.setFont(new Font("Login", Font.BOLD, 20));
			loign.setBounds(300, 400, 150, 40);
			
			loign.addActionListener(new ActionListener() {
			
				@SuppressWarnings("deprecation")
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String username = j1.getText();
					String password = p1.getText();
//					manual user and password is given * need to create a database in sql
					if(username.equals("Admin") && password.equals("admin123")) {
						new AdminSection();
						f.dispose();
					}
					else {
						
						JOptionPane.showMessageDialog( null, "Sorry, Username or Password Error","Invalid Entry!",0);
						
					}
				}
			});;
			
			back = new JButton("←");
			back.setFont(new Font(null, Font.PLAIN, 30));
			back.setBounds(20, 600, 100, 50);
			
			back.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					Launch.main(null);
					f.dispose();
				}
			});
			f.add(back);
			f.add(loign);
			f.add(user);
			f.add(pass);
			f.add(head);
			
			f.add(j1);
			f.add(p1);

			f.setResizable(false);
		
	}
	public static void main(String args[]) {
		new AdminLogin();
	}
}
