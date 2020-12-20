package com.hackthon.in;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("enter names");
	Scanner sc = new Scanner(System.in);
	String name1  = sc.next();
	String name2  = sc.next();
	String name3 = sc.next();
	
	List <String> names   = new ArrayList<String>();
     
	names.add(name1);
	names.add(name2);
	names.add(name3);
     
     for(String name: names) {
    	 System.out.println(name);
     }
     
     Iterator it = names.iterator();
     
     while (it.hasNext()) {
    	 String obj = (String)it.next();
    	 System.out.println(obj);
     }


	}

}
