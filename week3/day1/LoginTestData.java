package week3.day1;

public class LoginTestData extends TestData{

public void enterUsername()
	
	{
		System.out.println("Enter Username..");
	}
	
	public void enterPassord()
	
	{
		System.out.println("Enter Password..");
	}

	
	
	public static void main(String[] args) {
		
		TestData t = new TestData();
		t.enterCendential();
		t.navigatetoHomePage();
		
		LoginTestData l = new LoginTestData();
		l.enterCendential();
		l.enterPassord();

	}

}
