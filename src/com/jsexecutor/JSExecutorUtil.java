package com.jsexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSExecutorUtil {

	public static void doFlashElement(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.backgroundColor = ' " + color + " ' ", element);
	}

	public static void drawBorder(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border = '5px solid red' ", element);
	}

	// Scrolling is 3 types scroll by pixel, scroll until we find element, scroll to
	// bottom page
	
	public static void scrollingWindow(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,1000)", " ");
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		// js.executeScript("arguments[0].scrollTo(0, document.body.scrollHeight)", " ");
	}
	
	public static void clickElementByJS(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void generateAlert(WebDriver driver, String msg) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(" alert(' "+msg+" ') ");
	}

}
