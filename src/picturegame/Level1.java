package picturegame;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Level1 extends Frame implements ActionListener  {
	
	JFrame frame;
	JButton Answer;  // 정답 버튼
	int WIDTH =600;
	int HEIGHT =600;
	
	public Level1(){
		
	}

	public void Level1() {

		frame = new JFrame("PictureGame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton(new ImageIcon("level1.png")); // 버튼에 이미지 아이콘을 넣음
		frame.add(button);
		
		JButton button2 = new JButton(new ImageIcon("level1.png"));
		frame.add(button2);
		
		frame.setLayout(new GridLayout(1,2));  //GridLayout을 통해 버튼 배치
		
		JButton button3 = new JButton(new ImageIcon("level1.png"));
		frame.add(button3);
		
		frame.setLayout(new GridLayout(2,1));
		
		Answer = new JButton(new ImageIcon("1a.png"));
		frame.add(Answer);
		
		frame.setLayout(new GridLayout(2,2));
		
		Answer.addActionListener(this); //각 버튼에 ActionListener 추가
		button.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
	
		frame.setSize(600, 600);
		frame.setVisible(true);
		
	}
	
	 public void actionPerformed(ActionEvent e) { 
		  if (e.getSource() == Answer) { 
			 Level2 l = new Level2(); 
			 l.Level2();
		  } 
		  else {
			 PictureGame p = new PictureGame(); 
			 p.start();  
			 
			//else를 통해 Answer 버튼이 아닌 버튼들을 누를경우 PictureGame 클래스의 start()로 가게 지정
		  }
		  
	 }

}
