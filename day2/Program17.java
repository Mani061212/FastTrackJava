package com.day2;

public class Program17 {
	 static int a = 12; //static variable  
	 int b=10; // instance varaible
	 static void display()
	{
	  System.out.println("The value of a = " + a);// static method can access static variable
	//System.out.println("The value of b = " + b);// static method can not access instance varaible
	}
}
