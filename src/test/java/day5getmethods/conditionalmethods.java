package day5getmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalmethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	// WebElement logo=driver.findElement(By.xpath("(//img[@title='Flipkart'])"));
	 //System.out.println("Display status of logo:"+logo.isDisplayed());
		//boolean status=driver.findElement(By.xpath("(//img[@title='Flipkart'])")).isDisplayed();
		// System.out.println("Display status of logo:"+status);
		
		//is enabled method
		//boolean status=driver.findElement(By.xpath("(//input[@placeholder='Search for Products, Brands and More'])")).isEnabled();
		//System.out.println("Display status of sss:"+status);
		
		driver.findElement(By.xpath("//*[text()='Account']")).click();
		
		
	}

}
