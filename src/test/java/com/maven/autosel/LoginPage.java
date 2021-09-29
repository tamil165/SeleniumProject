package com.maven.autosel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
/**
* @author Mukesh_50
* 
* 
* This class will store all the locator and methods of login page
*
*/
public class LoginPage 
{
	
 
WebDriver driver;
 
 
 
By username=By.id("txtUsername");
By password=By.id("txtPassword");
By loginButton=By.name("Submit");
By welcome=By.partialLinkText("Welcome");
By logout=By.linkText("Logout");

 
 
public LoginPage(WebDriver driver)
{
this.driver=driver;
}
 
 
public void loginToWordpress(String userid,String pass)
{
 
driver.findElement(username).sendKeys(userid);
driver.findElement(password).sendKeys(pass);
driver.findElement(loginButton).click();
driver.findElement(welcome).click();
driver.findElement(logout).click();

}
 
 
public void typeUserName(String uid)
{
 
driver.findElement(username).sendKeys(uid);
}
 
public void typePassword(String pass)
{
 
driver.findElement(password).sendKeys(pass);
}
 
public void clickOnLoginButton()
{
driver.findElement(loginButton).click();
}

public void clickOnWelcome()
{
driver.findElement(welcome).click();
}

public void clickOnLogout()
{
driver.findElement(logout).click();
}
}