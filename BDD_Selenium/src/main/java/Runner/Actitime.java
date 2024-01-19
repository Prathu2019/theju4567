package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "featurefolder\\login.feature",
		glue = "stepdefinitions"
		)

public class Actitime extends AbstractTestNGCucumberTests {

}
