package week3.day1;

public class ChangeOdd {

	public static void main(String[] args) {
		 String test = "changeme";
		 char [] chararray = test.toCharArray();
		 for (char  i = 0; i<test.length();i++) {
			 if (i%2 !=0) {
				 chararray[i]= Character.toUpperCase(chararray[i]); 
			 }
		 }
		System.out.println(chararray); 
	}

}
