package com.sikuli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class UploadFile {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		//Sikuli is a tool used to deal with Desktop Application,
		// webdriver requires third party tool to integrate with deskotop/window application
		// till upload file buttn it is web, once we press it comes under desktop
		// download sikuli jar file and add it to project path
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // opens chrome
		String url = "http://the-internet.herokuapp.com/upload";
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("file-upload")).click();
		
		String FileInputPath = "C:\\Users\\RAJOB001\\selenium\\UploadFile";
		String OpenButtonPath = "C:\\Users\\RAJOB001\\selenium\\UploadFile";
		
		Screen s = new Screen();
		
		Pattern fileInputPattern = new Pattern(FileInputPath+"FileInputTextBox.PNG");
		Pattern openButtonPattern = new Pattern(OpenButtonPath+"OpenButton.PNG");
		
		Thread.sleep(4000);
		
		s.wait(fileInputPattern, 20);
		s.type(FileInputPath, FileInputPath+"FileInputTextBox.PNG");
		s.click(openButtonPattern);

	}

}
