package com.javabykiran;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumPractice {
WebDriver driver;
	
	@Test
	public void checktest(){
		
	 System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	 WebDriver driver =  new ChromeDriver();
	 System.out.println("=====================================================");
	 driver.get("https://accounts.google.com/b/0/AddMailService ");
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input ")).sendKeys("ajaybkadam17@gmail.com");
     driver.findElement(By.xpath(" /html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();
	 String at=driver.getTitle();
	 String et="Sign in – Google accounts";
	 driver.close();
	 Assert.assertEquals(at, et);
       
     
	}
  
	
	
	public void postman(){
		
		 System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		 WebDriver driver =  new ChromeDriver();	
		
		driver.get(" https://mhpostot.onlineapplicationform.org/ObjectionTrackerPortalWeb/loginPage.jsp");
		driver.manage().window().maximize();
		
		
		
	}
	
	
	 @Test
	  public void Action(){
		  
		  System.setProperty("webDriver.chrome.driver","chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.browserstack.com/guide/action-class-in-selenium");
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			Actions action =new Actions(driver);
		WebElement element=	driver.findElement(By.linkText("guide-tags__badge-link custom-btn-amp-events"));
		action.moveToElement(element).click().perform();	
		  
	
	
	
	
	
	
	
	
	 }	
	
	
	
}
