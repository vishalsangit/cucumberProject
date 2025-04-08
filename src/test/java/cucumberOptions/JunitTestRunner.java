package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = "stepDefinitions", monochrome = true, 
tags = "@smoke or @regression", dryRun = false, plugin = {
		"pretty", "html:target/cucumber-reports/report.html", 
		"json:target/cucumber-reports/report.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", 
		"rerun:target/failed.txt" })
public class JunitTestRunner {

}
