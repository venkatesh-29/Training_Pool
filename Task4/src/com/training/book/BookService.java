package com.training.book;
public class BookService {
	public double  discount(Book book) {
		double price = book.getPrice();
		if(price<=500) {
			return price * 0.05;
		}
		else if((price>500)&&(price<=1000)) {
			return price * 0.10;
		}
		else if(price>1000) {
			return price * 0.12;
		}
		else {
			return 0;
		}
	}
	public double calculateDiscount (Book book,String customerType) {
		double price1= book.getPrice();
		switch(customerType) {
		case "1":
			if(price1<=500) {
				return price1*0.07;
			}else if((price1>500)&&(price1<=1000)) {
				return price1* 0.12;
			}else if(price1>1000) {
				return price1*0.15;
			}else {
				return 0;
			}
		case "2":
			if(price1<=500) {
				return price1* 0.05;
			}else if((price1>500)&&(price1<=1000))
			 {
				return price1* 0.10;
			}else if(price1>1000)
			 {
				return price1* 0.12;
			}
			else {
				return 0;
			}
		}return 0;
	}
	}
