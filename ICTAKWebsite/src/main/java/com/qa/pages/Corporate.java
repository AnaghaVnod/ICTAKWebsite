package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ictakbase.Base;

public class Corporate extends Base 
{
	
	public Corporate(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Register Here']")
	private WebElement register;
	
	@FindBy(xpath="//h6[text()=' Corporate Membership ']")
	private WebElement corporate;
	
	public void clickCorporate()
	{
		corporate.click();
	}
	
	public void clickRegister()
	{
		register.click();
	}

}
