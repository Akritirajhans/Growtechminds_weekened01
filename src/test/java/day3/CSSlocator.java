package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSlocator {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
  driver.manage().window().maximize();
  
  //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Tshirt");
  //driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Tshirt");
  // driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Tshirt");
     driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("Tshirt");
}
}
