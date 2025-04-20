package week3.day1;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int a[]={3,2,11,4,6,7}; 
         int b[]={1,2,8,4,9,7}; 
         
         for(int i:a) {
        	 for(int j:b) {
        		if(i==j) {
        			System.out.println(i);
        		}
        	 }
         }

	}

}
