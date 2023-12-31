package week4.day2;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--disable-notifications");
			
			ChromeDriver driver=new ChromeDriver(options);
			
			driver.get("https://www.nykaa.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			WebElement brands = driver.findElement(By.linkText("brands"));

			Actions a = new Actions(driver);
			a.moveToElement(brands).perform();
			
//			driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris", Keys.ENTER);
//			driver.findElement(By.linkText("L'Oreal Paris")).click();
//			driver.findElement(By.xpath("//span[@class='sort-name']")).click();
//			driver.findElement(By.xpath("//label[@for='radio_customer top rated_undefined']")).click();
//			
//			driver.findElement(By.xpath("//span[text()='Category']")).click();
//			driver.findElement(By.xpath("//span[text()='Hair']")).click();
//			driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
//			driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
//			
//			driver.findElement(By.xpath("//span[text()='Concern']")).click();
//			driver.findElement(By.xpath("//span[text()='Colour Protection']")).click();
			
			WebElement brand = driver.findElement(By.xpath("//span[text()='Discount']"));
			Actions clik = new Actions(driver);
			clik.scrollToElement(brand).perform();
			driver.findElement(By.xpath("//span[@class='sort-name']")).click();
			driver.findElement(By.xpath("(//div[@class='control-indicator radio '])[3]")).click();
			
			WebElement brand1 = driver.findElement(By.xpath("//span[text()='Preference']"));
			Actions clik1 = new Actions(driver);
			clik1.scrollToElement(brand1).perform();
			
			 driver.findElement(By.xpath("(//div[@class='filter-action']/div)[2]")).click();
			 driver.findElement(By.xpath("//span[text()='Hair']")).click();
			 driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
			 driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		
			
			 WebElement concern = driver.findElement(By.xpath("//span[text()='Formulation']")); 
			 Actions clik2 = new Actions(driver); 
			 clik2.scrollToElement(concern).perform();
			 driver.findElement(By.xpath("//span[text()='Concern']")).click();
			 
			 WebElement colorprot = driver.findElement(By.xpath("//span[text()='Colour Protection']")); 
			 Actions clik3 = new Actions(driver); 
			 clik3.scrollToElement(colorprot).perform();
			driver.findElement(By.xpath("(//span[text()='1'])[6]")).click();
			

			String text = driver.findElement(By.xpath("//span[text()='Shampoo']")).getText();
			 String c1 = "Shampoo";
			 
			 if(text.equals(c1)) {
				 System.out.println("Shampoo is present");
			 }
			 else {
				System.out.println("Shampoo not present");
			}
			 
			 driver.findElement(By.xpath("//div[@class='css-43m2vm']/img")).click();
			 
			 	Set<String> windowHandle = driver.getWindowHandles();
				List<String> winHan = new ArrayList<String>(windowHandle);
				driver.switchTo().window(winHan.get(1));
				
				driver.findElement(By.xpath("//span[text()='180ml']")).click();
				String text2 = driver.findElement(By.xpath("//span[text()='₹209']")).getText();
				System.out.println("The price is :" +text2 );
				
				driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
				driver.findElement(By.xpath("//button[@type='button']")).click();
				Thread.sleep(4000);
				WebElement frameEle = driver.findElement(By.xpath("(//iframe)[1]"));
				driver.switchTo().frame(frameEle);
				String text3 = driver.findElement(By.xpath("//span[text()='₹279']")).getText();
				System.out.println("The Grand Total is :" +text3 );
				driver.findElement(By.xpath("//span[text()='Proceed']")).click();
				driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
			
			driver.findElement(By.xpath("//div[@class='css-gecnnw eqr1d9n12']")).click();
			Thread.sleep(4000);
				String text4 = driver.findElement(By.xpath("//p[text()='₹279']")).getText();
				System.out.println("The Grand Total is :" +text4 );
				
				if(text3.equals(text4)) {
					System.out.println("The price is same in 2 pages");
				}
				else {
					System.out.println("The price is not same in 2 pages");
				}
				
				driver.close();
				driver.switchTo().window(winHan.get(0));
				driver.close();
			
			
	}
	
}
