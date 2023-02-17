package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaForSelenium {
	
//	Declaration
	@FindBy (xpath = "//h2[text()='core java for selenium']")
	private WebElement pageHeader;
	
	@FindBy (xpath = "//a[text()=' Core Java For Selenium Trainin']")
	private WebElement coreJavaForSeleniumLink;
	
	//Initialization
	public CoreJavaForSelenium(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public String getPageHeader()
	{
		return pageHeader.getText();
	}
	
	public void clickCoreJavaForSeleniumLink()
	{
		coreJavaForSeleniumLink.click();
	}
	
	

}
