package anonymousTask03;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

class BtnTest extends JFrame{
	public BtnTest() {
		setTitle("타이틀!!!");
		setSize(400,500);
		
		setLocationRelativeTo(null); //화면 중앙
		setResizable(false);//사이즈 조절 불가
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("종료!");
				System.exit(0);
			}
		});
	}
	
	
}

public class Main {
	public static void main(String[] args) {
		BtnTest bt = new BtnTest();
	}
}
