package week3.day1;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text1 = "stops";
		String text2 = "potss";
		
		if(text1.length()==text2.length()) {
			System.out.println("length matched");
		}
		else {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
		
		char[] cs1 = text1.toCharArray();
		char[] cs2 = text2.toCharArray();
		
		Arrays.sort(cs1);
		Arrays.sort(cs2);
		System.out.println(cs1);
		System.out.println(cs2);
		
		
		if(Arrays.equals(cs1, cs2)) {
			System.out.println("The given strings are Anagram.");
		}else {
			System.out.println("The given strings are not an Anagram.");
		}
	}

}
