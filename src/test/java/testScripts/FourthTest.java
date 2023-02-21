package testScripts;

import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class FourthTest extends BaseClass{
	@Test
	public void fourthTest()
	{
		SoftAssert soft = new SoftAssert();
		
		home.clickGears();
		home.clickSkillrarydemoApp();
		web.handleChildBrowser();
		
		soft.assertTrue(demoApp.getPageHeader().isDisplayed());
		
		
		web.scrollElement(demoApp.getPageHeader());
		demoApp.clickContactUs();
	
		
		soft.assertTrue(contactpage.getPageHeader().isDisplayed());
		
		List<String> data = excel.fetchDataFromExcel("Sheet1");
		
		contactpage.submitDetails(data.get(0), data.get(1), data.get(2), data.get(3));
		
		
		
		soft.assertAll();
	}
	

}
