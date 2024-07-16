package com.day2;

public class Program25 {
      
	public static void fun() {
		System.out.println("Test.foo() called ");
	}

	
	  public void fun(int a) { 
	  System.out.println("Test.foo(int) called "); }
	 
	
	public static void main(String args[]) {
		Program25.fun();
		
		Program25 t1 = new Program25();
		t1.fun(1);
	}
}
