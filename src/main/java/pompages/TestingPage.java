package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class TestingPage {
	
	//Declaration
	@FindBy (xpath = "//h1[text()='Testing']")
	private WebElement pageHeader;
	
	@FindBy (id = "Selenium Training")
	private WebElement seleniumImage;
	
	@FindBy (id = "cartArea")
	private WebElement cartArea;
	
	@FindBy (xpath = "//div[@class='icons']/descendant::i[@class='fa fa-facebook']")
	private WebElement facebookIcon;
	
	//initialization
	
	public TestingPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this );
	}
	
	//Utilization
	public String getPageHeader()
	{
		return pageHeader.getText();
	}
	
	public WebElement getSeleniumImage()
	{
		return seleniumImage;
	}
	
	public WebElement getCartArea() {
		return cartArea;
	}
	
	public WebElement getFacebookIcon() {
		return facebookIcon;
	}
	
	public void clickFacebookIcon() {
		facebookIcon.click();
	}
	

}
