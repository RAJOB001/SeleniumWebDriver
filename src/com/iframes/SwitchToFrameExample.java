package com.iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SwitchToFrameExample {

	public static void main(String[] args) {
		/*
		 * frame - The <frame> tag was used in HTML 4 to define one particular window
		 * (frame) within a <frameset>. frameset - The <frameset> tag was used in HTML 4
		 * to define a frameset. iframe - The <iframe> tag specifies an inline frame. An
		 * inline frame is used to embed another document within the current HTML
		 * document.
		 * 
		 */
		System.setProperty("webdriver.chrome.driver", "C:\\\\ChromeDriver\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // opens chrome

		String url = "https://www.hyrtutorials.com/p/frames-practice.html";
		driver.get(url);

		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input.frmTextBox")).sendKeys("Buddeeswar 1");
		
		//now have to jump into another frame and do operation
		
		driver.switchTo().frame("frm1");
		WebElement element = driver.findElement(By.id("course"));
		Select select_dd = new Select(element);
		select_dd.selectByVisibleText("Python");
		
		//get back to original HTML document from Frame 1
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector("input.frmTextBox")).clear();
		driver.findElement(By.cssSelector("input.frmTextBox")).sendKeys("Buddeeswar 2");
		
		//later Work -> switch to frame2 nd do something also use frame3 
		
		
		

	}

}
