package com.qa.pages;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.ictakbase.Base;

public class Coursepage extends Base {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[@routerlink='/LandingPage/courses']")
	private WebElement Course;

	@FindBy(xpath="//h3[text()='Our Courses']")
	private WebElement coursestitle;
	
	@FindBy(id="listSearch")
	private WebElement listSearch;
	
	@FindBy(xpath="//button[text()=' Search ']")
	private WebElement Search;
	
	@FindBy(xpath="//button[text()=' Know more '][1]")
	private WebElement knowmore;
	
	@FindBy(xpath="//h6[text()=' Data Science and Analytics '][1]")
	private WebElement datascience;
	
	
	
	 public Coursepage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
	
	
	public void clickCourse()
	{
		Course.click();
	}
	
	
	public boolean titleverification()
	{
		boolean title = coursestitle.isDisplayed();
		return title;
	}
	
	
	
	public void setlistsearch(String strlistsearch)
	{
		listSearch.sendKeys(strlistsearch);
	}
	
	
	public void clickSearch()
	{
		Search.click();
	}
	
	public void Scrolltoview() throws InterruptedException
	{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();",knowmore);
	Thread.sleep(3000);
	}
	

	public void forceclickKnowmore() throws InterruptedException
	{
		
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",knowmore);
	
	}
	
	public void clickKnowmore()
	{
		knowmore.click();
	}


	public void clickdatascience()
	{
	datascience.click();
	}
	
	


}
