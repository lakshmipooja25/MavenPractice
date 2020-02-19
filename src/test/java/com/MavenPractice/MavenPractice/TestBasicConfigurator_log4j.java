package com.MavenPractice.MavenPractice;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestBasicConfigurator_log4j   
{
	
	static Logger log = Logger.getLogger(TestBasicConfigurator_log4j.class); 
    @Test
    public void TestApplication()
    {
//new
    	BasicConfigurator.configure();
    	log.info("Entering Username");
    	log.info("Entering Password");
    	log.info("Login SUCCESS");
    	System.out.println("driver quit done");
    	System.setProperty("webdriver.chrome.driver", "E:\\LAKSH\\Selenium\\Selenium Library\\Selenium Drivers\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.quit();
    }
}
