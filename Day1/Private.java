package com.Day1;

public class Private {

	private void display() {
		System.out.println("mani");
	}
}
class B{
	public static void main(String[] args) {
		Private obj= new Private();
		obj.display();
		
	}
}
