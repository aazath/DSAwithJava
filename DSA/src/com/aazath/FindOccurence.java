package com.aazath;

import java.util.Scanner;

public class FindOccurence {

	public static void main(String[] args) {
		// WAP to find the occurance of a digit in a given number
		
		int num = 3535335;
		int oc = 3;
		int count =0;
		while(num>0)
		{
			if(num % 10 ==3)
			{
				count++;
			}
			num = num/10;
		}
		
		System.out.println(count);

	}

}
