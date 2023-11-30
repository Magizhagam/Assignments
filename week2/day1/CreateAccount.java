package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("abcd12");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select in = new Select(industry);
		in.selectByValue("IND_SOFTWARE");
		
		WebElement owner = driver.findElement(By.name("ownershipEnumId"));
		Select o = new Select(owner);
		o.selectByVisibleText("S-Corporation");
		
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select s = new Select(source);
		s.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketing = driver.findElement(By.id("marketingCampaignId"));
		Select m = new Select(marketing);
		m.selectByIndex(5);
		
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select st = new Select(state);
		st.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		
		WebElement acc = driver.findElement(By.id("accountName"));
		System.out.println("New Account Created Successfully......." +acc.getAttribute("value"));
		
		driver.close();
				
		
	}

}
