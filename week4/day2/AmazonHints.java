package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.compress.harmony.pack200.NewAttributeBands;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonHints {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
		
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		
		price = price.concat(".00");
		
		System.out.println("Price of the Product : "+price);
		
		String rating = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-star-small a-star-small-4 aok-align-bottom'])[1]")).getText();
		//String rating = driver.findElement(By.xpath("(//span[@class='a-icon-alt'])[1]")).getText();
		System.out.println("Product Rating  : "+ rating );
		
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handle=new ArrayList<String>(windowHandles);

		driver.switchTo().window(handle.get(2));
		
		WebElement screen = driver.findElement(By.id("landingImage"));
		
		File src = screen.getScreenshotAs(OutputType.FILE);
		File des = new File("./ScreenShot/phone.png");
		FileUtils.copyFile(src, des);
		Thread.sleep(2000);
		
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(2000);
		
		String Total = driver.findElement(By.xpath("(//span[@id='attach-accessory-cart-subtotal'])[1]")).getText();
		
	//	driver.switchTo().window(handle.get(1));
				
		System.out.println("Total Cart : "+Total);
		
	//	driver.close();
		
		if(price==Total)
		{
			System.out.println("Total Amount is Matched");
		}
		
		else {
			
			System.out.println("Total not Matched");
		}
	}

}
