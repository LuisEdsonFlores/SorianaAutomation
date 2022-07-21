package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageCheckoutInvitado {
	private WebDriver driver;

	private By btnContinuarComoInvitado;
	private By txtNombre;
	private By txtApellidoPaterno;
	private By txtEmail;
	private By txtTelefono;
	private By btnContinuarComoInvitadoForm;
	private By HorarioEnvio;
	private By SelecthoraEnvio;
	private By btnPagar;
	private By AbrirSuperEnTuCasa;

	
	
	
	public PageCheckoutInvitado (WebDriver driver) {
		this.driver = driver;
		btnContinuarComoInvitado = By.xpath("(//button[@class='btn btn-login-outline-primary col-12 btn-modal-guest'])[1]");
		txtNombre = By.xpath("(//input[@id='registration-form-fname'])[2]");
		txtApellidoPaterno = By.xpath("(//input[@id='registration-form-lname'])[2]");
		txtEmail = By.xpath("(//input[@id='registration-form-email'])[2]");
		txtTelefono = By.xpath("(//input[@id='registration-form-phone'])[2]");
		btnContinuarComoInvitadoForm = By.xpath("//button[@class='btn btn-primary btn-block form-info-guest']");
		HorarioEnvio = By.xpath("//div[@class='section-shipping-time-grocery col-sm-12 col-12 col-lg-8 bg-white px-1 px-sm-4 py-2 border-radius default-box-shadow border-solid-gray']");
		SelecthoraEnvio = By.xpath("(//button[contains(text(),'20:00 a 21:00')])[1]");
		btnPagar = By.xpath("//button[@class='clickPayment btn btn-primary btn-block mt-3 text-center text-uppercase submit-promotion']");
		AbrirSuperEnTuCasa = By.xpath("(//button[@class='btn btn-collapsed-div-general p-0 pl-4 pr-3'])[1]");

	}
	
	
	public void irComoInvitado (String Nombre, String ApellidoP, String Telefono, String Email ) {
		WebDriverWait ewait = new WebDriverWait (driver,20);
		ewait.until(ExpectedConditions.elementToBeClickable(btnContinuarComoInvitado));
		driver.findElement(btnContinuarComoInvitado).click();
		driver.findElement(txtNombre).sendKeys(Nombre);
		try{
			Thread.sleep(3000);
			}
			catch(InterruptedException ie){
				
			} 		driver.findElement(txtApellidoPaterno).sendKeys(ApellidoP);
		try{
			Thread.sleep(3000);
			}
			catch(InterruptedException ie){
				
			} 	
		driver.findElement(txtEmail).sendKeys(Email);
		driver.findElement(txtTelefono).sendKeys(Telefono);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(btnContinuarComoInvitadoForm).click();
	}
	

	public void SeleccionamosTDC (String cvv) {
		try{
			Thread.sleep(6000);
			}
			catch(InterruptedException ie){
				
			} 
		JavascriptExecutor jse =(JavascriptExecutor)driver;   
		WebElement ele = driver.findElement(By.xpath("(//input[@type='password'])[3]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		jse.executeScript("arguments[0].value='123';", ele);
		try{
			Thread.sleep(6000);
			}
			catch(InterruptedException ie){
				
			}  		
		jse.executeScript("window.scrollTo(0, 300)");
		driver.findElement(AbrirSuperEnTuCasa).click();
		driver.findElement(HorarioEnvio).click();
		driver.findElement(SelecthoraEnvio).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(btnPagar).click();
		try{
			Thread.sleep(600);
			}
			catch(InterruptedException ie){
				
			}  	
		driver.findElement(btnPagar).click();
		}
		
		

		public void SeleccionamosTDCInvitado (String cvv) {
			try{
				Thread.sleep(6000);
				}
				catch(InterruptedException ie){
					
				} 
			JavascriptExecutor jse =(JavascriptExecutor)driver;   
			WebElement ele = driver.findElement(By.xpath("(//input[@type='password'])[3]"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", ele);
			jse.executeScript("arguments[0].value='123';", ele);
			try{
				Thread.sleep(6000);
				}
				catch(InterruptedException ie){
					
				}  		
			jse.executeScript("window.scrollTo(0, 300)");
			driver.findElement(AbrirSuperEnTuCasa).click();
		
	
	}

}
