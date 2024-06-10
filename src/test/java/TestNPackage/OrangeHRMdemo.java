package TestNPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OrangeHRMdemo {
	WebDriver driver;
	
	
	@BeforeSuite
	public void Setup()
	{
	
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(priority =1)
	public void login()
	{
	 driver.findElement(By.name("username")).sendKeys("Admin");
	 driver.findElement(By.name("password")).sendKeys("admin123");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test(priority =2)
	public void verifyloginpage()
	{
	String Das=	driver.findElement(By.xpath("//div[@id='app']/descendant::h6")).getText();
	if (Das.equals("Dashboard"))
	{
		System.out.println("Test case passed");
		
	}
	else
	{
		System.out.println("Test case failed");	
	}
	}
	
	@Test(priority =3)
	public void logout() throws InterruptedException
	{
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		driver.findElement(By.xpath("//ul[@role='menu']/child::li[4]/child::a[1]")).click();
		Thread.sleep(5000);
			}
	@AfterSuite
	public void closeBrowser()
		{
		driver.quit();	
	}
	
	}

