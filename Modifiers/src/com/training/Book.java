package com.training;

public class Book {
	private String Author_name;
	private int Book_id;
	private double Price;
	public Book() {
		//super(); either super or this but never both.
		this("reacl",101,101.00);
}
	public Book(String author_name, int book_id, double price) {
super();
		//this . author name refers to the field private String author name 
		//author name refers to the method argument author name
		this.Author_name = author_name;
		this.Book_id = book_id;
		this.Price = price;
	}
	public String getAuthor_name() {
		return Author_name;
	}
	public void setAuthor_name(String author_name) {
		this.Author_name = author_name;
	}
	public int getBook_id() {
		return Book_id;
	}
	public void setBook_id(int book_id) {
		Book_id = book_id;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		this.Price = price;
	}
}

