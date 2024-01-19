package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "featurefolder\\googlesuggestion.feature",
		glue = "stepdefinitions"
		)
	


public class Runner extends AbstractTestNGCucumberTests {
	
	
}
