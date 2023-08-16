package com.runner;


	import java.io.File;
import java.io.IOException;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.github.dockerjava.api.model.Driver;

	public class Testrunner {
	
		static WebDriver driver;
		
		private static void browserlaunch() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\test\\driver\\chromedriver.exe");
		    driver= new ChromeDriver();	
			driver.manage().window().maximize();
			driver.get("https://www.nykaa.com/");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			}
		
		private static void login() {
			WebElement Element = driver.findElement(By.xpath("//button[text()='Sign in']"));
			Element.click();
			WebElement Element2= driver.findElement(By.xpath("(//button[@kind=\"secondary\"])[1]"));
			Element2.click();

		}
		
		private static void input() throws InterruptedException {
			 WebElement a = driver.findElement(By.xpath("//input[@name=\"emailMobile\"]"));
			 a.sendKeys("9600046952");
			 WebElement b = driver.findElement(By.id("submitVerification"));
			 b.click();
		     WebElement c = driver.findElement(By.xpath("//input[@type=\"number\"]"));
			 c.sendKeys("1234");
			 Thread.sleep(30000);
			 WebElement d = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
			 d.click();
		}
		
		private static void select() {
			 WebElement e = driver.findElement(By.xpath("//a[text()='men']"));
			 e.click();
			}
		
		private static void windowhandle() {
			Set<String> windowHandles = driver.getWindowHandles(); 
		    for(String string: windowHandles)
		    {
		    	String title= driver.switchTo().window(string).getCurrentUrl();
		    	System.out.println(title);
		    }
		    String title ="https://www.nykaa.com/sp/men-store/men-store?root=nav_1&dir=desc&order=popularity";
		    for(String string:windowHandles)
		    {
		    	if(driver.switchTo().window(string).getCurrentUrl().equals(title));
		    	
		    }
		}
		
		private static void selectproduct() {
			JavascriptExecutor js=( JavascriptExecutor)driver;
		    js.executeScript("window.scrollBy(0,2000)");
		    
			  WebElement findElement = driver.findElement(By.xpath("//img[@alt=\"Jaguar Classic Black Eau De Toilette\"]"));
			  findElement.click();
			  JavascriptExecutor js1=( JavascriptExecutor)driver;
			  js1.executeScript("window.scrollBy(0,200)");
			  WebElement findElement2 = driver.findElement(By.xpath("//input[@type=\"tel\"]"));
			  findElement2.sendKeys("600080");

		}
		private static void addtobag() throws Throwable {
			 WebElement findElement = driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]"));
			findElement.click();
			WebElement findElement2 = driver.findElement(By.xpath("//span[text()='1']"));
			findElement2.click();
			driver.switchTo().frame(0);
			WebElement findElement3 = driver.findElement(By.xpath("//div[@class=\"css-15vhhhd e25lf6d4\"]"));
			Thread.sleep(3000);
			findElement3.click();
			
		}
		private static void payment() throws Throwable  {
			WebElement findElement = driver.findElement(By.xpath("//button[@class=\"css-n7wnfc e8tshxd0\"]"));
			findElement.click();
			WebElement findElement2 = driver.findElement(By.xpath("//p[text()='Credit/Debit Card']"));
			findElement2.click();  
			WebElement findElement3 = driver.findElement(By.xpath("//input[@label=\"Card Number\"]"));	
		   findElement3.click();
		   Thread.sleep(4000);
		   findElement3.sendKeys("4461 2086 5633 7782");
			WebElement findElement4 = driver.findElement(By.xpath("(//input[@type=\"tel\"])[2]"));
			findElement4.click();
			Thread.sleep(3000);
			findElement4.sendKeys("10/27");
			WebElement findElement5 = driver.findElement(By.xpath("//input[@type=\"number\"]"));
			findElement5.click();
			Thread.sleep(3000);
			findElement5.sendKeys("315");
			WebElement findElement6 = driver.findElement(By.cssSelector("button.css-v61n2j.e8tshxd0"));
			findElement6.click();
			TakesScreenshot ts=(TakesScreenshot) driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File source=new File("C:\\Users\\USER\\eclipse-workspace\\maven\\Screenshot\\Payment.png");
			try {
				FileHandler.copy(src, source);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
//		private void removebag() {
//			JavascriptExecutor js1=(JavascriptExecutor)driver;
//			js1.executeScript("window.scrollby(0,1000)");
//			driver.findElement(By.xpath(null));

		//}
		public static void main(String[] args) throws Throwable {
			browserlaunch();
			login();
			input();
			select();
			windowhandle();
			selectproduct();
			addtobag();
			payment();
			}
		}



