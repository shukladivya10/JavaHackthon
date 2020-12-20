package com.hackthon.in;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[]args) {
    	System.out.println("Enter any String");
        Scanner sc = new Scanner(System.in);
        String anyString = sc.next();
  	  checkPalindrome(anyString);	
     }
	public static void checkPalindrome(String s) {
		
      StringBuffer sb = new StringBuffer(s);
      String reversS= sb.reverse().toString();
      if (s.equals(reversS))
        System.out.println("Yes");
      else 
	   System.out.println("no");
	}
}
