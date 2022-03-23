package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PagePDPaddTocart {
	
	private WebDriver driver;
	private By Verde;
	private By Medio;
	private By Maduro;
	private By btnAgregar;
	
	
	public  PagePDPaddTocart (WebDriver driver) {
		this.driver = driver;
		Verde = By.xpath("//input[@value='Verde']");
		Medio = By.xpath("//div[@id='mamedio']");
		Maduro = By.xpath("(//label[@class='content-input input-maturation'])[3]");
		btnAgregar = By.xpath("(//button[@class='btn-add-to-cart-remaster d-inline-flex btn btn-primary button button--secondary-red m-0'])[1]");
		
	}

	
	public void AgregarProductoAlCarrito ( ) {
		try{
			Thread.sleep(2000);
			}
			catch(InterruptedException ie){
			}
		if( driver.findElements(Medio).size()!=0) {
			
			driver.findElement(Maduro).click();		
		}
		
	driver.findElement(btnAgregar).click();
	}
}
