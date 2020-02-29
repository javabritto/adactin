package org.overloading.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public  class Staticm {
	
 public Staticm(int a) {
	// TODO Auto-generated constructor stub
System.out.println("my parent parametrized constructor");
int b =0, c=58253, d=0,temp =0;
List<Integer> li =new ArrayList<Integer>();

while(c>0)
{
	b = c%10;
	c =c/10;
	li.add(b);
	
}
Collections.sort(li); 
for (int i = 0; i < li.size(); i++) {
	 System.out.print(li.get(i));
	
}
 }
 

}
