package View;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

public class RightPanel implements ViewResource {
	public void mainFirst() {

		tangshang.add(maraTang);
		tangshang.add(maraShang);
		
		maraShang.setBackground(new Color(255, 255, 255));
		maraShang.setBounds(65, 169, 121, 23);
		rightpanel_1.add(maraShang);
		
		maraTang.setBackground(new Color(255, 255, 255));
		maraTang.setBounds(245, 169, 121, 23);
		rightpanel_1.add(maraTang);
		
		tangImage.setBounds(39, 35, 150, 100);
		rightpanel_1.add(tangImage);
		shangImage.setBounds(207, 35, 150, 100);
		rightpanel_1.add(shangImage);
		
		maraTang.addActionListener(hand);
		maraShang.addActionListener(hand);
		
		
		////deco
		
		decoP.setBackground(new Color(127, 23, 30));
		decoP.setBounds(396, 0, 96, 661);
		rightpanel_1.add(decoP);
		

		JLabel deco1 = new JLabel(new ImageIcon("deco.jpg"));
		deco1.setSize(96,661);
		decoP.add(deco1);
			
		
		
		////////////size
		
		
		sizepanel.setForeground(new Color(0, 0, 0));
		sizepanel.setLayout(null);
		sizepanel.setBackground(new Color(255, 182, 193));
		sizepanel.setBounds(0, 225, 397, 68);
		rightpanel_1.add(sizepanel);
		
		sizeBg.add(large);
		sizeBg.add(mid);
		sizeBg.add(small);
		
		large.setForeground(new Color(0, 0, 0));
		large.setBackground(new Color(255, 182, 193));
		large.setBounds(25, 36, 99, 23);
		sizepanel.add(large);
		
		mid.setForeground(new Color(0, 0, 0));
		mid.setBackground(new Color(255, 182, 193));
		mid.setBounds(149, 36, 99, 23);
		sizepanel.add(mid);
		
		small.setForeground(new Color(0, 0, 0));
		small.setBackground(new Color(255, 182, 193));
		small.setBounds(273, 36, 99, 23);
		sizepanel.add(small);
		
		large.addActionListener(hand);
		mid.addActionListener(hand);
		small.addActionListener(hand);
		
		
		sizelabel.setBackground(new Color(255, 182, 193));
		sizelabel.setForeground(new Color(0, 0, 0));
		sizelabel.setBounds(180, 9, 64, 15);
		sizepanel.add(sizelabel);
		
		///////////매운맛 1
		hot1Bg.add(hot1_1);
		hot1Bg.add(hot1_2);
		hot1Bg.add(hot1_3);
		hot1panel.setBackground(new Color(204, 51, 51));
		hot1panel.setBounds(0, 303, 397, 68);
		rightpanel_1.add(hot1panel);
		hot1panel.setLayout(null);
		
		hot1_1.setForeground(new Color(255, 255, 255));
		hot1_1.setBackground(new Color(204, 51, 51));
		hot1_1.setBounds(25, 36, 99, 23);
		hot1panel.add(hot1_1);
		
		hot1_2.setForeground(new Color(255, 255, 255));
		hot1_2.setBackground(new Color(204, 51, 51));
		hot1_2.setBounds(149, 36, 99, 23);
		hot1panel.add(hot1_2);
		
		hot1_3.setForeground(new Color(255, 255, 255));
		hot1_3.setBackground(new Color(204, 51, 51));
		hot1_3.setBounds(273, 36, 99, 23);
		hot1panel.add(hot1_3);
		
		HotLabel.setForeground(new Color(255, 255, 255));
		HotLabel.setBounds(180, 9, 64, 15);
		hot1panel.add(HotLabel);

		
		hot1_1.addActionListener(hand);
		hot1_2.addActionListener(hand);
		hot1_3.addActionListener(hand);
		
		////매운맛 2//
		
		hot2Bg.add(hot2_1);
		hot2Bg.add(hot2_2);
		hot2Bg.add(hot2_3);
		hot2panel.setLayout(null);
		hot2panel.setBackground(new Color(204, 0, 0));
		hot2panel.setBounds(0, 381, 397, 68);
		rightpanel_1.add(hot2panel);
		
		hot2_1.setForeground(Color.WHITE);
		hot2_1.setBackground(new Color(204, 0, 0));
		hot2_1.setBounds(25, 36, 99, 23);
		hot2panel.add(hot2_1);
		
		hot2_2.setForeground(Color.WHITE);
		hot2_2.setBackground(new Color(204, 0, 0));
		hot2_2.setBounds(149, 36, 99, 23);
		hot2panel.add(hot2_2);
		
		hot2_3.setForeground(Color.WHITE);
		hot2_3.setBackground(new Color(204, 0, 0));
		hot2_3.setBounds(273, 36, 99, 23);
		hot2panel.add(hot2_3);
		
		hot2label_1.setBackground(new Color(204, 0, 0));
		hot2label_1.setForeground(Color.WHITE);
		hot2label_1.setBounds(173, 12, 64, 15);
		hot2panel.add(hot2label_1);
		
		
		hot2_1.addActionListener(hand);
		hot2_2.addActionListener(hand);
		hot2_3.addActionListener(hand);
		
		//////고기고기
		
		meatBg.add(beef);
		meatBg.add(lamb);
		meatBg.add(vegan);		
		
		meatPanel.setLayout(null);
		meatPanel.setBackground(new Color(153, 0, 0));
		meatPanel.setBounds(0, 459, 397, 68);
		rightpanel_1.add(meatPanel);
		
		beef.setForeground(Color.WHITE);
		beef.setBackground(new Color(153, 0, 0));
		beef.setBounds(25, 35, 99, 23);
		meatPanel.add(beef);
		
		lamb.setForeground(Color.WHITE);
		lamb.setBackground(new Color(153, 0, 0));
		lamb.setBounds(125, 35, 90, 23);
		meatPanel.add(lamb);
		
		vegan.setForeground(Color.WHITE);
		vegan.setBackground(new Color(153, 0, 0));
		vegan.setBounds(211, 35, 151, 23);
		meatPanel.add(vegan);
		
		label_2.setBackground(new Color(153, 0, 0));
		label_2.setForeground(Color.WHITE);
		label_2.setBounds(183, 12, 64, 15);
		meatPanel.add(label_2);
		
		beef.addActionListener(hand);
		lamb.addActionListener(hand);
		vegan.addActionListener(hand);
		///다음단계
		nextBt.setForeground(new Color(255, 255, 255));
		nextBt.setBackground(new Color(139, 0, 0));
		nextBt.setBounds(252, 551, 121, 42);
		rightpanel_1.add(nextBt);
		
		
		nextBt.addActionListener(hand);
		
//		mainMenu.add(rightpanel_1);
	}
	
	public void mainSecond() {

		decoP2.setBackground(new Color(127, 23, 30));
		decoP2.setBounds(396, 0, 96, 661);
		
		JLabel deco2 = new JLabel(new ImageIcon("deco.jpg"));
		deco2.setSize(96,661);
		rightpanel_2.add(decoP2);
			decoP2.add(deco2);
			
			
		rightpanel_2.setBackground(new Color(255, 255, 255));
		rightpanel_2.setLayout(null);
		
		nextBt2.setForeground(new Color(255, 255, 255));
		nextBt2.setBackground(new Color(139, 0, 0));
		nextBt2.setBounds(252, 551, 121, 42);
		rightpanel_2.add(nextBt2);
		
		
		
		cancel.setForeground(Color.WHITE);
		cancel.setBackground(new Color(139, 0, 0));
		cancel.setBounds(51, 551, 121, 42);
		rightpanel_2.add(cancel);
		nextBt2.addActionListener(saveTmp);
		cancel.addActionListener(saveTmp);
		
		/////////옵션들///
		lb_info.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 20));
		lb_info.setHorizontalAlignment(SwingConstants.CENTER);
		lb_info.setBounds(12, 16, 361, 58);
		rightpanel_2.add(lb_info);
		
		lb_info2.setBounds(12, 73, 372, 42);
		rightpanel_2.add(lb_info2);
		
		optionPanel.setBackground(new Color(255, 255, 255));
		optionPanel.setBounds(0, 118, 397, 342);
		rightpanel_2.add(optionPanel);
		optionPanel.setLayout(null);
		
		op1.setForeground(new Color(255, 255, 255));
		op1.setBackground(new Color(178, 34, 34));
		op1.setBounds(26, 21, 97, 23);
		optionPanel.add(op1);
		
		op2.setForeground(Color.WHITE);
		op2.setBackground(new Color(178, 34, 34));
		op2.setBounds(149, 21, 97, 23);
		optionPanel.add(op2);
		
		op3.setForeground(Color.WHITE);
		op3.setBackground(new Color(178, 34, 34));
		op3.setBounds(272, 21, 97, 23);
		optionPanel.add(op3);
		
		op4.setForeground(Color.WHITE);
		op4.setBackground(new Color(178, 34, 34));
		op4.setBounds(272, 68, 97, 23);
		optionPanel.add(op4);
		
		op5.setForeground(Color.WHITE);
		op5.setBackground(new Color(178, 34, 34));
		op5.setBounds(149, 68, 97, 23);
		optionPanel.add(op5);
		
		op6.setForeground(Color.WHITE);
		op6.setBackground(new Color(178, 34, 34));
		op6.setBounds(26, 68, 97, 23);
		optionPanel.add(op6);
		
		op7.setForeground(Color.WHITE);
		op7.setBackground(new Color(178, 34, 34));
		op7.setBounds(272, 117, 97, 23);
		optionPanel.add(op7);
		
		op8.setForeground(Color.WHITE);
		op8.setBackground(new Color(178, 34, 34));
		op8.setBounds(149, 117, 97, 23);
		optionPanel.add(op8);
		
		op9.setForeground(Color.WHITE);
		op9.setBackground(new Color(178, 34, 34));
		op9.setBounds(26, 117, 97, 23);
		optionPanel.add(op9);
		
		op10.setForeground(Color.WHITE);
		op10.setBackground(new Color(178, 34, 34));
		op10.setBounds(272, 166, 97, 23);
		optionPanel.add(op10);
		
		op11.setForeground(Color.WHITE);
		op11.setBackground(new Color(178, 34, 34));
		op11.setBounds(149, 166, 97, 23);
		optionPanel.add(op11);
		
		op12.setForeground(Color.WHITE);
		op12.setBackground(new Color(178, 34, 34));
		op12.setBounds(26, 166, 97, 23);
		optionPanel.add(op12);
		
		op13.setForeground(Color.WHITE);
		op13.setBackground(new Color(178, 34, 34));
		op13.setBounds(272, 260, 97, 23);
		optionPanel.add(op13);
		
		op14.setForeground(Color.WHITE);
		op14.setBackground(new Color(178, 34, 34));
		op14.setBounds(149, 260, 97, 23);
		optionPanel.add(op14);
		
		op15.setForeground(Color.WHITE);
		op15.setBackground(new Color(178, 34, 34));
		op15.setBounds(149, 211, 97, 23);
		optionPanel.add(op15);
		
		op16.setForeground(Color.WHITE);
		op16.setBackground(new Color(178, 34, 34));
		op16.setBounds(272, 211, 97, 23);
		optionPanel.add(op16);
		
		op17.setForeground(Color.WHITE);
		op17.setBackground(new Color(178, 34, 34));
		op17.setBounds(26, 211, 97, 23);
		optionPanel.add(op17);
		
		op18.setForeground(Color.WHITE);
		op18.setBackground(new Color(178, 34, 34));
		op18.setBounds(26, 260, 97, 23);
		optionPanel.add(op18);
		
		op19.setForeground(Color.WHITE);
		op19.setBackground(new Color(178, 34, 34));
		op19.setBounds(26, 304, 97, 23);
		optionPanel.add(op19);
		
		op20.setForeground(Color.WHITE);
		op20.setBackground(new Color(178, 34, 34));
		op20.setBounds(149, 304, 97, 23);
		optionPanel.add(op20);
		
		op21.setForeground(Color.WHITE);
		op21.setBackground(new Color(178, 34, 34));
		op21.setBounds(272, 304, 97, 23);
		optionPanel.add(op21);
		
		op1.addActionListener(oph);
		op2.addActionListener(oph);
		op3.addActionListener(oph);
		op4.addActionListener(oph);
		op5.addActionListener(oph);
		op6.addActionListener(oph);
		op7.addActionListener(oph);
		op8.addActionListener(oph);
		op9.addActionListener(oph);
		op10.addActionListener(oph);
		op11.addActionListener(oph);
		op12.addActionListener(oph);
		op13.addActionListener(oph);
		op14.addActionListener(oph);
		op15.addActionListener(oph);
		op16.addActionListener(oph);
		op17.addActionListener(oph);
		op18.addActionListener(oph);
		op19.addActionListener(oph);
		op20.addActionListener(oph);
		op21.addActionListener(oph);
		
		
		///옵션들끝///
		///고기추가옵션
		
		meetPlusPanel.setBounds(0, 460, 397, 67);
		rightpanel_2.add(meetPlusPanel);
		meetPlusPanel.setLayout(null);
		
		plusbeef.setForeground(Color.WHITE);
		plusbeef.setBackground(new Color(178, 34, 34));
		plusbeef.setBounds(91, 34, 97, 23);
		meetPlusPanel.add(plusbeef);
		
		pluslamb.setForeground(Color.WHITE);
		pluslamb.setBackground(new Color(178, 34, 34));
		pluslamb.setBounds(214, 34, 97, 23);
		meetPlusPanel.add(pluslamb);
		
		lbmeetplus.setBounds(132, 10, 155, 15);
		meetPlusPanel.add(lbmeetplus);
		plusbeef.addActionListener(oph);
		pluslamb.addActionListener(oph);
	}
	
	public RightPanel() {
		mainFirst() ;
		mainSecond() ;

		mainMenu.setLayout(card);
		mainMenu.add(rightpanel_1);
		mainMenu.add(rightpanel_2);
		
		
		rightpanel_1.setBackground(new Color(255, 255, 255));
		rightpanel_1.setLayout(null);
		
		
		//////
		rightpanel.setSize(500, 350);
		rightpanel.setLayout(new GridLayout(1,1));
		rightpanel.add(right, BorderLayout.CENTER);
		right.addTab("메인메뉴 - 마라", mainMenu);
		
	}


}
