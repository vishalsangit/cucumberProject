package utils;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;

import pageObjects.LandingPage;
import pageObjects.OffersPage;

public class TestBase {
	
	public static String productName = "";
	public static String offerpageProductName = "";
	public static WebDriver driver;
	public LandingPage landing;
	public OffersPage offer;
	
	
	public static void launchApp() {
		
			driver.get("http://rahulshettyacademy.com/seleniumPractise/#/");
			driver.manage().window().maximize();
	}

}
