package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/features/checkout.feature",
		glue="steps"
		)

public class runner extends AbstractTestNGCucumberTests{

}
