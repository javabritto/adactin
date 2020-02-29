package org.overloading.sample;

public class StaticOver extends Staticm {

	public StaticOver() {
		// TODO Auto-generated constructor stub
		this(10);
	System.out.println("my default constructor");
	}
	public StaticOver(int a) {
		// TODO Auto-generated constructor stub
		this("shahul");
	System.out.println("my parametrised constructor");
	}
	public StaticOver(String a) {
		// TODO Auto-generated constructor stub
		super(20);
	System.out.println("my parametrised string constructor");
	}
	
	public static void main(String[] args) {
		StaticOver s1 = new StaticOver();
		
	}

	
}
