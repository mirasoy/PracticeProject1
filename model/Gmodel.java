package model;

public class Gmodel {

	private String name;
	private int kr;
	private int en;
	private int math;
	private int total;
	private double av;
	private int rank;

	public Gmodel() {
		this(0, null, 0, 0, 0, 0, 0, 0);
	}

	public Gmodel(int idx, String name, int kr, int en, int math, int total, double av, int rank) {
		super();
		this.idx = idx;
		this.name = name;
		this.kr = kr;
		this.en = en;
		this.math = math;
		this.total = total;
		this.av = av;
		this.rank = rank;
	}

	private int idx;

	@Override
	public String toString() {
		return "번호 :" + idx + " " + "이름 :" + name + " " + "국어 :" + kr + "점 " + "영어 :" + en + "점 " + "수학 :" + math + "점 "
				+ "총점 :" + total + "점 " + "평균 :" + 
				Math.round((av) * 100) / 100.0
				+ "점 " + "등수 :" + rank + "등 ";
	}
	public String toString(int i) {
		return "["+rank + "등 ] "  +"번호 :" + idx + " " + "이름 :" + name + " " + "국어 :" + kr + "점 " + "영어 :" + en + "점 " + "수학 :" + math + "점 "
				+ "총점 :" + total + "점 " + "평균 :" + 
				Math.round((av) * 100) / 100.0
				+ "점 ";
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKr() {
		return kr;
	}

	public void setKr(int kr) {
		this.kr = kr;
	}

	public int getEn() {
		return en;
	}

	public void setEn(int en) {
		this.en = en;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAv() {
		return av;
	}

	public void setAv(double av) {
		this.av = av;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

}
