package com.Day1;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		int n1,n2;
		Scanner s = new Scanner(System.in);
        n1=s.nextInt();
        n2=s.nextInt();
        System.out.println(n1);
        System.out.println(n2);
        
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        
        System.out.println(n1);
        System.out.println(n2);
	}
}
