package checkboxdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxescccc {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
       driver.manage().window().maximize();
       
       //1. select specific checkbox
       //driver.findElement(By.xpath("//input[@id='sunday']")).click();
       
       //2 caputure all checkbox means multiple webelement
      List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
      /* for(int i=0;i<checkboxes.size();i++)
       {
    	   checkboxes.get(i).click();
       }*/
      
    //Enhnacer for loop
      //for(WebElement checkbox:checkboxes) 
    //  {
    	 // checkbox.click();
    	  
    //}
      
      // 3.Select last 3 checkbox
      
      
      
      
       }
  
	}


