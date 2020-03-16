package org.overloading;

public class Overload {
	public void employee(int empid) {
		System.out.println(empid);
	}
	public void employee (String name, int age) {
		System.out.println(name +"age is" +age);
		
	}
	public void employee (float salary) {
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		Overload o = new Overload();
		Overload o1 = new Overload();
		o.employee(787465);
		o.employee("Pavan", 30);
	    o.employee(78205.00f);
		o1.employee(720401);
		o1.employee("Java", 21);
	}

}
