package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PageCar {
	private WebDriver driver;
	private By txtCupon;
	private By irCarrito;
	private By buttonAplciarCupon;
	
	
	public  PageCar (WebDriver driver) {
		this.driver = driver;
		txtCupon = By.xpath("//input[@id='couponCode']");
		irCarrito = By.xpath("(//span[@class='minicart-total-value font-primary--bold'])[2]");
		buttonAplciarCupon = By.xpath("(//button[contains(text(),'Aplicar')])[1]");
		
	}
	
	
	public void agregarCupon(String cupon1) {
		
		driver.findElement(txtCupon).click();
		driver.findElement(txtCupon).sendKeys(cupon1);
		driver.findElement(buttonAplciarCupon).click();
		
	}
	
	public void irAcarrito () {
		try{
			Thread.sleep(2700);
			}
			catch(InterruptedException ie){
			}
		driver.findElement(irCarrito).click();

	}
	

}
