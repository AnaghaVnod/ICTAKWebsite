package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ict.Base;

public class Datasciencepage extends Base {
	
	WebDriver driver;
	
	@FindBy(xpath="//h2[text()='CERTIFIED SPECIALIST IN DATA SCIENCE AND ANALYTICS']")
	private WebElement title;
	
	@FindBy(xpath="//button[text()=' Closed '][1]")
	private WebElement closed;
	
	@FindBy(id="v-pills-home-tab")
	private WebElement about;
	
	@FindBy(id="v-pills-profile-tab")
	private WebElement agenda;
	
	@FindBy(id="v-pills-messages-tab")
	private WebElement highlights;
	
	@FindBy(id="v-pills-settings-tab")
	private WebElement Entrance;
	
	@FindBy(id="v-pills-download-tab")
	private WebElement models;
	
	@FindBy(id="v-pills-download-tab")
	private WebElement partner;
	
	 public Datasciencepage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
	 
	 public String GetText()
		{
			String Text = title.getText();
			return Text;
		}
	 
	 
	public void clickclosed()
	{
		closed.click();
		
	}
	
	public void Scrolltoview() throws InterruptedException
	{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();",about);
	Thread.sleep(3000);
	}
	
	
	
	public void clickabout()
	{
		about.click();
	}
	public void clickagenda()
	{
		agenda.click();
	}
	public void clickhighlights()
	{
		highlights.click();
	}
	public void clickEntrance()
	{
		Entrance.click();
	}
	
	public void clickpartner()
	{
		partner.click();
	}	
	
	public void clickmodels()
	{
		models.click();
	}
	
}
