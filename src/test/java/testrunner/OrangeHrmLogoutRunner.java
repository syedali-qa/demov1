package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features/OrangeLogout.feature",
		glue = "StepDefinitions",
		plugin = {"pretty","html:target/Html/report.html"}
		)

public class OrangeHrmLogoutRunner {

	
	
}
