package com.rb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\ChromeDriver\\\\chromedriver.exe");

		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		//options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);
		
		String url="https://practicetestautomation.com/practice-test-login/";
		driver.get(url);
		
		driver.findElement(By.id("username")).sendKeys("student"); // sendkeys used to give input
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		
		String exp_title = "Logged In Successfully | Practice Test Automation";
		
		String act_title = driver.getTitle();
		
		if(exp_title.equals(act_title) == true ) {
			System.out.println("test case passed");
		}
		else {
			System.out.println("test case failed");
		}

	}

}
