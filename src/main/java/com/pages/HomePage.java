package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;
	
	private By logo = By.xpath("//img[@src='/images/Toolsqa.jpg']");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public Boolean isHomePageLogoDisplayed() {
		return driver.findElement(logo).isDisplayed();
	}

}
