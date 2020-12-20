package com.hackthon.in;
import java.util.Scanner;
public class CalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value of 1st number ::");
    int a = sc.nextInt();

    System.out.println("Enter value of 2nd number ::");
    int b = sc.nextInt();

    System.out.println("Select operation");
    System.out.println("Add + : Sub - : Multi * : Divi / : ");
    char ch = sc.next().charAt(0);
    switch(ch) {
       case '+' :
       System.out.println("Sum of the given two numbers: "+(a+b));
       break;
       case '-' :
       System.out.println("sub between the two numbers: "+(a-b));
       break;
       case '*' :
       System.out.println("multiplication  of the two numbers: "+(a*b));
       case '/' :
       System.out.println("division of two number: "+(a/b));
       break;
       default :
       System.out.println("not correct ");
    }
 }

}
