package com.Nykaa.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class Addtobag extends Base implements Loginimplement {
	public Addtobag() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[text()='Add to Bag'])[1]")
	private WebElement AddToBag;

	public WebElement getAddToBag() {
		return AddToBag;
	}

	@FindBy(xpath = "//span[text()='1']")
	private WebElement select1in_AddToBag;

	public WebElement getSelect1in_AddToBag() {
		return select1in_AddToBag;
	}

	@FindBy(xpath = "//div[@class='css-15vhhhd e25lf6d4']")
	private WebElement proceed_button;

	public WebElement getProceed_button() {
		return proceed_button;
	}

	@FindBy(xpath = "//button[@class='css-n7wnfc e8tshxd0']")
	private WebElement DeleverHere_btn;

	public WebElement getDeleverHere_btn() {
		return DeleverHere_btn;
	}

}
