package com.webdrivercommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\ChromeDriver\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // opens chrome

		String url = "https://practicetestautomation.com/practice-test-login/";
		driver.get(url);

		driver.manage().window().maximize();

		System.out.println("Title " + driver.getTitle());

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.navigate().to("https://www.facebook.com/");
		System.out.println("Title " + driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("back to " + driver.getTitle());

		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().forward();
		System.out.println("forward " + driver.getTitle());
        
		// driver.close();
		driver.quit();

	}

}
