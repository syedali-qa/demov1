package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageobjects.OrangeHrmLogout;

public class OrangeLogout {
	WebDriver driver = null;
	OrangeHrmLogout ol;

	@Given("user navigate to orange hrm application")
	public void user_navigate_to_orange_hrm_application() {
		String projectPath = System.getProperty("user.dir");
		System.out.println("project path = " + projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@When("^User enter valid (.*) and (.*) and click on login$")
	public void user_enter_valid_admin_and_admin123_and_click_on_login(String username, String password) {
		ol = new OrangeHrmLogout(driver);
		ol.setUsername(username);
		ol.setPassword(password);
		ol.clickLogin();
	}

	@Then("User should be navigated to the home page")
	public void user_should_be_navigated_to_the_home_page() {
		boolean landed = ol.checkHome();
		if (landed = true) {
			System.out.println("User is on home page");
		}

	}

	@Then("User click on the admin module")
	public void user_click_on_the_admin_module() throws InterruptedException {

		ol.clickAdmin();
		Thread.sleep(5000);
	}

	@Then("User click on the logout button")
	public void user_click_on_the_logout_button() {
		ol.clickLogout();
	}

	@Then("User should be able to logout of the application")
	public void user_should_be_able_to_logout_of_the_application() {
		boolean atLogin = ol.loginDisplayed();
		if (atLogin == true) {
			System.out.println("User is on login page");
		}
		driver.close();
	}

}
