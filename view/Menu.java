package view;

import static res.R.m;

public class Menu implements View {

	@Override
	public void display() {
		m("∥∥∥∥∥∥∥∥∥∥"+menulist[(int)dt.get("no")]+"∥∥∥∥∥∥∥∥∥∥");	
		
		
		for(int i = 1; i<menulist.length;i++){
			

			System.out.print(i+"."+menulist[i]+" ");
			
		}
		
		m();
		m("메뉴를 선택하세요");
		
		
		
	}

}
