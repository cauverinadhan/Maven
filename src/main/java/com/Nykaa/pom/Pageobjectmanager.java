package com.Nykaa.pom;


import org.openqa.selenium.support.PageFactory;

import com.base.Base;
import com.github.dockerjava.api.model.Driver;

public class Pageobjectmanager extends Base{
	private Pageobjectmanager()
	{
	PageFactory.initElements(driver, this);
	}
	

	public Login1 getLn() {
		if(ln==null) {
		ln=new Login1();
		}
		return ln;
	}

	public Productselect1 getPs() {
		if(ps==null) {
		ps=new Productselect1();
		}
		return ps;
	}

	public Addtobag1 getAdd() {
		if(add==null) {
			add=new Addtobag1();
		}
		return add;
	}

	public Payment1 getPay() {
		if(pay==null) {
			add=new Addtobag1();
		}
		return pay;
	}

	public static Pageobjectmanager getPom() {
		if(pom==null)
			pom=new Pageobjectmanager();
		return pom;
	}

	private Login1 ln;
	private Productselect1 ps;
	private Addtobag1 add;
	private Payment1 pay;
	
	private  static Pageobjectmanager pom;
	
}


