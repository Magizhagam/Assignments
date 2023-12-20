package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHints {

	public static void main(String[] args) {

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		Thread.sleep(4000);
		
		Set<String> winds = driver.getWindowHandles();
		List<String> lst=new ArrayList<String>(winds);
		driver.switchTo().window(lst.get(1));
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		Thread.sleep(5000);

		driver.switchTo().window(lst.get(0));
		
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Thread.sleep(4000);
		
		Set<String> winds1 = driver.getWindowHandles();
		List<String> lst1=new ArrayList<String>(winds1);
		driver.switchTo().window(lst1.get(1));
		
		Thread.sleep(3000);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		Thread.sleep(4000);
		
		driver.switchTo().window(lst.get(0));
		
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Thread.sleep(4000);
		
		Alert alt=driver.switchTo().alert();
		alt.accept();

		String title=driver.getTitle();
		System.out.println(title);

		

	}

}
