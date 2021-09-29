package com.maven.autosel;

 


import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

 

import io.github.bonigarcia.wdm.WebDriverManager;

 

public class Example1
{
	//c static void main(String args[]) throws InterruptedException
	@Test
	public void sell() throws InterruptedException
	{
		
		
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\tamilselvann\\eclipse-workspace-selenium\\SelelniumProject\\driver\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();	
	//stem.setProperty("webdriver.gecko.driver","C:\\Users\\tamilselvann\\eclipse-workspace-selenium\\SelelniumProject\\driver\\geckodriver.exe");
	//bDriver driver = new FirefoxDriver();
		WebDriverManager.chromedriver().setup();
        //WebDriver driver = new FirefoxDriver();
        WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(3000);
	driver.findElement(By.partialLinkText("Welcome")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Logout")).click();
	driver.close();
	


	
	}	
	@Test
	public void Clickbtn() {
		String baseUrl = "http://facebook.com/";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		WebElement txtUsername = driver.findElement(By.id("email"));
		Actions builder = new Actions(driver);
		org.openqa.selenium.interactions.Action seriesOfActions = builder
		.moveToElement(txtUsername)
		.click()
		.keyDown(txtUsername, Keys.SHIFT)
		.sendKeys(txtUsername,"hello")
		.keyUp(txtUsername, Keys.SHIFT)
		.doubleClick(txtUsername)
		.contextClick()
		.build();
		seriesOfActions.perform();
		}

}
