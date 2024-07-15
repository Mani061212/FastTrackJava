package com.Day1;

import java.util.Scanner;

public class Program6 {
	
	public static void main(String[] args) {
		String str,rev=" ";
		char ch;
		Scanner s = new Scanner(System.in);
        str=s.nextLine();
        System.out.println("original string is " + str);
        for(int i=0;i<str.length();i++) {
        	ch = str.charAt(i);
        	rev=ch+rev;
        }
        System.out.println("revised string : " + rev);
	}
}
		
