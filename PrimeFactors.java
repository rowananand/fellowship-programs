package com.blz.basicCoreProgram;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		int no=scn.nextInt();
		primeFactors(no);
		
	}//main
	
	public static void primeFactors(int no) {
		for(int i=2;i<=no/2;i++) {
			while(no%i==0) {
			//	System.out.println(i+"  ");
				no=no/i;
			}//while
			System.out.println(i+"  ");
		}//for
			if(no>2)
				System.out.println(no);
			
	}//method

}//class
