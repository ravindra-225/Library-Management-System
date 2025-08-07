package com.example.library.models;

public class Book {
	private int bookid;
	private String title;
	private String author;
	private String language;
	private String category;
	private int year;
	private boolean isAvailable;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookid, String title, String author, String language, String category, int year) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.author = author;
		this.language = language;
		this.category = category;
		this.year = year;
		this.isAvailable=true;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public boolean isAvailable() {
	    return isAvailable;
	}
	public void setAvailable(boolean available) {
	    isAvailable = available;
	}
	
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", title=" + title + ", author=" + author + ", language=" + language
				+ ", category=" + category + ", year=" + year + "', isAvailable=" + isAvailable + "]";
	}
	
	

}
