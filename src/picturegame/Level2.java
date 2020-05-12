package picturegame;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Level2 extends Frame implements ActionListener {

	JFrame frame;
	JButton Answer;
	int WIDTH = 600;
	int HEIGHT = 600;
	int count = 3;

	public Level2() {

	}

	public void Level2() {

		frame = new JFrame("PictureGame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setTitle("틀린그림찾기" + " [남은 목숨: " + count + "]");

		JButton button = new JButton(new ImageIcon("level2.png"));
		frame.add(button);

		Answer = new JButton(new ImageIcon("2a.png"));
		frame.add(Answer);
		frame.setLayout(new GridLayout(1, 2));

		JButton button2 = new JButton(new ImageIcon("level2.png"));
		frame.add(button2);
		frame.setLayout(new GridLayout(2, 1));

		JButton button3 = new JButton(new ImageIcon("level2.png"));
		frame.add(button3);
		frame.setLayout(new GridLayout(2, 2));

		JButton button4 = new JButton(new ImageIcon("level2.png"));
		frame.add(button4);
		frame.setLayout(new GridLayout(3, 1));

		JButton button5 = new JButton(new ImageIcon("level2.png"));
		frame.add(button5);
		frame.setLayout(new GridLayout(3, 2));

		Answer.addActionListener(this);
		button.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);

		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Answer) {
			JOptionPane.showConfirmDialog(null, "정답, 다음 스테이지로 넘어갑니다");
			Level3 l = new Level3();
			l.Level3();
		} else {
			count--;
			frame.setTitle("틀린그림찾기" + " [남은 목숨: " + count + "]");

			if (count == 0) {
				JOptionPane.showConfirmDialog(null, "게임오버, 시작화면으로 돌아갑니다");
				PictureGame p = new PictureGame();
				p.start();
			}
		}
	}

}