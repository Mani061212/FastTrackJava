package com.Day1;

import java.util.Scanner;

public class Program20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i,sum=0;
		Scanner s = new Scanner(System.in);
        num=s.nextInt();
        int[] array= new int[num];
        for(i=0;i<num;i++) {
        	array[i]=s.nextInt();
        	}
        for(i=0;i<num;i++) {
        	sum=sum+array[i];
        	}
        System.out.println("sum of array is " + sum);
	}
	
}
