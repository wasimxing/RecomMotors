package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
//Declaration
	@FindBy (xpath = "//img[contains(@src,'contactus')]")
	private WebElement pageHeader;
	
	@FindBy (name = "name" )
	private WebElement fullNameTF;
	
	@FindBy (name = "sender")
	private WebElement emailTF;
	
	@FindBy(name = "subject")
	private WebElement subjectTF;
	
	@FindBy (name = "message")
	private WebElement messageTextArea;
	
	@FindBy (name="//button[text()='Send us mail']")
	private WebElement sendUsMailButton;
	
	//Initialization
	public ContactUsPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getPageHeader()
	{
		return pageHeader;
	}
	
	public void submitDetails(String name, String email, CharSequence subject, CharSequence message)
	{
		fullNameTF.sendKeys(name);
		emailTF.sendKeys(email);
		subjectTF.sendKeys(subject);
		messageTextArea.sendKeys(message);
		sendUsMailButton.click();
	}
	
}
