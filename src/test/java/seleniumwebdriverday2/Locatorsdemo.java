package seleniumwebdriverday2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsdemo {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://demo.opencart.com/");
		 driver.manage().window().maximize();
		 
		// driver.findElement(By.name("search")).sendKeys("samsung");
		 //boolean logoDisplaystatus=driver.findElement(By.id("logo")).isDisplayed();
		 //System.out.println(logoDisplaystatus); 
		 
		// driver.findElement(By.linkText("Tablets")).click();
		// driver.findElement(By.partialLinkText("Table")).click();	
		 
	//List<WebElement> headerLinks= driver.findElements(By.className("list-inline-item"));
		// System.out.println("total number of header links:"+headerLinks.size());
		 
		// List<WebElement> Links= driver.findElements (By.tagName("a"));
		// System.out.println("total number of header links:"+Links.size());
		 
		 List<WebElement> images= driver.findElements (By.tagName("img"));
		 System.out.println("total number of images :"+images
				 .size());
		 
		 
		 
				 }

}
