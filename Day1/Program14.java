package com.Day1;

import java.util.Scanner;

public class Program14 {
     
	public static void main(String[] args) {
		int n1,rev=0,digit;
		Scanner s = new Scanner(System.in);
        n1=s.nextInt();
        while(n1!=0) {
        	digit=n1%10;
        	rev=rev*10+digit;
        	n1=n1/10;
        }
        System.out.println("rev of digits " + rev);
	}
}
