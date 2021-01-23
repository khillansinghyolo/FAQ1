package org.testing;

import java.util.Scanner;

public class PenlindromNumber {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter the number ");
		int n=s.nextInt();
		int temp=n;
		int rev=0,reminder=0;
		while(temp!=-1)
		{
			reminder=temp%10;
			rev=rev*10+reminder;
			temp=temp/10;	
		}
		if(temp==n)
		{
			System.out.println("Number is penlindrom number");
		}
		else
		{
			System.out.println("Number is not pelindrome number");
		}
	}
	

}
