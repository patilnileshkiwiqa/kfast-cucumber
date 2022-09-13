package stepdefinations;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.qa.factory.DriverFactory;
import com.qa.pages.AccountsPage;
import com.qa.pages.LoginPage;
import com.qa.util.TestData;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountsPageSteps {
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private AccountsPage accountsPage;

	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable credTable) throws IOException {

		List<Map<String, String>> credList = credTable.asMaps();
		String userName = credList.get(0).get("username");
		String password = credList.get(0).get("password");

		String url = TestData.getValueFromConfig("src\\test\\resources\\config\\config.properties", "url");
		DriverFactory.getDriver()
		.get("https://www.saucedemo.com/");
		accountsPage = loginPage.doLogin(userName, password);
	}

	@When("^user gets the title of the page$")
	public void user_gets_the_title_of_the_page() throws Throwable {
		accountsPage.getAccountsPageTitle();
	}

	@Then("^page title should be \"([^\"]*)\"$")
	public void page_title_should_be_something(String strArg1) throws Throwable {
		
	}

}
