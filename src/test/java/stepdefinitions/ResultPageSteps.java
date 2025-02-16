package stepdefinitions;

import io.cucumber.java.en.When;
import pages.ResultPage;

public class ResultPageSteps {
	ResultPage resultsPage = new ResultPage();
	
	@When("User clicks on Users category")
	public void userClicksOnUsersCategory () {
		resultsPage.clickUserLabel();
	}
}
