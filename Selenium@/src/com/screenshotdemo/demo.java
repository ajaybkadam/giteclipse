package com.screenshotdemo;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "D:chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///H:/SELENIUM/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/dashboard.html");	
		// File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.);
		TakesScreenshot t= (TakesScreenshot)driver;	
		File srcfile=t.getScreenshotAs(OutputType.FILE);	

		FileUtils.copyFile(srcfile, new File("I:eclipse-jee-neon-3-win32-x86_64 testngmavenSelenium@srccomscreenshotdemo.png"));



	}	


		
		
		
		
		
		
		
		
		
		
		
		
	}


