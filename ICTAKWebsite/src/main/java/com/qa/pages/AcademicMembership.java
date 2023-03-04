package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ictakbase.Base;

public class AcademicMembership extends Base {
	
	public AcademicMembership(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}

	@FindBy(xpath="//a[@id='dropdownMenuDocs'][1]")
	private WebElement membership;
	
	@FindBy(xpath="(//a[@routerlink='/LandingPage/academic'])[1]")
	private WebElement academic;
	
	@FindBy(xpath="//a[text()='View Members']")
	private WebElement viewmembers;
	
	@FindBy(xpath="//h2[@class='tabheading']")
	private WebElement members;
	
	@FindBy(xpath="//a[@routerlink='/LandingPage/academiccollaboarations']")
	private WebElement renewal ;
	
	public void verifyMembership()
	{
		membership.click();	
	}
	public void verifyAcademicMembership()
	{
		academic.click();
	}
	public void scrolltoView() throws InterruptedException	
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",viewmembers);
		Thread.sleep(2000);
	}
	public void verifyViewMembers()
	{
		viewmembers.click();
	}
	public String memberList()
	{
		return members.getText();
	}
	public void renewalMembership()
	{
	    String status=renewal.getText();
	    String open="Registartion open";
	    if(status==open)
	    {
	    	renewal.click();
	    }
	   System.out.println(status);
		

	}

}
