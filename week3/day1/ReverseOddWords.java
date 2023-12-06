package week3.day1;

public class ReverseOddWords {

	public static void main(String[] args) {

		String text ="I am a software tester";
		String v ="";
		String reverse ="";
		String[] s = text.split(" ");
		
		for(int i=0;i<s.length; i++) {
			
			
			v=s[i];
			String reverseword ="";
			for(int j=v.length()-1; j>=0; j--) {
				
							
					reverseword = reverseword + v.charAt(j);
				}
			
				
				
			reverse = reverse + reverseword + " ";
			
		}
		
		System.out.println("Reverse ODD Position Words are..." +  reverse);

	}

}
