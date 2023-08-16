package com.Nykaa.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public interface Loginimplement {
	
	// login

	String sign_btn_xpath = "//button[text()='Sign in']";
	
	String sign_with_mail_xpath ="(//button[@kind='secondary'])[1]";
	
	String number_enter_xpath = "//input[@name='emailMobile']";
			
	String Proceed_btn_id = "submitVerification";  
	
	String Enter_Otp_xpath = "//input[@type='number']";
	
	String Verify_btn_xpath = "//button[@type='submit']";
	
	//product

	String men_btn_xpath = "//a[text()='men']";
	
	String Select_product_xpath = "//img[@alt='Jaguar Classic Black Eau De Toilette']";
	
    String Enter_pincode_xpath = "//input[@type='tel']";
    
    //addtobag
	
    String AddToBag_xpath = "(//span[text()='Add to Bag'])[1]";
    
    String select1in_AddToBag_xpath = "//span[text()='1']";
	
    String proceed_button_xpath = "//div[@class='css-15vhhhd e25lf6d4']";
	
    String  DeleverHere_btn_xpath = "//button[@class='css-n7wnfc e8tshxd0']";
    
    
    //card options
	
	
    String  Credit_cardOption_xpath = "//p[text()='Credit/Debit Card']";
    
    String  Credit_cardNumber_xpath = "//input[@label='Card Number']";
	
	
    String  Exp_month_xpath = "(//input[@type='tel'])[2]";
    
    String  cvv_button_xpath = "//input[@type='number']";
	
    String  payment_button_xpath = "button.css-v61n2j.e8tshxd0";
 
}



