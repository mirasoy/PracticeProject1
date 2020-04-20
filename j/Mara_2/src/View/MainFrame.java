package View;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame implements ViewResource {
	JFrame frame =  new JFrame();
	
	
	public MainFrame() {
		
		////////////콘텐츠 팬설정///////////////
		frame.getContentPane();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(0, 2, 0, 0));
		frame.setBounds(100, 100, 1000, 700);
		frame.add(leftpanel);
		frame.add(rightpanel);
		frame.setTitle("마라미라마라탕");
		frame.setVisible(true);
		
	///////////////////
		new LeftPanel();
		new RightPanel();
		/////
		
		
		
	}
	
	
}
