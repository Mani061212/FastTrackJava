package com.day2;

public class Program24 {
	public  void fun() {
		System.out.println("Test.foo() called ");
	}
	public  void fun(int a) {
		System.out.println("Test.foo(int) called ");
	}
	public  void fun(double a) {
		System.out.println("Test.foo(double) called ");
	}
	public static void main(String args[])
	{
		Program24 t1 = new Program24();
		t1.fun();
		t1.fun(10);
		t1.fun(10.d);
	}
}
