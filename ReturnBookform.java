//RETURNBOOK FORM
package libraryproject;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ReturnBookform {
	public ReturnBookform() {
		// TODO Auto-generated constructor stub
		JFrame f = new JFrame();
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(null);
		
		JLabel title ,call , stuid;
		
		title = new JLabel("Return Book ");
		title .setBounds(120, 50, 100, 40); title.setFont(new Font("title", Font.BOLD, 15));
		f.add(title);
		
		call = new JLabel("Book Id No. ");
		call.setBounds(50, 100, 80, 40);
		f.add(call);
		
		stuid = new JLabel("Student Id");
		stuid.setBounds(50, 200, 80, 40);
		f.add(stuid);
		
		JTextField tf1,tf2 ;
		tf1 = new JTextField();
		tf1.setBounds(150, 110, 150, 25);
		f.add(tf1);
		
		tf2 = new JTextField();
		tf2.setBounds(150, 210, 150, 25);
		f.add(tf2);
		
		JButton bk = new JButton("Back");
		bk.setBounds(250, 300, 100, 40);
		f.add(bk);
		bk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new LibrarianSection();
				f.dispose();
			}
		});
		
		JButton ib = new JButton("Issue Book");
		ib.setBounds(100, 300, 100, 40);
		ib.addActionListener(new  ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int bookcallno = Integer.parseInt(tf1.getText());
				int studentid = Integer.parseInt(tf2.getText());
				
				int i = ReturnDataBase.delete(bookcallno, studentid);
				if(i>0) {
					JOptionPane.showMessageDialog(f,"Book returned Sucessfully");
					LibrarianSection.main(null);
					f.dispose();
				}
				else {
					JOptionPane.showMessageDialog(f, "Can't Return Book");
				}
			}
		});
		f.add(ib);
		f.setResizable(false);
	}
	public static void main(String args[]) {
		new ReturnBookform();
	}

}
