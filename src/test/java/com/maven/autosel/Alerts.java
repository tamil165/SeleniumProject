package com.maven.autosel;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
	
	@Test
	public void alertexample() throws InterruptedException, IOException, AWTException{
		
		WebDriverManager.chromedriver().setup();
        
        WebDriver driver = new ChromeDriver();
		
	
	  // Alert Message handling
	
    driver.get("http://demo.guru99.com/test/delete_customer.php");	
    driver.manage().window().maximize();
       
//1.Screenshot
    
   /* TakesScreenshot screenshot=(TakesScreenshot)driver;
    File sourceFile=screenshot.getScreenshotAs(OutputType.FILE);
    File destinationFile=new File("C:\\Users\\tamilselvann\\Pictures\\Screenshots\\snap1.png");
    FileHandler.copy(sourceFile, destinationFile);*/
 	      	
    driver.findElement(By.name("cusid")).sendKeys("53920");					
    driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/")).submit();	
    
    
    		
    // Switching to Alert        
    Alert alert = driver.switchTo().alert();		
    		
    // Capturing alert message.    
    String alertMessage= driver.switchTo().alert().getText();		
    		
    // Displaying alert message		
    System.out.println(alertMessage);	
    Thread.sleep(3000);
    
    //1.Screenshot
    
    /*TakesScreenshot screenshot=(TakesScreenshot)driver;
    File sourceFile=screenshot.getScreenshotAs(OutputType.FILE);
    File destinationFile=new File("C:\\Users\\tamilselvann\\Pictures\\Screenshots\\snap1.png");
    FileHandler.copy(sourceFile, destinationFile);*/
    
    //2.Screenshot
    
    /*Robot robot=new Robot();
    Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
    Rectangle rectangle=new Rectangle(screenSize);
    BufferedImage source=robot.createScreenCapture(rectangle);
    File destination=new File("C:\\Users\\tamilselvann\\Pictures\\Screenshots\\snap2.png");
    ImageIO.write(source, "png", destination);*/
    
    
    
    	// Accepting alert		
        alert.accept();	
        Thread.sleep(2000);
        driver.close();
       
    	
    
    
}	

}

