package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MarksandspencerElementsLocator {
	WebDriver driver;
	
	public MarksandspencerElementsLocator(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@class='search-bar--search']")
	public WebElement searchBar;
	
	@FindBy(how=How.XPATH,using="//*[@id='SC_Level_1_14866033_menu']")
	public WebElement food;
	
	@FindBy(how=How.XPATH,using="//section[@id='progressiveHeaderSection']//button[@type='submit']")
	public WebElement sendButton;
	
	@FindBy(how=How.XPATH,using="//*[@id='8648162']//div[@class='detail']")
	public WebElement selectItem1;
	
	@FindBy(how=How.XPATH,using="//label[@for='18']")
	public WebElement item1Size;
	
	@FindBy(how=How.ID,using="add-to-basket-button")
	public WebElement addToBasketButton;
	
	@FindBy(how=How.XPATH,using="//*[@id='3987514']//div[@class='detail']")
	public WebElement selectItem2;
	
	@FindBy(how=How.XPATH,using="//*[@id='8736510']//div[@class='detail']")
	public WebElement selectItem3;
	
	@FindBy(how=How.XPATH,using="//label[@for='22']")
	public WebElement item3Size;
	
	@FindBy(how=How.XPATH,using="//span[text()='YOUR BAG']")
	public WebElement checkoutButton;
	
	@FindBy(how=How.XPATH,using="//*[@class='pricing-summary__top-value ng-binding']")
	public WebElement totalPriceSummary;
	
}
