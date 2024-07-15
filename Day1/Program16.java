package com.Day1;

import java.util.Scanner;
import java.lang.*;

public class Program16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,digit=0,n,rem,res=0;
		Scanner s = new Scanner(System.in);
        num=s.nextInt();
        n=num;
        while(n!=0) {
        	n=n/10;
        	digit++;
        	}
        n=num;
        while(n!=0) {
        	rem=n%10;
        	res+=Math.pow(rem,digit);
        	n=n/10;
        }
        if(res==num) {
        	System.out.println(num +" is a armgstrong number");
        }
        else {
        	System.out.println(num +" is a not armgstrong number");
        }
	}

}
