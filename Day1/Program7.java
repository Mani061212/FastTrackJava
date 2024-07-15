package com.Day1;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n1,n2,n3;
        Scanner s = new Scanner(System.in);
        n1=s.nextInt();
        n2=s.nextInt();
        n3=s.nextInt();
        if(n1>n2 && n1>n3) {
        	System.out.println( n1 + " is greater");
        }
        else if(n2>n3) {
        	System.out.println( n2 + " is greater");
        }
        else {
        	System.out.println( n3 + " is greater");
        }
	}

}
