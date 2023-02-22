package collecctionsprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data= {1,2,2,3,5,6,6,7,8,9};
		
		Set<Integer> ts= new TreeSet<Integer>();
		
		for(int i=0;i<data.length;i++) {
			ts.add(data[i]);
			
			
		}
		System.out.println(ts);
		
		List<Integer> in=new ArrayList<Integer>();
		in.addAll(0,ts);
		System.out.println(in);
			
		int j=in.size();
		System.out.println(j);
		
		for( int i=0;i<j-1;i++) {
			int num=in.get(i);
			int don=num+1;
			int tum=in.get(i+1);
			if(don==tum) {
				System.out.println("number is there");
			}
			else
				System.out.println(don);
		}
	
	}

}
