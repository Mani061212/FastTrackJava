package com.Day1;

import java.util.Scanner;

public class Program17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,count=0;
		Scanner s = new Scanner(System.in);
        n=s.nextInt();
        int temp = n;
        while(temp!=0) {
        	temp=temp/10;
        	count++;
        }
        System.out.println("the count of " +n + " is " + count);
	}

}
 