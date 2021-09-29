package com.maven.autosel;


	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Test;
	
	import com.maven.autosel.LoginPage;
	
	 
	/**
	* @author Mukesh_50
	*
	*/
	public class VerifyWordpressLogin 
	{
		public static void main(String []args) throws InterruptedException
		{
	 
	 
	System.setProperty("webdriver.gecko.driver","C:\\Users\\tamilselvann\\eclipse-workspace-selenium\\SelelniumProject\\driver\\geckodriver.exe");
	 
	WebDriver driver=new FirefoxDriver();
	 
	driver.manage().window().maximize();
	 
	driver.get("https://opensource-demo.orangehrmlive.com/");
	 
	LoginPage login=new LoginPage(driver);
	
	login.typeUserName("Admin");
	
	login.typePassword("admin123");
	 
	login.clickOnLoginButton();
	Thread.sleep(2000);
	
	login.clickOnWelcome();
	login.clickOnLogout();
	
	Thread.sleep(2000);
	
	//2nd
	
	try {
		
	
	login.typeUserName("Admin");
	
	login.typePassword("admin1234");
	 
	login.clickOnLoginButton();
	Thread.sleep(2000);
	
	login.clickOnWelcome();
	login.clickOnLogout();
	
	
	}
	catch(Exception e)
	{
		System.out.println("Invalid Credentials");
	}
	
	
	login.typeUserName("Admin");
	
	login.typePassword("admin123");
	 
	login.clickOnLoginButton();
	
	Thread.sleep(2000);
	
	login.clickOnWelcome();
	login.clickOnLogout();
	
	
	
	 
	 
	driver.quit();
	 
	}
	 
	 
	}
	

