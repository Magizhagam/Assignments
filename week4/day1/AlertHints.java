package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHints {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("(//a[@class='product-title'])[1]")).click();
		
		driver.findElement(By.name("wk_zipcode")).sendKeys("600001");
		driver.findElement(By.xpath("//input[@value='Check']")).click();
		
		driver.findElement(By.xpath("//span[text()= 'Add to Cart']")).click();
		
		driver.findElement(By.xpath("//span[text()= 'View Cart']")).click();
		
		driver.findElement(By.xpath("(//span[text()= 'Checkout'])[1]")).click();
		
				
		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("Close");
		alert.accept();
		
		String element = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(element);


	}

}
