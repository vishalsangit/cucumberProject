package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import utils.MyContextSetup;
import utils.TestBase;

public class OfferPageStepDefinition extends TestBase {

	@Then("validate product name in offers page matches with Landing Page")
	public void validate_product_name_in_offers_page() {
		Assert.assertEquals(productName, offerpageProductName,
				"product names are equal on both the pages");
	}
}
