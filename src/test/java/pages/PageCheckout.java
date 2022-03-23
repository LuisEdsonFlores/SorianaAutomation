package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageCheckout {
	private WebDriver driver;
	private By iconTarjetaUno;
	private By primerTxtCcv;
	private By horaEnvio;
	private By btnPagar;
	private By btnEntendidoPopup;
	private By AbrirSuperEnTuCasa;
	
	public PageCheckout (WebDriver driver) {
	this.driver = driver;
	primerTxtCcv = By.xpath("(//input[@type='password'])[3]");
	horaEnvio = By.xpath("(//button[contains(text(),'20:00 a 21:00')])[1]");
	btnPagar = By.xpath("//button[@class='clickPayment btn btn-primary btn-block mt-3 text-center text-uppercase submit-promotion']");
	btnEntendidoPopup = By.xpath("//button[@class='btn btn-primary mt-3 text-center submit-entiendo']");
	AbrirSuperEnTuCasa = By.xpath("(//button[@type='buttonl'])[2]");
		
	}
	
	public void fincarOrdenTDC (String cvv) {
		JavascriptExecutor jse = ((JavascriptExecutor)driver);   
		WebElement ele = driver.findElement(By.xpath("(//input[@type='password'])[3]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		jse.executeScript("arguments[0].value='123';", ele);
		jse.executeScript("window.scrollTo(0, 400)");
		driver.findElement(AbrirSuperEnTuCasa).click();
		driver.findElement(horaEnvio).click();
		
		driver.findElement(btnPagar).click();
		try{
			Thread.sleep(600);
			}
			catch(InterruptedException ie){
				
			}  		
		
		jse.executeScript("arguments[0].value='123';", ele);
		executor.executeScript("arguments[0].click();", ele);
		executor.executeScript("arguments[0].value='123';", ele);
		driver.findElement(btnPagar).click();
	
		try{
			Thread.sleep(6000);
			}
			catch(InterruptedException ie){
			}
		;
	}
}
