package com.sahaja;

public class Sort {

	int[] a;
	void sortarray(){
		int temp;
		for(int i = 0; i < a.length; i++){
			int min = i;
			for(int j = i+1 ; j < a.length ; j++){
				if(a[j] < a[min]){
					temp = a[min];
					a[min] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i = 0; i < a.length; i++)
		{
		System.out.print(a[i] + " , ");
		}
	
	}
	
}
	