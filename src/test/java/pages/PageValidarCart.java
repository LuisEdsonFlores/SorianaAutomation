package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageValidarCart {
	private WebDriver driver;
	private By irCarrito;
	private By iconBote;
	private By btnVaciarCarrito;
	private By siAceptar;
	private By btnContinuarComprando;
	private By productoUno;
	private By btnIniciarPago;
	
	
	public  PageValidarCart (WebDriver driver) {
		this.driver = driver;
		irCarrito = By.xpath("(//span[@class='minicart-total-value font-primary--bold'])[2]");
		iconBote = By.xpath("(//button[@class='btn btn-link btn-link--secondary remove-btn-lg remove-product text--red border-0 p-0 bg-transparent'])[1]");
		btnVaciarCarrito = By.xpath("//button[@class='btn btn-outline-secondary col-12']");
		siAceptar = By.xpath("(//button[@class='btn btn-primary clear-cart expanded-down mb-3 mb-lg-0 mx-lg-2 order-lg-2'])[1]");
		btnContinuarComprando = By.xpath("(//a[@class='cart-empty__continue-shopping col btn btn-primary font-primary--semi-bold'])[1]");
		productoUno = By.xpath("(//div[@class='row col dm-cart__item-attributes py-0 mx-0 px-0'])[1]");
		btnIniciarPago = By.xpath("(//div[@class='col-12 py-2 mt-3'])[1]");
		
	}
	
	public void validarCarro() {
	
			driver.findElement(irCarrito).click();
		
		if( driver.findElements(productoUno).size()!=0) {
			
			driver.findElement(btnVaciarCarrito).click();	
			driver.findElement(siAceptar).click(); 
			try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){
				}
			driver.findElement(btnContinuarComprando).click();
		}
		else {
			driver.findElement(irCarrito).click();
			driver.findElement(btnContinuarComprando).click();
		}
		
	}
	
	public void IrCheckout() {
		try{
			Thread.sleep(5000);
			}
			catch(InterruptedException ie){
			}
		driver.findElement(irCarrito).click();
      if( driver.findElements(productoUno).size()!=0) {
			
			driver.findElement(btnIniciarPago).click();	
		}
	
	}

}
