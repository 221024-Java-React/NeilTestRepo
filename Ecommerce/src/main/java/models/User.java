package models;

public class User {
	
	private String firstName;
	private String lastName;
	private int userId;
	private String address;
	private String phoneNumber;
	
	
	/*Constructors*/
	public User() {
		super();
	}

	public User(String firstName, String lastName, int userId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userId = userId;
	}

	public User(String firstName, String lastName, int userId, String address, String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userId = userId;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	
	/*Getters & Setters*/
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
}
