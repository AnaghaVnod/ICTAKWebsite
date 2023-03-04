package com.qa.ictakbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
	
	public   WebDriver driver=null;
	public static Properties prop=null;
	
	
	@BeforeTest
	public void OnSetup() throws IOException, InterruptedException
	{
		prop=new Properties();
		FileInputStream pFile=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\qa\\utils\\config.properties");
		prop.load(pFile);
		driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(3000);		
	}
	@AfterTest
	public void afterTest() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
	
	

}
