package com.rb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopups {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\ChromeDriver\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // opens chrome
		// syntax http://username:password@URL
		String url = "http://admin:admin@the-internet.herokuapp.com/basic_auth";
		driver.get(url);
		
		String text = driver.findElements(By.cssSelector("p")).get(0).getText();
		System.out.println(text);
		
		//driver.quit();

	}

}
