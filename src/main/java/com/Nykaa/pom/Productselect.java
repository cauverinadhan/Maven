package com.Nykaa.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class Productselect extends Base implements Loginimplement {
	public Productselect() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='men']")
	private WebElement men_btn;

	public WebElement getMen_btn() {
		return men_btn;
	}
	@FindBy(xpath="//img[@alt='Jaguar Classic Black Eau De Toilette']")
	private WebElement Select_product;

	public WebElement getSelect_product() {
		return Select_product;
	}

	@FindBy(xpath="//input[@type='tel']")
	private WebElement Enter_pincode;

	public WebElement getEnter_pincode() {
		return Enter_pincode;
	}
	

	
	

	

}
