package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

// runner class

@RunWith(Cucumber.class)
@CucumberOptions(
		//features="E:\\Learning\\Eclipse Oxygen\\E2EProject\\FeatureFiles\\AutomationPractice.feature", 
		features="FeatureFiles",
		glue= {"StepDefinitions"}, 
		dryRun=false,
		tags= {"@InvalidEmail"},
		plugin= {"html:target/cucumber.html-report"}
		)

public class TestRunner {
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						

	
	
	
}
