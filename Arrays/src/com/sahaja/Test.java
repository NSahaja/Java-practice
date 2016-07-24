package com.sahaja;

public class Test {

	public static void main(String[] args) {
		int ak[] = {15,6,17,8,2};
		
		SumOfNum arr = new SumOfNum();
		arr.a = ak;
		arr.arraysum();
		
		MinMax arr1 = new MinMax();
		arr1.a = ak;
		arr1.findmaxmin();
		
		Sort arr2 = new Sort();
		arr2.a = ak;
		arr2.sortarray();

	}

}
