package com.qa.testscripts;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.ictakbase.Base;
import com.qa.pages.Courses;
import com.qa.utils.ExcelUtil;

public class TestCoursesSearchbox extends Base {
	
	Courses objCourse;
	
	@BeforeClass
	public void beforeClass()
	{
		objCourse=new Courses(driver);
	}
	
	//R3_TC301
	@Test(priority=0)
	public void verifySearchButtonValidData() throws IOException 
	{
		
		objCourse.clickCourse();
		String searchData=ExcelUtil.getCellData(0, 0,(System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelSearch.xlsx"), 0);
		objCourse.searchCourse(searchData);
		objCourse.clickSearch();
		boolean bool=objCourse.result();
		System.out.println(bool);
		Assert.assertEquals(bool, true);
	}
	//R3_TC302
	@Test(priority=1)
	public void verifySearchButtonInvalidData() throws IOException
	{
		
		//objCourse.clickCourse();
		objCourse.clearSearch();
		String searchData=ExcelUtil.getCellData(1, 0,(System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelSearch.xlsx"), 0);
		objCourse.searchCourse(searchData);
		objCourse.clickSearch();
		boolean bool=objCourse.noResults();
		Assert.assertEquals(bool, true);
		
	}
	
	

}
