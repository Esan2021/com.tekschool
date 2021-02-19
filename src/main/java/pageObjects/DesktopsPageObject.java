package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class DesktopsPageObject extends Base {

	//constructor 
	public DesktopsPageObject() {
		PageFactory.initElements(driver, this);
		
	}
				
			@FindBy(xpath ="//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
			private WebElement desktopsTab;
			
			@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
			private WebElement showalldesktops;
			
			@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[1]")
			private WebElement addToCartOption;
			
			@FindBy(xpath = "//input[@id='input-quantity']")
			private WebElement selectQuantity1;
			
			@FindBy(xpath = "//button[@id='button-cart']")
			private WebElement clickAddToCartButton;

			@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
			private WebElement messageDisplayed;
			
			
			// WebElemant for Register Page 
			//we stored
			public void clickOnDesktop() {
				WebDriverUtility.clickOnElement(desktopsTab);
			}
			public void clickOnShowAllDesktops() {
				WebDriverUtility.clickOnElement(showalldesktops);
			}
			public void addToCartOption() {
				WebDriverUtility.clickOnElement(addToCartOption);
			}
			public void selectQuantity1() {
				WebDriverUtility.clickOnElement(selectQuantity1);
			}
			public void clickAddToCartButton() {
				WebDriverUtility.clickOnElement(clickAddToCartButton);
			}
			public boolean messageDisplayed() {
				boolean successMessage = messageDisplayed.isDisplayed();
				return successMessage;
			
			}
		}

		

