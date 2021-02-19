package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.DesktopsPageObject;
import pageObjects.RetailPageObj;
import utilities.WebDriverUtility;

public class DesktopsPageStepDefinition extends Base {
	
	DesktopsPageObject desltopsPage = new DesktopsPageObject();
	
	@When("^User click on Desktops tab$")
	public void user_click_on_Desktops_tab() throws Throwable {
		desltopsPage.clickOnDesktop();
		logger.info("User click on DesktopsTob");

	}

	@When("^User click on Show all desktops$")
	public void user_click_on_Show_all_desktops() throws Throwable {
		desltopsPage.clickOnShowAllDesktops();
		logger.info("User click on show all desktops");
		WebDriverUtility.screenShot();

	}

	@When("^User click ADD TO CART option on ‘HP LP(\\d+)’ item$")
	public void user_click_ADD_TO_CART_option_on_HP_LP_item(int arg1) throws Throwable {
		desltopsPage.addToCartOption();
		logger.info("User click on add to cart option");
		
	
	}

	@When("^User select quantity (\\d+)$")
	public void user_select_quantity(int arg1) throws Throwable {
	  
	}

	@When("^User click add to Cart button$")
	public void user_click_add_to_Cart_button() throws Throwable {

	}

	@Then("^User should see a message ‘Success: you have added HP LP (\\d+) to your Shopping cart!’$")
	public void user_should_see_a_message_Success_you_have_added_HP_LP_to_your_Shopping_cart(int arg1) throws Throwable {

	}

}
