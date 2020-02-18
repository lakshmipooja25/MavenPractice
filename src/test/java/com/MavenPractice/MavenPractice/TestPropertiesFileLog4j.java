package com.MavenPractice.MavenPractice;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestPropertiesFileLog4j {
	static Logger log = Logger.getLogger(TestPropertiesFileLog4j.class); 
	@Test
    public void TestApplication()
    {
		PropertyConfigurator.configure("log4j.properties");
		
    	
		
		log.info("Opening Pack and Go application");
		System.out.println("calling test");
		/*System.setProperty("webdriver.chrome.driver", "E:\\LAKSH\\Selenium\\Selenium Library\\Selenium Drivers\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
		driver.quit();*/
    }
}
