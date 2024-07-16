package com.day2;

public class Program20 {
    
	// Static method in base class which will be hidden in subclass
    public static void content1() {
        System.out.println("Static or class method from Base");
    }
     
     // Non-static method which will be overridden in derived class
     public void content()  {
         System.out.println("Non-static or Instance method from Base");
    }
}
