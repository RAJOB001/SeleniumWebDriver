package com.webdrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\ChromeDriver\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // opens chrome
		String url = "https://demoqa.com/automation-practice-form";
		driver.get(url);
		driver.manage().window().maximize();

		WebElement f_name = driver.findElement(By.id("firstName"));
		
		// isDisplayed used to wether the element is visible or not
		// isEnabled used wether we can able insert data or not.
		// isSelected used in radio buttons checklist

		if (f_name.isDisplayed() && f_name.isEnabled()) {
			driver.findElement(By.id("firstName")).sendKeys("Buddeeswar");
			System.out.println("condition true");
		}
		//Thread.sleep(6000);
		
		driver.navigate().to("https://demo.guru99.com/test/radio.html");
		Thread.sleep(7000);
		boolean before=driver.findElement(By.id("vfb-7-3")).isSelected();
		System.out.println("radio before "+before);
		
		driver.findElement(By.id("vfb-7-3")).click();
		Thread.sleep(2000);
		boolean after=driver.findElement(By.id("vfb-7-3")).isSelected();
		System.out.println("radio after "+after);
		
		
		
		
	}
}
