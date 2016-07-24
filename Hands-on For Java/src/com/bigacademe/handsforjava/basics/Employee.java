package com.bigacademe.handsforjava.basics;

public class Employee {

//declaring variables
int empno;
String ename;
int sal;
static String address;

void displayInfo(){
	
	System.out.println("Employee no: " + empno);
	System.out.println("Employee name: " + ename);
	System.out.println("Employee salary: " + sal);
	
}
public static void displayOfficeAddress(){
	address = "hno-55, taft blvd, texas.";
	System.out.println("Employee office address: " + address);
	
}





}
