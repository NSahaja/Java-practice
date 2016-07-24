package com.cts.vms;

public class ExEMP {

	public static void main(String[] args) {
		EMP E1 = new EMP();
		EMP E2 = new EMP();
		EMP E3 = new EMP(15,"XYZ",30000,"TEMPORARY");
		EMP E4 = new EMP(20,"KLM",60000,"TEMPORARY");
	    E1.display();
	    E2.display();
	    E3.display();
	    E4.display();
	    
	    Student S1 = new Student(123,"abc",90,60,80,"S1");
	    Student S2 = new Student(456,"xyz",80,50,40,"S2");
	    Student S3 = new Student(789,"klm",70,30,20,"S3");
	    
	    S1.displayStdDetails();
	    S1.displayStdPermance();
	    Student.displaySchoolAddress();
	    System.out.println("Avg is: " + S1.displayavg());
	    
	    
	    S2.displayStdDetails();
	    S2.displayStdPermance();
	    Student.displaySchoolAddress();
	    System.out.println("Avg is: " + S2.displayavg());
	    
	    S3.displayStdDetails();
	    S3.displayStdPermance();
	    Student.displaySchoolAddress();
	    System.out.println("Avg is: " + S3.displayavg());
	    

	}

}
