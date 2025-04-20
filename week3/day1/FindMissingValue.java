package week3.day1;

import java.util.Arrays;

public class FindMissingValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,4,3,2,8,6,7};   
		
		
		Arrays.sort(a);

		System.out.println(a.length);
		System.out.println(Arrays.toString(a));
		
		
		
		for(int i=0;i<a.length;i++) {
			if((i+1)==a[i]) {
				continue;
				
			}else {
				System.out.println(i+1);
				break;
			}
				
		}

	}

	

}
