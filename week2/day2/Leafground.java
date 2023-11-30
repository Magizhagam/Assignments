package week2.day2;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Point;


public class Leafground {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String title = driver.getTitle();
		System.out.println("Current Page Title...." +title);
		
		if (title == "Dashboard")
		{
			System.out.println("Page title is Valid");
		}
		
		driver.navigate().back();
		
		WebElement b = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']"));
		
		if(!b.isEnabled())
		{
			System.out.println("Button is Disabled");
		}
		else
		{
			System.out.println("Button is Enabled");
		}
		
		WebElement position = driver.findElement(By.xpath("(//span[contains(text(),'Submit')])[1]"));
		 Point buttonloc = position.getLocation();
		 System.out.println(buttonloc.getX());
		 System.out.println(buttonloc.getY());
		 
		 WebElement background = driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
		 String color = background.getCssValue("color");
		 System.out.println(color);
		
		 
		 
		 WebElement button = driver.findElement(By.xpath("(//span[contains(text(),'Submit')])[2]"));
		 Dimension size = button.getSize();
		 int height = size.getHeight();
		 int width = size.getWidth();
		 System.out.println(height);
		 System.out.println(width);
		 		
		 driver.close();
		 	

	}

}
