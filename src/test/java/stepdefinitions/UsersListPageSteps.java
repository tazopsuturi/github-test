package stepdefinitions;

import io.cucumber.java.en.When;
import pages.UsersListPage;

public class UsersListPageSteps {
	UsersListPage usersListPage = new UsersListPage();
	
	@When("User chooses Account")
	public void userChoosesAccount () {
		usersListPage.clickUserName();
	}
}
