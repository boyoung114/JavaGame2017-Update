package picturegame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class End {
	
	JFrame frame;
	int WIDTH =600;
	int HEIGHT =600;
	
	public End(){
		
	} 

	public void End() {

		frame = new JFrame("PictureGame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("End");
	
		button.addActionListener(new ActionListener() { //ActionListener를 이용해 button을 누를시 게임이 종료되게 함
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
		}
		});
		
		frame.add(button);
		
		frame.setSize(600, 600);
		frame.setVisible(true);
	}

}
