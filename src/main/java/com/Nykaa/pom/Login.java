package com.Nykaa.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class Login extends Base implements Loginimplement {
	public Login() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Sign in']")
	private WebElement SignIn_btn;

	public WebElement getSignIn_btn() {
		return SignIn_btn;
	}

	@FindBy(xpath = "(//button[@kind='secondary'])[1]")
	private WebElement SignInWithMail;

	public WebElement getSignInWithMail() {
		return SignInWithMail;
	}

	@FindBy(xpath = "//input[@name='emailMobile']")
	private WebElement EnterthePhoneNum;

	public WebElement getEnterthePhoneNum() {
		return EnterthePhoneNum;
	}

	@FindBy(id = "submitVerification")
	private WebElement Proceed_btn;

	public WebElement getProceed_btn() {
		return Proceed_btn;
	}

	@FindBy(xpath = "//input[@type='number']")
	private WebElement Enter_Otp;

	public WebElement getEnter_Otp() {
		return Enter_Otp;
	}

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Verify_btn;

	public WebElement getVerify_btn() {
		return Verify_btn;
	}

}
