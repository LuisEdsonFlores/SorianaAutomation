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
	
	
	public  PageModalCP (WebDriver driver) {
		this.driver = driver;
		IngresaTuCp = By.xpath("//a[@class='common-header__postal-code maps-show']");
		Pickup = By.id("blockpickup");
		EnvioaDomicilio = By.id("blockhome");
		txtCPpickup = By.id("store-postal-code-header");
		txtCPDomicilio = By.id("zipCode");
		checkDirPredeterminada = By.xpath("(//div[contains(text(),'predeterminada')])[1]");
		btnAceptar = By.xpath("//button[@class='btn btn-primary store-form--btn js-submit-postal']");
	}
	
	public void IngresarCpEnModalEnvioDomicilio (String codigopostal) {
		try{
			Thread.sleep(2000);
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
}

