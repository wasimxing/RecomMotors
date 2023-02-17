package testScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;
import pompages.SkillraryDemoApp;

/**
 * first step should be get property from base class
 * @author wasim
 *
 */
public class FirstTest extends BaseClass {
	@Test
	public void firstTest()
	{
		SoftAssert soft = new SoftAssert();
		
		home.clickGears();
		home.clickSkillrarydemoApp();
		web.handleChildBrowser();
		
		soft.assertTrue(demoApp.getPageHeader().isDisplayed());
		
		demoApp.mouseHoverToCourseTab(web);
		demoApp.ClickSeleniumTraining();
		
		soft.assertEquals(selenium.getPageHeader().getText(), "Selenium Training");
		selenium.doubleClickPlusButton(web);
		selenium.clickAddToCart();
		web.handleAlert();
		web.explicitWait(time, selenium.getItemAddedMessage());
		web.takeScreenshot();
		
		soft.assertTrue(selenium.getItemAddedMessage().isDisplayed());
		
		soft.assertAll();
		//selenium.getItemAddedMessage();
	}
	

}
