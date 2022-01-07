package org.emp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	
	public static void main(String[] args) {
		
		
		//to configure the browser
		System.setProperty("WebDriver.Chrome.driver","C:\\Users\\SRK\\eclipse-workspace\\BrowserLaunch\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//to launch the browser
		driver.get("https://www.facebook.com/");
		
		//to maximize the window
		driver.manage().window().maximize();
		
	}
	

}
