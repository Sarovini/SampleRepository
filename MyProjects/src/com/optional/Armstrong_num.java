package com.optional;

import java.util.Scanner;

public class Armstrong_num {
	//Write a program to check whether the given 3 digit number is Armstrong or not
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 3 digit number: ");
		int number = in.nextInt();
		int temp =number;
		int digit1,digit2,digit3;
		
		digit3=temp%10;//3
		temp=temp/10;//15
		
		digit2=temp%10;
		temp=temp/10;
		
		digit1=temp%10;
		
		int result=(digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
		if(number==result) {
			System.out.println("Given number is Armstrong number");
		}
		else {
			System.out.println("Not an Armstrong number");
		}
	}

}
