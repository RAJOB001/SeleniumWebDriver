package com.webdrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\ChromeDriver\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // opens chrome

		String url = "https://practicetestautomation.com/practice-test-login/";
		driver.get(url);
        
		driver.manage().window().maximize();

		System.out.println("title "+ driver.getTitle());
		System.out.println("current URL "+ driver.getCurrentUrl());
		String text = driver.findElement(By.xpath("/html/body/div[1]/div/header/div[3]/div[1]/div/div[2]/div/nav/ul/li[1]/a")).getText();
		System.out.println("getText " + text);  // should display Home
		
		driver.quit(); // closes all opened tabs or pages
		//driver.close(); // closes current tab or page only

	}

}
