package com.qa.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.ictakbase.Base;



public class CorporateForm extends Base {
	
	public CorporateForm(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h3[text()=' Corporate Membership Form ']")
	private WebElement title;
	
	@FindBy(name="name")
	private WebElement name;
	
	@FindBy(name="address")
	private WebElement address;
	
	@FindBy(name="head")
	private WebElement head;
	
	@FindBy(name="nature")
	private WebElement nature;
	
	@FindBy(name="website")
	private WebElement website;
	
	@FindBy(xpath="//select[@formcontrolname='typeof']")
	private WebElement selectType;
	
	@FindBy(xpath="(//input[@name='identityNo'])[1]")
	private WebElement ciNum;
	
	@FindBy(name="GST")
	private WebElement gstNum;
	
	@FindBy(name="nameofContact")
	private WebElement pocName;
	
	@FindBy(xpath="(//input[@name='identityNo'])[2]")
	private WebElement mobNum;
	
	@FindBy(name="TechnicalSkill")
	private WebElement techSkill;

	@FindBy(xpath="(//input[@name='email'])[2]")
	private WebElement email;
	
	@FindBy(name="employeeCount")
	private WebElement employeeNum;
	
	@FindBy(xpath="//input[@aria-autocomplete='list']")
	private WebElement collaborate;

	@FindBy(xpath="//select[@formcontrolname='patents']")
	private WebElement patent;
	
	@FindBy(xpath="//select[@formcontrolname='hire']")
	private WebElement hire;
	
	@FindBy(xpath="//input[@formcontrolname='details']")
	private WebElement details;
	
	@FindBy(xpath="//input[@id='flexSwitchCheckDefault']")
	private WebElement toggle;

	@FindBy(xpath="//input[@value='REGISTER']")
	private WebElement register;
	
	@FindBy(linkText="Terms and Conditions")
	private WebElement tnc;
	
	public boolean headingVerification()
	{
		return title.isDisplayed();
	}
	
	public  void enterName(String excelName)
	{
		name.sendKeys(excelName);
	}
	public void enterAddr(String excelAddr) 
	{
		address.sendKeys(excelAddr);
	}
	public void enterHOD(String excelHOD)
	{
		head.sendKeys(excelHOD);
	}
	public void enterNature(String excelNature)
	{
		nature.sendKeys(excelNature);
	}
	public void enterWeb(String excelWeb)
	{
		website.sendKeys(excelWeb);
	}
	public void selectTypeof(String type) 
	{
	Select drpType=new Select(selectType);
	drpType.selectByVisibleText(type);
	}
	public void enterCIN(String excelCIN)
	{
		ciNum.sendKeys(excelCIN);
	}
	public void enterGST(String excelGST)
	{
		gstNum.sendKeys(excelGST);
	}
	public void enterPOC(String excelPOC)
	{
		pocName.sendKeys(excelPOC);
	}
	public void enterMob(String excelMob)
	{
		mobNum.sendKeys(excelMob);
	}
	public void enterTech(String excelTech)
	{
		techSkill.sendKeys(excelTech);
	}
	public void enterEmail(String excelEmail)
	{
		email.sendKeys(excelEmail);
	}
	public void enterCount(String excelCount)
	{
		employeeNum.sendKeys(excelCount);	
	}  
	public void howToCollaborate(String collab) throws InterruptedException  
	{
		collaborate.sendKeys(collab);
		Thread.sleep(2000);
		collaborate.sendKeys(Keys.ENTER);	
	}
	public void selectPatent(String Patent)
	{
		Select drpPat=new Select(patent);
		drpPat.selectByVisibleText(Patent);  
	}
	public void selectHire(String Hire)
	{
		Select drpHire=new Select(hire);
        drpHire.selectByVisibleText(Hire);
	}
	
	public void enterDetails(String excelDetail)
	{
		details.sendKeys(excelDetail);
	}
	public void verifyToggle()
	{
		toggle.click();
	}
	public boolean verifyTnC()
	{
		
	    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
	    wait.until(ExpectedConditions.elementToBeClickable(tnc));
		tnc.click();
		boolean bool=tnc.isEnabled();
	    return bool;
	   
	}
	public boolean isEnabled() 
	{
		boolean bool=register.isEnabled();
		return bool;
	}
	public void verifyRegister() 
	{
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView();",register);
		register.submit();
	}
	
	

}
