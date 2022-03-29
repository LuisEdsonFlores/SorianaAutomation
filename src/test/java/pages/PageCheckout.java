package pages;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PageCheckout {
	private WebDriver driver;
	private By iconTarjetaUno;
	private By primerTxtCcv;
	private By SelecthoraEnvio;
	private By btnPagar;
	private By btnEntendidoPopup;
	private By AbrirSuperEnTuCasa;
	private By PagoContraEntrega;
	private By txtPagoConraEntrega;
	private By SelectMetodoDePago;
	private By methodTDC;
	private By methodEfectivo;
	private By metohdVales;
	private By SumaDeEfectivo;
	private By HorarioEnvio;
	private By SelectEntregaEnTienda;
	private By TxtTelefonoCasa;
	private By TxtTelefonoMovil;
	private By BtnConfirmarTelefonos;
	
	private By btnAgregarTarjeta;
	private By txtNumeroDeTarjeta;
	private By txtNombreDeTarjeta;
	private By txtMMAA;
	private By txtCvv;
	private By txtCP;
	private By txtCalle;
	private By txtExterior;
	private By txtInterior;
	private By txtTelefono;
	private By btnGuardarTarjeta;
	
	private By terminosYcondiciones;
	private By btnPagarInvitado;
	
	private By abrirDatosEnvio;
	private By btnNuevaDirección;
	private By txtExteriorNuevaDir;
	private By txtReferencia;
	private By btnGuardarDir;
	

	
	public PageCheckout (WebDriver driver) {
	this.driver = driver;
	primerTxtCcv = By.xpath("(//input[@type='password'])[4]");
	SelecthoraEnvio = By.xpath("(//button[contains(text(),'20:00 a 21:00')])[1]");
	btnPagar = By.xpath("//button[@class='clickPayment btn btn-primary btn-block mt-3 text-center text-uppercase submit-promotion']");
	btnEntendidoPopup = By.xpath("//button[@class='btn btn-primary mt-3 text-center submit-entiendo']");
	AbrirSuperEnTuCasa = By.xpath("(//button[@class='btn btn-collapsed-div-general p-0 pl-4 pr-3'])[1]");
	PagoContraEntrega = By.xpath("//div[@class='col p-0 pl-1 pr-2']");
	txtPagoConraEntrega = By.xpath("//div[contains(text(),'Pago contra entrega')]");
	SelectMetodoDePago = By.id("podMethods");
	methodTDC = By.id("credit_card");
	methodEfectivo = By.id("cash");
	metohdVales = By.id("voucher_card");
	SumaDeEfectivo = By.xpath("//input[@class='form-control form-control--numeric cashAmount js-numeric-only onChangeEfect']");
	HorarioEnvio = By.xpath("//div[@class='section-shipping-time-grocery col-sm-12 col-12 col-lg-8 bg-white px-1 px-sm-4 py-2 border-radius default-box-shadow border-solid-gray']");
	SelectEntregaEnTienda = By.xpath("//label[@for='pickup-grocery']");
	TxtTelefonoCasa = By.xpath("(//label[@class='form-control-label'])[21]");
	TxtTelefonoMovil = By.xpath("(//label[@class='form-control-label'])[21]");
	BtnConfirmarTelefonos = By.xpath("//button[@class='btn btn-primary mb-3 mb-lg-0']");
	btnAgregarTarjeta = By.xpath("(//span[@class='credit-card-label text-justify m-0 pl-2'])[1]");
	txtNumeroDeTarjeta = By.xpath("//input[@id='cardNumberNew']");
	txtNombreDeTarjeta = By.xpath("//input[@id='cardOwnerNew']");
	txtMMAA = By.xpath("//input[@id='expirationDateNew']");
	txtCvv = By.xpath("//input[@id='securityCodeNew']");
	txtCP = By.xpath("(//input[@id='postalCode'])[2]");
	txtCalle = By.xpath("(//input[@id='address1'])[2]");
	txtExterior  = By.xpath("(//input[@id='streetNumberNew'])[1]");
	txtInterior = By.xpath("(//input[@id='buildingNumber'])[2]");
	txtTelefono = By.xpath("(//input[@id='phoneNew'])[1]");
	btnGuardarTarjeta = By.xpath("(//button[@name='save'])[1]");
	terminosYcondiciones = By.xpath("//b[@class='terms-guest']");
	btnPagarInvitado = By.xpath("//button[@class='clickPayment btn btn-primary btn-block mt-3 text-center text-uppercase submit-promotion payGuest']");
	abrirDatosEnvio = By.xpath("(//div[@class='col-sm-1 col-md-1 col-2 col-lg-1 text-lg-right p-0 float-arrow-right sub-arrow'])[1]");
	btnNuevaDirección = By.xpath("//button[@class='btn btn-outline-primary button-address btn-ajax-modal btn-address-modal']");
	txtExteriorNuevaDir = By.xpath("(//input[@id='streetNumber'])[2]");
	txtReferencia = By.xpath("(//input[@id='reference'])[2]");
	btnGuardarDir = By.xpath("(//button[@class='btn btn-primary expanded-down btn-width-address mx-lg-2 order-lg-1 btn-add-address js-save-address js-save-postal-code show-bottom'])[1]");
	
	}
	

	public void SeleccionamosTDCguardada (String cvv) {
		JavascriptExecutor jse = ((JavascriptExecutor)driver);   
		WebElement ele = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/div[1]/div[3]/div/div/div[2]/div/form/fieldset[1]/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div[1]/div[4]/div/div[1]/div/input"));
		jse.executeScript("arguments[0].click();", ele);
		try{
			Thread.sleep(5000);
			}
			catch(InterruptedException ie){
				
			} 
		jse.executeScript("arguments[0].value='123';", ele);
		driver.findElement(AbrirSuperEnTuCasa).click();
		jse.executeScript("window.scrollTo(0, 300)");
		driver.findElement(HorarioEnvio).click();
		try{
			Thread.sleep(5000);
			}
			catch(InterruptedException ie){
				
			} 
		driver.findElement(SelecthoraEnvio).click();
		jse.executeScript("window.scrollTo(0, 700)");
		driver.findElement(btnPagar).click();
		try{
			Thread.sleep(5000);
			}
			catch(InterruptedException ie){
				
			}
	/*	driver.findElement(HorarioEnvio).click();
		driver.findElement(SelecthoraEnvio).click();*/
		driver.findElement(btnPagar).click();
		try{
			Thread.sleep(5000);
			}
			catch(InterruptedException ie){
				
			}
		}
	
	
	
	
	public void SeleccionamosTDCnueva (String cvv) {
		JavascriptExecutor jse = ((JavascriptExecutor)driver);   
		WebElement ele = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/div[1]/div[3]/div/div/div[2]/div/form/fieldset[1]/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div[1]/div[4]/div/div[1]/div/input"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ele);
		try{
			Thread.sleep(5000);
			}
			catch(InterruptedException ie){
				
			} 
		/*jse.executeScript("arguments[0].value='123';", ele);*/	
		/*driver.findElement(AbrirSuperEnTuCasa).click();
		jse.executeScript("window.scrollTo(0, 300)");*/
		driver.findElement(HorarioEnvio).click();
		try{
			Thread.sleep(5000);
			}
			catch(InterruptedException ie){
				
			} 
		driver.findElement(SelecthoraEnvio).click();
		jse.executeScript("window.scrollTo(0, 700)");
		driver.findElement(btnPagar).click();
		driver.findElement(btnPagar).click(); 	
		}
	
	public void AgregamosTDC(String NumeroTarjeta, String Nombre, String MMAA, String cvv, String CP) {
		
		WebDriverWait ewait = new WebDriverWait (driver,20);
		ewait.until(ExpectedConditions.elementToBeClickable(btnAgregarTarjeta));
		driver.findElement(btnAgregarTarjeta).click();
		driver.findElement(txtNumeroDeTarjeta).sendKeys(NumeroTarjeta);
		driver.findElement(txtNombreDeTarjeta).sendKeys(Nombre);
		driver.findElement(txtMMAA).sendKeys(MMAA);
		driver.findElement(txtCvv).sendKeys(cvv);
		driver.findElement(txtCP).sendKeys(CP);
		driver.findElement(txtCalle).sendKeys("Calle");
		driver.findElement(txtExterior).sendKeys("14-a");
		driver.findElement(txtInterior).sendKeys("404");
		driver.findElement(txtTelefono).sendKeys("5554554523");
		driver.findElement(btnGuardarTarjeta).click();
	}
	
	public void seleccionarEntregaEnTienda() {
		try{
			Thread.sleep(4000);
			}
			catch(InterruptedException ie){
				
			} 
		driver.findElement(SelectEntregaEnTienda).click();
        if( driver.findElements(TxtTelefonoCasa).size()!=0) {
			driver.findElement(TxtTelefonoCasa).sendKeys("5554554513");
			driver.findElement(TxtTelefonoMovil).sendKeys("5554554545");
			driver.findElement(BtnConfirmarTelefonos).click();
				}
		else {
			driver.findElement(SelectEntregaEnTienda).click();
		}
		
		
		
	}
	
	public void seleccionarPagoContraEntregaVales() {
		WebDriverWait ewait = new WebDriverWait (driver,40);
		ewait.until(ExpectedConditions.elementToBeClickable(PagoContraEntrega));	
		driver.findElement(PagoContraEntrega).click();
		driver.findElement(metohdVales).click();
	}
	
	public void seleccionarPagoContraEntregaEfectivo() {
		WebDriverWait ewait = new WebDriverWait (driver,40);
		ewait.until(ExpectedConditions.elementToBeClickable(PagoContraEntrega));	
		driver.findElement(PagoContraEntrega).click();
		driver.findElement(methodEfectivo).click();
		driver.findElement(SumaDeEfectivo).sendKeys("500");
		driver.findElement(SumaDeEfectivo).sendKeys(Keys.ENTER);
		
	}
	
	public void SuperEnTuCasa() {
		JavascriptExecutor jse = ((JavascriptExecutor)driver); 

		driver.findElement(HorarioEnvio).click();
		jse.executeScript("window.scrollBy(0,500)");
		driver.findElement(SelecthoraEnvio).click();	
		driver.findElement(SelecthoraEnvio).click();	

	}
	
	public void SuperEnTuCasaInvitado() {
		
		driver.findElement(SelecthoraEnvio).click();	
	}
	
	public void FincarOrdern() {

		try{
			Thread.sleep(3000);
			}
			catch(InterruptedException ie){
				
			}  
		driver.findElement(btnPagar).click();
	}
	
	public void FincarOrdernComoInvitado() {

		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(terminosYcondiciones));	
		JavascriptExecutor jse = ((JavascriptExecutor)driver); 
		jse.executeScript("window.scrollBy(0,-500)");
		driver.findElement(terminosYcondiciones).click();;
		driver.findElement(btnPagarInvitado).click();
		try{
			Thread.sleep(1000);
			}
			catch(InterruptedException ie){
				
			}  
		driver.findElement(terminosYcondiciones).click();;
		try{
			Thread.sleep(1000);
			}
			catch(InterruptedException ie){
				
			}  
		driver.findElement(terminosYcondiciones).click();;
		try{
			Thread.sleep(1000);
			}
			catch(InterruptedException ie){
				
			}  
		driver.findElement(btnPagarInvitado).click();

	}
	
	public void nuevaDirecciónInvitado(String cp, String calle, String exterior, String interior, String referencia) {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(abrirDatosEnvio).click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(btnNuevaDirección));	
		driver.findElement(btnNuevaDirección).click();
		try{
			Thread.sleep(5000);
			}
			catch(InterruptedException ie){
			}
		driver.findElement(txtCP).sendKeys(cp);
		driver.findElement(txtCalle).sendKeys(calle);
		driver.findElement(txtExteriorNuevaDir).sendKeys(exterior);
		driver.findElement(txtInterior).sendKeys(interior);
		driver.findElement(txtReferencia).sendKeys(referencia);
		driver.findElement(btnGuardarDir).click();
	}
	
	
	
}
