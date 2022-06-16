package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBuscarProducto {
	
	private WebDriver driver;
	private By CampoBusqueda;
	private By ProductoEnBusqueda;
	
	
	
	public PageBuscarProducto (WebDriver driver) {
		this.driver = driver;
		CampoBusqueda = By.xpath("//input[@class='w-100 search-field']");
		ProductoEnBusqueda = By.xpath("(//a[@class='d-flex align-items-center suggestions-product__anchor'])[1]");

	}
	
	
	public void BuscarProducto(String producto) {
		try{
			Thread.sleep(5400);
			}
			catch(InterruptedException ie){
			}	
		driver.findElement(CampoBusqueda).click();
		driver.findElement(CampoBusqueda).sendKeys(producto);
		try{
			Thread.sleep(1000);
			}
			catch(InterruptedException ie){
			}	
		driver.findElement(ProductoEnBusqueda).click();

		
	}

}
