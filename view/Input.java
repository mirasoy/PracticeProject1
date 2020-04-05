package view;

import static res.R.*;

import model.Gmodel;

public class Input implements View {

	@Override
	public void display() {
		m("∥∥∥∥∥∥∥∥∥∥" + menulist[(int) dt.get("no")] + "∥∥∥∥∥∥∥∥∥∥");

		Gmodel one = new Gmodel();

		mm("이름입력");
		one.setName(sc.next());
		mm("국어성적입력");
		
		while(true) {
		int j = sc.nextInt();
		if(j <0 || j >100) {
			m("잘못된 점수 범위 입니다. 다시 입력해주세요.");
		}else {one.setKr(j); break;}
		}
		
		
		mm("수학성적입력");
		
		while(true) {
			int j = sc.nextInt();
			if(j <0 || j >100) {
				m("잘못된 점수 범위 입니다. 다시 입력해주세요.");
			}else {one.setMath(j); break;}
			}
			
		
		mm("영어성적입력");

		while(true) {
			int j = sc.nextInt();
			if(j <0 || j >100) {
				m("잘못된 점수 범위 입니다. 다시 입력해주세요.");
			}else {one.setEn(j); break;}
			}
			
		
		
		sc.nextLine();
		one.setTotal(one.getEn() + one.getKr() + one.getMath());
		one.setAv((double)(one.getEn() + one.getKr() + one.getMath()) / (double)3.0);

		dt.put("one", one);

	}

}
