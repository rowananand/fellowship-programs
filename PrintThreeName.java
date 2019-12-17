package com.blz.classwork;

import java.util.Scanner;

public class PrintThreeName {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		String str[]=new String[3];
		for(int i=0;i<3;i++) {
			System.out.println("Enter "+i+" name" );
			str[i]=scn.next();
		}
		System.out.print("Hii ");
		for(int i=2;i>=0;i--) {
			System.out.print("  "+str[i]);
		}
	}//main
}//class
