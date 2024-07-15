package com.Day1;

import java.util.Scanner;

public class Program18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,range;
		Scanner s = new Scanner(System.in);
        num=s.nextInt();
        range=s.nextInt();
        for(int i=0;i<=range;i++) {
        	System.out.println("The table is " + (num * i));
        }
	}

}
