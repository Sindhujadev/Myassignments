package collecctionsprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		Set<Integer> ts = new TreeSet<Integer>();
		
		for (int i=0;i<data.length;i++) {
			ts.add(data[i]);
			
		}
		System.out.println(ts);
		
		List<Integer> in=new ArrayList<Integer>();
		in.addAll(0,ts);
		System.out.println(in);
		System.out.println(in.get(in.size()-2));
	}


}
