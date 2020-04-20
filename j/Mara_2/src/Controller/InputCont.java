package Controller;

import java.util.Vector;

import Model.SaveDao;
import Model.TmpDao;
import View.MainMenuHandler;

public class InputCont {
	
	MainMenuHandler hand = new MainMenuHandler(); 
	TmpDao tmpDao = new TmpDao(); 	
	SaveDao saveDao =  new SaveDao();
	
	
	
	public void play(Object[] my) {

		String oderMenu = (String) my[0];
		String option = (String) my[2];
		int price = (int) my[1];

		tmpDao.connect(oderMenu, price, option);
		hand.showList(tmpDao.allList());
		hand.showPrice(tmpDao.nowPrice());

	}

	public void addOption(String str, int price) {
		tmpDao.addOP(str, price);
		hand.showList(tmpDao.allList());
		hand.showPrice(tmpDao.nowPrice());

	}

	public void del(int selectedRow) {
		
		tmpDao.del(selectedRow);
		hand.showList(tmpDao.allList());
		hand.showPrice(tmpDao.nowPrice());
		
		
	}

	public void saveTmp() {
		saveDao.save();
		
		
		
	}

	public void cancle() {
		tmpDao.delall();
		hand.showList(tmpDao.allList());
		hand.showPrice(tmpDao.nowPrice());
	}

	public String payment() {
		
		Vector<Vector> bigV = tmpDao.allList();
		String listStr = "";
		
		
		for(Vector v : bigV) {
			
			String one = (String) v.get(1);
			String two = (String) v.get(2);
			String three = (String) v.get(4);
			
			
			
			if(one==null) {
				one="";
			}
			if(two==null) {
				two="";
			}
			if(three==null) {
				three="";
			}
			
			
			
			String list = one+"/"+two+"/"+three;

			listStr += list + "\n";
			
		}
		
		
		return listStr;
		
	}

	public int howmuch() {
		
		return tmpDao.nowPrice();
	}

	public void mainDel(int no) {

		if(tmpDao.mainDel(no)){
			hand.back();
		}
		hand.showList(tmpDao.allList());
		hand.showPrice(tmpDao.nowPrice());
	}

	public void reset() {
		// TODO Auto-generated method stub
		tmpDao.delall();
		tmpDao.delall2();
		hand.showList(tmpDao.allList());
		hand.showPrice(tmpDao.nowPrice());
	}

	
}
