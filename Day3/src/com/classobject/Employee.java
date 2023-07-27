package com.classobject;

class Employee<T> {
	

	private T ename;
	private T email;
	private T eid;
	private T salary;
	
	
	public Employee() {
		super();
	}
	public Employee(T ename, T email, T eid, T salary) {
		super();
		this.ename = ename;
		this.email = email;
		this.eid = eid;
		this.salary = salary;
	}
	public T getEname() {
		return ename;
	}
	public void setEname(T ename) {
		this.ename = ename;
	}
	public T getEmail() {
		return email;
	}
	public void setEmail(T email) {
		this.email = email;
	}
	public T getEid() {
		return eid;
	}
	public void setEid(T eid) {
		this.eid = eid;
	}
	public T getSalary() {
		return salary;
	}
	public void setSalary(T salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", email=" + email + ", eid=" + eid + ", salary=" + salary + "]";
	}
	
	
	
	

	
}
