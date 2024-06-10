package Xpathday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathdemo {

	private static final String String_xpath = null;

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//xpath with single attribute
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Tshirt");
		//driver.findElement(By.xpath("//*[@title='MacBook']")).click();
		
		//Xpath with multiple attribute
	//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']"));
	
	//xpath with and operator----> Both attribute should be true
	
	//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']"));
		
		//xpath with or operator----> one attribute should be true
		
		//driver.findElement(By.xpath("//input[@name='search'][@placeholder='XYU']"));
		//driver.findElement(By.xpath("//*[@class='img-fluid']")).click();
		//driver.findElement(By.xpath("//img[@title='Canon EOS 5D']")).click();
		// xapth with text() method
		
		//driver.findElement(By.xpath("//*[text()='Components']")).click();
	  /* boolean display= driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
	   System.out.println(display);
	   String value=driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
	   System.out.println(value);
	   */
		
		//xpath with contains()
	//	driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Tshirt");
		//xpath with Starts-with()method
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Tshirt");
		
		//Xpath with chained
		boolean display= driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		System.out.println(display);
	}
	


}
