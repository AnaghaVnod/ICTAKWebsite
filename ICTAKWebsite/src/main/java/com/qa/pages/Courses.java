package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.ictakbase.Base;

public class Courses extends Base {

	
	public Courses(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="dropdownMenuBlocks")
	private WebElement courses;
	
	@FindBy(id="listSearch")
	private WebElement searchBox;
	
	@FindBy(xpath="//button[text()=' Search ']")
	private WebElement searchButton;
	
	@FindBy(xpath="//h4[text()='Software Testing']")
	private WebElement softwareTesting;
	
	@FindBy(xpath="//h5[text()='No Results Found']")
	private WebElement noResultFound;
	
	@FindBy(xpath="//p[text()='FULL STACK']")
	private WebElement meanFullStack;
	
	@FindBy(id="reg")
	private WebElement open;
	
	@FindBy(xpath="(//button[text()=' Know more '])[1]")
	private WebElement knowMore;
	
	
	public void clickCourse()
	{
		courses.click();
	}
	public void searchCourse(String searchData) 
	{
		searchBox.sendKeys(searchData);
	}
	public void clearSearch()
	{
		searchBox.clear();
	}
	public void clickSearch()
	{
		searchButton.click();
	}
	public boolean result()
	{
		return softwareTesting.isDisplayed();	
	}
    public boolean noResults()
	{
		return noResultFound.isDisplayed();	
	}
	public void clickKnowMoreMean() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",meanFullStack);
			
		Actions action=new Actions(driver);
        action.moveToElement(meanFullStack);
	    Thread.sleep(2000);
	    knowMore.click();
	}
	    
	    

}
