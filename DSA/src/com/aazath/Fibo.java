package com.aazath;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		// Fibonacci series: 0 1 1 2 3 5 8 13 18 ....
		// find the nth fibo number
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int previous =0;
		int current =1;
		int count =2;
		
		while(count <=n)
		{
			int temp = current;
			current = current +previous;
			previous = temp;
			count++;
		}
		System.out.println(current);
		
		
	}

}
