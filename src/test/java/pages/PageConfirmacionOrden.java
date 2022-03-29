package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PageConfirmacionOrden {
	
	private WebDriver driver;

	
	private By GraciasPorTuCompra;
	
	
	public PageConfirmacionOrden (WebDriver driver) {
        this.driver = driver;
        
		GraciasPorTuCompra = By.xpath("//div[@class='d-flex justify-content-center font-size-20 font-size-lg-32 mb-5 font-primary--semi-bold']");

	}
	
	public void ConfirmacionDeOrden() {
		try{
			Thread.sleep(6000);
			}
			catch(InterruptedException ie){
			}		String actualTitle = driver.getTitle();
		String expectedTitle = "Confirmación de pedido | Soriana";
		if(driver.findElements(GraciasPorTuCompra).size()!=0){
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("la orden se finco correctamente");
		}
		else {
			System.out.println("la orden NO se finco correctamente");

		}
	}
	
	
}
