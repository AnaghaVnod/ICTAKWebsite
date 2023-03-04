package com.qa.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.ictakbase.Base;
import com.qa.pages.AcademicMembership;
import com.qa.pages.Corporate;
import com.qa.pages.CorporateForm;
import com.qa.utils.ExcelUtil;

public class TestCorporateMembership extends Base {
	
	AcademicMembership objAcademic;
	Corporate objCorporate;
	CorporateForm objCForm;
	
	@BeforeClass
	public void beforeClass()
	{
		objAcademic = new AcademicMembership(driver);
		objCorporate = new Corporate(driver);
		objCForm = new CorporateForm(driver);
	}
	//R5_TC356
	@Test(priority=0)
	public void corporateRegisterVerification()
	{
		
		objAcademic.verifyMembership();
		objCorporate.clickCorporate();
		objCorporate.clickRegister();
		boolean bool=objCForm.headingVerification();
		Assert.assertEquals(bool, true);
					
			
	}
	//R5_TC357
	@Test(priority=3)
	public void corporateRegisterForm() throws IOException, InterruptedException 
	{
		
		
		//objAcademic.verifyMembership();	
		//objCorporate.clickCorporate();
		//objCorporate.clickRegister();	
		
		String excelName=ExcelUtil.getCellData(0, 1, (System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelCorporateForm.xlsx"), 0);
		String excelAddr=ExcelUtil.getCellData(1, 1, (System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelCorporateForm.xlsx"), 0);
		String excelHOD=ExcelUtil.getCellData(2, 1, (System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelCorporateForm.xlsx"), 0);
		String excelNature=ExcelUtil.getCellData(3, 1, (System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelCorporateForm.xlsx"), 0);
		String excelWeb=ExcelUtil.getCellData(4, 1, (System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelCorporateForm.xlsx"), 0);
		String excelCIN=ExcelUtil.getCellData(6, 1, (System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelCorporateForm.xlsx"), 0);
		String excelGST=ExcelUtil.getCellData(7, 1, (System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelCorporateForm.xlsx"), 0);
		String excelPOC=ExcelUtil.getCellData(8, 1, (System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelCorporateForm.xlsx"), 0);
		String excelMob=ExcelUtil.getCellData(9, 1, (System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelCorporateForm.xlsx"), 0);
		String excelTech=ExcelUtil.getCellData(10, 1, (System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelCorporateForm.xlsx"), 0);
		String excelEmail=ExcelUtil.getCellData(11, 1, (System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelCorporateForm.xlsx"), 0);
		String excelCount=ExcelUtil.getCellData(12, 1, (System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelCorporateForm.xlsx"), 0);
		String excelDetail=ExcelUtil.getCellData(16, 1, (System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelCorporateForm.xlsx"), 0);
		
		objCForm.enterName(excelName);
		objCForm.enterAddr(excelAddr);
		objCForm.enterHOD(excelHOD);
		objCForm.enterNature(excelNature);
		objCForm.enterWeb(excelWeb);
		objCForm.enterCIN(excelCIN);
		objCForm.enterGST(excelGST);
		objCForm.enterPOC(excelPOC);
		objCForm.enterMob(excelMob);
		objCForm.enterTech(excelTech);
		objCForm.enterEmail(excelEmail);
		objCForm.enterCount(excelCount);
		objCForm.selectTypeof(" Public ");
		objCForm.howToCollaborate("Internships");
		objCForm.selectPatent(" 1-10 ");
		objCForm.selectHire(" 1-10 ");
		objCForm.enterDetails(excelDetail);
		objCForm.verifyRegister();
		String succussmsg=driver.switchTo().alert().getText();
	    Assert.assertEquals(succussmsg, "Registration Successfull");
	    driver.switchTo().alert().dismiss();

		
	}
	//R5_TC359
	@Test(priority=2)
	public void verificationTnC() 
	{
		
		//objAcademic.verifyMembership();
		//objCorporate.clickCorporate();
		//objCorporate.clickRegister();
		Boolean bool=objCForm.verifyTnC();
		Assert.assertEquals(bool, true);
		
	}
	//R5_TC358
	@Test(priority=1)
	public void verifyRegisterDisabledNullData()
	{
		
		//objAcademic.verifyMembership();
		//objCorporate.clickCorporate();
		//objCorporate.clickRegister();
		boolean bool=objCForm.isEnabled();
		Assert.assertEquals(bool, false);
	}
	
			

}
