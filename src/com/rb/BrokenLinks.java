package com.rb;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		// Broken Links are no longer Active/working/
		System.setProperty("webdriver.chrome.driver", "C:\\\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // opens chrome
		driver.get("https://www.zlti.com/");
		driver.manage().window().maximize();		
		
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++) {
			WebElement element= links.get(i);
			String url=element.getAttribute("href");
			//System.out.println(url);
			URL link=new URL(url);
			
			HttpURLConnection huc = (HttpURLConnection) link.openConnection();
			huc.connect();
			int responseCode=huc.getResponseCode();
			if(responseCode >= 400) {
				System.out.println(url +"    is Broken Link");
			}
			else {
				System.out.println(url +"    is Working Link");
			}
			
		}
		
		
		

	}

}
