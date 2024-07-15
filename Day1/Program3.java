package com.Day1;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n,fact=1;
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        for(int i=1;i<=n;i++) {
        	fact=fact*i;
        }
        System.out.println("factorial of " + n + " is " + fact);
	}

}
