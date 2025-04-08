package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.TestBase;

public class LandingPage extends TestBase {

	public LandingPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='search']")
	public WebElement search;

	@FindBy(css = "h4.product-name")
	public WebElement productName;

}
