package com.hackthon.in;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter a String");
Scanner sc = new Scanner(System.in);
String anyString = sc.next();

char a []= anyString.toCharArray();
for (int i=a.length-1; i>=0; i--) {
	System.out.println(a[i]);
	
}

}

}
