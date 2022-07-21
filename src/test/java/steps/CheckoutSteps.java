package steps;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

import Helpers.WebDriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PageBM;
import pages.PageBase;
import pages.PageBuscarProducto;
import pages.PageCar;
import pages.PageCategorias;
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
	 	driver.get("https://storefront:soria2021@development.soriana.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	@Given("el usuario ingresa a la pagina de soriana")
	public void  el_usuario_ingresa_a_la_pagina_de_soriana () {
		IrASoriana();		
	}
    
	@When("El usuario inicia sesion")
	public void El_usuario_inicia_sesion() throws HeadlessException, InvalidFormatException, IOException, AWTException, InterruptedException {
		PageLogin login = new PageLogin(driver);
		login.Iniciasesion("luflores@ts4.mx","qa123456");
	}
	
	@When("El usuario continua como invitado")
	public void El_usuario_continua_como_invitado() throws HeadlessException, InvalidFormatException, IOException, AWTException, InterruptedException {
		PageLogin invitado = new PageLogin(driver);
		invitado.iniciaComoInvitado();
	}
	
	@Then("Validamos que el carro de compras este vacio")
	public void Validamos_que_el_carro_de_compras_este_vacio() {
		PageValidarCart ValidarCarro = new PageValidarCart(driver);
		ValidarCarro.validarCarro();
	}
	
	@Then("El usuario selecciona un CP")
	public void El_usuario_selecciona_un_CP (){
		PageModalCP modal = new PageModalCP(driver);
		modal.IngresarCpEnModalEnvioDomicilio("64100");
	}
	
	@Then("El usuario ingresa el cp {string}")
	public void El_usuario_Ingresa_el_cp(String cp) {
		PageModalCP ingresacp = new PageModalCP(driver);
		ingresacp.IngresaCpEnModalEnvioDomicilio(cp);
	}
	
	@Then("El usuario selecciona una tienda para recoger en ella")
	public void El_usuario_selecciona_una_tienda_para_recoger_en_ella() {
		PageModalCP seleccionarPrimeraTienda = new PageModalCP(driver);
		seleccionarPrimeraTienda.seleccionamosTiendaPickup();
	}
	
	
	
	@Then("El usuario selecciona un CP ")
	public void El_usuario_selecciona_un_CP_1_0 (){
		PageModalCP modal = new PageModalCP(driver);
		modal.ingresaCPmodalPiclup("64100");
	}
	
	
	@Then("El usuario selecciona un CP como invitado")
	public void El_usuario_selecciona_un_CP_como_invitado (){
		PageModalCP modalInvitado = new PageModalCP(driver);
		modalInvitado.IngresarCpComoInvitado("64610");
	}
	
	
	@When("el usuario realiza la busqueda de un producto grosery")
	public void el_usuario_realiza_la_busqueda_de_un_producto() {
		PageBuscarProducto  BuscarProducto = new PageBuscarProducto(driver);
		BuscarProducto.BuscarProducto("melon");
		
	}
	
	@When("el usuario realiza la busqueda de una bebida alcoholica")
	public void el_usuario_realiza_la_busqueda_de_una_bebida_alcoholica() {
		PageBuscarProducto  BuscarProducto = new PageBuscarProducto(driver);
		BuscarProducto.BuscarProducto("tequila");
		
	}
	
	@When("el usuario realiza la busqueda de un producto general")
	public void el_usuario_realiza_la_busqueda_de_un_producto_general() {
		PageBuscarProducto  BuscarProducto = new PageBuscarProducto(driver);
		BuscarProducto.BuscarProducto("cocina");
		
	}
	
	@When("Agrega el producto al Carrito")
	public void Agrega_el_producto_al_Carrito() {
		PagePDPaddTocart agregaracarrito = new PagePDPaddTocart(driver);
		agregaracarrito.AgregarProductoAlCarrito();

		
	}
	
	@When("Agrega producto al Carrito")
	public void Agrega_producto_al_Carrito() {
		PagePDPaddTocart agregaracarritoConCupon = new PagePDPaddTocart(driver);
		agregaracarritoConCupon.AgregarProductoConCuponAlCarrito();
		
	}
	
	
	@When("El usuario va a el carrito")
	public void El_usuario_va_a_el_carrito() {
		PageCar irCarro = new PageCar(driver);
        irCarro.irAcarrito();
	}
	
	@When("Agrego el cupon {string}")
	public void Agrego_el_cupon (String cupon) {
		PageCar agregoCupon = new PageCar(driver);
		agregoCupon.agregarCupon(cupon);
	}
	
	@When("El usuario aplica el trespordos")
	public void El_usuario_Aplica_el_trespordos() {
		PageCar Agrego3x2 = new PageCar(driver);
		Agrego3x2.agregar3x2();
	}
	
	@When("el usuario realiza la busqueda de el producto {string} que tenga descuento y_o con cupon")
	public void el_usuario_realiza_la_busqueda_de_el_producto_que_tenga_descuento_con_cupon (String productoDescCupon) {
		PageBuscarProducto buscarProductoCupon = new PageBuscarProducto (driver);
		buscarProductoCupon.buscarProductoConDescuentoCupon(productoDescCupon);
	}
	
	@Then("Valida si se agrego producto a carrito y voy al checkout")
	public void Valida_si_se_agrego_producto_a_carrito_y_voy_al_checkout() {
        PageValidarCart iralcheckout = new PageValidarCart(driver);
        iralcheckout.IrCheckout();
	}
	
	@When("el usuario va al checkout como invitado")
	public void el_usuario_va_al_checkout_como_invitado() {
        PageCheckoutInvitado irComoInvitado = new PageCheckoutInvitado (driver);
        irComoInvitado.irComoInvitado("Luis", "Flores", "5554554513", "luflores@ts4.mx");
	}
	
	
	@When("^el usuario finca la orden con tdc$")
	public void el_usuario_finca_la_orden_con_tdc() throws IOException {
		PageCheckout fincartdc = new PageCheckout(driver);
		fincartdc.SeleccionamosTDCguardada("123");
		
		
	}
	
	@When("el usuario registra y finca la orden con paypal")
	public void el_usuario_registra_y_finca_la_orden_con_paypal() {
		PageCheckout addPaypal = new PageCheckout(driver);
		addPaypal.AgregamosCuentaPaypal("sb-qia1s1093984@business.example.com", "r#c.W3aG");
	}
	

	@When("el usuario registra y finca la orden con paypal como invitado")
	public void el_usuario_registra_y_finca_la_orden_con_paypal_como_invitado() {
		PageCheckout addPaypal = new PageCheckout(driver);
		addPaypal.AgregamosCuentaPaypal("sb-qia1s1093984@business.example.com", "r#c.W3aG");
		}
	
	@When("el usuario finca la orden con paypal cuenta registrada")
		public void el_usiario_finca_la_orden_con_paypal_cuenta_registrada() {
			PageCheckout paypalAsociado = new PageCheckout(driver);
			paypalAsociado.paypalCuentaAsociada();
		}
	
	
	@When("el usuario finca la orden con una tdc nueva")
	public void el_usuario_finca_la_orden_con_una_tdc_nueva() {
        PageCheckout agregarTdc = new PageCheckout(driver);
        PageCheckout fincartdc = new PageCheckout(driver);
        agregarTdc.AgregamosTDC("4027665743271281", "Luis tarjeta de prueba", "1123", "123", "64610");
		fincartdc.SeleccionamosTDCnueva("123");

	}
	
	@When("el usuario finca la orden con una tdc nueva como invitado")
	public void el_usuario_finca_la_orden_con_una_tdc_nueva_como_invitado() {
        PageCheckout agregarTdc = new PageCheckout(driver);
		PageCheckout selectVales = new PageCheckout(driver);
        PageCheckoutInvitado fincartdc = new PageCheckoutInvitado(driver);
        agregarTdc.AgregamosTDC("4027665743271281", "Luis tarjeta de prueba", "1123", "123", "64610");
		fincartdc.SeleccionamosTDCInvitado("123");
		/*selectVales.nuevaDirecciónInvitado("64610", "calle", "11", "20", "referencia");
		selectVales.SuperEnTuCasaInvitado();*/
		/*selectVales.FincarOrdernComoInvitado();*/

	}
	
	@When("el usuario finca la orden con una tdc nueva como invitado agregando direccion")
	public void el_usuario_finca_la_orden_con_una_tdc_nueva_como_invitado_agregando_direccion() {
        PageCheckout agregarTdc = new PageCheckout(driver);
		PageCheckout selectVales = new PageCheckout(driver);
        PageCheckoutInvitado fincartdc = new PageCheckoutInvitado(driver);
        agregarTdc.AgregamosTDC("4027665743271281", "Luis tarjeta de prueba", "1123", "123", "64610");
		fincartdc.SeleccionamosTDCInvitado("123");
		selectVales.nuevaDirecciónInvitado("64610", "calle", "11", "20", "referencia");
		selectVales.SuperEnTuCasaInvitado();
		/*selectVales.FincarOrdernComoInvitado();*/

	}
	
	@When("^el usuario finca la orden con vale$")
	public void el_usuario_finca_la_orden_con_vale() {
		PageCheckout selectVales = new PageCheckout(driver);
		selectVales.seleccionarPagoContraEntregaVales();
		selectVales.FincarOrdern();
		
	}
	
	@Then("^el usuario finca la orden con pago contra entrega tdc$")
	public void el_usuario_finca_la_orden_con_pago_contra_entrega_tdc(){
		PageCheckout SelectTDCpagoCE = new PageCheckout(driver);
		SelectTDCpagoCE.seleccionarPagoContraEntregatdc(); 		
	}
	
	@When("^el usuario finca la orden con vales como invitado$")
	public void el_usuario_finca_la_orden_con_vales_como_invitado() {
		PageCheckout selectVales = new PageCheckout(driver);
		selectVales.seleccionarPagoContraEntregaVales();
		selectVales.nuevaDirecciónInvitado("64610", "Calle", "exterior", "interior", "referencia");
		selectVales.SuperEnTuCasaInvitado();
		/*selectVales.FincarOrdernComoInvitado();*/
	}
	
	@When("^el usuario finca la orden con vales como invitado en entrega en tienda$")
	public void el_usuario_finca_la_orden_con_vales_como_invitado_en_entrega_en_tienda() {
		PageCheckout selectVales = new PageCheckout(driver);
		selectVales.seleccionarPagoContraEntregaVales();
		selectVales.SuperEnTuCasa();
		/*selectVales.FincarOrdernComoInvitado();*/
	}

	
	@When("^el usuario finca la orden con efectivo$")
	public void el_usuario_finca_la_orden_con_efectivo() {
		PageCheckout selectEfectivo = new PageCheckout(driver);
		selectEfectivo.SuperEnTuCasa();
		selectEfectivo.seleccionarPagoContraEntregaEfectivo();
		selectEfectivo.FincarOrdern();
	}
	
	@When("^el usuario finca la orden con efectivo en entrega en tienda$")
	public void el_usuario_finca_la_orden_con_efectivo_en_entrega_en_tienda() {
		PageCheckout selectEfectivo = new PageCheckout(driver);
		selectEfectivo.seleccionarPagoContraEntregaEfectivo();
		selectEfectivo.SuperEnTuCasa();
	/*	selectEfectivo.FincarOrdernComoInvitado();*/
	}
	
	@When("^el usuario finca la orden con efectivo como invitado$")
	public void el_usuario_finca_la_orden_con_efectivo_como_invitado() {
		PageCheckout selectVales = new PageCheckout(driver);
		selectVales.seleccionarPagoContraEntregaEfectivo();
		selectVales.nuevaDirecciónInvitado("64610", "Calle", "exterior", "interior", "referencia");
		selectVales.SuperEnTuCasaInvitado();
		/*selectVales.FincarOrdernComoInvitado();*/
	}
	
	@When("^el usuario finca la orden como invitado con efectivo$")
	public void el_usuario_finca_la_orden_con_efectivo_como_invitado_efectivo() {
		PageCheckout selectVales = new PageCheckout(driver);
		selectVales.seleccionarPagoContraEntregaEfectivo();
		selectVales.nuevaDirecciónInvitado("64610", "Calle", "exterior", "interior", "referencia");
		selectVales.SuperEnTuCasaInvitado();
	/*	selectVales.FincarOrdernComoInvitadoEfectivo();*/
	}
	
	@When("El usuario selecciona entrega en tienda")
	public void El_usuario_selecciona_entrega_en_tienda() {
		PageCheckout select = new PageCheckout(driver);
		select.seleccionarEntregaEnTienda();

	}
		@When("el sistema valida que se finque bien la orden")
		public void el_sistema_valida_que_se_finque_bien_la_orden() throws IOException {
			PageConfirmacionOrden confirmaOrden = new PageConfirmacionOrden (driver);
			confirmaOrden.ConfirmacionDeOrden();

		}
		
		@Then ("el usuario cierra el navegador")
		public void el_usuario_cierra_el_navegador() {
            PageCerrarNavegador cerrar = new PageCerrarNavegador (driver);
            cerrar.cerrarNavegador();
		}
		
		@Then("Seleccionamos y validamos la categoria despensa")
		public void Seleccionamos_y_validamos_la_categoria_despensa() {
			PageCategorias categoria = new PageCategorias (driver);
			categoria.ValidarCategoriaDespensa();
			
		}
		

		@Then("Seleccionamos y validamos la categoria Vinos Licores y cervezas")
		public void Seleccionamos_y_validamos_la_categoria_vinos_licores_cervezas() {
			PageCategorias categoria = new PageCategorias (driver);
			categoria.ValidarCategoriaVinosLicoresCervezas();
			
		}
		
		
		
		@Given("El sistema valida en el BM la orden")
		public void El_sistema_valida_en_el_BM_la_orden() {
			PageBM BM = new PageBM(driver);
			BM.IrAlBM();
			BM.IniciarSesionBM("luflores@ts4.mx", "Test123456");
			BM.irOrdenes();
		}
		

	
		
	
}