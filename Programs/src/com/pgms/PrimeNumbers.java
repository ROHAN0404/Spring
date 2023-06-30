package com.pgms;

import java.util.Scanner;

public class PrimeNumbers {
	static int count=1;
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int range=sc.nextInt();
		
		
		for(int j=1;j<range;j++) {
			int flag=0;
			for(int i=2;i<j;i++)
			{
				if(j%i==0) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(count+": "+  j);
				count++;
			}
			
		}
		
		
	}

}
