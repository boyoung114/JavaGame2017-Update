package picturegame;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Level3 extends Frame implements ActionListener {

	JFrame frame;
	JButton Answer;
	int WIDTH =600;
	int HEIGHT =600;
	
	public Level3(){
		
	} 
	
	public void Level3() {
		
		frame = new JFrame("PictureGame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton(new ImageIcon("level3.png"));
		frame.add(button);
		
		Answer = new JButton(new ImageIcon("3a.png"));
		frame.add(Answer);
		
		frame.setLayout(new GridLayout(1,2));
		
		JButton button3 = new JButton(new ImageIcon("level3.png"));
		frame.add(button3);
		
		frame.setLayout(new GridLayout(2,1));
		
		JButton button4 = new JButton(new ImageIcon("level3.png"));
		frame.add(button4);
		
		frame.setLayout(new GridLayout(2,2));
		
		Answer.addActionListener(this);
		button.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
	
	
		frame.setSize(600, 600);
		frame.setVisible(true);

	}
	
	 public void actionPerformed(ActionEvent e) { 
		  if (e.getSource() == Answer) { 
			 End end = new End(); 
			 end.End();
		  } 
		  
		  else {
				 PictureGame p = new PictureGame(); 
				 p.start();  
			  }
	 }

}
