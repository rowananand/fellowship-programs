package com.blz.classwork;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int x=0;
		double h=0;
		System.out.println("Enter value");
		x=scn.nextInt();
		for(int i=1;i<=x;i++) {
			h=h+(1/(i*1.0));
			if(i!=x)
				
			System.out.print("1/"+i+" +");
			else
				System.out.print("1/"+x+" ");
		}//for
		//System.out.println(h);
	}//main
}//class
