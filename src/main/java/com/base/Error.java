package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Error {
	private static final TimeUnit seconds = null;
	
	

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gor-pathology.web.app/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("test@kennect.io");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("Qwerty@1234");
		WebElement login = driver.findElement(By.xpath("//span[text()='Login']"));
		login.click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,7000)");
		driver.findElement(By.xpath("//div[text()='AFP (ALPHA FETO PROTEINS)']"));
			
		
	}


	
}
