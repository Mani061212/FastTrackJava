package com.Day1;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3,num;
		Scanner s = new Scanner(System.in);
        num=s.nextInt();
        System.out.print(n1 + " " + n2 + " " );
        for(int i=2;i<=num;i++) {
        	n3=n1+n2;
        	System.out.print(n3 + " ");
        	n1=n2;
        	n2=n3;
        	
        }
	}

}
