//LIBRARIAN LOGIN
package libraryproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LibrarianLogin {

	public LibrarianLogin() {
		// TODO Auto-generated constructor stub
		JFrame f = new JFrame("Librarian login form");
		f.setVisible(true);
		f.setLayout(null);
		f.setSize(800, 800);
		f.getContentPane().setBackground(Color.pink);
		
		JLabel user , pass, title;
		
		title = new JLabel("Librarian Login Form");
		title.setBounds(250, 100, 1500, 40);
		title.setFont(new Font(null, Font.BOLD, 30));
		title.setForeground(Color.GRAY);
		
		user = new JLabel("enter username :");
		user.setBounds(100, 200, 200, 40);
		user.setFont(new Font(null,Font.BOLD, 20));
		
		pass = new JLabel("enter password :");
		pass.setBounds(100, 300, 200, 40);
		pass.setFont(new Font(null,Font.BOLD,20));
		
		JTextField t1 = new JTextField();
		t1.setBounds(300, 200, 150, 40);
		
		JPasswordField p1 = new JPasswordField();
		p1.setBounds(300, 300, 150, 40);
		
        JButton login1,back;
        
        login1 =new JButton("Login");
        login1.setBounds(250, 400, 150, 40);
        
        login1.addActionListener(new ActionListener() {

			@SuppressWarnings({ "deprecation", "unlikely-arg-type" })
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					String username = t1.getText();
					String pass = p1.getText();
					
					if((LibrarianDataBase.check(username, pass))) {
						LibrarianSection.main(null);
						f.dispose();
					}
					else {
						JOptionPane.showMessageDialog(null, "Sorry! invlaid username or password", "invalid Entry!", 0);
						
					}
			}
		});;
        
		back = new JButton("←");
		back.setFont(new Font(null, Font.PLAIN, 30));
		back.setBounds(20, 600, 100, 50);
		back.addActionListener(new ActionListener() {			
			@Override                                                             //Action Listener Function 
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Launch.main(null);
				f.dispose();
			}
		});
		
		f.add(back);
		f.add(title);
		f.add(user);
		f.add(t1);
		f.add(pass);
		f.add(p1);
		f.add(login1);
		
		f.setResizable(false);
		
	}
	public static void main(String args[]) {
		new LibrarianLogin();	}
}
//av