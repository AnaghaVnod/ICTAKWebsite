package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.ictakbase.Base;

public class MeanFullstack extends Base {
	
	
	
	
	public MeanFullstack(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//h1[text()='MEAN FullStack']")
	private WebElement titleMean;
	
	@FindBy(xpath="//span[text()='FULL STACK']")
	private WebElement meanFullstack;
	
	@FindBy(xpath="//button[text()=' Apply Now ']")
	private WebElement apply;
	
    @FindBy(name="name")
	private WebElement name;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement email;
	
	@FindBy(name="phoneno")
	private WebElement phone;
	
	@FindBy(xpath="//button[text()='Register']")
	private WebElement register;
	
	
	
	public void clickMeanFullstack() throws InterruptedException
	{
		Thread.sleep(2000);
	    meanFullstack.click();
	}
	public String headingVerification()
	{
		String head=titleMean.getText();
		return head;
	}
	public void clickApply() throws InterruptedException
	{
		Actions action=new Actions(driver);
        action.moveToElement(apply);
    	Thread.sleep(2000);
		apply.click();
	}
	public void enterName(String excelName)
	{
		name.sendKeys(excelName);
	}
	public void enterEmail(String excelEmail)
	{
		email.sendKeys(excelEmail);
	}
	public void enterPhone(String excelPhone) 
	{
		phone.sendKeys(excelPhone);
	}
	public boolean isEnabled() 
	{
		boolean bool=register.isEnabled();
		return bool;
	}
	public void clickRegister()
	{
		register.click();
	}
	
	

}
