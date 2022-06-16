package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PageBase {
	
	public WebDriver driver;
	private By NoSuscribir;
	private By Ini_Registrate;
	private By IniciaSesion;
	private By CorreoElectronicoButton;
	private By Email;
	private By Password;
	private By ButtonIniciaSesion;

	
	public PageBase (WebDriver driver) {
		this.driver = driver;
		NoSuscribir = By.xpath("//button[@class='secondary-action subscribers-no-button']");
	}
	
	public void IrASoriana() {
		
	 	DesiredCapabilities caps = new DesiredCapabilities ();
	 	System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
	 	driver = new ChromeDriver();
	 	driver.manage().window().maximize();
	 	driver.get("https://storefront:soria2021@development-na01-soriana.demandware.net/s/Soriana/home");
		driver.findElement(NoSuscribir).click();	 	
		try{
			Thread.sleep(4000);
			}
			catch(InterruptedException ie){
			}	 	
	}
	
}
