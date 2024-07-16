package com.day2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class BigIntDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        System.out.println("enter your big dec data");
        BigDecimal num=s.nextBigDecimal();
        System.out.println("data is " +num);
        System.out.println("enter your big int data");
        BigInteger num1=s.nextBigInteger();
        System.out.println("data is " +num1);
	}

}
