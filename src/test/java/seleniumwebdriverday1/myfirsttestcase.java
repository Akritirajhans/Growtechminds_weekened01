package seleniumwebdriverday1;

import org.openqa.selenium.chrome.ChromeDriver;

public class myfirsttestcase {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
	
		driver.get("https://in.search.yahoo.com/");
		
		String act_title=driver.getTitle();
		
		if(act_title.equals("Yahoo"))
		{
			System.out.println("Test passed");
		}
			else
			{
				System.out.println("Test failed");	
		}
		
		driver.close();
	}

}
