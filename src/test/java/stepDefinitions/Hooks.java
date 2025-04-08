package stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.TestBase;

public class Hooks extends TestBase {
	

	@Before("@smoke")
	public void runBeforeScenario() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}

	@After
	public void runAfterScenario(Scenario sc) throws IOException {

		if (sc.isFailed()) {
			String scPath = "C:\\Users\\Vishal Sangal\\Documents\\workspace-spring-tool-suite-4-4.15.3.RELEASE\\cucumber\\Screenshots\\failedScreenshot";
			String filename = (new Random()).nextInt(1, 20000)+".png";
			TakesScreenshot tks = (TakesScreenshot) driver;
			File inputFile = tks.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(inputFile, new File(scPath + filename));
		}
		driver.quit();
	}
}
