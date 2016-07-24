package com.cts.vms;

public class Student {
	int stdno;
	String stdname;
	int m1;
	int m2;
	int m3;
	String objname;
	static String address;
	
	Student(int stdno, String stdname, int m1, int m2, int m3, String objname){
		this.stdno = stdno;
		this.stdname = stdname;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.objname = objname;
	}
	
	void displayStdDetails(){
		System.out.println("Student number is" + stdno + "Student name is" + stdname);
	}
	
	void displayStdPermance(){
		System.out.println("student " + objname + " m1: " + m1 + " m2 :" + m2 + " m3: " + m3);
	}
	
	int displayavg(){
		int avg = (m1+m2+m3)/3;
		//System.out.println("calculated avg is" + avg);
		return avg;
	}
	
	static void displaySchoolAddress(){
		address = "some address";
		System.out.println("school address:" + address);
		
	}

}
