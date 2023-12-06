package week3.day2;

import java.util.ArrayList;
import java.util.Collections;

public class MissingElement {

	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,4,10,6,8};
			
		ArrayList<Integer> list = new ArrayList<Integer>();
						
		for(int i=0;i<arr1.length;i++) {
			list.add(arr1[i]);
		}
		
		Collections.sort(list);
		System.out.println(list);
		
		for (int i = list.get(0); i < list.get(list.size()-1); i++) {
			
			if(!list.contains(i)) {
				
				System.out.println(i+" ");
			}
			
					
	}

}
}