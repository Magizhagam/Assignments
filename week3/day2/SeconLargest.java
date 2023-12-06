package week3.day2;

import java.util.ArrayList;
import java.util.Collections;

public class SeconLargest {

	public static void main(String[] args) {
		
		int arr1[] = {3,2,11,4,6,7};
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
				
		for(int i=0;i<arr1.length;i++) {
			arrayList.add(arr1[i]);
		}
		
		Collections.sort(arrayList);
		
		//System.out.println(arrayList);
		
		System.out.println("Second Larget Number is... " +arrayList.get(4));

	}

}
