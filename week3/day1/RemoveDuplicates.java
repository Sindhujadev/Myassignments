package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "We learn java basics as part of java sessions in java week1";

		String t=text.replaceAll(" ", ",");
		System.out.println(t);
  
		
		String[] str_Array = t.split(","); 

		 for (int i=0;i<str_Array.length;i++) {
			 
             System.out.println("str_Array[" + i+ "]=" + str_Array[i]);
             
		 }
		 
		 System.out.println(str_Array[1]);
		System.out.println(str_Array.length);
		
		Set<String> ts = new LinkedHashSet<String>();
		
 		for(int i=0;i<str_Array.length;i++) {
			ts.add(str_Array[i]);
			//System.out.println(ts);
		}
		System.out.println(ts);
		String ts1=ts.toString();
		String ts2=ts1.replaceAll(",", " ");
		System.out.println(ts2);
	}


}
