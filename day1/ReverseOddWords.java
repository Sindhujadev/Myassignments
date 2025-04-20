package week3.day1;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test= "I am a sowftware tester";
		String t=test.replaceAll(" ", ",");
		System.out.println(t);
		

		String[] str_Array = t.split(","); 

		 for (int i=0;i<str_Array.length;i++) {
			 
             System.out.println("str_Array[" + i+ "]=" + str_Array[i]);
             
		 }
		 
		
		
		for(int i=0;i<str_Array.length;i++) {
			
			
			if(i%2 !=0 ) {
				
				char[] ca = str_Array[i].toCharArray();
				String rev = "" ;
				for(int j=ca.length-1;j>=0;j--) {
				rev=rev+ca[j];
				}
				
				str_Array[i]=rev;
				
			}
			
			
			
		
				
		}
		
		
		
		String result = String.join(" ", str_Array);
        System.out.println(result);

	}

}
