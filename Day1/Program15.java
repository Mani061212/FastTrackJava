package com.Day1;

import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,sum=0;
		Scanner s = new Scanner(System.in);
        n=s.nextInt();
        for(i=0;i<=n;i++) {
        	sum=sum+i;
        }
        System.out.println("sum of natural num is " + sum);
	}

}
