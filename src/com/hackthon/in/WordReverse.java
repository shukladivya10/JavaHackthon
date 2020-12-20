package com.hackthon.in;

import java.util.Scanner;

public class WordReverse {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    for (int i=args.length-1; i>=0; i--) {
	   System.out.println(args[i]);	
    }
   }
}