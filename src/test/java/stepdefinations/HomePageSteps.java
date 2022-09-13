package stepdefinations;

import com.qa.factory.DriverFactory;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.Common;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePageSteps {
	private HomePage homePage = new HomePage(DriverFactory.getDriver());
	
	String title = "";
	
	@Given("^user is on Home page$")
    public void user_is_on_home_page() {
		homePage.homePageUrl();
		System.out.println("Page title is: " + title);
		
    }
	
	@When("search on homepage {string}")
	public void search_on_homepage(String searchKeyword) {
		homePage.search(searchKeyword);
		Common.pause(2);
	}
	




}
