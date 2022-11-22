package models;

public class Receipt {
	
	private int recNum;
	private int userRefId;
	private double total;
	private String Desc;
	
	private static final int iMin = 10000000;
	private static final int iMax = 99999999;
	
	//Constructor
	public Receipt() {
		super();
		this.recNum = generateRecNum();
	}


	/*Getters & Setters*/
	public int getRecNum() {
		return recNum;
	}


	public void setRecNum(int recNum) {
		this.recNum = recNum;
	}


	public int getUserRefId() {
		return userRefId;
	}


	public void setUserRefId(int userRefId) {
		this.userRefId = userRefId;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	public String getDesc() {
		return Desc;
	}


	public void setDesc(String desc) {
		Desc = desc;
	}
	
	
	private static int generateRecNum() {
		int num = (int) Math.floor(Math.random()*(iMax-iMin+1)+iMin);
		return num;
	}
	
	

}
