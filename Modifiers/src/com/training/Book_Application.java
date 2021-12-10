package com.training;

public class Book_Application {

	public static void main(String[] args) {
		Book First = new Book();
		First.setAuthor_name("guardian");
		First.setBook_id(101);
		First.setPrice(100.0);
		System.out.println(First.getBook_id());
		System.out.println(First.getAuthor_name());
		System.out.println(First.getPrice());
		Book effJava = new Book("Therasa",102,102.25);
		System.out.println(effJava.getBook_id());
		System.out.println(effJava.getAuthor_name());
		System.out.println(effJava.getPrice());
		
	}

}
