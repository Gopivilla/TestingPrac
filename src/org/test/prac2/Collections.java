package org.test.prac2;

import java.util.ArrayList;
import java.util.List;

public class Collections {
	
	public static void main(String[] args) {
		
       List<Integer> a=new ArrayList<>();
      
       
         a.add(10); //0
         a.add(20); //1
         a.add(30); //2
         a.add(90); //3
         a.add(10); //4
         a.add(10); //5
         a.add(40); //6
         a.add(50); //7
         
         System.out.println(a);
         
         
         int indexOf = a.indexOf(10);
         System.out.println(indexOf);
         
         int lastIndexOf = a.lastIndexOf(10);
         System.out.println(lastIndexOf);
         
         Integer integer = a.get(3);
         System.out.println(integer);
         
         Integer integer2 = a.get(7);
         System.out.println(integer2);
         
         
         
         
		
		
		
		
		
		
		
	}

}
