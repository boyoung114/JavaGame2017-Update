package picturegame;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Level1 extends Frame implements ActionListener {

	JFrame frame;
	JButton Answer; // 정답 버튼
	int WIDTH = 600;
	int HEIGHT = 600;
	int count = 3;
	Timer mTimer = new Timer(10000,this);
	int mTime = 10;
	
	public Level1() {
		mTimer.start();
	}

	public void Level1() {

		frame = new JFrame("PictureGame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setTitle("틀린그림찾기" + " [남은 목숨: " + count + "]" +" [남은 시간: " + mTime + "]");

		JButton button = new JButton(new ImageIcon("level1.png")); // 버튼에 이미지 아이콘을 넣음
		frame.add(button);

		JButton button2 = new JButton(new ImageIcon("level1.png"));
		frame.add(button2);
		frame.setLayout(new GridLayout(1, 2)); // GridLayout을 통해 버튼 배치

		JButton button3 = new JButton(new ImageIcon("level1.png"));
		frame.add(button3);
		frame.setLayout(new GridLayout(2, 1));

		Answer = new JButton(new ImageIcon("1a.png"));
		frame.add(Answer);
		frame.setLayout(new GridLayout(2, 2));

		JButton button4 = new JButton(new ImageIcon("level1.png"));
		frame.add(button4);
		frame.setLayout(new GridLayout(3, 1));

		JButton button5 = new JButton(new ImageIcon("level1.png"));
		frame.add(button5);
		frame.setLayout(new GridLayout(3, 2));

		Answer.addActionListener(this); // 각 버튼에 ActionListener 추가
		button.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);

		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Answer) {
			JOptionPane.showConfirmDialog(null, "정답, 다음 스테이지로 넘어갑니다");
			Level2 l = new Level2();
			l.Level2();
		} else {
			count--;
			frame.setTitle("틀린그림찾기" + " [남은 목숨: " + count + "]" +" [남은 시간: " + mTime + "]");
			if (count == 0) {
				JOptionPane.showConfirmDialog(null, "게임오버, 시작화면으로 돌아갑니다");
				PictureGame p = new PictureGame();
				p.start();
			}

			// else를 통해 Answer 버튼이 아닌 버튼들을 누를경우 PictureGame 클래스의 start()로 가게 지정
		}
		if (mTimer == e.getSource()){
			mTime--;
			
			if (mTime <= 0){
				mTimer.stop();	
				frame.setTitle("틀린그림찾기" + " [남은 목숨: " + count + "]" +" [남은 시간: " + mTime + "]");
			}
				JOptionPane.showConfirmDialog(null, "시간초과, 시작화면으로 돌아갑니다");
				PictureGame p = new PictureGame();
				p.start();
		}
	}	
}
