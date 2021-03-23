package com.R177219041.q2;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		//creating aiml department
		
		Department dep =new  Department(100,"AI&ML");
		
		//creating employee of dep
		
		Employee e = new Employee("Aravind", 41, dep);
		
		System.out.println(e);
		
		//cloning e
		
		Employee e2 = e.clone();
		
		//changing value of e2
		
		e2.setName("Anurag");
		e2.setId(21);
		e2.getDep().setDName("Upstream");
		e2.getDep().setdId(200);
		
		//checking values after cloning
		
		System.out.println("\nAfter cloning\n");
		System.out.println(e);
		System.out.println(e2);
		


	}

}
