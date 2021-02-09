package com.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	// browserLucn
	public void chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	// lunchUrl
	public static void lunchUrl(String url) {
		driver.get(url);
	}

	// sendKeys
	public static void sendKeys(WebElement element, String data) {
		element.sendKeys(data);

	}

	// gettext
	public String getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
		return text;

	}

	// getAttribute
	public String getAttribute(WebElement element) {
		String attribute = element.getAttribute("value");

		return attribute;

	}

	// getScreenShot
	public void getScreenShot() throws IOException {
		TakesScreenshot tc = (TakesScreenshot) driver;
		File source = tc.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\god\\Downloads\\chromedriver_win32");
		FileUtils.copyFile(source, destination);
	}

	// Actions Methods
	// 1)mouseOverAction
	public void mouseOverAction(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();

	}

	// 2)drag and drop
	public void dragAndDrop(WebElement source, WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).perform();

	}

	// 3)mouseDoubleClick
	public void mouseDoubleClick(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();

	}

	// 4)mouseRightClick
	public void mouseRightClick(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
	}

	// 5)release
	public void release(WebElement element) {
		Actions a = new Actions(driver);
		a.release();

	}

	// 6)alertAccept
	public void alertAccept() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	// 7)alertDismiss
	public void alertDismiss() {
		Alert a = driver.switchTo().alert();
		a.dismiss();

	}

	// 8)alertSendkeys
	public void alertSendKeys(String text) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(text);

	}

	// 9)alertGetText
	public void alertGetText() {
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.err.println(text);

	}

	// 10)Select
	// selectVisbleText
	public void selectVisbleText(WebElement element, String data) {
		Select s = new Select(element);
		s.selectByVisibleText(data);

	}

	// deselectVisbleText
	public void deselectVisbleText(WebElement element, String data) {
		Select s = new Select(element);
		s.deselectByVisibleText(data);
	}

	// 12)selectByIndex
	public void selectByIndex(WebElement element, int index) {

		Select s = new Select(element);
		s.selectByIndex(index);

	}

	// 13)deselectByIndex
	public void deselectByIndex(WebElement element, int index) {

		Select s = new Select(element);
		s.deselectByIndex(index);

	}

	// 14)selectByValue
	public void selectByValue(WebElement element, String Value) {
		Select s = new Select(element);
		s.selectByValue(Value);

	}

	// 14)deselectByValue
	public void deselectByValue(WebElement element, String Value) {
		Select s = new Select(element);
		s.deselectByValue(Value);

	}
	public void getFirstSelectedOption(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);

	}

	//15)deselect
	public void deSelect(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();
		

	}
	//16)isMultiple
	public void isMultiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		

	}
	//17)maximizeBrowser
	public void maximizeBrowser() {
		driver.manage().window().maximize();

	}
	//18)cleanText
	public void cleanText(WebElement element) {
		element.clear();

	}
	//19)refresh
	public void refresh() {
		driver.navigate().refresh();

	}
 //20)	forward
	public void forward() {
		driver.navigate().forward();


	}
	//21)back
	public void back() {
		driver.navigate().back();
	}
	
	}


	



