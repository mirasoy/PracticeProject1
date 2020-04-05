package model;

import static res.R.*;

import control.Crt;

public class Dao {

	private final int MAX = 100;
	private int idx;
	private int top = 0;
	private Gmodel[] gArr = new Gmodel[MAX];
	private Gmodel[] rankArr = new Gmodel[MAX];

	private Dao() {
	}

	private static Dao daoins;

	public static Dao getIns() {
		if (daoins == null) {

			daoins = new Dao();
		}
		return daoins;
	}

	public boolean empty() {

		if (top == 0) {
			m("입력된 정보가 없습니다.");
			return false;
		}
		return true;
	}

	public void makeR() {

		for (int i = 0; i < top; i++) {
			Gmodel g = new Gmodel();
			g.setName(gArr[i].getName());
			g.setTotal(gArr[i].getTotal());
			g.setAv(gArr[i].getAv());
			g.setEn(gArr[i].getEn());
			g.setIdx(gArr[i].getIdx());
			g.setKr(gArr[i].getKr());
			g.setMath(gArr[i].getMath());
			g.setRank(gArr[i].getRank());
			rankArr[i] = g;
		}
		
		
		for (int i = 0; i < top; i++) {
			for (int j = 0; i + j < top; j++) {
				if (rankArr[i].getAv() > rankArr[i + j].getAv()) {
					rankArr[i] = rankArr[i];
				} else {
					Gmodel tmp = rankArr[i];
					rankArr[i] = rankArr[i + j];
					rankArr[i + j] = tmp;
				}

			}
		}

		for (int i = 0; i < top; i++) {
			for (int j = 0; j < top; j++) {
				if (gArr[i].getIdx() == rankArr[j].getIdx()) {
					gArr[i].setRank(j + 1);
				}
			}
		}

	}

	public void inputD() {

		((Gmodel) dt.get("one")).setIdx(idx++);
		rankArr[top] = (Gmodel) dt.get("one");
		gArr[top++] = (Gmodel) dt.get("one");

		makeR();

		m(gArr[top - 1].toString());
		m("입력완료");

	}

	public void outputD() {

		Gmodel[] garr = new Gmodel[top];

		for (int i = 0; i < top; i++) {
			Gmodel g = new Gmodel();
			g.setName(gArr[i].getName());
			g.setTotal(gArr[i].getTotal());
			g.setAv(gArr[i].getAv());
			g.setEn(gArr[i].getEn());
			g.setIdx(gArr[i].getIdx());
			g.setKr(gArr[i].getKr());
			g.setMath(gArr[i].getMath());
			g.setRank(gArr[i].getRank());
			garr[i] = g;

		}
		dt.put("arr", garr);

	}

	public void outputR() {

		Gmodel[] garr = new Gmodel[top];

		for (int i = 0; i < top; i++) {
			Gmodel g = new Gmodel();
			g.setName(rankArr[i].getName());
			g.setTotal(rankArr[i].getTotal());
			g.setAv(rankArr[i].getAv());
			g.setEn(rankArr[i].getEn());
			g.setIdx(rankArr[i].getIdx());
			g.setKr(rankArr[i].getKr());
			g.setMath(rankArr[i].getMath());
			g.setRank(rankArr[i].getRank());
			garr[i] = g;

		}
		dt.put("arr", garr);

	}

	public void search() {
		int cnt = 0;
		boolean flag = false;
		Gmodel[] ga = new Gmodel[MAX];
		for (int i = 0; i < top; i++) {

			if (gArr[i].getName().equalsIgnoreCase((String) dt.get("name"))) {
				Gmodel g = new Gmodel();
				g.setName(gArr[i].getName());
				g.setTotal(gArr[i].getTotal());
				g.setAv(gArr[i].getAv());
				g.setEn(gArr[i].getEn());
				g.setIdx(gArr[i].getIdx());
				g.setKr(gArr[i].getKr());
				g.setMath(gArr[i].getMath());
				g.setRank(gArr[i].getRank());
				ga[cnt++] = g;
				flag = true;
			}

		}
		if (!flag) {
			m("존재하지 않습니다.");
			new Crt().service();
		}
		;
		Gmodel[] ga2 = new Gmodel[cnt];
		for (int i = 0; i < cnt; i++) {
			ga2[i] = ga[i];
		}

		dt.put("arr", ga2);

	}

	public void modifyD() {

		for (int i = 0; i < top; i++) {

			if (gArr[i].getIdx() == ((int) dt.get("idx"))) {

				switch ((int) dt.get("mdfno")) {
				case 1:
					m("수정할 이름을 입력하세요");
					gArr[i].setName(sc.next());
					break;

				case 2:
					m("수정할 국어 점수를 입력하세요");
					while(true) {
						int j = sc.nextInt();
						if(j <0 || j >100) {
							m("잘못된 점수 범위 입니다. 다시 입력해주세요.");
						}else {gArr[i].setKr(j); break;}
						}
					break;
				case 3:
					m("수정할 영어 점수를 입력하세요");
					while(true) {
						int j = sc.nextInt();
						if(j <0 || j >100) {
							m("잘못된 점수 범위 입니다. 다시 입력해주세요.");
						}else {gArr[i].setEn(j); break;}
						}
					break;
				case 4:
					m("수정할 수학어 점수를 입력하세요");
					while(true) {
						int j = sc.nextInt();
						if(j <0 || j >100) {
							m("잘못된 점수 범위 입니다. 다시 입력해주세요.");
						}else {gArr[i].setMath(j); break;}
						}
					break;
				default:
					m("잘못된입력입니다");
					return;

				}

				gArr[i].setTotal(gArr[i].getEn() + gArr[i].getKr() + gArr[i].getMath());
				gArr[i].setAv((double) (gArr[i].getEn() + gArr[i].getKr() + gArr[i].getMath()) / (double) 3);
				m("수정되었습니다.");
				makeR();
				m(gArr[i].toString());

			}

		}

	}

	public void deleteD() {
		for (int i = 0; i < top; i++) {

			if (gArr[i].getIdx() == ((int) dt.get("idx"))) {
				m(gArr[i].toString());
				for (int j = i; j < top; j++) {
					gArr[j] = gArr[j + 1];
					
					
					
				}
				
				
				

				m("삭제가 완료되었습니다");
				top--;
				
				
				makeR();

			}
		}

	}

}
