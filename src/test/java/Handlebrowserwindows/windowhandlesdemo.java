package Handlebrowserwindows;

import java.time.Duration;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class windowhandlesdemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		// we need to caputure  id's for both windows 
		// driver.getWindowHandles();---> so this will return id in SET collection so 
		// we have to store it in variable, it will return in string .
		
		Set<String> windowIDs=driver.getWindowHandles();
		
		// Now, windowIDs will contain both parent and child browser id so both in set collection
		// we need to get individual id how to get it?
		//Approach 1---> Looping statement and iterate it. Approach 2. convert it in list and extract
		
		// Approach 1 convert set in array list only two windows id
		//List<String> windowList=new ArrayList(windowIDs);
		//String parentid=windowList.get(0);
		//String childid=windowList.get(1);
		 
		 
		 //switch to child window
		 
		//driver.switchTo().window(parentid);
		//System.out.println(driver.getTitle());
		
		//Approach 2: more than 2 window or 5 6 browser, using loop 
		
		for(String windID:windowIDs)
		{
		String title=driver.switchTo().window(windID).getTitle();
		
		if(title.equals("OrangeHRM"))
		{
			System.out.println(driver.getCurrentUrl());
		}
		
	//	else
	//	{
	//		System.out.println(driver.getCurrentUrl());	
	//	}
		
	}
		
	}

}
