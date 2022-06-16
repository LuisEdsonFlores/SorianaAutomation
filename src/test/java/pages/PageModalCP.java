package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageModalCP {
	
	private WebDriver driver;
	private By IngresaTuCp;
	private By Pickup;
	private By EnvioaDomicilio;
	private By txtCPpickup;
	private By txtCPDomicilio;
	private By checkDirPredeterminada;
	private By btnAceptar;
	private By txtCP;
	
	
	
	public  PageModalCP (WebDriver driver) {
		this.driver = driver;
		IngresaTuCp = By.xpath("//a[@class='common-header__postal-code maps-show']");
		Pickup = By.id("blockpickup");
		EnvioaDomicilio = By.xpath("//div[@class='opacity-selector-modal homeDelivery-pc js-click-shadow']");
		txtCPpickup = By.id("store-postal-code-header");
		txtCPDomicilio = By.id("zipCode");
		checkDirPredeterminada = By.xpath("//div[@class='font-size-13 font-primary--medium text--green mb-1 ']");
		btnAceptar = By.xpath("//button[@class='btn btn-primary store-form--btn js-submit-postal']");
		txtCP = By.xpath("//input[@id='zipCode']");
	}
	
	public void IngresarCpEnModalEnvioDomicilio (String codigopostal) {
		try{
			Thread.sleep(1000);
			}
			catch(InterruptedException ie){
			}
		driver.findElement(IngresaTuCp).click();
		
        if( driver.findElements(checkDirPredeterminada).size()!=0) {
			
			driver.findElement(checkDirPredeterminada).click();		
		}
		else {
			
			driver.findElement(EnvioaDomicilio).click();
			driver.findElement(checkDirPredeterminada).click();	
			
		}	
	}
	
	public void IngresarCpComoInvitado (String CPinvitado) {
		try{
			Thread.sleep(2000);
			}
			catch(InterruptedException ie){
			}
		driver.findElement(IngresaTuCp).click();
		try{
			Thread.sleep(2000);
			}
			catch(InterruptedException ie){
				
			} 		driver.findElement(EnvioaDomicilio).click();
		driver.findElement(txtCP).sendKeys(CPinvitado);
		driver.findElement(btnAceptar).click();
		
       	
	}
	
}

