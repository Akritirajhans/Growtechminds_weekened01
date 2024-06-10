package navigationalcommand;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationalcommandssss {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver=new ChromeDriver();
		
	//driver.navigate().to("https://demo.nopcommerce.com/");
		
		//URL myurl=new URL("https://demo.nopcommerce.com/");
		//driver.navigate().to(myurl);
		
		driver.navigate().to("https://demo.nopcommerce.com");
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
		
	}

}
