package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Durations;
import io.cucumber.java.be.I.Is;

public class BusTickectBooking {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//div/div[(text()='Chennai')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//div/div[(text()='Bangalore')]")).click();
		driver.findElement(By.xpath("//a[text()='Tomorrow']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		Thread.sleep(2000);
		
		String title = driver.findElement(By.xpath("(//h5[@class='title'])[1]")).getText();
		System.out.println("First Bus in the Selection List Is .class.."+title);
		
		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
		
		String seats = driver.findElement(By.xpath("//div[@id='service-operator-select-seat-1770701618']//small[1]")).getText();
		System.out.println("Number of Seats are Aviable..." +seats);
		
		driver.findElement(By.xpath("(//button[text()='Show Seats'])[1]")).click();
		
		driver.findElement(By.xpath("//button[@class='seat sleeper']//span[contains(text(),'L3')]")).click();
		driver.findElement(By.xpath("(//input[@class='primary  '])[2]")).click();
		driver.findElement(By.xpath("(//input[@class='primary  '])[2]")).click();
		
		String selected = driver.findElement(By.xpath("(//div[@class='row selectedSeatDetails']//span)[2]")).getText();
		System.out.println("Selected Seat Number..." +selected);
		
		String fare =  driver.findElement(By.xpath("(//div[@class='row selectedSeatDetails']//span)[4]")).getText();
		System.out.println("Total Ticket Fare..." +fare);
		
		String title1 = driver.getTitle();
		System.out.println("Title of Current Page..."+title1);
		
		driver.close();
		
		
		
	}

}
