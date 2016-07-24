 package com.cts.vms;

public class EMP {
	int empno;
	String ename;
	int sal;
	String type; 
	
	EMP(){
		empno = 10;
		ename = "abc";
	    sal = 50000;
		type = "permanent";
	}
	
	EMP(int empno,String ename,int sal,String type){
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
		this.type = type;
	}
	
	void display(){
		System.out.println("empno is " + empno + "emp name is " + ename + " sal is " + sal + "emp type is " + type);
	}
}
