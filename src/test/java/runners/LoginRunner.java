package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		glue = "steps",
		tags = "@Login",
		monochrome = true,
		dryRun = false,
		plugin =  {
				"pretty",
				"html:target/cucumber",
				"json:target/cucumber.target"
					
		}	
		)

public class LoginRunner {

}
