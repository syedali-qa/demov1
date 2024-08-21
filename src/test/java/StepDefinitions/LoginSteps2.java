package StepDefinitions;

import io.cucumber.java.en.*;

public class LoginSteps2 {

	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		System.out.println("user is on the login page");
	}

	@When("User enters valid id and pwd")
	public void user_enters_valid_id_and_pwd() {
		System.out.println("User enters valid id and pwd");

	}

	@When("Clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Clicks on login button");

	}

	@Then("User is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("User is navigated to the home page");

	}
}
