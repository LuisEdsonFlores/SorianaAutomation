package pages;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageModalCP {
	
	private WebDriver driver;
	private By IngresaTuCp;
	private By Pickup;
	private By TextoPresentrePickup;
	private By txtCPpickup;
	private By txtCPDomicilio;
	private By checkDirPredeterminada;
	private By btnAceptar;
	private By txtCP;
	private By textoIngresaCpPickup;
	private By EnvioaDomicilio;
	private By btnAceptarcp;
	private By linkIniciarSesion;
	private By seleccionarPrimerTienda;
	private By btnAceptarPickup;
	private By invitadoLinkIS;
	private By btnAceptarInvitado;
	
	public  PageModalCP (WebDriver driver) {
		this.driver = driver;
		IngresaTuCp = By.xpath("//a[@class='common-header__postal-code maps-show']");
		Pickup = By.xpath("//div[@class='opacity-selector-modal pickup-pc js-click-shadow']");
		EnvioaDomicilio = By.xpath("(//div[@class='opacity-selector-modal homeDelivery-pc js-click-shadow'])[1]");
		invitadoLinkIS = By.xpath("(//a[@id='refLogin'])[2]");
		txtCPpickup = By.id("store-postal-code-header");
		txtCPDomicilio = By.id("zipCode");
		checkDirPredeterminada = By.xpath("(//div[@class='font-size-15 font-primary--medium mb-1'])[1]");
		btnAceptar = By.xpath("//button[@class='btn btn-primary store-form--btn js-submit-postal']");
		btnAceptarInvitado = By.xpath("//button[@class='btn btn-primary btn-modal-direction px-0 py-1 ml-2 js-modal-cp-direccion']");
		txtCP = By.xpath("//input[@id='zipCode']");
		btnAceptarcp = By.xpath("(//button[contains(text(),'Aceptar')])[2]");
		textoIngresaCpPickup = By.xpath("//p[@class='font-primary--medium mx-0 store-locator__search-title mb-3 text-general-modal']");
		linkIniciarSesion = By.xpath("//p[contains(text(),'Elige')]");
	    seleccionarPrimerTienda = By.xpath("(//div[@class='title-tab font-size-15 font-primary--semi-bold mb-3'])[1]");
	    btnAceptarPickup = By.xpath("//button[@class='btn btn-primary btn-modal-direction px-0 py-1 ml-2 js-select-store-modal']");
	
	}
	

	public void IngresaCpEnModalEnvioDomicilio (String codigopostal) {
		WebDriverWait ewait = new WebDriverWait (driver,50);
		ewait.until(ExpectedConditions.elementToBeClickable(IngresaTuCp));
		driver.findElement(IngresaTuCp).click();
		try{
			Thread.sleep(1000);
			}
			catch(InterruptedException ie){
			}
		driver.findElement(txtCP).click();
		driver.findElement(txtCP).sendKeys(codigopostal);
		driver.findElement(btnAceptarcp).click();
			
				
	}
	
	
	public void seleccionamosTiendaPickup() {
		WebDriverWait ewait = new WebDriverWait (driver,50);
		ewait.until(ExpectedConditions.elementToBeClickable(IngresaTuCp));
		driver.findElement(IngresaTuCp).click();
		try{
			Thread.sleep(2000);
			}
			catch(InterruptedException ie){
			}
		
		if(driver.findElement(linkIniciarSesion).isDisplayed()) {
			WebDriverWait ewaitt = new WebDriverWait (driver,50);
			ewaitt.until(ExpectedConditions.elementToBeClickable(Pickup));
        	driver.findElement(Pickup).click();
			ewaitt.until(ExpectedConditions.elementToBeClickable(seleccionarPrimerTienda));
			driver.findElement(seleccionarPrimerTienda).click();	
			driver.findElement(btnAceptarPickup).click();
			}
			else {
				try{
					Thread.sleep(2700);
					}
					catch(InterruptedException ie){
					}
				driver.findElement(seleccionarPrimerTienda).click();
				driver.findElement(btnAceptarPickup).click();

			}	
		
		
	}
	
	
	public void IngresarCpEnModalEnvioDomicilio (String codigopostal) {
		WebDriverWait ewait = new WebDriverWait (driver,50);
		ewait.until(ExpectedConditions.elementToBeClickable(IngresaTuCp));
		driver.findElement(IngresaTuCp).click();
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);
		try {
		WebElement textoIngPickup = wait.until(new Function <WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver ) {
			      return driver.findElement(By.xpath("//p[@class='font-primary--medium mx-0 store-locator__search-title mb-3 text-general-modal']"));
			}});
		}	catch(Exception ie){
		}
		WebElement textoIngresaCpPickup = driver.findElement(By.xpath("//p[@class='font-primary--medium mx-0 store-locator__search-title mb-3 text-general-modal']"));
		boolean TextoPresentrePickup = textoIngresaCpPickup.isDisplayed();		
		if(TextoPresentrePickup) {
			WebDriverWait ewaitt = new WebDriverWait (driver,50);
			ewaitt.until(ExpectedConditions.elementToBeClickable(EnvioaDomicilio));
        	driver.findElement(EnvioaDomicilio).click();
			ewaitt.until(ExpectedConditions.elementToBeClickable(checkDirPredeterminada));
			driver.findElement(checkDirPredeterminada).click();	
			}
			else {
				try{
					Thread.sleep(2700);
					}
					catch(InterruptedException ie){
					}
				driver.findElement(checkDirPredeterminada).click();
				
			}	
				
	}
	
	public void ingresaCPmodalPiclup (String codigoPostal){
		driver.findElement(IngresaTuCp).click();
		WebDriverWait ewaitt = new WebDriverWait (driver,50);
		ewaitt.until(ExpectedConditions.elementToBeClickable(EnvioaDomicilio));
        	driver.findElement(EnvioaDomicilio).click();
        		WebDriverWait ewait = new WebDriverWait (driver,50);
        		ewaitt.until(ExpectedConditions.elementToBeClickable(checkDirPredeterminada));
			driver.findElement(checkDirPredeterminada).click();	
			
	}
	
	public void IngresarCpComoInvitado (String CPinvitado) {
		WebDriverWait ewait = new WebDriverWait (driver,50);
		ewait.until(ExpectedConditions.elementToBeClickable(IngresaTuCp));
		driver.findElement(IngresaTuCp).click();
		ewait.until(ExpectedConditions.elementToBeClickable(invitadoLinkIS));
		driver.findElement(txtCPDomicilio).click();
		driver.findElement(txtCP).sendKeys(CPinvitado);
		driver.findElement(btnAceptarInvitado).click();
		
       	
	}
	
}

