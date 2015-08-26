package com.demo.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AccountPage {
	
	public WebDriver driver;	
	
	@Test
	public void getTitle() throws Exception{
		driver = new FirefoxDriver();
		
		driver.get("http://docs.seleniumhq.org/");
		String titleHomePage = driver.getTitle();
		
		
		driver.findElement(By.linkText("Download")).click();
		Thread.sleep(2000);
		String titleDownloadPage = driver.getTitle();
	}

}
