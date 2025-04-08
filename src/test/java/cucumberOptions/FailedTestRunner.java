package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "@target/failed.txt", glue = "stepDefinitions", monochrome = true, 
tags = "@smoke or @regression", dryRun = false, plugin = {"pretty", "html:target/cucumber-reports/report.html",
		"json:target/cucumber-reports/report.json", 
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class FailedTestRunner extends AbstractTestNGCucumberTests {

//	@Override
//	@DataProvider(parallel = true)
//	public Object[][] scenarios() {
//		return super.scenarios();
//	}
}
