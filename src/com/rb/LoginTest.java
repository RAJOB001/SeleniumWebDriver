package com.rb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\ChromeDriver\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // opens chrome

		String url = "https://practicetestautomation.com/practice-test-login/";
		driver.get(url);

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("student"); // sendkeys used to give input
		Thread.sleep(3000);
		//driver.findElement(By.linkText(url))
		driver.findElement(By.id("password")).sendKeys("Password123");
		Thread.sleep(3000);
		driver.findElement(By.id("submit")).click();

		String exp_title = "Logged In Successfully | Practice Test Automation";

		String act_title = driver.getTitle();

		if (exp_title.equals(act_title) == true) {
			System.out.println("Automate Testing passed");
		} else {
			System.out.println("Automate Testing failed");
		}
		Thread.sleep(2000);
		driver.close(); // used to close browser

	}

}
