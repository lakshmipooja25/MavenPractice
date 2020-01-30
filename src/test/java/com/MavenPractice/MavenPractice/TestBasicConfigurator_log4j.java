package com.MavenPractice.MavenPractice;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


import org.testng.annotations.Test;

public class TestBasicConfigurator_log4j   
{
	
	static Logger logger = Logger.getLogger(TestBasicConfigurator_log4j.class);
    @Test
    public void TestApplication()
    {
    	
    	
    	BasicConfigurator.configure();
    	logger.info("Entering Username");
    	logger.info("Entering Password");
    	logger.info("Login SUCCESS");
    	System.out.println("driver quit done");
    	
    }
}
