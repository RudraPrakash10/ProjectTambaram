package org.college;

public class College {
	public void collegeInfo() {
		// TODO Auto-generated method stub
System.out.println("collegeName-Srm,collegeCode-4128,collegeRank-15");

	}

	public static void main(String[] args) {
		College c= new College();
		c.collegeInfo();
		
		Student s= new Student();
		s.studentDetails();
		
		Hostel h= new Hostel();
		h.hostelName();
		
		Dept d= new Dept();
		d.deptName();
		
		
	}
}
