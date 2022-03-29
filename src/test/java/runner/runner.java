package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/features/checkout_usuario_logeado.feature",
		glue="steps",
		tags = "not @wip and not @quarentine"
		)

public class runner extends AbstractTestNGCucumberTests{

}
