package com.phase3.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
	WebDriver driver;
	By titleByXpath = By.xpath("//*[@id=\"et-boc\"]/div/div/div[1]/div[1]/div/div[1]/div/h2");
	By subTitleByXpath = By.xpath("//*[@id=\"et-boc\"]/div/div/div[2]/div/div/div[1]/div/h3");
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getTitle() {
		return driver.findElement(titleByXpath).getText();
	}
	
	public String getSubTitle() {
		return driver.findElement(subTitleByXpath).getText();
	}
}


