package com.iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlerts {

	public static void main(String[] args) throws InterruptedException {
		// we cant find Xpath for Alert buttons Ok & Cancel so we have methods accept()
		// & dismiss ()
		// getText() method to extract alert body message & senkKeys method to give
		// input
		System.setProperty("webdriver.chrome.driver", "C:\\\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // opens chrome
		String url = "http://the-internet.herokuapp.com/javascript_alerts";
		driver.get(url);
		driver.manage().window().maximize();
		

		driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[1]/button")).click();
		Thread.sleep(2000);
		// now alert will open
		driver.switchTo().alert().accept(); // clicks Ok in alert Box
		// driver.switchTo().defaultContent(); // with or without getting output
		String text = driver.findElement(By.id("result")).getText();
		if (text.equals("You successfully clicked an alert")) {
			System.out.println("Test Case Passed Successfully");
		}

		// driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[2]/button")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[2]/button")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		String text1 = driver.findElement(By.id("result")).getText();
		if (text1.equals("You clicked: Cancel")) {
			System.out.println("Test Case Passed Successfully");
		}

	}

}
