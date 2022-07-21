package runner;

import org.junit.AfterClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/features/Checkout3UsuarioInvitado",
		glue="steps",
		tags = "not @wip and not @quarentine",
		plugin  = {"json:target/report/cucumber_reports.json"}
		

		)

public class runner extends AbstractTestNGCucumberTests{
	
	@AfterClass
	public static void finish() {
		try {
			System.out.println("Gerenando Reporte");
			String[] cmd = {"cmd.exe", "C:\\Users\\luisf\\eclipse-workspace\\Soriana", "node run report"};
			Runtime.getRuntime().exec(cmd);
			System.out.println("Reporte generado");
		}catch(Exception ex){
			ex.printStackTrace();
	}
		
}

}