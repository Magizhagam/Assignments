package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		  Thread.sleep(1000);
		  //driver.findElement(By.id("u_0_0_9w")).click();
		  driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("asdfg123");  
		  //driver.findElement(By.name("firstname")).sendKeys("asdfgh124");
		  driver.findElement(By.name("lastname")).sendKeys("s");
		  driver.findElement(By.name("reg_email__")).sendKeys("maxifymaximo@gmail.com");
		  driver.findElement(By.name("reg_passwd__")).sendKeys("abcdef123");
		  
		  WebElement day = driver.findElement(By.id("day"));
		  Select d = new Select(day);
		  d.selectByIndex(9);
		  
		  WebElement month = driver.findElement(By.id("month"));
		  Select m = new Select(month);
		  m.selectByIndex(6);
		  
		  WebElement year = driver.findElement(By.id("year"));
		  Select y = new Select(year);
		  y.selectByVisibleText("1992");
				  
		  driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/label[text()='Male']")).click();
		  
		  driver.findElement(By.name("websubmit")).click();
		  
		  String title = driver.getTitle(); System.out.println(title);
		  
		  driver.close();
		  
		 
	}

}
