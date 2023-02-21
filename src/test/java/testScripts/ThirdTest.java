package testScripts;

import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class ThirdTest extends BaseClass {
	@Test
	public void thirdTest() throws InterruptedException
	{
		SoftAssert soft = new SoftAssert();
		
		home.searchFor("core java for selenium");
		soft.assertEquals(corejava.getPageHeader(), "CORE JAVA FOR SELENIUM");
		
		corejava.clickCoreJavaForSeleniumLink();
		
		soft.assertEquals(videopage.getPageHeader(), "Core Java For Selenium Training");
		
		videopage.clickCloseCookies();
		Thread.sleep(2000);
		web.switchToFrame();
		videopage.clickPlayButton();
		Thread.sleep(2000);
		videopage.clickPauseButton();
		
		web.switchBacktoFrame();
		videopage.clickWishlist();
		
		soft.assertAll();
		
				
		
	}

}
