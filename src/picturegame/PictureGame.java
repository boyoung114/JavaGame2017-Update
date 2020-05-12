package picturegame;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PictureGame extends Frame implements ActionListener { // ActionListener와 Frame

	JFrame frame;
	JButton button;
	int WIDTH = 600;
	int HEIGHT = 600;

	public PictureGame() {

	}

	public void start() {

		frame = new JFrame("PictureGame"); // 프레임 생성
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);

		button = new JButton("start");
		frame.add(button);

		button.addActionListener(this); // button에 ActionListener를 추가시킴
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) { // if를 이용해 button이 눌러진 경우
			JOptionPane.showConfirmDialog(null, "게임을 시작합니다.");
			Level1 l = new Level1(); // Level1 클래스를 호출
			l.Level1();
		}

	}
}
