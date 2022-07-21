package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import pages.PageConfirmacionOrden;

public class PageBM {
	
	public WebDriver driver;
	private By UserName;
	private By btnLogin;
	private By password;
	private By labelLoginError;
	private By btnLogWithAccountManager;
	private By btnMerchantTools;
	private By labelSorianaSiteList;
	private By menuOrdering;
	private By btnSkioForNow;
	private By orderingMenuOrders;
	private By txtOrderNumer;
	private By btnFind;
	
	
	public PageBM (WebDriver driver) {
		this.driver = driver;
		UserName = By.xpath("//input[@id='idToken1']");
		btnLogin = By.xpath("//input[@id='loginButton_0']");
		password = By.xpath("//input[@id='idToken2']");
		labelLoginError = By.xpath("//div[@class='login_failed']");
		btnLogWithAccountManager =  By.xpath("//button[contains(text(),'Log In with Account Manager')]");
		btnMerchantTools = By.xpath("//a[contains(text(),'Merchant Tools')]");
		labelSorianaSiteList = By.xpath("//a[contains(text(),'Soriana')]");
		menuOrdering = By.xpath("(//span[contains(text(),'Ordering')])[2]");
		btnSkioForNow = By.xpath("//button[contains(text(),'Skip for now')]");
		orderingMenuOrders = By.xpath("(//span[contains(text(),'Orders')])[2]");
		txtOrderNumer = By.xpath("//input[@id='OrderSearchForm2_SimpleSearchTerm']");
		btnFind = By.xpath("(//button[@id='searchFocus'])[1]");
	}
	
	
	public void IrAlBM() {
		
			driver.get("https://account.demandware.com/dwsso/XUI/?realm=/&goto=https://account.demandware.com:443/dwsso/oauth2/authorize?response_type%3Dcode%26client_id%3D01fcd573-ec2e-356b-ae9b-6f7288bdbb5e%26scope%3DtenantFilter%2520openid%2520profile%2520roles%2520externalId%2520email%26state%3DAhGSmMLfW9F0PAzdT8QJqHZFbjTDJibU9LXt2ZlDnSc%253D%26redirect_uri%3Dhttps://development-na01-soriana.demandware.net:443/on/demandware.servlet/dw/oidc/openid_connect_login%26nonce%3Dg2iN7slssbil7aTB8l5umgeBa9wlAlzq7iYrq7FrvMI%26prompt%3D#login/");
	}
	
	public void IniciarSesionBM(String Username , String Pass) {
		driver.findElement(UserName).sendKeys(Username);
		driver.findElement(btnLogin).click();
		driver.findElement(password).sendKeys(Pass); 
		driver.findElement(btnLogin).click();
		try{
			Thread.sleep(5000);
			}
			catch(InterruptedException ie){
				
			} 
		if(driver.findElement(labelLoginError).isDisplayed()) {
			driver.findElement(btnLogWithAccountManager).click();
			driver.findElement(UserName).sendKeys(Username);
			driver.findElement(btnLogin).click();
			driver.findElement(password).sendKeys(Pass); 
			driver.findElement(btnLogin).click();
		}else {
			System.out.println("Login correcto");
		}
				
	}
	
	public void irOrdenes() {
		driver.findElement(btnMerchantTools).click();
		driver.findElement(labelSorianaSiteList).click();
		driver.findElement(menuOrdering).click();
		driver.findElement(orderingMenuOrders).click();
	}
	
	public void buscarOrden() {
		try{
			Thread.sleep(5000);
			}
			catch(InterruptedException ie){
				
			} 
		JavascriptExecutor jse = ((JavascriptExecutor)driver);   
		WebElement ele = driver.findElement(By.xpath("//input[@id='OrderSearchForm2_SimpleSearchTerm']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ele);	
		try{
			Thread.sleep(5000);
			}
			catch(InterruptedException ie){
				
			} 
		driver.findElement(txtOrderNumer).sendKeys(PageConfirmacionOrden.NumeroOrdenFinal);
		System.out.println(PageConfirmacionOrden.NumeroOrdenFinal);
		driver.findElement(btnFind).click();
	}

}






