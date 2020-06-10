package com.phase3.pom.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
	WebDriver driver;
	By solutionMenuById = By.id("menu-item-3240");
	By whoWeAreMenuById = By.id("menu-item-3241");
	By iTDropdown = By.id("menu-item-4115");
	
	By caseStudiesById = By.id("menu-item-353");
	By careersById = By.id("menu-item-475");
	
	By innovationSquadById = By.id("menu-item-3248");
	By iTBussinessTransfById = By.id("menu-item-3247");
	By customSoftwareDevById = By.id("menu-item-3249");
	By agentOfChangeStaffById = By.id("menu-item-3250");
	By iTFoundationById = By.id("menu-item-3253");
	By iTProtectionById = By.id("menu-item-3254");
	By compareProductsById = By.id("menu-item-3255");
	By iTNetworkById = By.id("menu-item-3252");
	
	By aboutUsById = By.id("menu-item-3243");
	By pointOfDifferentiationById = By.id("menu-item-3242");
	By blogById = By.id("menu-item-4661");
	
	By titleByXpath = By.xpath("//*[@id=\"et-boc\"]/div/div/div[1]/div[1]/div/div[1]/div/h2");
	
	public MainPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getTitle() {
		return driver.findElement(titleByXpath).getText();
	}
	
	public void goToInovationSquad() {
		driver.findElement(solutionMenuById).click();
		driver.findElement(innovationSquadById).click();
	}
	
	public void goToITBussinessTransf() {
		driver.findElement(solutionMenuById).click();
		driver.findElement(iTBussinessTransfById).click();
	}
	
	public void goToCustomSoftDev() {
		driver.findElement(solutionMenuById).click();
		driver.findElement(customSoftwareDevById).click();
	}
	
	public void goToAgentOfChange() {
		driver.findElement(solutionMenuById).click();
		driver.findElement(agentOfChangeStaffById).click();
	}
	
	public void goToITFoundation() {
		driver.findElement(solutionMenuById).click();
		driver.findElement(iTDropdown).click();
		driver.findElement(iTFoundationById).click();
	}
	
	public void goToITProtection() {
		driver.findElement(solutionMenuById).click();
		driver.findElement(iTDropdown).click();
		driver.findElement(iTProtectionById).click();
	}
	
	public void goToCompareProducts() {
		driver.findElement(solutionMenuById).click();
		driver.findElement(iTDropdown).click();
		driver.findElement(compareProductsById).click();
	}
	
	public void goToITNetwork() {
		driver.findElement(solutionMenuById).click();
		driver.findElement(iTNetworkById).click();
	}
	
	public void goToAboutUs() {
		driver.findElement(whoWeAreMenuById).click();
		driver.findElement(aboutUsById).click();
	}
	
	public void goToPointOfDifferentiation() {
		driver.findElement(whoWeAreMenuById).click();
		driver.findElement(pointOfDifferentiationById).click();
	}
	
	public void goToBlog() {
		driver.findElement(whoWeAreMenuById).click();
		driver.findElement(blogById).click();
	}
	
	public void goToCaseStudies() {
		driver.findElement(caseStudiesById).click();
	}
	
	public void goToCareers() {
		driver.findElement(careersById).click();
	}	
}
