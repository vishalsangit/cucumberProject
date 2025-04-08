package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import utils.TestBase;

public class GreenkartStepDefinition extends TestBase {

	public static final Logger log = LogManager.getLogger(GreenkartStepDefinition.class.getName());

	@Given("User is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() {
		launchApp();
		landing = new LandingPage();
		offer = new OffersPage();
		log.info("Application launched");
	}

	@When("^user searched with Shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortName)
			throws InterruptedException {

		landing.search.sendKeys(shortName);
		Thread.sleep(2000);
		productName = landing.productName.getText().split("-")[0].trim();
		System.out.println(productName + " is extracted");

	}

	@Then("^user searched for same shortname (.+) in offers page to check if product exist$")
	public void user_searched_for_same_shortname_in_offers_page(String shortName) throws InterruptedException {

		offer.topDeals.click();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		String parentWindow = i1.next();
		String childWindow = i1.next();
		driver.switchTo().window(childWindow);
		offer.search.sendKeys(shortName);
		Thread.sleep(2000);
		offerpageProductName = offer.productName.getText();
		System.out.println(offerpageProductName + " is extracted");
	}

}
