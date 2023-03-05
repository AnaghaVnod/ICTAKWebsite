package com.qa.testscripts;


import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.ictakbase.Base;
import com.qa.pages.Partnershippage;
import com.qa.pages.Partnershipregisterpage;
    
	


		public class Partnershiptestclass extends Base {
			
			
		
			Partnershippage partner;
			Partnershipregisterpage Register;
			
			
			@Test(priority=1)
			
			public void selctionofpartnershippage() throws IOException, InterruptedException
			{
				
				partner = new Partnershippage(driver);
				Register = new Partnershipregisterpage(driver);
			    
			    partner.clickMembership();
				Thread.sleep(3000);
				
				partner.clickpartnership();
				Thread.sleep(3000);
				
				String Text= partner.GetText();
				Assert.assertEquals(Text, "PARTNERSHIP");
			    System.out.println(Text);
			}
				
				
				@Test(priority=2)
				
				public void downloadingproposal() throws IOException, InterruptedException
				{
				
				partner.Scrolltoview();
				Thread.sleep(2000);
					
                 partner.forceclick();
				 Thread.sleep(8000);
				 
				
				 
				
				 String home= driver.getCurrentUrl();
				 driver.get(home);
				 Thread.sleep(4000);
				 
				 driver.switchTo().window(home);
				 	     
				}
				
				@Test(priority=3)
				
				public void selectionofpartnership() throws IOException, InterruptedException
				{
			   
					
				partner.clickRegister();
				Thread.sleep(3000);
				}
				
			
				@Test(priority=4)
				public void verificationofpartnershippage() throws IOException, InterruptedException
				{
					
				
				    
				    String name = com.qa.utils.Excelutility.getCellData(0, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutility.xlsx", 0);
					String email = com.qa.utils.Excelutility.getCellData(0, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutility.xlsx", 0);
					String phone = com.qa.utils.Excelutility.getIntegerData(1, 0);
					String firm = com.qa.utils.Excelutility.getIntegerData(1, 1);
					String address = com.qa.utils.Excelutility.getCellData(2, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutility.xlsx", 0);
					String district = com.qa.utils.Excelutility.getCellData(2, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutility.xlsx", 0);
					String officeSpace =  com.qa.utils.Excelutility.getIntegerData(3, 0);
					String employeeCount = com.qa.utils.Excelutility.getIntegerData(3, 1);
					String report = com.qa.utils.Excelutility.getCellData(4, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutility.xlsx", 0);
					String expect = com.qa.utils.Excelutility.getCellData(4, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutility.xlsx", 0);
					String profile = com.qa.utils.Excelutility.getCellData(5, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutility.xlsx", 0);
				
				
				
			
			
			
			Register.setname(name);
			Thread.sleep(3000);
			
			Register.setphone(phone);
			Thread.sleep(3000);
			
			Register.setfirm(firm);
			Thread.sleep(3000);
			
			Register.setaddress(address);
			Thread.sleep(3000);
			
			Register.setdistrict(district);
			Thread.sleep(3000);
			
			Register.setofficeSpace(officeSpace);
			Thread.sleep(3000);
			
			Register.setemployeeCount(employeeCount);
			Thread.sleep(3000);
			
			Register.setreport(report);
			Thread.sleep(3000);
			
			Register.setexpect(expect);
			Thread.sleep(3000);
			
			Register.setprofile(profile);
			Thread.sleep(4000);
			
			 Register.setemail(email);
			 Thread.sleep(3000);
			
			Register.forceclicksubmit();
			Thread.sleep(2000);
			
			
			String successmsg=driver.switchTo().alert().getText();
			Assert.assertEquals(successmsg,"Registration Successfull");
			driver.switchTo().alert().dismiss();
			
				}
				@BeforeTest
				
				public void currenthome()  throws IOException, InterruptedException
				{
				 String home= driver.getCurrentUrl();
				 driver.get(home);
				 Thread.sleep(4000);
				 
				 
				}
				
				@Test(priority=5)
				
				public void verificationwithinvaliddata() throws IOException, InterruptedException
				{
					 
					Register.clearname();
					Thread.sleep(2000);
					
					Register.clearphone();
					Thread.sleep(2000);
					
					Register.setname("12345");
					Thread.sleep(2000);
					
					Register.setphone("Good");
					Thread.sleep(2000);
					
					Register.forceclicksubmit();
					Thread.sleep(2000);
					
					String successmsg=driver.switchTo().alert().getText();
					Assert.assertEquals(successmsg,"Registration Successfull");
					driver.switchTo().alert().dismiss();
				}
				
				@Test(priority=6)
				
				public void verificationwithnulldata() throws IOException, InterruptedException
				{
					
					Register.setname("");
					Thread.sleep(2000);
					
					Register.setphone("");
					Thread.sleep(2000);
					
					Register.setaddress("");
					Thread.sleep(2000);
					
					Register.setdistrict("");
					Thread.sleep(2000);
					
					Register.forceclicksubmit();
					Thread.sleep(2000);
					
					String successmsg=driver.switchTo().alert().getText();
					Assert.assertEquals(successmsg,"Registration Successfull");
					driver.switchTo().alert().dismiss();
				}
										
		}



