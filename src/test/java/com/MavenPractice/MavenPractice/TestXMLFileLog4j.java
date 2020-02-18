package com.MavenPractice.MavenPractice;


import java.net.URL;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestXMLFileLog4j {
	

	 static Logger logger = Logger.getLogger(TestXMLFileLog4j.class);
	@Test
    public void TestApplication()
    {
		
		DOMConfigurator.configure("log4j.xml");
		//logger.debug("Sample debug message");
		logger.info("Sample info message");
		logger.warn("Sample warn message");
		logger.error("Sample error message");
		logger.fatal("Sample fatal message");
		
		logger.debug("Log4j appender configuration is successful !!");
		System.setProperty("webdriver.chrome.driver", "E:\\LAKSH\\Selenium\\Selenium Library\\Selenium Drivers\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.quit();
		
		
    }
}
