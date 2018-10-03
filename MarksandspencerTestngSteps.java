package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MarksandspencerTestngSteps{
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		Utility.setUpDriver();
		Utility.openPage("https://www.marksandspencer.com");
		
	}

	@When("^Search and select first Item$")
	public void search_and_select_first_Item() throws Throwable {
		MarksandspencerPageActions object = new MarksandspencerPageActions(Utility.getDriver());
		object.EnterItemName("Jacket");
		object.searchForItems();
		Utility.waitForPageToLoad();
		object.selectFirstItem();
		
	}

	@Then("^Add first item to the baskest$")
	public void add_first_item_to_the_baskest() throws Throwable {
		MarksandspencerPageActions object = new MarksandspencerPageActions(Utility.getDriver());
		object.pickItem1Size();
		Utility.waitForPageToLoad();
		object.navigateToAddToBasketButton();
		object.addItemToBasket();
	}

	@When("^Search and select second Item$")
	public void search_and_select_second_Item() throws Throwable {
		MarksandspencerPageActions object = new MarksandspencerPageActions(Utility.getDriver());
		Utility.waitForPageToLoad();
		object.EnterItemName("Perfume");
		object.searchForItems();
		object.selectSecondItem();
	}

	@Then("^Add second item to the baskest$")
	public void add_second_item_to_the_baskest() throws Throwable {
		MarksandspencerPageActions object = new MarksandspencerPageActions(Utility.getDriver());
		Utility.waitForPageToLoad();
		object.navigateToAddToBasketButton();
		Utility.waitForPageToLoad();
		object.addItemToBasket();
	}
	

	@When("^Search and select third Item$")
	public void search_and_select_third_Item() throws Throwable {
		MarksandspencerPageActions object = new MarksandspencerPageActions(Utility.getDriver());
		Utility.waitForPageToLoad();
		object.EnterItemName("Jumper");
		object.searchForItems();
		object.selectThirdItem();
	}
	

	@Then("^Add third item to the baskest$")
	public void add_third_item_to_the_baskest() throws Throwable {
		MarksandspencerPageActions object = new MarksandspencerPageActions(Utility.getDriver());
		object.pickItem3Size();
		object.navigateToAddToBasketButton();
		object.addItemToBasket();	
	}
	

	@Then("^Navigate to checkout the items$")
	public void navigate_to_checkout_the_items() throws Throwable {
		MarksandspencerPageActions object = new MarksandspencerPageActions(Utility.getDriver());
		Utility.waitForPageToLoad();
		object.cheackItemsOut();
	}

	@Then("^Verify the total price with the expected price$")
	public void verify_the_total_price_with_the_expected_price() throws Throwable {
		MarksandspencerPageActions object = new MarksandspencerPageActions(Utility.getDriver());
		Utility.waitForPageToLoad();
		object.verifyPrice("£64.00");
	}

	@Then("^Display a successful message$")
	public void display_a_successful_message() throws Throwable {
		MarksandspencerPageActions object = new MarksandspencerPageActions(Utility.getDriver());
		object.printSucessfulMessage();
	}

}