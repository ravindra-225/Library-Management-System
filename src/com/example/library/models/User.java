package com.example.library.models;

public class User {
	
	private int userid;
	private String name;
	private long phone;
	private Book borrowedbooks;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public Book getBorrowedbooks() {
		return borrowedbooks;
	}
	
	public User(int userid, String name, long phone) {
		super();
		this.userid = userid;
		this.name = name;
		this.phone = phone;
		this.borrowedbooks = null;
	}
	
	public void borrowBook(Book book) {
	    this.borrowedbooks = book;
	    book.setAvailable(false);
	}

	public void returnBook() {
	    if (borrowedbooks != null) {
	        borrowedbooks.setAvailable(true);
	        borrowedbooks = null;
	    }
	}
	
	@Override
	public String toString() {
	    return "User [userId= " + userid + ", name = "+ name + ", Phone number : "+phone + ", borrowedBook = " + (borrowedbooks != null ? borrowedbooks.getTitle() : "None") + "]";
	}

}
