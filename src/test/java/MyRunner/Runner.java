package MyRunner;

import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Java Selenium\\ProjectCode\\BDDCucumberFramework\\src\\test\\java\\Features",
		glue = {"StepDefinition","cucumber.hook"},
			
		plugin = {"html:target/site/cucumber-html", "json:target/cucumber1.json"}, 
		monochrome = true,
		strict = true,
		dryRun = false,
		tags="@Test123"
		)

public class Runner {

	
}
