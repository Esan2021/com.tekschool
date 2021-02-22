package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

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
		desltopsPage.addToCartOptionOnHPLP3065Itime();
		logger.info("User click on add to cart option");
	}

	@When("^User select quantity (\\d+)$")
	public void user_select_quantity(int arg1) throws Throwable {
		desltopsPage.selectQuantity1();
		logger.info("User select quantity1");
		WebDriverUtility.screenShot();
	  
	}

	@When("^User click add to Cart button$")
	public void user_click_add_to_Cart_button() throws Throwable {
		desltopsPage.clickAddToCartButton();
		logger.info("User click on add to cart button");

	}

	@Then("^User should see a message ‘Success: you have added HP LP (\\d+) to your Shopping cart!’$")
	public void user_should_see_a_message_Success_you_have_added_HP_LP_to_your_Shopping_cart(int arg1) throws Throwable {
		
		Assert.assertTrue(desltopsPage.messageDisplayed());
		WebDriverUtility.screenShot();
		logger.info("User should see a message ‘Success: you have added HP LP (\\\\d+) to your Shopping cart!’");

	}
	
	@When("^User click ADD TO CART option on ‘Canon EOS (\\d+)D’ item$")
	public void user_click_ADD_TO_CART_option_on_Canon_EOS_D_item(int arg1) throws Throwable {
		desltopsPage.addToCartOptionOnCanonEOS5DItiem();
		logger.info("User click add to cart option");
		WebDriverUtility.screenShot();
		
	}

	@When("^User select color from dropdown ‘Red’$")
	public void user_select_color_from_dropdown_Red() throws Throwable {
		desltopsPage.colorFromDropdownRed();
		logger.info("User select color fron dropdown");
		WebDriverUtility.screenShot();
	}

	@Then("^User should see a message ‘Success: You have added Canon EOS (\\d+)D to your shopping cart!’$")
	public void user_should_see_a_message_Success_You_have_added_Canon_EOS_D_to_your_shopping_cart(int arg1) throws Throwable {
	
		Assert.assertTrue(desltopsPage.messageDisplayed());
		WebDriverUtility.screenShot();
		logger.info("user_should_see_a_message_Success_You_have_added_Canon_EOS_D_to_your_shopping_cart");

	}
	}
