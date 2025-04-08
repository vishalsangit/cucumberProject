package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.TestBase;

public class OffersPage extends TestBase {

	public OffersPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Top Deals")
	public WebElement topDeals;

	@FindBy(xpath = "//input[@type='search']")
	public WebElement search;

	@FindBy(css = "tr td:nth-child(1)")
	public WebElement productName;

}
