package pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class PageLogin {
	
	public WebDriver driver;
	private By NoSuscribir;
	private By Ini_Registrate;
	private By IniciaSesion;
	private By CorreoElectronicoButton;
	private By Email;
	private By Password;
	private By ButtonIniciaSesion;
	
	
	
	public  PageLogin (WebDriver driver) {
	
		this.driver = driver;
		NoSuscribir = By.xpath("//button[@class='secondary-action subscribers-no-button']");
		Ini_Registrate = By.xpath("//div[@class='d-none d-lg-block ml-3 header-account__text']");
		IniciaSesion = By.id("login-tab");
		CorreoElectronicoButton = By.xpath("//button[@class='btn btn-primary btn-block remove-hide-form-login']");
		Email = By.id("login-form-email");
		Password = By.id("login-form-password");
		ButtonIniciaSesion = By.xpath("//button[@class='btn btn-primary btn-block mt-4 mb-0']");
		
	}
	
	
	public void Iniciasesion (String user, String pass) {

		try{
			Thread.sleep(4000);
			}
			catch(InterruptedException ie){
			}	 	
		driver.findElement(NoSuscribir).click();	 	
	 	driver.findElement(Ini_Registrate).click();
		driver.findElement(IniciaSesion).click();
		driver.findElement(CorreoElectronicoButton).click();
		driver.findElement(Email).sendKeys(user);
		driver.findElement(Password).sendKeys(pass);
		driver.findElement(ButtonIniciaSesion).click();
		driver.findElement(ButtonIniciaSesion);
		try{
			Thread.sleep(5000);
			}
			catch(InterruptedException ie){
			}	
		
	}
	
	public void iniciaComoInvitado() {
		try{
			Thread.sleep(1000);
			}
			catch(InterruptedException ie){
			}	
		driver.findElement(NoSuscribir).click();	 	

	}
	
	

}
