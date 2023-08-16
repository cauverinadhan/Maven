package com.Nykaa.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class Payment extends Base implements Loginimplement {
	public Payment() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[text()='Credit/Debit Card']")
	private WebElement Credit_cardOption;

	public WebElement getCredit_cardOption() {
		return Credit_cardOption;
	}

	@FindBy(xpath = "//input[@label='Card Number']")
	private WebElement Credit_cardNumber;

	public WebElement getCredit_cardNumber() {
		return Credit_cardNumber;
	}

	@FindBy(xpath = "(//input[@type='tel'])[2]")
	private WebElement Exp_month;

	public WebElement getExp_month() {
		return Exp_month;
	}

	@FindBy(xpath = "//input[@type='number']")
	private WebElement cvv_button;

	public WebElement getCvv_button() {
		return cvv_button;
	}

	@FindBy(css = "button.css-v61n2j.e8tshxd0")
	private WebElement payment_button;

	public WebElement getPayment_button() {
		return payment_button;
	}

}
