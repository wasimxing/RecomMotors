package genericLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pompages.ContactUsPage;
import pompages.CoreJavaForSelenium;
import pompages.CoreJavaVideoPage;
import pompages.SeleniumTrainingPage;
import pompages.SkillraryDemoApp;
import pompages.SkillraryHomepage;
import pompages.TestingPage;

public class BaseClass {
	
	protected PropertyFileUtility property;
	protected ExcelUtility excel;
	protected WebDriverUtility web;
	protected SkillraryHomepage home;
	protected SkillraryDemoApp demoApp;
	protected SeleniumTrainingPage selenium;
	protected CoreJavaForSelenium corejava;
	protected CoreJavaVideoPage videopage;
	protected TestingPage testingpage;
	protected ContactUsPage contactpage;
	protected WebDriver driver;
	protected long time;
	//@BeforeSuite
	//@BeforeTest
	@BeforeClass
	public void classConfiguration()
	{
		property = new PropertyFileUtility();
		excel = new ExcelUtility();
		web = new WebDriverUtility();
		
		property.propertyFileInitialization(IConstantPath.PROPERTIES_FILE_PATH);
		excel.excelInitialization(IConstantPath.EXCEL_FILE_PATH);
		long time = Long.parseLong(property.fetchProperty("timeout"));
		web.openAppliciation(property.fetchProperty("browser"), property.fetchProperty("url"), time);
	}
	@BeforeMethod
	public void methodConfiguration()
	{
		
		time = Long.parseLong(property.fetchProperty("timeout"));
		driver = web.openAppliciation(property.fetchProperty("browser"), property.fetchProperty("url"), time);
		
		home = new SkillraryHomepage(driver);
		
		Assert.assertTrue(home.getLogo().isDisplayed());
		
		demoApp = new SkillraryDemoApp(driver);
		selenium = new SeleniumTrainingPage(driver);
		videopage = new CoreJavaVideoPage(driver);
		testingpage = new TestingPage(driver);
		contactpage = new ContactUsPage(driver);
		corejava = new CoreJavaForSelenium(driver);
		
	}
	
	
	@AfterMethod
	public void methodTearDown()
	{
		web.quitBrowser();
	}
	
	@AfterClass
	public void classTearDown()
	{
		excel.closeExcel();
	}
	//@AfterTest
	//@AfterSuite

}
