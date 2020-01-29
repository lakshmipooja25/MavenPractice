package com.MavenPractice.MavenPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestRun 
    
{
	WebDriver driver;
    @Test
    public void TestApplication()
    {
    	System.setProperty("webdriver.chrome.driver", "E:\\LAKSH\\Selenium\\Selenium Library\\Selenium Drivers\\chromedriver.exe");
    	driver=new ChromeDriver();
    	driver.get("http://newtours.demoaut.com");
    	driver.quit();
    }
}
