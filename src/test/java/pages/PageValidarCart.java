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
	
	
	
	public  PageValidarCart (WebDriver driver) {
		this.driver = driver;
		irCarrito = By.xpath("/html/body/div[1]/header/div[3]/div[3]/div/div[1]/div[2]/a");
		iconBote = By.xpath("(//button[@class='btn btn-link btn-link--secondary remove-btn-lg remove-product text--red border-0 p-0 bg-transparent'])[1]");
		btnVaciarCarrito = By.xpath("//button[@class='btn btn-outline-secondary col-12']");
		siAceptar = By.xpath("(//button[@class='btn btn-primary clear-cart expanded-down mb-3 mb-lg-0 mx-lg-2 order-lg-2'])[1]");
		btnContinuarComprando = By.xpath("(//span[@class='btn btn-primary minicart-empty--hide'])[1]");
		productoUno = By.xpath("(//div[@class='row col dm-cart__item-attributes py-0 mx-0 px-0'])[1]");
		btnIniciarPago = By.xpath("(//div[@class='col-12 py-2 mt-3'])[1]");
		txtTuCarroEstaVacio = By.xpath("//p[@class='cart-empty__title font-primary--medium mb-2 mb-lg-4']");
		
	}
	
	public void validarCarro() {
	
		driver.get("https://development.soriana.com/carrito");

	/*
	if( driver.findElements(productoUno).size()!=0) {
			
			driver.findElement(btnVaciarCarrito).click();	
			driver.findElement(siAceptar).click(); 
			
			try{
				Thread.sleep(3000);
				}
				catch(InterruptedException ie){
				}
			driver.findElement(btnContinuarComprando).click();
		}
		else {
			driver.findElement(btnContinuarComprando).click();
		}*/
	if( driver.findElement(txtTuCarroEstaVacio).isDisplayed()){
		driver.findElement(btnContinuarComprando).click();
	}else {
		driver.findElement(btnVaciarCarrito).click();	
		driver.findElement(siAceptar).click(); 
		try{
			Thread.sleep(2000);
			}
			catch(InterruptedException ie){
			}
		driver.findElement(btnContinuarComprando).click();
	}
	
		
		
	}
	
	public void IrCheckout() {
	
		try{
			Thread.sleep(2200);
			}
			catch(InterruptedException ie){
			}
		driver.get("https://development.soriana.com/carrito");
      if( driver.findElements(productoUno).size()!=0) {
  		JavascriptExecutor jse = ((JavascriptExecutor)driver);   
		jse.executeScript("window.scrollTo(0, 600)");

			driver.findElement(btnIniciarPago).click();	
		}
	
	}

}
