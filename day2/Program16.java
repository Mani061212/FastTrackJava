package com.day2;

public class Program16 {
	 static int a = 12; //static variable
	 int b = 22; //instance variable
	 void display() //instance method
	 {
	 System.out.println("The value of a = " + a); //instance method can access static variable
	 System.out.println("The value of b = "+ b); // instance method can access instance variable 
	 }
}
