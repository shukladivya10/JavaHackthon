package com.hackthon.in;

import java.util.Scanner;

public class SplitCreditCardNummber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter credit card number");
		Scanner sc = new Scanner(System.in);
		String creditCardNumber = sc.next();
//		String sName = "2345-23434-8696-3245";
		String card[] = creditCardNumber.split("-", 4);
		for(int i =0 ; i< card.length ; i++) {
			System.out.println(""+card[i]);
		}
		
		
	}

}
