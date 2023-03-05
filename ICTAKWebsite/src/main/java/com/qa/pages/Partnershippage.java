package com.qa.pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Partnershippage {
	
	WebDriver driver;
	
	@FindBy(xpath="(//a[@id='dropdownMenuDocs'][1])")
	private WebElement Membership;
	
	@FindBy(xpath="(//a[@routerlink='/LandingPage/partnership'][1])")
	private WebElement partnership;
	
	@FindBy(xpath="//h1[text()='PARTNERSHIP']")
	private WebElement Partnershiptitle;
	
	@FindBy(xpath="//div[@class='buttons']//child::a")
	private WebElement downloadproposal;

	
	@FindBy(xpath="(//button[@routerlink='/LandingPage/partnershipform'][1])")
	private WebElement Register;
	
	
	public Partnershippage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public void clickMembership()
	{
		
		Membership.click();
	}
	
	
	public void clickpartnership()
	{
		partnership.click();
	}
	
	public void Scrolltoview() throws InterruptedException
	{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();",downloadproposal);
	Thread.sleep(3000);
	}
	
	public void forceclick() throws InterruptedException
	{
		
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", downloadproposal);
	}
	
	public void clickdownloadproposal()
	{
		downloadproposal.click();
	}
	
	
	public String GetText()
	{
		String Text = Partnershiptitle.getText();
		return Text;
	}
	
	public void movetoelement() throws InterruptedException
	{
		 Actions action = new Actions(driver);
		 action.moveToElement(Register).build().perform();
	}
	
	
	public void clickRegister()
	{
		Register.click();
	
	}
	
	


}
	

