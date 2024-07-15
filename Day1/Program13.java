package com.Day1;

import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1;
        Scanner s = new Scanner(System.in);
        n1=s.nextInt();
        boolean isleapyear = (n1%4==0 && n1%100!=0) || (n1 % 400 ==0);
        if(isleapyear) {
        	System.out.println(n1 +" is leapyear");
        }
        else {
        	System.out.println(n1 +" is not leapyear");
        }
	}

}
