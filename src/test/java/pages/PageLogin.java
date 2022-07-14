package pages;


import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

import impresion.utilizafile;




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
		cerrarModal = By.xpath("(//button[@title='Cerrar'])[5]");
		
	}
	
	
	public void Iniciasesion (String user, String pass) throws HeadlessException, InvalidFormatException, IOException, AWTException, InterruptedException {
		
		utilizafile imprimeEvidencia = new utilizafile();

		WebDriverWait ewait = new WebDriverWait (driver,50);
	
		ewait.until(ExpectedConditions.elementToBeClickable(cerrarModal));
		driver.findElement(cerrarModal).click();
	 	driver.findElement(Ini_Registrate).click();
	 	ewait.until(ExpectedConditions.elementToBeClickable(NoSuscribir));
		JavascriptExecutor js = ((JavascriptExecutor)driver);   
		WebElement ele = driver.findElement(NoSuscribir);
		js.executeScript("arguments[0].click();", ele);
		driver.findElement(IniciaSesion).click();
		/*driver.findElement(CorreoElectronicoButton).click();*/
		/*imprimeEvidencia.InicializaFile();*/
	/*	imprimeEvidencia.PasoDelScript("1.- El usuario Ingresa usuario y password", driver);*/
		driver.findElement(Email).sendKeys(user);
		driver.findElement(Password).sendKeys(pass);
		driver.findElement(ButtonIniciaSesion).click();
	/*	imprimeEvidencia.PasoDelScript("2.- El usuario Inicio sesión", driver);
		imprimeEvidencia.GeneraEvidencia("Step1.docx");*/
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);


	}
	

		
	
	public void iniciaComoInvitado() {
		WebDriverWait ewait = new WebDriverWait (driver,20);
		ewait.until(ExpectedConditions.elementToBeClickable(NoSuscribir));
		driver.findElement(NoSuscribir).click();	 	
		
	}
	
	

}
