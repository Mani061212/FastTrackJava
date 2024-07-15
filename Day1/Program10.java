package com.Day1;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,sum=0,digit;
		Scanner s = new Scanner(System.in);
        n1=s.nextInt();
        while(n1>0) {
        	digit=n1%10;
        	sum+=digit;
        	n1=n1/10;
        }
        System.out.println("sum of digits" + sum);
	}

}
