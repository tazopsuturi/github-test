package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MainPage;

public class MainPageSteps {
	MainPage mainPage = new MainPage();
	
	@Given("User goes to Github")
	public void userGoesToGithub() {
		Assert.assertTrue(mainPage.state().waitForDisplayed(), "User should see the main page");
	}
	
	@When("User clicks search button")
	public void userClicksSearchButton () {
		mainPage.clickSearchButton();
	}
	
	@When("User writes {string} in the search bar")
	public void userWritesSeleniumInTheSearchBar(String searchText) {
		mainPage.enterSearchText(searchText);
	}
	
	@And("User clicks search result")
	public void userClicksSearchResult () {
		mainPage.clickSearchResult();
	}
}
