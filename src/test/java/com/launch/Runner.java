package com.launch;

import com.base.Base;

public class Runner extends Base {
	
	public static void main(String[] args) {
		browserlaunch("chrome");
		launchUrl("https://www.nykaa.com/");
		
		exit("close");
	}

}
