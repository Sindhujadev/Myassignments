package collecctionsprogram;

import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="SindhujaDevendran";
		char[] ca = name.toCharArray();

		System.out.println(ca[8]);
		
		Set<Character> ts=new HashSet<Character>();
		
		for( int i=0;i<ca.length;i++) {
			ts.add(ca[i]);
		}
		System.out.println(ts);
		
	}

}
