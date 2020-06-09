package com.phase3.pom.tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import com.phase3.pom.driverInit.driverInitiante;
import com.phase3.pom.pages.BasePage;
import com.phase3.pom.pages.MainPage;

class Test1 {
	WebDriver driver;
	driverInitiante driverInit;
	MainPage mainPage;
	BasePage basePage;
	
	@BeforeEach
	void Setup() {
		driverInit = new driverInitiante();
		driver = driverInit.initiante();
		mainPage = new MainPage(driver);
		basePage = new BasePage(driver);
	}
	
	@Test
	void Home_doesLoad() {
		System.out.println(mainPage.getTitle());
		assertEquals(mainPage.getTitle(), "We transform businesses. \nMeasuring our achievements by their impact.");
	}
	
	@Test
	void TechInnovation_doesLoad() {
		mainPage.goToInovationSquad();
		assertEquals(basePage.getTitle(),"Tech-enabled Innovation");
	}
	
	@AfterEach
	protected void tearDown() {
	    driver.quit();
	    driver = null;
	}

}