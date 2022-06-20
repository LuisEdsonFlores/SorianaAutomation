package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
		try{
			Thread.sleep(800);
			}
			catch(InterruptedException ie){
			}
		if( driver.findElements(Medio).size()!=0) {
			
	         driver.findElement(Maduro).click();
	         
		}
		if (driver.findElements(btnAgregar2).size()!=0) {
			driver.findElement(btnAgregar2).click();
		}
			else{
				System.out.println("No tiene stock el producto");
			}				
	}
}
