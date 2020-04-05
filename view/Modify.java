package view;

import static res.R.m;

import model.Gmodel;

public class Modify implements View {

	@Override
	public void display() {

		m("∥∥∥∥∥∥∥∥∥∥" + menulist[(int) dt.get("no")] + "∥∥∥∥∥∥∥∥∥∥");
		m("수정할 no를 입력해주세요");
		int i = sc.nextInt();

		for (int j = 0; j < ((Gmodel[]) dt.get("arr")).length; j++) {

			if (((Gmodel[]) dt.get("arr"))[j].getIdx() == i) {

				dt.put("idx", i);

				m("수정할 내용를 입력해주세요");
				m("1.이름  2.국어점수 3.영어점수 4.수학점수 ");
				dt.put("mdfno", sc.nextInt());

			}
		}

	}

}
