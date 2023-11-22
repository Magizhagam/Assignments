package week1.day2.Assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int range = 8;
		int FN =0;
		int SN =1;
		int sum;
		
		System.out.println("Fibonacci Series is  "  +FN);
		System.out.println("Fibonacci Series is  "  +SN);
		
		for (int i = 1; i <= range; i++) {
			
			sum = FN + SN;
			FN = SN;
			SN = sum;
		
			System.out.println("Fibonacci Series is  " +sum);
		}

	}

}
