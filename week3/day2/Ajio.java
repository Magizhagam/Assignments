package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();

		
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags", Keys.ENTER);
		
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		
		String count = driver.findElement(By.xpath("//*[@id=\"products\"]/div[3]/div/div[1]")).getText();
		
		System.out.println(" Count of Items Found...." +count);
		
		List<WebElement> brands=driver.findElements(By.xpath("//div[@class='brand']"));
		
		for(int i=0;i<brands.size();i++) {
			System.out.println(brands.get(i).getText());
		}
		
		
		List<WebElement> bags=driver.findElements(By.xpath("//div[@class='nameCls']"));
		
		for(int i=0;i<bags.size();i++) {
			System.out.println(bags.get(i).getText());
		}
		
	}

}
