package week1.day2.Assignments;

public class Primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ip = 13;
		boolean flag = false;
		
		for (int i = 2; i <=ip/2; i++) {
			
			if(ip %i ==0)
			{
				flag = true;
				break;
			}
			
		}
		
		if(flag = false)
		{
			System.out.println(ip+" The Number is not a Prime");
		}
		else 
		{
			System.out.println(ip+ " The Number is a Prime");
		}
		
		
	}

}
