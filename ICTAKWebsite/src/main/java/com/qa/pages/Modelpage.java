package com.qa.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ictakbase.Base;

public class Modelpage extends Base {
	
	WebDriver driver;
	
	@FindBy(xpath="(//a[text()=' DOWNLOAD'])[1]")
	private WebElement sampleqp;
	
	
	@FindBy(xpath="(//a[text()=' DOWNLOAD'])[2]")
	private WebElement companylist;
	
	@FindBy(xpath="(//a[text()=' DOWNLOAD'])[3]")
	private WebElement samplecourse ;
	
	@FindBy(xpath="(//a[text()=' DOWNLOAD'])[4]")
	private WebElement internshipcertificate;
	
	@FindBy(xpath="//h5[text()='List of companies came for placement']")
	private WebElement qptitle;
	
	 public Modelpage(WebDriver driver)
	 {
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
	 public void clicksampleqp()
		{
			sampleqp.click();
			
		}
		
	 
	 public void clickcompanylist()
	 {
		companylist.click();
	 }
	 
	 public void clicksamplecourse()
	 {
		samplecourse.click();
	 }
		
	 public void clickinternshipcertificate()
	 {
		internshipcertificate.click();
	 }
	 
	 public String GetText()
		{
			String Text = qptitle.getText();
			return Text;
		}	 
	 	 
}



