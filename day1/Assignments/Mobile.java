package week1.day1.Assignments;

public class Mobile {
	
	public void makecall() {
		
		String mobileModel = "One Plus+";
		float mobileWeight = 200.56f;
		System.out.println("Mobile Model is " +mobileModel);
		System.out.println("Mobile Weight is "+mobileWeight);
	}
	
public void sendmsg() {
		
		boolean isFullCharged = true;
		int mobileCost = 40000;
		System.out.println("Mobile is Fully Charged =" +isFullCharged);
		System.out.println("Mobile Price "+mobileCost);
	}

	
	public static void main(String[] args) {
		
		Mobile obj = new Mobile();
		obj.makecall();
		obj.sendmsg();
				
		System.out.println("This is my Mobile");
		
	}
}
