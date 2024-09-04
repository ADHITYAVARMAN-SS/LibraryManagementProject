//AddBooks 
package libraryproject;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AddBooks {
	public AddBooks() {
		JFrame f = new JFrame ("Book Add Section");
		f.setSize(600, 600);
		f.setLayout(null);
		f.setVisible(true);
		f.getContentPane().setBackground(Color.PINK);
//		f.setResizable(false);
		
		JLabel l1, id, title,author,genre,subgenre,publisher;
		l1 = new JLabel("INSERT A BOOK");
		l1.setBounds(245, 50, 300, 40);
		l1.setFont(new Font("title", Font.BOLD, 26));
		f.add(l1);
		
		id = new JLabel("BOOK ID:");
		id .setBounds(50, 150, 80, 40);
		f.add(id);
		
		title = new JLabel("Title :");
		title .setBounds(50, 200, 80, 40);
		f.add(title);

		author = new JLabel("Author :");
		author.setBounds(50, 250, 80, 40);
		f.add(author);
		
		genre = new JLabel("Genre:");
		genre .setBounds(50, 300, 80, 40);
		f.add(genre);
		
		subgenre = new JLabel("Subgenre:");
		subgenre .setBounds(50, 350, 80, 40);
		f.add(subgenre);
		
		publisher = new JLabel("Publisher:");
		publisher.setBounds(50, 400, 80, 40);
		f.add(publisher);
		
		JTextField i1,t1,a1,g1,sg1,p1;
		
		i1 = new JTextField();
		i1.setBounds(150, 150, 200, 40);
		f.add(i1);

		t1 = new JTextField();
		t1.setBounds(150, 200, 200, 40);
		f.add(t1);
		
		a1 = new JTextField();
		a1.setBounds(150, 250, 200, 40);
		f.add(a1);
		
		g1 = new JTextField();
		g1.setBounds(150, 300, 200, 40);
		f.add(g1);
		
		sg1 = new JTextField();
		sg1.setBounds(150, 350, 200, 40);
		f.add(sg1);
		
		p1 = new JTextField();
		p1.setBounds(150, 400, 200, 40);
		f.add(p1);

		JButton Add,Back;
		
		Add = new JButton("ADD BOOK");
		Add.setBounds(150, 450, 100, 40);
		f.add(Add);
		Add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String id = i1.getText();
				int i = Integer.parseInt(id);
				String Author = a1.getText();
				String Title = t1.getText();
				String Genre = g1.getText();
				String SubGenre = sg1.getText();
				String Publisher = p1.getText();
				int a = BooksDataBase.insert(i, Title, Author, Genre, SubGenre, SubGenre, Publisher);
				if(a>0) {
					JOptionPane.showMessageDialog(f, "BOOK ADDED SUCCESSFULLY", "Result", 0);
				}
				else {
					JOptionPane.showMessageDialog(f, "CAN'T ADD A BOOK ", "Result", 0);
				}
			}
		});
		
		Back = new JButton("Back");
		Back.setBounds(350, 500, 100, 40);
		f.add(Back);
		Back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				LibrarianSection.main(null);
				f.dispose();
			}
		});
	}
	public static void  main(String args[]) {
		new AddBooks();
		}
}
