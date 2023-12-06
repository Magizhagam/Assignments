package week3.day2;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {
		
		String arr[] = {"HCL", "Wipro", "Aspire System", "CTS"}; 
		ArrayList<String> List = new ArrayList<String>();
		
				
		for(int i=0;i<arr.length;i++) {
			List.add(arr[i]);
		}
		
		//System.out.println(List);
		
		Collections.sort(List);
		System.out.println("Asending Order..." +List);
		
		Collections.sort(List, Collections.reverseOrder());
		
		System.out.println("Desending Order..." +List);
	}

}
