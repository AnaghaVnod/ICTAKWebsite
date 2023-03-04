package com.qa.testscripts;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.ictakbase.Base;
import com.qa.pages.Courses;
import com.qa.pages.MeanFullstack;
import com.qa.utils.ExcelUtil;

public class TestMeanFullstack extends Base {
	
	MeanFullstack objMean;
	Courses objCourse;
	
	@BeforeClass
	public void beeforeClass()
	{
		 objCourse=new Courses(driver);
		 objMean=new MeanFullstack(driver);	
	}
	
	//R3_TC332	
	@Test(priority=0)
	public void verifyMeanFullStack() throws InterruptedException
	{
		objCourse.clickCourse();
		objCourse.clickKnowMoreMean();
		String heading=objMean.headingVerification();
        Assert.assertEquals(heading, "MEAN FullStack");
        
	}
		
	//R3_TC334
	@Test(priority=3)
	public void verifyRegisterDisabledNullData() throws InterruptedException 
	{
		
	    objMean.clickApply();
	    boolean bool=objMean.isEnabled();
	    Assert.assertEquals(bool, false);
	    Actions action=new Actions(driver);
	    action.sendKeys(Keys.ESCAPE);
	   
	}
	//RC_TC321
	@Test(priority=1)
	public void applyMeanFullstack() throws InterruptedException, IOException
	{   
		
		objCourse.clickCourse();
		objMean.clickMeanFullstack();
	    objMean.clickApply();
	    String excelName=ExcelUtil.getCellData(0, 1, (System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelMeanFullstack.xlsx"), 0);
	    String excelEmail=ExcelUtil.getCellData(1, 1, (System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelMeanFullstack.xlsx"), 0);
	    String excelPhone=ExcelUtil.getCellData(2, 1, (System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelMeanFullstack.xlsx"), 0);
	    objMean.enterName(excelName);
	    objMean.enterEmail(excelEmail);
	    objMean.enterPhone(excelPhone);
	    boolean bool=objMean.isEnabled();
	    System.out.println(bool);
	    objMean.clickRegister();
	    String succussmsg=driver.switchTo().alert().getText();
	    driver.switchTo().alert().dismiss();
	    Assert.assertEquals(succussmsg, "Registration Successfull");
	    

	}
	//RC_TC323
	@Test(priority=2)
	public void applyMeanFullstackInvalidData() throws InterruptedException, IOException
	{   
		//objCourse.clickCourse();
		//objMean.clickMeanFullstack();
	    objMean.clickApply();
	    String excelName=ExcelUtil.getCellData(0, 2, (System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelMeanFullstack.xlsx"), 0);
	    String excelEmail=ExcelUtil.getCellData(1, 2, (System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelMeanFullstack.xlsx"), 0);
	    String excelPhone=ExcelUtil.getCellData(2, 2, (System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelMeanFullstack.xlsx"), 0);
	    objMean.enterName(excelName);
	    objMean.enterEmail(excelEmail);
	    objMean.enterPhone(excelPhone);
	    boolean bool=objMean.isEnabled();
	    System.out.println(bool);
	    objMean.clickRegister();
	    String errormsg=driver.switchTo().alert().getText();
	    driver.switchTo().alert().dismiss();
	    Assert.assertEquals(errormsg, "Invalid credentials");
	    

	}
	
}
