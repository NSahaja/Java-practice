package com.bigacademe.handsforjava.basics;

public class EmployeeEx {

	public static void main(String[] args) {
		Employee E1 = new Employee();
		Employee E2 = new Employee();
		
		E1.empno = 100;
		E1.ename = "Raju";
		E1.sal = 50000;
		
		E2.empno = 200;
		E2.ename = "Ravi";
		E2.sal = 70000;
		
		E1.displayInfo();
		E2.displayInfo();
		
		Employee.displayOfficeAddress();
		

	}

}
