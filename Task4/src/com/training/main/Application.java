package com.training.main;
import com.training.bill.*;

public class Application {
	public static double findAmount(MobileBill bill) {
		switch(bill.getPlanname()) {
		case "prepaid":
			return 200;
		case "postpaid":
			return 300;
		
		}return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address = new Address(9,"chinnammal","westsaidapet","Chennai",600015);
        MobileBill bill= new MobileBill("venkat",637382,"postpaid",address);
        System.out.println(findAmount(bill));
          
          
	}

}
