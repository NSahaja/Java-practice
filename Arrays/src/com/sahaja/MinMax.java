//Write a program to find max number and min number from an array

package com.sahaja;

public class MinMax {
	int max,min;
	int[] a;
	void findmaxmin(){
		max = a[0];
		min = a[0];
		for(int i=1; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
			
			if(a[i]<min)
			{
				min = a[i];
			}
		}
		System.out.println("max number is:" + max + " min number is: " + min);
		
		
		
		
		
	}

}
