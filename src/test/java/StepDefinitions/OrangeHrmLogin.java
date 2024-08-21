package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class OrangeHrmLogin {

	WebDriver driver = null;

	@Given("User navigate to the orange hrm application on chrome")
	public void user_navigate_to_the_orange_hrm_application_on_chrome() {
		String projectPath = System.getProperty("user.dir");
		System.out.println("project path = " + projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@When("^User enter the valid (.*) and (.*)$")
	public void user_enter_the_valid_admin_and_admin123(String id,String pwd) {

		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(id);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(pwd);
	}

	@Then("User click on login should be navigated to the home page")
	public void user_click_on_login_should_be_navigated_to_the_home_page() throws InterruptedException {
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath("//h6[text()=\"Dashboard\"]"));
		boolean present = ele.isDisplayed();
		if (present == true) {
			System.out.println("The User has landed on the home page");
		}
	}

	@Then("User close the chrome browser")
	public void user_close_the_chrome_browser() {
		driver.close();
		driver.quit();
	}
}
