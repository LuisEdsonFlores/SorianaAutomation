package pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class PageLogin {
	
	public WebDriver driver;
	private By NoSuscribir;
	private By Ini_Registrate;
	private By IniciaSesion;
	private By CorreoElectronicoButton;
	private By Email;
	private By Password;
	private By ButtonIniciaSesion;
	private By cerrarModal;
	
	
	
	public  PageLogin (WebDriver driver) {
	
		this.driver = driver;
		NoSuscribir = By.xpath("//button[@class='secondary-action subscribers-no-button']");
		Ini_Registrate = By.xpath("//h6[contains(text(),'Inicia sesión')]");
		IniciaSesion = By.xpath("(//button[contains(text(),'Iniciar sesión')])[1]");
		CorreoElectronicoButton = By.xpath("//button[@class='btn btn-primary btn-block remove-hide-form-login']");
		Email = By.id("login-form-email");
		Password = By.id("login-form-password");
		ButtonIniciaSesion = By.xpath("//button[@id='btn-login-js']");
		cerrarModal = By.xpath("(//button[@class='close'])[6]");
		
	}
	
	
	public void Iniciasesion (String user, String pass) {

		try{
			Thread.sleep(4000);
			}
			catch(InterruptedException ie){
			}	
		JavascriptExecutor js = ((JavascriptExecutor)driver);   
		WebElement ele = driver.findElement(NoSuscribir);
		js.executeScript("arguments[0].click();", ele);
		try{
			Thread.sleep(4000);
			}
			catch(InterruptedException ie){
			}	
		driver.findElement(cerrarModal).click();
	 	driver.findElement(Ini_Registrate).click();
		driver.findElement(IniciaSesion).click();
		/*driver.findElement(CorreoElectronicoButton).click();*/
		driver.findElement(Email).sendKeys(user);
		driver.findElement(Password).sendKeys(pass);
		driver.findElement(ButtonIniciaSesion).click();
		driver.findElement(ButtonIniciaSesion);
		try{
			Thread.sleep(3000);
			}
			catch(InterruptedException ie){
			}	
		
	}
	
	public void iniciaComoInvitado() {
		WebDriverWait ewait = new WebDriverWait (driver,20);
		ewait.until(ExpectedConditions.elementToBeClickable(NoSuscribir));
		driver.findElement(NoSuscribir).click();	 	
		
	}
	
	

}
