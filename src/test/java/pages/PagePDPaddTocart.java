package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PagePDPaddTocart {
	
	private WebDriver driver;
	private By Verde;
	private By Medio;
	private By Maduro;
	private By btnAgregar;
	private By btnAgregar2;

	
	
	public  PagePDPaddTocart (WebDriver driver) {
		this.driver = driver;
		Verde = By.xpath("//input[@value='Verde']");
		Medio = By.xpath("//div[@id='mamedio']");
		Maduro = By.xpath("(//label[@class='content-input input-maturation'])[3]");
		btnAgregar = By.xpath("(//button[@class='btn-add-to-cart-remaster d-inline-flex btn btn-primary button button--secondary-red m-0'])[1]");
		btnAgregar2 = By.xpath("(//button[@class='btn-add-to-cart-remaster d-inline-flex btn btn-primary button button--secondary-red m-0'])[2]");
	
	}

	
	public void AgregarProductoAlCarrito ( ) {
		WebDriverWait ewait = new WebDriverWait (driver,50);
		ewait.until(ExpectedConditions.elementToBeClickable(Medio));
		if( driver.findElements(Medio).size()!=0) {
			WebDriverWait wait = new WebDriverWait (driver,50);
			wait.until(ExpectedConditions.elementToBeClickable(Maduro));
	         driver.findElement(Maduro).click();
	         
		}
		if (driver.findElements(btnAgregar2).size()!=0) {
			driver.findElement(btnAgregar2).click();

			try{
				Thread.sleep(5000);
				}
				catch(InterruptedException ie){
				}
		}
			else{
				System.out.println("No tiene stock el producto");
			}				
	}
	
	public void AgregarProductoConCuponAlCarrito ( ) {		
		if (driver.findElements(btnAgregar2).size()!=0) {
			driver.findElement(btnAgregar2).click();
			try{
				Thread.sleep(5000);
				}
				catch(InterruptedException ie){
				}
		}
			else{
				System.out.println("No tiene stock el producto");
			}				
	}
	
	
}
