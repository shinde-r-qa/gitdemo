package gitdemo1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeClass 
	public void openbrowser()
	{
	System.out.println("open broswer");
	System.out.println("open web app");
		}
	//if @Beforeclass is used, it wil execute only once and rest of test methods will get executed.
	// if @Beforemethod is used, it will be executed before every test method
	//before method can be given before specific methods 
	
	@BeforeMethod // will execute this method before every test method
	public void login()
	{
		System.out.println("log in");		
	}
	@Test(priority='1')
	public void createemail()
	{
		System.out.println("create email");		
	}
	@Test(priority='2')
	public void modifyemail()
	{
		System.out.println("modify email");		
	}
	@Test(priority='3')
	public void deleteemail()
	{
		System.out.println("delete email");		
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("logout");	
	}
	
	@AfterClass
	public void closebrowser()
	{
	System.out.println("close broswer");		
	}
	// same like @Beforeclass and @Beforemethod, @Afterclass and @Aftermethod 

}
