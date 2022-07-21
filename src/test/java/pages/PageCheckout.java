package pages;

import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import org.testng.ITestResult;

import io.cucumber.java.Scenario;

import org.openqa.selenium.Keys;

public class PageCheckout {
	private WebDriver driver;
	private By iconTarjetaUno;
	private By primertdc;
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
	private By noVolverAmostrarCheck;
    private By btnEntendido;
    
    private By btnPaypalcheckout;
    private By btnPaypalSwich;
    private By txt_correo_paypal;
    private By txt_pass_paypal;
    private By btn_siguiente;
    private By btn_iniciarsesión;
    private By btnContinuar;
    private By AceptarYPagar;
    private By btnPagarGuest;
    
    private By BuscarDirección;
    private By form;
    private By tarjetaGuradada;
    private By ConfirmarUbicacion;
    private By btn_Continiar_ConfirmaUbicacion;
    private By btnGuardarConfirmarUbicacion;
    private By seleccionarFecha;
    
    private By IngresaCvv;
    private By Aceptarcvv;
    private By listMSI;
    private By aUnPago;
    private By metodosDePagoSecc;
    private By seleccionarPrimeraTDC;
    
	public PageCheckout (WebDriver driver) {
	this.driver = driver;
	primertdc = By.cssSelector("//*[@id=\"Path_33866\"]");
	seleccionarFecha = By.xpath("//div[@class='times-week__day times-week__day-menu text-center space-slot-content d-none bottom activeSecondViwer']");
	
	SelecthoraEnvio = By.xpath("(//div[@class='col-12 px-0 times-week__info-inner checkout-slot-block'])[8]");
	btnPagar = By.xpath("(//button[contains(text(),'Pagar')])[1]");
	btnPagarGuest = By.xpath("//button[@class='clickPayment btn btn-primary btn-block mt-3 text-center text-uppercase submit-promotion payGuest']");
	btnEntendidoPopup = By.xpath("//button[@class='btn btn-primary mt-3 text-center submit-entiendo']");
	AbrirSuperEnTuCasa = By.xpath("//button[@class='btn btn-collapsed-div-general p-0 pl-4 pr-3']");
	PagoContraEntrega = By.xpath("(//div[@class='col-auto pl-2 ml-1 pr-1'])[1]");
	txtPagoConraEntrega = By.xpath("//div[contains(text(),'Pago contra entrega')]");
	SelectMetodoDePago = By.id("podMethods");
	methodTDC = By.id("credit_card");
	methodEfectivo = By.id("cash");
	metohdVales = By.id("voucher_card");
	SumaDeEfectivo = By.xpath("//input[@class='form-control form-control--numeric cashAmount js-numeric-only onChangeEfect']");
	HorarioEnvio = By.xpath("//div[@class='section-shipping-time-grocery col-sm-12 col-12 col-lg-8 bg-white px-1 px-sm-4 py-2 border-radius default-box-shadow border-solid-gray']");
	SelectEntregaEnTienda = By.xpath("//label[@for='pickup-grocery']");
	TxtTelefonoCasa = By.xpath("//input[@id='validate-form-phoneBusiness']");
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
	btnNuevaDirección = By.xpath("(//button[contains(text(),'Nueva dirección')])[1]");
	txtExteriorNuevaDir = By.xpath("(//input[@id='streetNumber'])[2]");
	txtReferencia = By.xpath("(//input[@id='reference'])[2]");
	btnGuardarDir = By.xpath("(//button[@class='btn btn-primary expanded-down btn-width-address mx-lg-2 order-lg-1 btn-add-address js-save-address js-save-postal-code show-bottom'])[1]");
	noVolverAmostrarCheck = By.xpath("//input[@id='showAgainModal']");
	btnEntendido = By.xpath("//button[@class='btn btn-primary mt-3 text-center submit-entiendo']");
	
	btnPaypalcheckout = By.xpath("//li[@data-method-id=\"PayPal\"]");
	btnPaypalSwich = By.xpath("//img[@class='paypal-logo paypal-logo-paypal paypal-logo-color-blue']");
	txt_pass_paypal = By.xpath(""); 
	txt_correo_paypal = By.xpath("//input[@id='email']");
	btn_siguiente = By.xpath("//button[@id='btnNext']");
	btn_iniciarsesión = By.xpath("//button[@id='btnLogin']");
	btnContinuar = By.xpath("//button[@id='fiSubmitButton']");
	AceptarYPagar = By.xpath("//button[@id='consentButton']");
	tarjetaGuradada = By.xpath("(//*[@id=\"Path_33782-2\"])[2]");
	form = By.xpath("//*[@id=\"carouselPayment\"]");
	
	BuscarDirección = By.xpath("//a[@id='chargeInfo']");
	ConfirmarUbicacion = By.xpath("//p[@id='homeDeliveryModal-grocery-title']");
	btn_Continiar_ConfirmaUbicacion = By.xpath("//button[@class='btn btn-primary expanded-down btn-width-address mx-lg-2 order-lg-1 btn-confirm-address']");
	btnGuardarConfirmarUbicacion = By.xpath("//button[@class='ml-3 btn btn-primary expanded-down btn-width-address mx-lg-2 order-lg-1 btn-add-address js-save-address js-save-postal-code show-bottom']");
	IngresaCvv = By.xpath("//input[@name='confirmCvvOrNipCodeInput']");
	Aceptarcvv = By.xpath("//button[@class='btn btn-primary expanded-down btn-card-accept-checkout']");
	
	
	listMSI = By.xpath("//select[@id='clearCouwn']");
	aUnPago = By.xpath("//option[@id='inpgro-0']");
	metodosDePagoSecc = By.xpath("//button[@class='btn pr-0 mr-1 btn-collapsed-div-payment2 getButtomCall']");
	seleccionarPrimeraTDC = By.xpath("(//label[@class='col-3 col-lg-2 col-sm-2 card-text-mobile card-text-with text-center align-self-center cursor-pointer'])[1]");
	
	}
	

	public void SeleccionamosTDCguardada (String cvv) throws IOException {		
		File screenshot;
		screenshot = ((TakesScreenshot)driver ).getScreenshotAs(OutputType.FILE);
		WebDriverWait ewait = new WebDriverWait (driver,50);
		try{
			Thread.sleep(9500);
			}
			catch(InterruptedException ie){
				
			} 		
		driver.findElement(seleccionarFecha).click();
		driver.findElement(SelecthoraEnvio).click();
		ewait.until(ExpectedConditions.elementToBeClickable(metodosDePagoSecc));
		driver.findElement(metodosDePagoSecc).click();
	driver.findElement(seleccionarPrimeraTDC).click();
	try{
		Thread.sleep(9000);
		}
		catch(InterruptedException ie){
			
		} 		
	driver.findElement(btnPagar).click();
		
	/*	if (driver.findElements(listMSI).size()!=0) {
			ewait.until(ExpectedConditions.elementToBeClickable(listMSI));
	        driver.findElement(listMSI).click();
			ewait.until(ExpectedConditions.elementToBeClickable(aUnPago));
			driver.findElement(aUnPago).click();
			ewait.until(ExpectedConditions.elementToBeClickable(btnPagar));
			driver.findElement(btnPagar).click();
		}else {
			System.out.println("No hay MSI");
		}	*/	
		
		ewait.until(ExpectedConditions.elementToBeClickable(IngresaCvv));
		driver.findElement(IngresaCvv).sendKeys("123");
		driver.findElement(Aceptarcvv).click();	
		try{
			Thread.sleep(2000);
			}
			catch(InterruptedException ie){
				
			} 	
	/*	FileUtils.copyFile(screenshot, new File("\"..\\Soriana\\CapturasDePantalla\\screen.png"+"Error"+ System.currentTimeMillis()+".png"));*/
		
		
	
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
		
		}
	
	public void AgregamosTDC(String NumeroTarjeta, String Nombre, String MMAA, String cvv, String CP) {
		
		WebDriverWait ewait = new WebDriverWait (driver,20);
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
	
	public void AgregamosCuentaPaypal(String correo, String pass) {
		driver.findElement(btnPaypalcheckout).click();
		JavascriptExecutor jse = ((JavascriptExecutor)driver);   
		WebElement elem = driver.findElement(By.xpath("(//div[@class='times-week__day-prefix size-calc-12-14 font-primary--regular'])[2]"));
		jse.executeScript("arguments[0].click();", elem);	
		WebDriverWait ewait = new WebDriverWait (driver,20);
		WebElement horaEnvio = driver.findElement(By.xpath("(//button[contains(text(),'13:00 a 14:00')])[2]"));
		jse.executeScript("arguments[0].click();", horaEnvio);
		if (driver.findElements(terminosYcondiciones).size()!=0) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);  
			js.executeScript("window.scrollBy(0, -500)");
			PageCheckout addPaypal = new PageCheckout(driver);
			addPaypal.nuevaDirecciónInvitado("64610", "calle", "11", "20", "referencia");
			driver.findElement(terminosYcondiciones).click();
			driver.findElement(btnPagarGuest).click();
		}else {
			driver.findElement(btnPagar).click();
		}/*
		WebElement iframe = driver.findElement(By.xpath("//iframe[@title='PayPal']"));
		driver.switchTo().frame(iframe);
		JavascriptExecutor js = ((JavascriptExecutor)driver);   
		WebElement ele = driver.findElement(By.xpath("//img[@class='paypal-logo paypal-logo-paypal paypal-logo-color-blue']"));
		js.executeScript("arguments[0].click();", ele);
		for(String winNew:driver.getWindowHandles()) {
			driver.switchTo().window(winNew)
;		}
		driver.findElement(txt_correo_paypal).sendKeys(correo);
		if (driver.findElements(btn_siguiente).size()!=0) {
			driver.findElement(btn_siguiente).click();
			driver.findElement(txt_pass_paypal).sendKeys(pass);
			driver.findElement(btn_iniciarsesión).click();
		} else {
			driver.findElement(txt_pass_paypal).sendKeys(pass);
			driver.findElement(btn_iniciarsesión).click();
		}
		driver.findElement(btnContinuar).click();
		driver.findElement(AceptarYPagar);*/
		
	}
	
	
	public void paypalCuentaAsociada() {
		driver.findElement(btnPaypalcheckout).click();
		JavascriptExecutor js = ((JavascriptExecutor)driver);  
		WebElement elem = driver.findElement(By.xpath("(//div[@class='times-week__day-prefix size-calc-12-14 font-primary--regular'])[2]"));
		js.executeScript("arguments[0].click();", elem);
		WebDriverWait ewait = new WebDriverWait (driver,20);
		WebElement horaEnvio = driver.findElement(By.xpath("(//button[contains(text(),'13:00 a 14:00')])[1]"));
		js.executeScript("arguments[0].click();", horaEnvio);	
		driver.findElement(SelecthoraEnvio).click();
		driver.findElement(HorarioEnvio).click();
		driver.findElement(SelecthoraEnvio).click();
		driver.findElement(btnPagar).click();
	}
	

	public void seleccionarEntregaEnTienda() {
		WebDriverWait ewait = new WebDriverWait (driver,50);
		ewait.until(ExpectedConditions.elementToBeClickable(SelectEntregaEnTienda));	
		driver.findElement(SelectEntregaEnTienda).click();
        if( driver.findElements(TxtTelefonoCasa).size()!=0) {
			driver.findElement(TxtTelefonoCasa).sendKeys("5554554513");
			driver.findElement(TxtTelefonoMovil).sendKeys("5554554545");
			driver.findElement(BtnConfirmarTelefonos).click();
				}
		else {
			WebDriverWait ewaitt = new WebDriverWait (driver,50);
			ewaitt.until(ExpectedConditions.elementToBeClickable(SelectEntregaEnTienda));	
			driver.findElement(SelectEntregaEnTienda).click();
		}
		
		
		
	}
	
	public void seleccionarPagoContraEntregaVales() {
		WebDriverWait ewait = new WebDriverWait (driver,20);
		driver.findElement(seleccionarFecha).click();
		ewait.until(ExpectedConditions.elementToBeClickable(SelecthoraEnvio));	

		driver.findElement(SelecthoraEnvio).click();
		
		
		ewait.until(ExpectedConditions.elementToBeClickable(PagoContraEntrega));	
		driver.findElement(PagoContraEntrega).click();
		driver.findElement(metohdVales).click();
	}
	
	public void seleccionarPagoContraEntregaEfectivo() {
		WebDriverWait ewait = new WebDriverWait (driver,10);
		ewait.until(ExpectedConditions.elementToBeClickable(PagoContraEntrega));	
		driver.findElement(PagoContraEntrega).click();
		driver.findElement(methodEfectivo).click();
		driver.findElement(SumaDeEfectivo).sendKeys("500");
		driver.findElement(SumaDeEfectivo).sendKeys(Keys.ENTER);
		
	}
	

	public void seleccionarPagoContraEntregatdc() {
		WebDriverWait ewait = new WebDriverWait (driver,10);
		ewait.until(ExpectedConditions.elementToBeClickable(PagoContraEntrega));	
		driver.findElement(PagoContraEntrega).click();
		driver.findElement(methodTDC).click();
		
		
	}
	
	public void SuperEnTuCasa() {
		WebDriverWait ewait = new WebDriverWait (driver,50);
		ewait.until(ExpectedConditions.elementToBeClickable(seleccionarFecha));	
		driver.findElement(seleccionarFecha).click();
		try{
			Thread.sleep(4000);
			}
			catch(InterruptedException ie){
				
			}
		driver.findElement(SelecthoraEnvio).click();
		ewait.until(ExpectedConditions.elementToBeClickable(metodosDePagoSecc));
		driver.findElement(metodosDePagoSecc).click();	
		
	}
	
	public void SuperEnTuCasaInvitado() {
		
		/*driver.findElement(SelecthoraEnvio).click();	*/
	}
	
	public void FincarOrdern() {

		WebDriverWait ewait = new WebDriverWait (driver,50);
		ewait.until(ExpectedConditions.elementToBeClickable(btnPagar)); 
		JavascriptExecutor jse = ((JavascriptExecutor)driver); 
	    jse.executeScript("window.scrollBy(0,200)");
	    try{
			Thread.sleep(2000);
			}
			catch(InterruptedException ie){
				
			} 	
	    driver.findElement(btnPagar).click();
	}
	
	public void FincarOrdernComoInvitado() {

		WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.elementToBeClickable(terminosYcondiciones));	
		JavascriptExecutor jse = ((JavascriptExecutor)driver); 
		jse.executeScript("window.scrollBy(0,-500)");
		driver.findElement(terminosYcondiciones).click();;
		driver.findElement(btnPagarInvitado).click();
		
	}
	
	public void FincarOrdernComoInvitadoEfectivo() {

		WebDriverWait wait = new WebDriverWait(driver,50);
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


	}
	
	public void nuevaDirecciónInvitado(String cp, String calle, String exterior, String interior, String referencia) {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(abrirDatosEnvio).click();
		try{
			Thread.sleep(5000);
			}
			catch(InterruptedException ie){
			}
		JavascriptExecutor js = ((JavascriptExecutor)driver); 
		js.executeScript("window.scrollBy(0, -500)");
		driver.findElement(btnNuevaDirección).click();
		WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.elementToBeClickable(txtCP));	
		driver.findElement(txtCP).clear();
		driver.findElement(txtCP).sendKeys(cp);
		if (driver.findElements(BuscarDirección).size()!=0) {
			driver.findElement(BuscarDirección).click();
			driver.findElement(txtCalle).sendKeys(calle);
			driver.findElement(txtExteriorNuevaDir).sendKeys(exterior);
			driver.findElement(txtInterior).sendKeys(interior);
			driver.findElement(txtReferencia).sendKeys(referencia);
			driver.findElement(btnGuardarDir).click();
		}
		else {
			driver.findElement(txtCalle).sendKeys(calle);
			driver.findElement(txtExteriorNuevaDir).sendKeys(exterior);
			driver.findElement(txtInterior).sendKeys(interior);
			driver.findElement(txtReferencia).sendKeys(referencia);
			driver.findElement(btnGuardarDir).click();
		}
	}
	
	
/*	public void tearDown(ITestResult result) {
		if(result.isSuccess()) {
			File screenshot = ((TakesScreenshot)driver ).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screenshot, new File("Error"+ System.currentTimeMillis()+".png"));
			}catch (Exception ie) {
				ie.printStackTrace();
			}
		}
	}*/
	
	
}
