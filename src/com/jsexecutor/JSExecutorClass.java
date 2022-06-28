package com.jsexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorClass {
	//JSExecutor used for flasing element, drawing border around element, capture title, click on some element,
	// generate alert info, refreshing page, scrolling page

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");  // opens chrome
		driver.manage().window().maximize();		
		
		WebElement submitElement=driver.findElement(By.id("submit"));
		
		// Scrolling Window
		JSExecutorUtil.scrollingWindow(driver, submitElement);  
		Thread.sleep(3000);
		
		// Flashing an Element
		for(int i=0;i<500;i++) {
			JSExecutorUtil.doFlashElement("yellow", submitElement, driver);
			JSExecutorUtil.doFlashElement("#000000", submitElement, driver);
		}
		
		WebElement testlogin=driver.findElement(By.xpath("/html/body/div[1]/div/section/section/h2"));	
		JSExecutorUtil.scrollingWindow(driver, testlogin); 
		
		// Drawing boarder around an element
		WebElement element1=driver.findElement(By.id("username"));
		JSExecutorUtil.drawBorder(driver, element1);		
		Thread.sleep(3000);
		
		//click
		WebElement clickElement=driver.findElement(By.id("submit"));
		JSExecutorUtil.clickElementByJS(driver, clickElement);
		
		// JS Alert Generating after clicking submit
		JSExecutorUtil.generateAlert(driver, "you clicked on Submit Button");
		
		

	}

}
