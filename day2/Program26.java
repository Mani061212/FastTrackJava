package com.day2;

public class Program26 {

	int a =10;
    static  int b = 20;
    
    int display() {
    	System.out.println(a);
    	System.out.println(b);
    	return 10;
    }
    void display1() {
    	System.out.println(a);
    	System.out.println(b);
    	System.out.println(" instance mani");
    }
    
    static int display2() {
    	//System.out.println(a);
    	System.out.println(b);
    	return 10;
    }
    static void display3() {
    	//System.out.println(a);
    	System.out.println(b);
    	System.out.println(" static mani");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Program26 obj = new Program26();
        obj.display();
        obj.display1();
        Program26.display3();
        Program26.display2();
	}

}
