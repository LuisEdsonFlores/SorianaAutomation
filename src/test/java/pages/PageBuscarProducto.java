package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
			Thread.sleep(2000);
			}
			catch(InterruptedException ie){
			}
		WebDriverWait ewait = new WebDriverWait (driver,80);
		ewait.until(ExpectedConditions.elementToBeClickable(CampoBusqueda));
		WebElement ele = driver.findElement(By.xpath("//input[@class='w-100 search-field']"));
		JavascriptExecutor jse = ((JavascriptExecutor)driver);  
		jse.executeScript("arguments[0].click();", ele);
		WebDriverWait wait = new WebDriverWait (driver,85);
		    driver.findElement(CampoBusqueda).sendKeys(producto);
			try{
				Thread.sleep(2000);
				}
				catch(InterruptedException ie){
				}
		    driver.findElement(ProductoEnBusqueda).click();

		
	}

}
