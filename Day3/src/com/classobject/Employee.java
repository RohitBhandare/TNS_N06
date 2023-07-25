package com.classobject;

class Employee {
	

	private String ename;
	private String email;
	private int eid;
	private long salary;
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", email=" + email + ", eid=" + eid + ", salary=" + salary + "]";
	}
	
	
	
	

	
}
