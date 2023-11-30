package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("XYZ");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("def");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("dfghfg");
		driver.findElement(By.name("departmentName")).sendKeys("Dept");
		driver.findElement(By.name("description")).sendKeys("Testing");
		driver.findElement(By.name("primaryEmail")).sendKeys("Yahoo@gmail.com");
		
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select st = new Select(state);
		st.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("Good Bye");
		driver.findElement(By.name("submitButton")).click();
		
		String title = driver.getTitle();
		
		System.out.println("Title of the Page...." +title);
		
			
	}

}
