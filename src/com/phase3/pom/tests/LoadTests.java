package com.phase3.pom.tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import com.phase3.pom.driverInit.driverInitiante;
import com.phase3.pom.pages.BasePage;
import com.phase3.pom.pages.MainPage;

class LoadTests {
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
	
	@Test
	void ITBussinessTransfomation_doesLoad() {
		mainPage.goToITBussinessTransf();
		assertEquals(basePage.getTitle(),"You’re moving fast. We’ve got a board-level vCIO to get you there faster.");	
	}
	
	@Test
	void CustomSoftwareDevelpment_doesLoad() {
		mainPage.goToCustomSoftDev();
		assertEquals(basePage.getTitle(),"Custom Software Development");		
	}
	
	@Test
	void AgentOfChange_doesLoad() {
		mainPage.goToAgentOfChange();
		assertEquals(basePage.getTitle(),"Staff Augmentation");
	}
	
	@Test
	void ITFoundation_doesLoad() {
		mainPage.goToITFoundation();
		assertEquals(basePage.getTitle(),"IT Support");
	}
	
	@Test
	void ITProtection_doesLoad() {
		mainPage.goToITProtection();
		assertEquals(basePage.getTitle(),"IT Protection & Support");
	}
	
	@Test
	void CompareProducts_doesLoad() {
		mainPage.goToCompareProducts();
		assertEquals(basePage.getTitle(),"IT Support Services");
	}
	
	@Test
	void ITNetwork_doesLoad() {
		mainPage.goToITNetwork();
		assertEquals(basePage.getTitle(),"From design to implementation and support.\n" 
				+ "Full-Service Network Solutions that increase your business’ stability and security.");
	}
	
	@Test
	void AboutUS_doesLoad() {
		mainPage.goToAboutUs();
		assertEquals(basePage.getTitle(),"We’re driven by an earnest belief");
	}
	
	@Test
	void PointOfDifferentiation_doesLoad() {
		mainPage.goToPointOfDifferentiation();
		assertEquals(basePage.getSubTitle(),"The GBH Difference");
	}
	
	@Test
	void Blog_doesLoad() {
		mainPage.goToBlog();
		assertEquals(basePage.getTitle(),"Our latest insights on the strategic use of tech to amplify your impact.");
	}
	
	@Test
	void CaseStudies_doesLoad() {
		mainPage.goToCaseStudies();
		assertEquals(basePage.getTitle(),"We deliver market-ready tech that defines industries.");
	}
	
	@Test
	void Careers_doesLoad() {
		mainPage.goToCareers();
		assertEquals(basePage.getTitle(),"We do meaningful work");
	}
	
	@AfterEach
	protected void tearDown() {
	    driver.quit();
	    driver = null;
	}

}

