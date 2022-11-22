package models;

public class Item {
	private String name;
	private double price;
	private int idn;
	private String desc;
	private ItemType type;
	//private int qnt;
	
	/*Used as the min & max to generate 4-digit random number for idn*/
	private static final int iMin = 1000;
	private static final int iMax = 9999;
	
	
	
	
	
	/*Constructors*/
	public Item() {
		super();
	}
	
	
	public Item(String name, double price) {
		super();
		this.name = name;
		this.price = price;
		this.idn = generateIdn();
	}
	

	public Item(String name, double price, int idn) {
		super();
		this.name = name;
		this.price = price;
		this.idn = idn;
	}


	public Item(String name, double price, int idn, String desc) {
		super();
		this.name = name;
		this.price = price;
		this.idn = idn;
		this.desc = desc;
	}


	/*Getter & Setter methods*/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getIdn() {
		return idn;
	}

	public void setIdn(int idn) {
		this.idn = idn;
	}



	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	/*
	public int getQnt() {
		return qnt;
	}
	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
*/

	public ItemType getType() {
		return type;
	}


	public void setType(ItemType type) {
		this.type = type;
	}


	//Generates a random 4 digit identification number
	private static int generateIdn() {
		int idn = (int) Math.floor(Math.random()*(iMax-iMin+1)+iMin);
		return idn;
	}
}
