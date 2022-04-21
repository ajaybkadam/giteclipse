package com.javabykiran;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JBKSCREENSHOT {

	
	@Test
	public void Taskfirst() throws Exception{
		
		
		
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("file:///H:/SELENIUM/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
	
	
    driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input")).sendKeys("kiran@gmail.com");
    
    
 
		
		
		
		
	}
	
	

	
	
}
