package com.blz.homework;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("enter year");
		int year=scn.nextInt();
		if(year<=999) {
			System.out.println("please enter year that is above than 999");
			year=scn.nextInt();
		}//if
		if((year%4==0&&year%100!=0)||year%400==0) {
			System.out.println(year+" is leap year");
		}//if
		else {
			System.out.println(year+" is not leap year");
		}
	}

}
