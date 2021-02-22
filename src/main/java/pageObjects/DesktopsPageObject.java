package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.WebDriverUtility;

public class DesktopsPageObject extends Base {

	// constructor
	public DesktopsPageObject() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
	private WebElement desktopsTab;

	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement showalldesktops;

	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[1]")
	private WebElement addToCartOptionOnHPLP3065Itime;

	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement selectQuantity1;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement clickAddToCartButton;

	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement messageDisplayed;
	
	
	//WebElement for Canon EOS 5D from Desktops page
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[1]")
	private WebElement addToCartOptionOnCanonEOS5DItiem;
	
	@FindBy(xpath = "//select[@class='form-control']")
	private WebElement colorFromDropdownRed;
	
	@FindBy(xpath = "//button[@class='btn btn-primary btn-lg btn-block']")
	private WebElement addToCartButton; 

	// WebElemant for Register Page
	// we stored
	public void clickOnDesktop() {
		WebDriverUtility.clickOnElement(desktopsTab);
	}

	public void clickOnShowAllDesktops() {
		WebDriverUtility.clickOnElement(showalldesktops);
	}

	public void addToCartOptionOnHPLP3065Itime() {
		WebDriverUtility.clickOnElement(addToCartOptionOnHPLP3065Itime);
	}

	public void selectQuantity1() {
		WebDriverUtility.clickOnElement(selectQuantity1);
	}

	public void clickAddToCartButton() {
		WebDriverUtility.clickOnElement(clickAddToCartButton);
	}
	
	public void addToCartOptionOnCanonEOS5DItiem() {
		WebDriverUtility.clickOnElement(addToCartOptionOnCanonEOS5DItiem);
	}
	
	public void colorFromDropdownRed() {
		WebDriverUtility.clickOnElement(colorFromDropdownRed);

	}

	public boolean messageDisplayed() {
		boolean successMessageyouHaveAddedHPLP3065ToYourShoppingCart = messageDisplayed.isDisplayed();
		return successMessageyouHaveAddedHPLP3065ToYourShoppingCart;

	}
}
