package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaVideoPage {
	//Declaration
	@FindBy (xpath = "//h1[text()='Core Java For Selenium Training']")
	private WebElement pageHeader;
	
	@FindBy (xpath = "//button[@aria-label='Play']")
	private WebElement playButton;

	@FindBy (xpath = "//button[@aria-label='Play']")
	private WebElement pauseButton;
	
	@FindBy (xpath = "//span[text()='Add To Wishlist']")
	private WebElement addToWishlistTab;
	
	//initialization
	 public CoreJavaVideoPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	} 
	
	
	//utilization
	public String getPageHeader()
	{
		return pageHeader.getText();
		
	}
	
	public void clickPlayButton()
	{
		playButton.click();
	}
	
	public void clickPauseButton()
	{
		pauseButton.click();
	}
	
	
	
	
}
