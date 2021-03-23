package com.R177219041.q2;

//enable Arrays.sort
import java.util.Arrays;

public class Employee implements Cloneable{
	
	private int id;
	private String name;
	private Department dep;
	
	public Employee(String name,int id,Department dep) {
		this.name = name;
		this.id = id;
		this.dep = dep;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}	
	
	public Department getDep() {
		return dep;
	}

	public void setDep(Department dep) {
		this.dep = dep;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id :"+id+"| name : "+name+ " |Department : "+dep;
	}
	
	@Override
	protected Employee clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Employee newEmp = (Employee)super.clone();
		newEmp.setDep(newEmp.getDep().clone());
		
		return newEmp;
	}
	
	
	
	
	

}
