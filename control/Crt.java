package control;

import static res.R.*;

import java.util.InputMismatchException;


public class Crt {

	public void service() {

		dt.put("no", 0);
	
		menu.display();
		try {
			dt.put("no", sc.nextInt());

			switch ((int) dt.get("no")) {

			case 1:

				ip.display();
				dao.inputD();
				break;

			case 2:

				if (dao.empty()) {
					dao.outputD();
					op.display();
				}
				break;

			case 3:
				if (dao.empty()) {
					sr.display();
					dao.search();
					sr.display2();

				}

				break;

			case 4:
				if (dao.empty()) {
					sr.display();
					dao.search();
					sr.display2();
					mdf.display();
					dao.modifyD();
				}
				break;

			case 5:
				if (dao.empty()) {
					sr.display();
					dao.search();
					sr.display2();
					del.display();
					dao.deleteD();
				}
				break;

			case 6:
				if (dao.empty()) {
					dao.makeR();
					dao.outputR();
					al.display();

				}
				break;
			case 7:
				m("시스템을 종료합니다");
				System.exit(0);

			default:
				m("잘못된입력입니다.");
			}
		} catch (InputMismatchException e) {
			m("잘못 된 입력입니다.");
			sc.nextLine();
			service();
		}catch (NullPointerException e) {
			m("잘못 된 입력입니다.");
			sc.nextLine();
			service();
		}

//			dt.put("no", 0);

		service();
	}

}
