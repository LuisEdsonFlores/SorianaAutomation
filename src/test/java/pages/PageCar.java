package pages;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PageCar {
	private WebDriver driver;
	private By txtCupon;
	private By irCarrito;
	private By buttonAplciarCupon;
	private By msjInvalidCupon;
	private By precio3x2;
	private By cuponValido;
	private By agreagrqty;
	
	public  PageCar (WebDriver driver) {
		this.driver = driver;
		txtCupon = By.xpath("//input[@id='couponCode']");
		irCarrito = By.xpath("(//span[@class='minicart-total-value font-primary--bold'])[2]");
		buttonAplciarCupon = By.xpath("(//button[contains(text(),'Aplicar')])[1]");
		precio3x2 = By.xpath("//span[contains(text(),'$85.20')]");
		msjInvalidCupon = By.xpath("//span[contains(text(),'El cupón no se puede agregar a su carrito.')]");
		cuponValido= By.xpath("(//*[@id=\"arrow-cricle-green\"])[1]");
		agreagrqty = By.xpath("//button[@class='js_product-update-quantity tile-update-quantity increase mx-0']");
		
	}
	
	
	public void agregarCupon(String cupon1) {
		driver.findElement(txtCupon).click();
		driver.findElement(txtCupon).sendKeys(cupon1);
		driver.findElement(buttonAplciarCupon).click();
		WebDriverWait wait = new WebDriverWait (driver,80);
		if( driver.findElement(cuponValido).isDisplayed()){
			System.out.println("Se aplico el cupon");
		}else {
			driver.findElement(msjInvalidCupon).isDisplayed();
		System.out.println("NO se aplico el cupon correctamente");
		}
	}
	
	public void irAcarrito () {
		try{
			Thread.sleep(2700);
			}
			catch(InterruptedException ie){
			}
		driver.findElement(irCarrito).click();

	}
	
	public void agregar3x2() {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
		try {
		WebElement MasUnQty = wait.until(new Function <WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver ) {
			      return driver.findElement(By.xpath("//button[@class='js_product-update-quantity tile-update-quantity increase mx-0']"));
			}});

		}	catch(Exception ie){
		}
		driver.findElement(agreagrqty).click();
		driver.findElement(agreagrqty).click();
		driver.findElement(agreagrqty).click();

		
		if( driver.findElement(precio3x2).isDisplayed()){
			wait.until(ExpectedConditions.elementToBeClickable(precio3x2));
			driver.findElement(precio3x2).click();
			System.out.println("Se aplico la promocion 3x2");

		}else {
		System.out.println("No se aplico la promocion 3x2");
	}
	
	
	}
}
