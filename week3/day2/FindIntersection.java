package week3.day2;

import java.util.ArrayList;
import java.util.Collections;

public class FindIntersection {

	public static void main(String[] args) {
		
		int arr1[] = {3,2,11,4,6,7};
		int arr2[] = {1,2,8,4,9,7};
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
		
				
		for(int i=0;i<arr1.length;i++) {
			arrayList.add(arr1[i]);
		}
		
		for(int j=0;j<arr2.length;j++) {
			arrayList1.add(arr2[j]);
		}
		
		Collections.sort(arrayList);
		Collections.sort(arrayList1);
		
		for (int i = 0; i < arrayList.size(); i++) {
			
			for (int j = 0; j < arrayList1.size(); j++) {
				
				if(arrayList.get(i)==arrayList1.get(j))
					
				{
					System.out.println("Intersection Elements...." + arrayList.get(i) + "");
				}
			}
			
		}

	}

}
