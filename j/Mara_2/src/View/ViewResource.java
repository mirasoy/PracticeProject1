package View;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public interface ViewResource {
	Font f2 = new Font("돋움",Font.BOLD, 20);
	Font f = new Font("돋움",Font.BOLD, 015);
	Font f3 = new Font("돋움",Font.BOLD, 30);
	
	
	JPanel rightpanel = new JPanel();
	JPanel leftpanel = new JPanel();
	
	/////////////////// 왼쪽패널 고정존////////////////////////

	
	LastHandler last = new LastHandler();
	
	
	ImageIcon icon = new ImageIcon("title.jpg");
	JLabel lblNewLabel_1 = new JLabel(icon);
	JScrollPane scrollPane = new JScrollPane();
	String[] lsit= {"no","메뉴","수량","가격","기타"};
	String[][] s = null;
	DefaultTableModel model = new DefaultTableModel(null, lsit);
	JTable table = new JTable(model);
	JButton delete = new JButton("선택삭제");
	JButton payment = new JButton("결제하기");
	JLabel total = new JLabel("합계 :   \\");
	JLabel price = new JLabel("0");
	///////////////오른쪽패널 기본셋팅 > 탭팬 ////
	JTabbedPane right = new JTabbedPane();
	JPanel mainMenu =  new JPanel();
	JPanel subMenu =  new JPanel();
	
	/////////////////오른쪽페널 메인메뉴 선택1//////////
	
	
	
	
	OptionHandler oph = new OptionHandler();
	MainMenuHandler hand  = new MainMenuHandler();
	CardLayout card = new CardLayout();
	JPanel rightpanel_1 = new JPanel();
	
	JPanel decoP = new JPanel();
	
	
	JRadioButton maraShang = new JRadioButton("마라탕");
	JRadioButton maraTang = new JRadioButton("마라샹궈");
	JLabel tangImage = new JLabel(new ImageIcon("tang.jpg"));
	JLabel shangImage = new JLabel(new ImageIcon("shang.jpg"));

	
	
	ButtonGroup tangshang = new ButtonGroup();
	ButtonGroup hot1Bg = new ButtonGroup();
	ButtonGroup hot2Bg = new ButtonGroup();
	ButtonGroup meatBg = new ButtonGroup();
	ButtonGroup sizeBg = new ButtonGroup();
	
	
	JPanel hot1panel = new JPanel();
	JLabel HotLabel = new JLabel("매운맛");
	JRadioButton hot1_1 = new JRadioButton("1단계");
	JRadioButton hot1_2 = new JRadioButton("2단계");
	JRadioButton hot1_3 = new JRadioButton("3단계");

	JPanel hot2panel = new JPanel();
	JLabel hot2label_1 = new JLabel("얼얼한맛");
	JRadioButton hot2_1 = new JRadioButton("1단계");
	JRadioButton hot2_2 = new JRadioButton("2단계");
	JRadioButton hot2_3 = new JRadioButton("3단계");
	
	JPanel meatPanel = new JPanel();
	JRadioButton beef = new JRadioButton("소고기");
	JRadioButton lamb = new JRadioButton("양고기");
	JRadioButton vegan = new JRadioButton("고기없음(야채추가)");
	JLabel label_2 = new JLabel("고기선택");

	JPanel sizepanel = new JPanel();
	JRadioButton large = new JRadioButton("대 : 23,000원");
	JRadioButton mid = new JRadioButton("중 : 19,000원");
	JRadioButton small = new JRadioButton("소 : 15,000원");
	JLabel sizelabel = new JLabel("사이즈");
	
	JButton nextBt = new JButton("다음단계");
	////////////////////오른쪽페널 메인메뉴 선택2////////////////////////////
	JPanel rightpanel_2 = new JPanel();
	JPanel decoP2 = new JPanel();
	JButton nextBt2 = new JButton("완료");
	JButton cancel = new JButton("취소");
	
	SaveTmp saveTmp = new SaveTmp();
	
	JLabel lb_info = new JLabel("<html>기본 재료가 포함되어 있는 상태입니다.\r\n<br/>추가하실 옵션을 고르세요. (각 1000원)</html>");
	JLabel lb_info2 = new JLabel("<html>기본구성 : 청경채, 숙주, 배추, 새송이, 느타리, 목이버섯, 건두부, 푸주, 옥수수면, 중국당면</html>");
	JPanel optionPanel = new JPanel();
	
	JButton op1 = new JButton("납작당면");
	JButton op2 = new JButton("녹두당면");
	JButton op3 = new JButton("옥수수면");
	JButton op4 = new JButton("청경채");
	JButton op5 = new JButton("콩나물");
	JButton op6 = new JButton("숙주나물");
	JButton op7 = new JButton("배추");
	JButton op8 = new JButton("감자");
	JButton op9 = new JButton("시금치");
	JButton op10 = new JButton("부죽");
	JButton op11 = new JButton("새송이");
	JButton op12 = new JButton("느타리");
	JButton op13 = new JButton("쑥갓");
	JButton op14 = new JButton("새우완자");
	JButton op15 = new JButton("게살완자");
	JButton op16 = new JButton("문어완자");
	JButton op17 = new JButton("메추리알");
	JButton op18 = new JButton("게맛살");
	JButton op19 = new JButton("비엔나");
	JButton op20 = new JButton("얼린두부");
	JButton op21 = new JButton("두유피");
	
	JPanel meetPlusPanel = new JPanel();
	JButton plusbeef = new JButton("소고기");
	JButton pluslamb = new JButton("양고기");
	JLabel lbmeetplus = new JLabel("고기추가 (100g 3000원)");

	
}
