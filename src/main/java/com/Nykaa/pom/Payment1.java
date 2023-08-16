package com.Nykaa.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class Payment1 extends Base implements Loginimplement{
	public Payment1() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = Credit_cardOption_xpath)
	private WebElement Credit_cardOption;

	public WebElement getCredit_cardOption() {
		return Credit_cardOption;
	}

	@FindBy(xpath = Credit_cardNumber_xpath)
	private WebElement Credit_cardNumber;

	public WebElement getCredit_cardNumber() {
		return Credit_cardNumber;
	}

	@FindBy(xpath = Exp_month_xpath)
	private WebElement Exp_month;

	public WebElement getExp_month() {
		return Exp_month;
	}

	@FindBy(xpath = cvv_button_xpath)
	private WebElement cvv_button;

	public WebElement getCvv_button() {
		return cvv_button;
	}

	@FindBy(css = payment_button_xpath)
	private WebElement payment_button;

	public WebElement getPayment_button() {
		return payment_button;
	}

}
