package View;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.EventListener;
import java.util.Vector;

import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import Controller.InputCont;

class SaveTmp implements ActionListener, ViewResource {

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() instanceof JButton) {
			JButton jb = (JButton) e.getSource();

			if (jb == nextBt2) {
				JOptionPane.showMessageDialog(null, "추가되었습니다.");
				tangshang.clearSelection();
				hot1Bg.clearSelection();
				hot2Bg.clearSelection();
				meatBg.clearSelection();
				sizeBg.clearSelection();
				card.next(mainMenu);
				new InputCont().saveTmp();
			}
			if (jb == cancel) {
				tangshang.clearSelection();
				hot1Bg.clearSelection();
				hot2Bg.clearSelection();
				meatBg.clearSelection();
				sizeBg.clearSelection();
				JOptionPane.showMessageDialog(null, "취소되었습니다.");
				card.next(mainMenu);
				new InputCont().cancle();
			}

		}

	}

}

class OptionHandler implements ActionListener, ViewResource {

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() instanceof JButton) {
			JButton button = (JButton) e.getSource();

			if (button == plusbeef || button == pluslamb) {

				String addOp = "└" + button.getText();
				new InputCont().addOption(addOp, 3000);

			} else {

				String addOp = "└" + button.getText();
				new InputCont().addOption(addOp, 1000);
			}
		}

	}

}

public class MainMenuHandler implements ActionListener, ViewResource {
	String mainMenuStr;
	String sizeoption;
	String hot1option;
	String hot2option;
	String meatoption;
	int priceInt;

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() instanceof JRadioButton) {
			JRadioButton radioBt = (JRadioButton) e.getSource();

			if (radioBt == small) {
				sizeoption = "(小)";
				priceInt = 15000;
			}

			if (radioBt == mid) {
				sizeoption = "(中)";
				priceInt = 19000;
			}

			if (radioBt == large) {
				sizeoption = "(大)";
				priceInt = 23000;
			}

			if (radioBt == maraShang || radioBt == maraTang) {
				mainMenuStr = radioBt.getText();
			}

			if (radioBt == hot1_1 || radioBt == hot1_2 || radioBt == hot1_3) {
				hot1option = "매운맛" + radioBt.getText();
			}

			if (radioBt == hot2_1 || radioBt == hot2_2 || radioBt == hot2_3) {
				hot2option = "/얼얼함" + radioBt.getText();
			}

			if (radioBt == beef || radioBt == lamb || radioBt == vegan) {
				meatoption = "/" + radioBt.getText();
			}

		}

		if (e.getSource() instanceof JButton) {
			JButton button = (JButton) e.getSource();
			if (button == nextBt) {

				String menuStr = mainMenuStr + sizeoption;
				String option = hot1option + hot2option + meatoption;

				Object[] my = { menuStr, priceInt, option };

				if (mainMenuStr == null || sizeoption == null || hot1option == null || hot2option == null
						|| meatoption == null) {
					JOptionPane.showMessageDialog(null, "누락된항목이있습니다");
					return;
				}

				card.next(mainMenu);
				new InputCont().play(my);
			}
		}

	}

	public void showList(Vector<Vector> allList) {

		while (model.getRowCount() > 0) {

			model.removeRow(0);

		}

		for (Vector v : allList) {

			model.addRow(v);

		}

	}

	public void showPrice(int nowPrice) {

		String s = nowPrice + "";
		price.setText(s);

	}

	public void back() {
		tangshang.clearSelection();
		hot1Bg.clearSelection();
		hot2Bg.clearSelection();
		meatBg.clearSelection();
		sizeBg.clearSelection();
		JOptionPane.showMessageDialog(null, "취소되었습니다.");
		card.next(mainMenu);
	}

}


class LastHandler implements ViewResource, ActionListener {

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() instanceof JButton) {
			JButton jb = (JButton) e.getSource();
			if (jb == delete) {
				int row = table.getSelectedRow();
				if (row == -1) {
					JOptionPane.showMessageDialog(null, "삭제할 항목을 선택해주세요.");
					return;
				}

				int no = Integer.parseInt((String) model.getValueAt(row, 0));
				String menu = ((String) model.getValueAt(row, 1));
				
				if(menu.indexOf("마라")!=-1){
				
					new InputCont().mainDel(no);
					
				}
				
				new InputCont().del(no);
			}

			
			if (jb == payment) {
				
				
				String list = new InputCont().payment();
				System.out.println(list);
				int howmuch = new InputCont().howmuch();
				
				
				if(howmuch==0){
					JOptionPane.showMessageDialog(null, "주문내역이없습니다.");
					return;
				}
				int choice = JOptionPane.showConfirmDialog(null, "주문을 확인해주세요\n"+list , "주문확인", 2);
				
				
				
				if(choice == 0) {
					
					if(JOptionPane.showConfirmDialog(null, howmuch+"원 결제하시겠습니까?", "금액확인", 2) ==0){
						
						JOptionPane.showMessageDialog(null, "주문이 완료되었습니다.");
						new InputCont().reset();
						
					}
				}
				
			}
		}

	}

}
