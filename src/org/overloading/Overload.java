package org.overloading;

public class Overload {
	public void employee(int empid) {
		System.out.println(empid);
	}
	public void employee (String name) {
		System.out.println(name);
	}
	public void employee (float salary) {
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		Overload o = new Overload();
		o.employee(375955);
		o.employee("Britto");
	    o.employee(5868);
		
	}

}
