package com.blz.classwork;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int x=0;
		System.out.println("Enter value");
		x=scn.nextInt();
		for(int i=1;i<=x;i++) {
			System.out.println("2^"+i+" = "+(int)Math.pow(2, i));
			
		}//for
	}//main
}//class
