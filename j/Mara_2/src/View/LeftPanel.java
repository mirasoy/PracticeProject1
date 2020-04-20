package View;

import java.awt.Color;

public class LeftPanel implements ViewResource {

	public LeftPanel() {
		// TODO Auto-generated constructor stub
		//////// 왼쪽 고정 패널 설정////////////////////
		leftpanel.setBackground(new Color(127, 23, 30));

		leftpanel.setLayout(null);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(34, 36, 432, 55);

		scrollPane.setBounds(45, 122, 405, 349);
		scrollPane.setViewportView(table);
		leftpanel.add(scrollPane);

		delete.setBounds(85, 572, 120, 42);
		delete.setBackground(Color.white);
		leftpanel.add(delete);
		payment.setBounds(250, 572, 120, 42);
		payment.setBackground(Color.white);
		leftpanel.add(payment);

		delete.addActionListener(last);
		payment.addActionListener(last);
		
		
		total.setBounds(65, 500, 120, 43);
		total.setFont(f2);
		total.setForeground(Color.white);
		leftpanel.add(total);

		price.setBounds(330, 500, 207, 43);
		price.setFont(f2);
		price.setForeground(Color.white);
		leftpanel.add(price);

		leftpanel.add(lblNewLabel_1);

	}

}
