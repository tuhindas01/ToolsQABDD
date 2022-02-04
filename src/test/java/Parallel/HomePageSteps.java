package Parallel;

import org.junit.Assert;

import com.factory.DriverFactory;
import com.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
	
	private HomePage homePage = new HomePage(DriverFactory.getDriver());
	private static String title;
	
	@Given("user is on homepage")
	public void user_is_on_homepage() {
		DriverFactory.getDriver().get("https://demoqa.com/");
	}
	
	@When("user gets the tile of page")
	public void user_gets_the_tile_of_page() {
		title = homePage.getPageTitle();
	}
	
	@Then("the title should be {string}")
	public void the_title_should_be(String expectedTitle) {
		Assert.assertTrue(title.equals(expectedTitle));
	}
	
	@Then("the homepage logo should present")
	public void the_homepage_logo_should_present() {
		Assert.assertTrue(homePage.isHomePageLogoDisplayed());
	}

}
