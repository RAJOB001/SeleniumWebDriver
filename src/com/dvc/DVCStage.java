package com.dvc;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DVCStage {
	public static final String required_month = "August";
	public static final int day = 31;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // opens chrome
		String url = "https://stage.dvc-ubi.wdprapps.disney.com/home/290560410342";
		driver.get(url);
		Thread.sleep(3000);
		driver.manage().window().maximize();

		driver.findElement(By.id("login-username")).sendKeys("TEST119@disney.com"); // username

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/div/div[1]/mat-card/mat-card-content/app-login/form/div[4]/div/button/span"))
				.click();// next

		Thread.sleep(3000);
		driver.findElement(By.id("login-password")).sendKeys("Mickeyminnie123"); // password

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/div/div[1]/mat-card/mat-card-content/app-login/form/div[3]/div/button/span"))
				.click(); // LoginWith my ID

		Thread.sleep(10000); // wait for Loading Page

		/////////////////////////////////////////////////////
		//document.querySelector("#childProduct").shadowRoot.querySelector("#inputContainer")
		String query = "return document.querySelector('#childProduct').shadowRoot.querySelector('#inputContainer > i')";
		WebElement dropdown = (WebElement) ((JavascriptExecutor) driver).executeScript(query);
		dropdown.click();
	    
      // WebElement el1= (WebElement) ((JavascriptExecutor) driver).executeScript(query);
		Thread.sleep(3000);
		System.out.println("tag name " + dropdown.getTagName());

		String query1 = "return document.querySelector('#childProduct').shadowRoot.querySelector('#b2086124816 > div')";
		WebElement product = (WebElement) ((JavascriptExecutor) driver).executeScript(query1);
		product.click();

		String dateq = "return document.querySelector(\"#arrival-date\").shadowRoot.querySelector(\"#editable-input-container > wdpr-input\").shadowRoot.querySelector(\"#button-container > button > i\")";
		WebElement date = (WebElement) ((JavascriptExecutor) driver).executeScript(dateq);
		date.click();

		while (true) {
			// getting month element
			String monthquery = "return document.querySelector(\"#arrival-date\").shadowRoot.querySelector(\"#calendar-container > div.calendar-header > span > span.month\")";
			WebElement monthelement = (WebElement) ((JavascriptExecutor) driver).executeScript(monthquery);
			String current_month = monthelement.getText();

			System.out.println("current Month " + current_month);
			if (current_month.equals("August") == true) {
				break;
			}
			Thread.sleep(2000);
			// getting Element of pre-month clicking button ->HardCoded
			String premonthquery = "return document.querySelector(\"#arrival-date\").shadowRoot.querySelector(\"#calendar-container > div.calendar-header > button:nth-child(1)\")";
			WebElement prevMonthElement = (WebElement) ((JavascriptExecutor) driver).executeScript(premonthquery);
			prevMonthElement.click();
		}

		Thread.sleep(3000);
		
		
		// getting day Element
		String dayq = "return document.querySelector('#arrival-date').shadowRoot.querySelector('#calendar-container > div.calendar-body > div.calendar > div:nth-child("
				+ (day + 1) + ")')";
		WebElement dayElement = (WebElement) ((JavascriptExecutor) driver).executeScript(dayq);
		dayElement.click();
		Thread.sleep(10000);
		// clicking find offer
		driver.findElement(
				By.xpath("/html/body/app-root[1]/div/app-home/div/main/section/app-search/form/div[5]/wdpr-button[2]"))
				.click();

	}

}
