package com.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tl = new ThreadLocal<>();
	
	public WebDriver initDriver(String browser) {
		
		System.out.println("The Browser value is " +browser);
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			tl.set(new ChromeDriver());
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tl.set(new FirefoxDriver());
		}
		else if(browser.equals("opera")) {
			WebDriverManager.operadriver().setup();
			tl.set(new OperaDriver());
		}
		else {
			System.out.println("Please pass the correct browser value, current browser value is " +browser);
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		
		return getDriver();
		
	}
	
	public static WebDriver getDriver() {
		return tl.get();
	}

}
