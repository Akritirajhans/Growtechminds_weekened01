package day5getmethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getmethodspractice {
public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		//get url
		driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        //driver.quit();
        
        // get Title
    /*String actual_title= driver.getTitle();
     if(actual_title.equals("Orange HRM"))
		{
			System.out.println("Test passed");
		}
			else
			{
				System.out.println("Test failed");	
		}
     // get currenturl
     System.out.println(driver.getCurrentUrl());
     
    //page source
    System.out.println(driver.getPageSource());*/
        
        //getWindowHandle
        
      // String windowid= driver.getWindowHandle();
     //System.out.println(windowid);
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
     Set<String>windowids=driver.getWindowHandles();
     System.out.println(windowids);
	}

}
