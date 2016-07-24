// Write a program to calculate sum of numbers in array

package com.sahaja;

public class SumOfNum {
	int sum=0;
	int[] a;
	void arraysum(){
		for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of numbers in an array is: " + sum);
	}
	
	
	

}
