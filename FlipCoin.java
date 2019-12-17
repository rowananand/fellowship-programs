package com.blz.classwork;

import java.util.Random;

public class FlipCoin {

	public static void main(String[] args) {
		System.out.println("coin flip");
		Random rd= new Random();
		int count=0,pro=0,h=0,t=0;
		
		while(count<10) {
	    pro=(int) rd.nextInt();
		if(pro<50) {
			System.out.println("Head");
			h++;
		}
		else {
			System.out.println("Tails");
		t++;
		}
			count++;
		}//while
		System.out.println(" h:="+h+"   t="+t+"  count="+count);
		System.out.println("Head percentage="+(h/(count*1.0)));
		System.out.println("Tails percentage= "+(t/(count*1.0)));
	}

}
