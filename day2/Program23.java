package com.day2;


public class Program23 {
      
	public static void fun() {
		System.out.println("Test.fun() called ");
	}
	public static void fun(int a) {
		System.out.println("Test.fun(int) called ");
	}
	
	public static void fun(float b) {
		System.out.println("float value is displayed");
	}
	public static void main(String args[])
	{
		Program23.fun();
		Program23.fun(10);
		Program23.fun(12.2f);
	}
}
