package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ictakbase.Base;

public class Partnershipregisterpage extends Base {
	
	@FindBy(name="name")
	private WebElement name;
	
	@FindBy(xpath="//input[@name='email'][1]")
	private WebElement email;
	
	@FindBy(name="phone")
	private WebElement phone;
	
	@FindBy(name="firm")
	private WebElement firm;
	
	@FindBy(name="address")
	private WebElement address;
	
	@FindBy(name="district")
	private WebElement district;
	
	@FindBy(name="officeSpace")
	private WebElement officeSpace;
	
	@FindBy(name="employeeCount")
	private WebElement employeeCount;
	
	@FindBy(name="report")
	private WebElement report;
	
	@FindBy(name="expect")
	private WebElement expect;
	
	@FindBy(name="profile")
	private WebElement profile;
	
	@FindBy(xpath="//button[text()='Send Message']")
	private WebElement submit;
	
	
	public Partnershipregisterpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void Registerpage1(WebDriver driver2) {
	
	}

	public void setname(String strname)
	{
		name.sendKeys(strname);
	}

	
	public void setemail(String stremail)
	{
	email.sendKeys(stremail);
	}
	
	public void setphone(String strphone)
	{
		phone.sendKeys(strphone);
	}
	
	public void setfirm(String strfirm)
	{
		firm.sendKeys(strfirm);
	}
	public void setaddress(String straddress)
	{
		address.sendKeys(straddress);
	}
	
	public void setdistrict(String strdistrict)
	{
		district.sendKeys(strdistrict);
	}
	
	public void setofficeSpace(String strofficeSpace)
	{
		officeSpace.sendKeys(strofficeSpace);
	}
	
	public void setemployeeCount(String stremployeeCount)
	{
		employeeCount.sendKeys(stremployeeCount);
	}
	public void setreport(String strreport)
	{
		report.sendKeys(strreport);
	}
	public void setexpect(String strexpect)
	{
		expect.sendKeys(strexpect);
	}
	public void setprofile(String strprofile)
	{
		profile.sendKeys(strprofile);
	}
	
	public void forceclicksubmit() throws InterruptedException
	{
		
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", submit);
	}
	
	public void clearname()
	{
	name.clear();	
	}
	
	public void clearphone()
	{
		phone.clear();
	}
	
	
   public void clicksubmit()
	{
	   
		submit.click();
	}
   
   
	
	
	
	
	
	
	
}
