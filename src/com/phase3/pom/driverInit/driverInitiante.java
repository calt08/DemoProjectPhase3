package com.phase3.pom.driverInit;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverInitiante {
	WebDriver driver;
	
	public WebDriver initiante() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cesar\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.gbh.com.do");
		return driver;
	}

}
