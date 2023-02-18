package testScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;
import pompages.SkillraryDemoApp;

public class SecondTest extends BaseClass {
	@Test
	public void secondTest()
	{
		SoftAssert soft = new SoftAssert();
		home.clickGears();
		home.clickSkillrarydemoApp();
		web.handleChildBrowser();
		
		soft.assertTrue(demoApp.getPageHeader().isDisplayed());
		
		demoApp.selectCatagory(web, 1);
		soft.assertEquals(testingpage.getPageHeader(), "Testing");
		
		web.dragAndDrop(testingpage.getSeleniumImage(), testingpage.getCartArea());
		web.scrollElement(testingpage.getFacebookIcon());
		
		soft.assertAll();
		
	}
	

}
