package com.Nykaa.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class Login1 extends Base implements Loginimplement{
	

	public Login1() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = sign_btn_xpath)
	private WebElement SignIn_btn;

	public WebElement getSignIn_btn() {
		return SignIn_btn;
	}

	@FindBy(xpath = sign_with_mail_xpath)
	private WebElement SignInWithMail;

	public WebElement getSignInWithMail() {
		return SignInWithMail;
	}

	@FindBy(xpath = number_enter_xpath)
	private WebElement EnterthePhoneNum;

	public WebElement getEnterthePhoneNum() {
		return EnterthePhoneNum;
	}

	@FindBy(id = Proceed_btn_id)
	private WebElement Proceed_btn;

	public WebElement getProceed_btn() {
		return Proceed_btn;
	}

	@FindBy(xpath = Enter_Otp_xpath)
	private WebElement Enter_Otp;

	public WebElement getEnter_Otp() {
		return Enter_Otp;
	}

	@FindBy(xpath = Verify_btn_xpath)
	private WebElement Verify_btn;

	public WebElement getVerify_btn() {
		return Verify_btn;
	}

}