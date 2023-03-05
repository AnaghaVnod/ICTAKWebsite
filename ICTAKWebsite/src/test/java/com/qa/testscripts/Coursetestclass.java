package com.qa.testscripts;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.ictakbase.Base;
import com.qa.pages.Coursepage;
import com.qa.pages.Datasciencepage;
import com.qa.pages.Modelpage;

public class Coursetestclass  extends Base {
		
		
		Coursepage course;
		
		@Test(priority=1)
		
		public void coursepageverification() throws IOException, InterruptedException
		{
			
			course = new Coursepage(driver);
		   
			 String listSearch = com.qa.utils.Excelutility.getCellData(6, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutility.xlsx", 0);
			 
			 
		    course.clickCourse();
			Thread.sleep(3000);
			
			boolean title = course.titleverification();
			Assert.assertTrue(title);
			
			course.setlistsearch(listSearch);
			Thread.sleep(3000);
			
			course.clickSearch();
			Thread.sleep(4000);
		
			}
		
			@Test(priority=2)


		public void selectdatasciencepage() throws IOException, InterruptedException
			{
				
				
				
				course.forceclickKnowmore();
			    Thread.sleep(5000);
			    
			    driver.navigate().back();
				Thread.sleep(2000);
					
			}
			
			  @Test(priority=3)
			  
			  public void searchverificationwithinvaliddata() throws IOException, InterruptedException
			  {
				  
				String listsearch1 = com.qa.utils.Excelutility.getCellData(7, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutility.xlsx", 0);
				
				
				course.clickCourse();
			    Thread.sleep(3000);
					
				course.setlistsearch(listsearch1);
				Thread.sleep(3000);
				
				course.clickSearch();
				Thread.sleep(3000);
								
				driver.navigate().back();
				Thread.sleep(5000);
				
			}
			
			@Test(priority=3)
			
			public void datasciencepageselection()throws IOException, InterruptedException
			{
				
				
				course.clickCourse();
			    Thread.sleep(3000);	
				
			    course.clickdatascience();
			 }
				
			Datasciencepage data;
			

			@Test(priority=4)
			
			public void datsciencepageverification() throws IOException, InterruptedException
			{
				
				data = new Datasciencepage(driver);
			   
				String Text= data.GetText();
				Assert.assertEquals(Text, "CERTIFIED SPECIALIST IN DATA SCIENCE AND ANALYTICS");
			    System.out.println(Text);
			    
				data.clickclosed();
				Thread.sleep(3000);
				
			}
			
			
				@Test(priority=5)
				
				
				public void tabverificationofdatasciencepage() throws IOException, InterruptedException
				{
					
				
				data.Scrolltoview();
				Thread.sleep(3000);
				
				data.clickabout();
				Thread.sleep(3000);
				
				data.clickagenda();
				Thread.sleep(3000);
				
				data.clickhighlights();
				Thread.sleep(3000);
				
				data.clickEntrance();
				Thread.sleep(3000);
				
				data.clickpartner();
				Thread.sleep(3000);
				
				data.clickmodels();
				Thread.sleep(3000);
				}
				
				
				Modelpage model;

				@Test(priority=6)
				
				public void verificationofmodelpagedownloads()throws IOException, InterruptedException
				{
				
				model = new Modelpage(driver);
				
				driver.getWindowHandles();
				
				model.clicksampleqp();
				Thread.sleep(5000);
				
				
				
				data.clickmodels();
				Thread.sleep(2000);
				
				
				
				model.clickcompanylist();
				Thread.sleep(8000);
				
				
				
				model.clicksamplecourse();
				Thread.sleep(30000);
				
				
				model.clickinternshipcertificate();
				Thread.sleep(3000);
				
				
				

		}

				
			}
			
