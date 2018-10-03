package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MarksandspencerPageActions extends MarksandspencerElementsLocator {

	public MarksandspencerPageActions(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void EnterItemName(String item) {
		searchBar.sendKeys(item);
	}
	
	public void searchForItems() {
		sendButton.click();
	}
	
	public void selectFirstItem() {
		selectItem1.click();
	}
	
	public void selectSecondItem() {
		selectItem2.click();
	}
	
	public void selectThirdItem() {
		selectItem3.click();
	}
	
	public void addItemToBasket() {
		addToBasketButton.click();
	}
	
	public void cheackItemsOut() {
		checkoutButton.click();
	}
	
	public void revealPriceSummary() {
		totalPriceSummary.click();
	}
	
	public void navigateToAddToBasketButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.id("add-to-basket-button")));
	}
	
	public void pickItem1Size() {
		item1Size.click();
	}
	
	public void pickItem3Size() {
		item3Size.click();
	}
	
	public void printSucessfulMessage() {
		System.out.println("SUCCESSFUL FUNCTIONALITY TEST");
	}
	
	public void verifyPrice(String expectedPrice) {
		String totalPrice = totalPriceSummary.getText();
		Assert.assertEquals(totalPrice, expectedPrice);
	}
}
