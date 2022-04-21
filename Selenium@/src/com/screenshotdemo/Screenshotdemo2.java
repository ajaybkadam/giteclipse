package com.screenshotdemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotdemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
	System.setProperty("webdriver.chrome.driver","D:chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.get("file:///H:/SELENIUM/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
	
		
	TakesScreenshot screen=(TakesScreenshot)driver;	
	File srcFile=screen.getScreenshotAs(OutputType.FILE);	
	FileUtils.copyFile(srcFile, new File("I:eclipse-jee-neon-3-win32-x86_64 testngmavenSelenium@srccomscreenshotdemo.png"));
		
	

		
		
	
		
		
	}

}
