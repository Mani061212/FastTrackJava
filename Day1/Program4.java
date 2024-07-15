package com.Day1;

import java.util.Scanner;

public class Program4 {
     
	public static void main(String[] args) {
		int n,temp=0;
		Scanner s = new Scanner(System.in);
        n=s.nextInt();
        if(n==1 || n==0) {
        	System.out.println("not prime");
        }
        else {
        
        	for(int i=2;i<=n/2;i++) {
        	if(n%2==0)
        	  temp++;
            }
            if(temp==0)
            {
        	System.out.println("prime");
            }
            else {
        	System.out.println("not prime");
            }
        }
	}
}
