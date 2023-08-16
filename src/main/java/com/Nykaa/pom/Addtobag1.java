package com.Nykaa.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class Addtobag1 extends Base implements Loginimplement {
	public Addtobag1() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = AddToBag_xpath)
	private WebElement AddToBag;

	public WebElement getAddToBag() {
		return AddToBag;
	}

	@FindBy(xpath = select1in_AddToBag_xpath)
	private WebElement select1in_AddToBag;

	public WebElement getSelect1in_AddToBag() {
		return select1in_AddToBag;
	}

	@FindBy(xpath = proceed_button_xpath)
	private WebElement proceed_button;

	public WebElement getProceed_button() {
		return proceed_button;
	}

	@FindBy(xpath =DeleverHere_btn_xpath)
	private WebElement DeleverHere_btn;

	public WebElement getDeleverHere_btn() {
		return DeleverHere_btn;
	}

}


