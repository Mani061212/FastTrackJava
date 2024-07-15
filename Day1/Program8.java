package com.Day1;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str,rev="";
		Scanner s = new Scanner(System.in);
        str=s.nextLine();
        System.out.println("original string is " + str);
        for(int i=0;i<str.length();i++) {
        	rev=rev+str.charAt(i);       	
        }
        System.out.println("revised string : " + rev);
       
        if(str.equals(rev)) {
        	System.out.println(str +" is polyndrome");
        }
        else {
        	System.out.println(str +" not polyndrome");
        }
	}

}
