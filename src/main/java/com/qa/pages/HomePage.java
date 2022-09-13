package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.util.Common;

public class HomePage {

	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

//	@FindBy(id = "search_query_top")
//	WebElement searchBoxHome;
	//	@FindBy(name = "submit_search")
	//	WebElement searchBtn;


	//	private By subjectHeading = By.id("search_query_top");

	public void homePageUrl() {
		driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Backpack']")).click();
	}


	public void search(String searchKeyword) {
		driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Backpack']")).click();
	}

}
