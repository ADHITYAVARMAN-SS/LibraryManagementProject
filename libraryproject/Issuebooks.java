//ISSUE BOOKS
package libraryproject;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Issuebooks {
	JTextField tf1,tf2,tf3,tf4;
	Issuebooks(){
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setLayout(null);f.getContentPane().setBackground(Color.PINK);
		f.setSize(800, 800);
		
		JLabel title ,id,stuID,stuName,stuContact;
		title = new JLabel("Issue Books");
		title.setFont(new Font("title", Font.BOLD, 26));
		title.setBounds(250, 50, 300, 40);
		f.add(title);
		
		id = new JLabel("Book Id");
		id.setBounds(100, 150, 100, 40);
		f.add(id);
		
		stuID = new JLabel("Student ID");
		stuID.setBounds(100, 200, 100, 40);
		f.add(stuID);

		stuName = new JLabel("Student Name");
		stuName.setBounds(100, 250, 100, 40);
		f.add(stuName);

		stuContact = new JLabel("Student Contact");
		stuContact.setBounds(100, 300, 100, 40);
		f.add(stuContact);
		
		tf1 = new JTextField();
		tf1.setBounds(200, 160, 150, 30);
		f.add(tf1);

		tf2 = new JTextField();
		tf2.setBounds(200, 210, 150, 30);
		f.add(tf2);

		tf3 = new JTextField();
		tf3.setBounds(200, 260, 150, 30);
		f.add(tf3);

		tf4 = new JTextField();
		tf4.setBounds(200, 310, 150, 30);
		f.add(tf4);
		
		JButton ib = new JButton("Issue Book");
		ib.setBounds(200, 400, 100, 40);
		ib.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int bookcallno = Integer.parseInt(tf1.getText());
				int studentid = Integer.parseInt(tf2.getText());
				String studentname = tf3.getText();
				int studentcontact = Integer.parseInt(tf4.getText());
				
				if(IssueLibrary.checkBook(bookcallno)) {
					int i = IssueLibrary.save(bookcallno, studentid, studentname, studentcontact);
					if(i>0) {
						JOptionPane.showMessageDialog(f, "Successfully issued","Status",0);
					}
					else {
						JOptionPane.showMessageDialog(f, "Can't able to issue");
					}
				}
				else {
					JOptionPane.showMessageDialog(f, "book id does't exist");
				}
				
			}
		});
		f.add(ib);
		
		JButton bk = new JButton("Back");
		bk.setBounds(400, 400, 100, 40);
		f.add(bk);
		bk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new LibrarianSection();
				f.dispose();
			}
		});
		f.setResizable(false);
	}
	public static void main(String args[]) {
		new Issuebooks();
	}
}
