package day6_synchronisation;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fluentwaitdemo {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			
			
			
			WebDriverWait mywait= new WebDriverWait(driver, Duration.ofSeconds(5));
			
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();

	}

}
