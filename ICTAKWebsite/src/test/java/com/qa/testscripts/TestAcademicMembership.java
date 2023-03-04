package com.qa.testscripts;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.ictakbase.Base;
import com.qa.pages.AcademicMembership;


public class TestAcademicMembership extends Base{

	AcademicMembership objAcademic;
	
	@BeforeClass
	public void beforeClass()
	{
	objAcademic=new AcademicMembership(driver);
		
	}
	
	//R5_TC354
	@Test
	public void renewMembership() throws InterruptedException
	{

		objAcademic.verifyMembership();
		objAcademic.verifyAcademicMembership();
		objAcademic.scrolltoView();
        objAcademic.verifyViewMembers();
        objAcademic.renewalMembership();
        String memberlist=objAcademic.memberList();
        Assert.assertEquals(memberlist, "ICTAK Premium Member Colleges (2021 - 2022)");
        
        
	}
}
