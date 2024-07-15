package com.Day1;

import java.util.Scanner;

public class Program19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i;
		Scanner s = new Scanner(System.in);
        num=s.nextInt();
        int[] array= new int[num];
        int min=array[0],max=array[0];
        for(i=0;i<num;i++) {
        	array[i]=s.nextInt();
        	}
        for(i=1;i<num;i++) {
        	if(array[i]< min) {
        		min=array[i];
        	}
        	if(array[i]>max) {
        		max=array[i];
        	}
        	
        }
        System.out.println(" max of array is " + max);
        System.out.println(" min of array is " + min);
	}

}
