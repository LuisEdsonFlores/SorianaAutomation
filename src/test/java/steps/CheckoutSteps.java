package steps;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
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
import pages.PageCerrarNavegador;
import pages.PageCheckout;
import pages.PageCheckoutInvitado;
import pages.PageConfirmacionOrden;
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
	public void  el_usuario_ingresa_a_la_pagina_de_soriana () {
		IrASoriana();		
	}
    
	@When("El usuario inicia sesion")
	public void El_usuario_inicia_sesion() {
		WebDriverManager.setWindowSize(driver, "maximized");
		PageLogin login = new PageLogin(driver);
		login.Iniciasesion("luflores@ts4.mx","qa123456");
	}
	
	@When("El usuario continua como invitado")
	public void El_usuario_continua_como_invitado() {
		PageLogin invitado = new PageLogin(driver);
		invitado.iniciaComoInvitado();
	}
	
	@Then("Validamos que el carro de compras este vacio")
	public void Validamos_que_el_carro_de_compras_este_vacio() {
		WebDriverManager.setWindowSize(driver, "maximized");
		PageValidarCart ValidarCarro = new PageValidarCart(driver);
		ValidarCarro.validarCarro();
	}
	
	@Then("El usuario selecciona un CP")
	public void El_usuario_selecciona_un_CP (){
		WebDriverManager.setWindowSize(driver, "maximized");
		PageModalCP modal = new PageModalCP(driver);
		modal.IngresarCpEnModalEnvioDomicilio("64610");
	}
	
	@Then("El usuario selecciona un CP como invitado")
	public void El_usuario_selecciona_un_CP_como_invitado (){
		WebDriverManager.setWindowSize(driver, "maximized");
		PageModalCP modalInvitado = new PageModalCP(driver);
		modalInvitado.IngresarCpComoInvitado("64610");
	}
	
	
	@When("el usuario realiza la busqueda de un producto grosery")
	public void el_usuario_realiza_la_busqueda_de_un_producto() {
		WebDriverManager.setWindowSize(driver, "maximized");
		PageBuscarProducto  BuscarProducto = new PageBuscarProducto(driver);
		BuscarProducto.BuscarProducto("platano");
		
	}
	
	@When("el usuario realiza la busqueda de un producto general")
	public void el_usuario_realiza_la_busqueda_de_un_producto_general() {
		WebDriverManager.setWindowSize(driver, "maximized");
		PageBuscarProducto  BuscarProducto = new PageBuscarProducto(driver);
		BuscarProducto.BuscarProducto("cocina");
		
	}
	
	@When("Agrega el producto al Carrito")
	public void Agrega_el_producto_al_Carrito() {
		WebDriverManager.setWindowSize(driver, "maximized");
		PagePDPaddTocart agregaracarrito = new PagePDPaddTocart(driver);
		agregaracarrito.AgregarProductoAlCarrito();

		
	}
	
	@Then("Valida si se agrego producto a carrito y voy al checkout")
	public void Valida_si_se_agrego_producto_a_carrito_y_voy_al_checkout() {
		WebDriverManager.setWindowSize(driver, "maximized");
        PageValidarCart iralcheckout = new PageValidarCart(driver);
        iralcheckout.IrCheckout();
	}
	
	@When("el usuario va al checkout como invitado")
	public void el_usuario_va_al_checkout_como_invitado() {
		WebDriverManager.setWindowSize(driver, "maximized");
        PageCheckoutInvitado irComoInvitado = new PageCheckoutInvitado (driver);
        irComoInvitado.irComoInvitado("Luis", "Flores", "5554554513", "luflores@ts4.mx");
	}
	
	
	@When("^el usuario finca la orden con tdc$")
	public void el_usuario_finca_la_orden_con_tdc() {
		WebDriverManager.setWindowSize(driver, "maximized");
		PageCheckout fincartdc = new PageCheckout(driver);
		fincartdc.SeleccionamosTDCguardada("123");
		
	}
	
	@When("el usuario finca la orden con una tdc nueva")
	public void el_usuario_finca_la_orden_con_una_tdc_nueva() {
		WebDriverManager.setWindowSize(driver, "maximized");
        PageCheckout agregarTdc = new PageCheckout(driver);
        PageCheckout fincartdc = new PageCheckout(driver);
        agregarTdc.AgregamosTDC("4111111111111111", "Luis tarjeta de prueba", "1123", "123", "64610");
		fincartdc.SeleccionamosTDCnueva("123");

	}
	
	@When("el usuario finca la orden con una tdc nueva como invitado")
	public void el_usuario_finca_la_orden_con_una_tdc_nueva_como_invitado() {
		WebDriverManager.setWindowSize(driver, "maximized");
        PageCheckout agregarTdc = new PageCheckout(driver);
		PageCheckout selectVales = new PageCheckout(driver);
        PageCheckoutInvitado fincartdc = new PageCheckoutInvitado(driver);
        agregarTdc.AgregamosTDC("4111111111111111", "Luis tarjeta de prueba", "1123", "123", "64610");
		fincartdc.SeleccionamosTDCInvitado("123");
		selectVales.nuevaDirecciónInvitado("64610", "calle", "11", "20", "referencia");
		selectVales.SuperEnTuCasaInvitado();
		selectVales.FincarOrdernComoInvitado();

	}
	
	@When("^el usuario finca la orden con vale$")
	public void el_usuario_finca_la_orden_con_vale() {
		WebDriverManager.setWindowSize(driver, "maximized");	
		PageCheckout selectVales = new PageCheckout(driver);
		selectVales.seleccionarPagoContraEntregaVales();
		selectVales.SuperEnTuCasa();
		selectVales.FincarOrdern();
		
	}
	
	@When("^el usuario finca la orden con vales como invitado$")
	public void el_usuario_finca_la_orden_con_vales_como_invitado() {
		WebDriverManager.setWindowSize(driver, "maximized");	
		PageCheckout selectVales = new PageCheckout(driver);
		selectVales.seleccionarPagoContraEntregaVales();
		selectVales.nuevaDirecciónInvitado("64100", "Calle", "exterior", "interior", "referencia");
		selectVales.SuperEnTuCasaInvitado();
		selectVales.FincarOrdernComoInvitado();
	}
	
	@When("^el usuario finca la orden con vales como invitado en entrega en tienda$")
	public void el_usuario_finca_la_orden_con_vales_como_invitado_en_entrega_en_tienda() {
		WebDriverManager.setWindowSize(driver, "maximized");	
		PageCheckout selectVales = new PageCheckout(driver);
		selectVales.seleccionarPagoContraEntregaVales();
		selectVales.SuperEnTuCasa();
		selectVales.FincarOrdernComoInvitado();
	}

	
	@When("^el usuario finca la orden con efectivo$")
	public void el_usuario_finca_la_orden_con_efectivo() {
		WebDriverManager.setWindowSize(driver, "maximized");	
		PageCheckout selectEfectivo = new PageCheckout(driver);
		selectEfectivo.seleccionarPagoContraEntregaEfectivo();
		selectEfectivo.SuperEnTuCasa();
		selectEfectivo.FincarOrdern();
	}
	
	@When("^el usuario finca la orden con efectivo en entrega en tienda$")
	public void el_usuario_finca_la_orden_con_efectivo_en_entrega_en_tienda() {
		WebDriverManager.setWindowSize(driver, "maximized");	
		PageCheckout selectEfectivo = new PageCheckout(driver);
		selectEfectivo.seleccionarPagoContraEntregaEfectivo();
		selectEfectivo.SuperEnTuCasa();
		selectEfectivo.FincarOrdernComoInvitado();
	}
	
	@When("^el usuario finca la orden con efectivo como invitado$")
	public void el_usuario_finca_la_orden_con_efectivo_como_invitado() {
		WebDriverManager.setWindowSize(driver, "maximized");	
		PageCheckout selectVales = new PageCheckout(driver);
		selectVales.seleccionarPagoContraEntregaEfectivo();
		selectVales.nuevaDirecciónInvitado("64100", "Calle", "exterior", "interior", "referencia");
		selectVales.SuperEnTuCasaInvitado();
		selectVales.FincarOrdernComoInvitado();
	}
	
	@When("El usuario selecciona entrega en tienda")
	public void El_usuario_selecciona_entrega_en_tienda() {
		WebDriverManager.setWindowSize(driver, "maximized");	
		PageCheckout select = new PageCheckout(driver);
		select.seleccionarEntregaEnTienda();

	}
		@Then("el sistema valida que se finque bien la orden")
		public void el_sistema_valida_que_se_finque_bien_la_orden() {
			WebDriverManager.setWindowSize(driver, "maximized");
			PageConfirmacionOrden confirmaOrden = new PageConfirmacionOrden (driver);
			confirmaOrden.ConfirmacionDeOrden();

		}
		
		@Then ("el usuario cierra el navegador")
		public void el_usuario_cierra_el_navegador() {
			WebDriverManager.setWindowSize(driver, "maximized");
            PageCerrarNavegador cerrar = new PageCerrarNavegador (driver);
            cerrar.cerrarNavegador();
		}

	
}