package com.Nykaa.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class Productselect1 extends Base implements Loginimplement{
	public Productselect1() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=men_btn_xpath)
	private WebElement men_btn;

	public WebElement getMen_btn() {
		return men_btn;
	}
	@FindBy(xpath=Select_product_xpath)
	private WebElement Select_product;

	public WebElement getSelect_product() {
		return Select_product;
	}

	@FindBy(xpath=Enter_pincode_xpath)
	private WebElement Enter_pincode;

	public WebElement getEnter_pincode() {
		return Enter_pincode;
	}
	

}
