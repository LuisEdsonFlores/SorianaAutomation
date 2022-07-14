package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PageCar {
	private WebDriver driver;
	private By txtCupon;
	
	public  PageCar (WebDriver driver) {
		this.driver = driver;
		txtCupon = By.xpath("//input[@id='couponCode']");
	
		
	}
	
	
	public void agregarCupon(String cupon) {
		
		driver.findElement(txtCupon).click();
		driver.findElement(txtCupon).sendKeys(cupon);
		
	}
	
	

}
