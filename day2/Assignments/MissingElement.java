package week1.day2.Assignments;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,7,6,8};
		
		
		Arrays.sort(arr);
		int n = arr.length;
		int sum = (n+1) * (n+2)/2;
		for (int i = 0; i < arr.length; i++) 
		{
			
				
				sum = sum-arr[i];
				
		}
			System.out.println("Missing Element in an Array  " +sum);
							

	}

}
