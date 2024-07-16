package com.day2;

public class Program21 extends Program20{
 
	// This method is hidden by display() in Base
    public static void content1() {
         System.out.println("Static or class method from Derived");
    }
     
    // This method overrides print() in Base
    public void content() {
         System.out.println("Non-static or Instance method from Derived");
   }

}
