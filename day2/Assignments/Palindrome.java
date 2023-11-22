package week1.day2.Assignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 34343;
		
		int t,x,rev;
		t=num;
		
		for (rev = 0; t>0; t=t/10) {
			
			x = t%10;
			rev = rev*10 + x;
		}
		
		if(rev==num) 
		{
			System.out.println("The Number is Polindrome.." +num);
		}
		
		else
		{
			System.out.println("The Number is not a Polindrome.." +num);
		}

	}

}
