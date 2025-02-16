package stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.GithubAccPage;

public class GithubAccPageSteps {
	GithubAccPage githubAccPage = new GithubAccPage();
	
	@Then("User should see {string} account page")
	public void userShouldSeeTheAccountPage(String account) {
		Assert.assertTrue(githubAccPage.isCorrectAccount(account), "User should see the account page");
	}
}