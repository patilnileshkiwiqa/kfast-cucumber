package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Common;

public class HomePage{

	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[normalize-space()='Sauce Labs Backpack']")
	WebElement searchBoxHome;


	//	private By subjectHeading = By.xpath("//div[normalize-space()='Sauce Labs Backpack']");

	public void homePageUrl() {
		//		driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Backpack']")).click();
		searchBoxHome.click();
	}


	public void search(String searchKeyword) {
		driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Backpack']")).click();
	}

}
