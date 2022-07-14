package pages;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageValidarCart {
	private WebDriver driver;
	private By irCarrito;
	private By iconBote;
	private By btnVaciarCarrito;
	private By siAceptar;
	private By btnContinuarComprando;
	private By productoUno;
	private By btnIniciarPago;
	private By txtTuCarroEstaVacio;
	private By btnVaciarCarritoMinicar;
	private By Usarpuntos;
	
	public  PageValidarCart (WebDriver driver) {
		this.driver = driver;
		irCarrito = By.xpath("(//span[@class='minicart-total-value font-primary--bold'])[2]");
		iconBote = By.xpath("(//button[@class='btn btn-link btn-link--secondary remove-btn-lg remove-product text--red border-0 p-0 bg-transparent'])[1]");
		btnVaciarCarrito = By.xpath("//button[@class='btn btn-outline-secondary col-12']");
		btnVaciarCarritoMinicar = By.xpath("//button[@class='clean-minicart col-12']");
		siAceptar = By.xpath("(//button[@class='btn btn-primary clear-cart expanded-down mb-3 mb-lg-0 mx-lg-2 order-lg-2'])[1]");
		btnContinuarComprando = By.xpath("(//a[contains(text(),'Continuar comprando')])[1]");
		productoUno = By.xpath("(//div[@class='row col dm-cart__item-attributes py-0 mx-0 px-0'])[1]");
		btnIniciarPago = By.xpath("(//a[@class='set-spinner btn button button--secondary-red checkout-btn js-checkout-btn dm-cart__edit-btn btn btn-primary col-12 py-1'])[1]");
		txtTuCarroEstaVacio = By.xpath("//p[@class='cart-empty__title font-primary--medium mb-2 mb-lg-4']");
		Usarpuntos = By.xpath("//div[@class='font-primary--bold font-size-14 mr-3']");
	}
	
	public void validarCarro() {
		WebDriverWait ewait = new WebDriverWait (driver,80);
		
		try{
			Thread.sleep(5000);
			}
			catch(InterruptedException ie){
			}
		
		driver.findElement(irCarrito).click();
		
		try{
			Thread.sleep(1500);
			}
			catch(InterruptedException ie){
			}
	if( driver.findElement(txtTuCarroEstaVacio).isDisplayed()){
		ewait.until(ExpectedConditions.elementToBeClickable(btnContinuarComprando));
		driver.findElement(btnContinuarComprando).click();
	}else {
		ewait.until(ExpectedConditions.elementToBeClickable(btnVaciarCarrito));
		driver.findElement(btnVaciarCarrito).click();
		driver.findElement(siAceptar).click(); 
		ewait.until(ExpectedConditions.elementToBeClickable(btnContinuarComprando));
		driver.findElement(btnContinuarComprando).click();
	}
	
		
		
	}
	
	public void IrCheckout() {

		driver.findElement(irCarrito).click();
		JavascriptExecutor jse = ((JavascriptExecutor)driver);   
			
      if( driver.findElements(productoUno).size()!=0) {
		jse.executeScript("window.scrollTo(0, 600)");
			driver.findElement(btnIniciarPago).click();	
		}
	
	}

}