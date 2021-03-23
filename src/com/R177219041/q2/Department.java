package com.R177219041.q2;

public class Department implements Cloneable{
	
	int dId;
	String dName;
	
	public Department(int dId, String dName) {
		super();
		this.dId = dId;
		this.dName = dName;
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getDName() {
		return dName;
	}

	public void setDName(String dep) {
		this.dName = dep;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "DepId : "+dId+"|DepName : "+dName;
	}
	
	@Override
	protected Department clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Department) super.clone();
	}
	

}
