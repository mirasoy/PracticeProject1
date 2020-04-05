package res;

import java.util.Scanner;

import model.Dao;
import model.Gmodel;
import view.Alignment;
import view.Delete;
import view.Input;
import view.Menu;
import view.Modify;
import view.Output;
import view.Search;

public interface R {
	
	
	
	Scanner sc = new Scanner(System.in);
	Menu menu = new Menu();
	Alignment al = new Alignment();
	Delete del = new Delete();
	Input ip =  new Input();
	Modify mdf = new Modify();
	Output op = new Output();
	Search sr = new Search();
	Data dt = new Data();
	Gmodel gd = new Gmodel();
	Dao dao = Dao.getIns();
	
	
	
	
	
	
	
	
	
	
	static public String[] menulist =  {"메뉴보기", "입력하기", "모두보기" , "찾아보기" , "수정하기", "삭제하기", "정렬하기", "종료하기" };
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void m(String s){
		System.out.println(s);
	}
	
	public static void mm(String s){
		System.out.print(s);
	}
	
	public static void m(int s){
		System.out.println(s);
	}
	
	public static void m(){
		System.out.println();
	}
	
	
	
}
