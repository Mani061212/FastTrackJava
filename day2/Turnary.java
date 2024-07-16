package com.day2;

public class Turnary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x;
		x = (5<4)?true:false;
		System.out.println(x);
		int age = 12;
		String a = "Allowed to vote";
		String b = "Not allowed to vote";
		String accessallowed = (age > 18) ? a : b;
		System.out.println(accessallowed);
		int y;
		y = (10==10) ? 1 : 0;
		System.out.println(y);
	}

}
