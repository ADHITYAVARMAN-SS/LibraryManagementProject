//DELETE LIBRARIAN
package libraryproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DeleteLibrarian {

	public DeleteLibrarian() {

		/**/		JFrame f = new JFrame();
					f.setSize(400,400);
					f.setVisible(true);
					f.setLayout(null);
					f.setResizable(false);
		
					JLabel l1 = new JLabel("Enter ID :");
					l1.setBounds(60, 100, 100, 40);
					f.add(l1);
		
					JTextField t1 = new JTextField();
					t1.setBounds(150, 100, 150, 40);
					f.add(t1);
		
					JButton b,b1; 
					b = new JButton("DELETE");
					b.setBounds(150, 180, 100, 30);
					f.add(b);
					b.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							String dbID = t1.getText();		
							if (dbID == null || dbID == "") {
								JOptionPane.showMessageDialog(f, "Id can't be blank","Result", 0);
							}
							else {
								int id = Integer.parseInt(dbID);
								System.out.println(id);
								int i = LibrarianDataBase.delete(id);
								if(i>0) {
									JOptionPane.showMessageDialog(f, "Deleted Successfully", "Result", 0);
								}
								else {
									JOptionPane.showMessageDialog(f, "cant delete or no data found", "RESULT", 0);
								}
							}
						}
					});
					

					b1 = new JButton("back");
					b1.setBounds(20, 250 , 100,40);
					f.add(b1);
					b1.addActionListener(new ActionListener() {
						@Override 
						public void actionPerformed(ActionEvent e) {
						new AdminSection();
						f.dispose();
						}
					});
		
	}

	public static void main(String args[]) {
		new DeleteLibrarian();
	}
}
