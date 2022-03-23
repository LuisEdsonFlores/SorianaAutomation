package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helpers.WebDriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PageBase;
import pages.PageBuscarProducto;
import pages.PageCheckout;
import pages.PageLogin;
import pages.PageModalCP;
import pages.PagePDPaddTocart;
import pages.PageValidarCart;

public class CheckoutSteps {
	private WebDriver driver;

	
	public void IrASoriana() {
		
	 	DesiredCapabilities caps = new DesiredCapabilities ();
	 	System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
	 	driver = new ChromeDriver();
	 	driver.manage().window().maximize();
	 	driver.get("https://staging-na01-soriana.demandware.net/s/Soriana/home");
		driver.manage().timeouts().implicitlyWait(65, TimeUnit.SECONDS);

	} 	

	
	@Given("el usuario ingresa a la pagina de soriana")
	public void  elUsuarioIngresaAlaPagina () {
		IrASoriana();		
	}
    
	@When("El usuario inicia sesion")
	public void elUsuarioIniciaSesion() {
		WebDriverManager.setWindowSize(driver, "maximized");
		PageLogin login = new PageLogin(driver);
		login.Iniciasesion("luflores@ts4.mx","qa123456");
	}
	
	@Then("Validamos que el carro de compras este vacio")
	public void ValidarCarroCompras() {
		WebDriverManager.setWindowSize(driver, "maximized");
		PageValidarCart ValidarCarro = new PageValidarCart(driver);
		ValidarCarro.validarCarro();
	}
	
	@Then("El usuario selecciona un CP")
	public void elUsuarioIngresaUnCP (){
		WebDriverManager.setWindowSize(driver, "maximized");
		PageModalCP modal = new PageModalCP(driver);
		modal.IngresarCpEnModalEnvioDomicilio("64610");
	}
	
	
	@When("el usuario realiza la busqueda de un producto")
	public void elUsuarioBuscaProducto() {
		WebDriverManager.setWindowSize(driver, "maximized");
		PageBuscarProducto  BuscarProducto = new PageBuscarProducto(driver);
		BuscarProducto.BuscarProducto("platano");
		
	}
	
	@When("Agrega el producto al Carrito")
	public void elUsuarioAgregaProductoAlCarrito() {
		WebDriverManager.setWindowSize(driver, "maximized");
		PagePDPaddTocart agregaracarrito = new PagePDPaddTocart(driver);
		agregaracarrito.AgregarProductoAlCarrito();

		
	}
	
	@Then("Valida si se agrego producto a carrito y voy al checkout")
	public void ValidoCarrito() {
		WebDriverManager.setWindowSize(driver, "maximized");
        PageValidarCart iralcheckout = new PageValidarCart(driver);
        iralcheckout.IrCheckout();
	}
	
	
	@Given("el usuario finca la orden")
	public void FincaOrdenTDC() {
		WebDriverManager.setWindowSize(driver, "maximized");
		PageCheckout fincartdc = new PageCheckout(driver);
		fincartdc.fincarOrdenTDC("123");
		
	}
	
	
}