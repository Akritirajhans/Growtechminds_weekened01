package day6_synchronisation;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwaitdemo {


	public static void main(String[] args) throws InterruptedException {
				WebDriver driver=new ChromeDriver();
				
				
				
				WebDriverWait mywait= new WebDriverWait(driver, Duration.ofSeconds(5));
				
				driver.get("https://opensource-demo.orangehrmlive.com/");
				driver.manage().window().maximize();
				
			WebElement txtusername=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));

			txtusername.sendKeys("Admin");
			 
			//	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
			
			WebElement txtpassword=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));

			txtpassword.sendKeys("admin123");
		WebElement loginbtn= mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		loginbtn.click();

	}

}
 