package TestNPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotationdeem {

	
	
	@BeforeSuite
	public void beforeSuiteMethod()
	{
		System.out.println("BeforeSuite");
	}
	@BeforeTest
	public void beforeTestMethod()
	{
		System.out.println("Beforetest");
	}
	@BeforeClass
	public void beforeClassMethod()
	{
		System.out.println("Beforeclass");
	}
	@BeforeMethod
	public void beforemethodMethod()
	{
		System.out.println("Beforemethod");
	}
	@Test
	public void test1()
	{
		System.out.println("Test 1");
	}
	@Test
	public void test2()
	{
		System.out.println("Test 2");
	}
	
	@AfterMethod
	public void AftermethodMethod()
	{
		System.out.println("Aftermethod");
	}
	@AfterClass
	public void afterClassMethod()
	{
		System.out.println("afterCLass");
	}
	@AfterTest
	public void afterTestMethod()
	{
		System.out.println("aftertest");
	}
	@AfterSuite
	public void afterSuiteMethod()
	{
		System.out.println("AfterSuite");
	}
}
