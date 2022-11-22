package models;

import java.util.List;

public class Cart {
	private List<Item> cart;
	private double total;
	private User user;
	
	
	//Constructor
	public Cart() {
		super();
	}

	
	
	//Getters & Setters
	public List<Item> getCart() {
		return cart;
	}


	public void setCart(List<Item> cart) {
		this.cart = cart;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
	
	
	

}
