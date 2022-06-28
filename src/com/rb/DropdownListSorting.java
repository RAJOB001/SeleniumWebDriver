package com.rb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownListSorting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\ChromeDriver\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // opens chrome

		String url = "https://testautomationpractice.blogspot.com/";
		driver.get(url);

		driver.manage().window().maximize();
		
		WebElement element =driver.findElement(By.id("animals"));
		Select se= new Select(element);
		
		List originalList = new ArrayList();
		List tempList = new ArrayList();
		
		List<WebElement> options = se.getOptions();
		
		for(WebElement e: options) {
			originalList.add(e.getText());
			tempList.add(e.getText());
		}
		Collections.sort(tempList);
		if(originalList == tempList) {
			System.out.println("Dropdown list is sorted");
		}
		else {
			System.out.println("not sorted");
		}
		
		driver.quit();

	}

}
