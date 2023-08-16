package com.base;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;

//1,browser launch
	public static WebDriver browserlaunch(String browser) {
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("edge")){
			WebDriverManager.chromedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

//2,get
	public static WebDriver launchUrl(String url) {
		driver.get(url);
		return driver;

	}

//3,4close @ quit
	public static void exit(String input) {
		if (input.equals("close")) {
			driver.close();
		} else if (input.equals("quit")) {
			driver.quit();
		}
	}

//navigate forward
	public static void forwardpage() {
		driver.navigate().forward();
	}

	//sendkeys
	public static void passInput(WebElement element, String input) {
		element.sendKeys(input);
	}
	// Close Method
			public static void close() {
				driver.close();
			}

		// Quit Method

			public static void quit() {
				driver.quit();
			}

		// Navigate To Method

			public static void navigateTo(String url) {
				driver.navigate().to(url);
			}

		// Other Navigation Methods

			public static void navigate(String input) {

				if (input.equalsIgnoreCase("forward")) {
					driver.navigate().forward();
				} else if (input.equalsIgnoreCase("back")) {
					driver.navigate().back();
				} else if (input.equalsIgnoreCase("refresh")) {
					driver.navigate().refresh();
				}
			}

		// Get Method

			public static void getUrl(String url) {
				driver.get(url);
			}

		// Alert Methods

			public static void handlingAlert(String value) {
			
				if (value.equalsIgnoreCase("accept")) {
					driver.switchTo().alert().accept();
				}
				else if (value.equalsIgnoreCase("dismiss")) {
					driver.switchTo().alert().dismiss();
				}
				else if (value.equalsIgnoreCase("getText")) {
				System.out.println("Alert Text: " + driver.switchTo().alert().getText());
				}
			}

		// Alert Method to SendText

			public static void sendAlert(String Input) {
				driver.switchTo().alert().sendKeys(Input);
			}

			// Action Class Method(Simple)

						public static void simpleAction(String input) {

						Actions as = new Actions(driver);

						if (input.equalsIgnoreCase("click")) {
						as.click().build().perform();
						}
						else if (input.equalsIgnoreCase("click and hold")) {
						as.clickAndHold().build().perform();
						}
						else if (input.equalsIgnoreCase("context click")) {
						as.contextClick().build().perform();
						}
						else if (input.equalsIgnoreCase("double click")) {
						as.doubleClick().build().perform();
						}
						else if (input.equalsIgnoreCase("Release")) {
						as.release().build().perform();
						}
					}

				// Action Class Drag and Drop

					public static void actionDragAndDrop(WebElement source, WebElement target) {
						Actions ac = new Actions(driver);
						ac.dragAndDrop(source, target);
					}

				// Frame Methods

					public static void frameValue(String Value) {
						driver.switchTo().frame(Value);
					}

					public static void frameWebElement(WebElement Element) {
						driver.switchTo().frame(Element);
					}

					public static void frameIndex(int Position) {
						driver.switchTo().frame(Position);
					}

					public static void defaultWindow() {
						driver.switchTo().defaultContent();
					}

				

					public static void windowHande() {

					}

				// Drop Down Method

					public static void dropdown(WebElement element, String input, String data) {
						Select s = new Select(element);
						if (input.equalsIgnoreCase("Value")) {
						s.selectByValue(data);
						}
						else if (input.equalsIgnoreCase("text")) {
						s.selectByVisibleText(data);
						}
						else if (input.equalsIgnoreCase("index")) {
						int parseInt = Integer.parseInt(data);
						s.selectByIndex(parseInt);
						}

				// Get First Selected Option
						
						else if (input.equalsIgnoreCase("getfirstselectedoption")) {
						WebElement sop = s.getFirstSelectedOption();
						System.out.println("Text of Selected Option: " + sop.getText());
						}

				// getOptions
						else if (input.equalsIgnoreCase("getoptions")) {
						List<WebElement> op = s.getOptions();
						for (int i = 0; i < op.size(); i++) {
							String options = op.get(i).getText();
							System.out.println("GetOptions: " + options);
							}
						}

				// Is Multiple
						else if (input.equalsIgnoreCase("ismultiple")) {
						if (s.isMultiple()) {
						System.out.println("Multiple Selection Supported");
						} 
						else {
							System.out.println("Multiple Selection Not Supported");
							}
						}

				// Get All Selected Options

						else if (input.equalsIgnoreCase("getallselectedoptions")) {
						List<WebElement> op = s.getAllSelectedOptions();
						for (int i = 0; i < op.size(); i++) {
							String options = op.get(i).getText();
							System.out.println("All Selected Options: " + options);
							}
						}

						else if (input.equalsIgnoreCase("deselectall")) {
							s.deselectAll();
						}
					}

				// Method For is Enabled

					public static void isEnabled( WebElement element) {

						boolean enable = element.isEnabled();
						System.out.println("Boolean Value: " + enable);
					}	
					

				// Method For is Displayed

					public static void isDisplayed(WebElement element) {
						
						boolean display = element.isDisplayed();	
						System.out.println("Boolean Value: " + display);
						}
						
				// Method For is Selected

					public static void isSelected(WebElement element) {

					boolean selected = element.isSelected();
							System.out.println("Boolean Value: " + selected);
						}
						
				// get Title

					public static void getTitle() {
						System.out.println("Title : " + driver.getTitle());
					}

				// get Current URL

					public static void getCurrentUrl() {
						System.out.println("Current URL: " + driver.getCurrentUrl());
					}

				// get Text

					public static String getText(WebElement element) {

						String gettext = element.getText();
						System.out.println("Text of Element:" + gettext);
						return gettext;
					}

				// Wait Concept
					
					public static void implicitelywait(long time) {
					driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
					}

				//Explicit Wait	
					
					public static <WebDriverWait> void visibilityOfWebelement(long time, WebElement Element) {

					WebDriverWait wait = new WebDriverWait(driver, time);
					wait.until(ExpectedConditions.visibilityOf(Element)).click();
					}

				//Screenshot Method
					
					public static void TakeScreenshot(String filename) throws IOException {

						TakesScreenshot ts = (TakesScreenshot) driver;
						File src = ts.getScreenshotAs(OutputType.FILE);
//						Date d = new Date();
//						String filename = d.toString().replaceAll(":", "").replace(",", "") + ".png";
						File desc = new File("C:\\Users\\DELL\\eclipse-workspace\\dhivakar\\ProjectClass2\\ScreenShot\\" +filename + ".png");
						FileUtils.copyFile(src, desc);
					}
private void syso() {
	// TODO Auto-generated method stub
	System.out.println();

}
				//Scrolling up and down
					
					public static void scrolling( int a) {
						JavascriptExecutor js = (JavascriptExecutor) driver;
							js.executeScript("window.scrollBy(0," + a + ")");
					}

				// SendKeys Method

					public static void sendKeys(WebElement element, String sendkeys) {

					element.sendKeys(sendkeys);
							}

				// Clicking WebElement

				public static void 	clickingWebElement(WebElement element) {
					
					element.click();
				}

				}