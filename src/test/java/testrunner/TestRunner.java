package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features/login2.feature",
		glue = "StepDefinitions",
		monochrome= true,
		plugin = {"pretty","html:target/Html/report.html","json:target/Json/report.json",
				"junit:target/Junit/report.xml"},
		tags  = "@smoketest"
		
		)

public class TestRunner {

}
