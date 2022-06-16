package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import lombok.experimental.var;

public class PageCategorias {
	private WebDriver driver;
	private By home;
	private By txtDepartamentos;
	private By txtDespensa;
	private By txtCremasSopas_y_pures;
	private By txtAzycares_y_endulzantes;
	private By txtAderezosSalsasYVinages;
	private By priceProduct;
	private By strPriceText;
	private By span;
	private By AlimentosEnlatados;
	private By aceitesYmantecas;
	private By CerealesBarrasAvenas;
	private By MermeladasMiel;
	private By cafeTeChocolate;
	private By panesPastelillos;
	private By arrozFrijoSemillas;
	private By especiasSazonadores;
	private By harinasReposteria;
	private By botanaTostadas;
	private By Galletas;
	private By dulcesChocolates;
	private By flanesGelatinas;
	private By leche;
	private By organicos;
	private By gourmet;
	private By comidaOriental;
	
	private By vinosLicores;
	private By cerveza;
	private By vinos;
	private By destiladoLicores;
	
	
	private By electronica;
	private By tvVideo;
	private By audio;
	private By instrumentosMusicales;
	private By drones;
	private By hogalInteligente;
	private By videoJuegos;
	private By equipsComputo;
	private By apple;
	private By impresion;
	private By software;
	private By redes;
	private By accesoriosComputadora;
	private By disporitivosAlmecenamiento;
	private By smathWatch;
	private By telefonosCelulares;
	private By telefonosInalambricos;
	private By telefonosAlambricos;
	private By accesoriosTelefonia;
	private By camara;
	
	private By bebes;
	private By accesoriosBebe;
	private By nutricionInfantil;
	private By pañalesToallitas;
	private By perfumeEhigieneDeBebes;
	
	private By farmacia;
	private By nebulizadores;
	private By masajeadores;
	private By diabeticos;
	private By ortopedicos;
	private By materialMedico;
	private By antocoagulantes;
	private By cardiovasculares;
	private By incontinencia;
	private By analgesicos;
	private By Respiratorios;
	private By gastrointestinales;
	private By dermatologicos;
	private By vitaminasSuplementos;
	private By medicamentos;
	private By medicamentoGenerico;
	private By naturistaHerbolarios;
	private By medicamentoInfantilies;
	private By saludSexual;
	private By saludFemenina;
	private By cuidadoLabiosBoca;
	private By oftalmicosOticos;
	private By cuidadoCapilar;
	private By cuidadoPies;
	private By materialCuracion;
	private By monitoresSalud;
	private By suerosOrales;
	
	private By hogarElectrodomesticos;
	private By lineaBlanca;
	private By climatizacion;
	private By enseresCocina;
	private By enseresHogar;
	private By muebles;
	private By colchones;
	private By blancos;
	private By cocina;
	private By mesa;
	private By organizacionHogar;
	private By decoracion;
	private By iluminacionDecorativa;
	private By baño;
	private By jardin;
	private By asadores;
	private By fiesta;
	private By temporadas;
	private By equipaje;
	private By merceria;
	private By papeleria;
	private By productosConCausa;
	
	private By limpiezaHogar;
	private By limpiadores;
	private By productosParaElHogar;
	private By productosDesechablesParaElHogar;
	private By jarcieria;
	private By aromatizantes;
	
	private By mascotas;
	private By perros;
	private By gatos;
	private By aves;
	private By pecesTortugas;
	private By otrasMascotas;
	
	private By deportesMotos;
	private By fitness;
	private By basquetbol;
	private By soccer;
	private By ciclismo;
	private By deportesAcuaticos;
	private By campismo;
	private By motos;
	private By deportesCorrer;
	
	private By alimentosCongeladosRefrigerados;
	private By frutasVErdurasCongeladas;
	private By heladosPaletasPostres;
	private By alimentosCongelados;
	private By alimentosRefrigerados;
	private By hielo;
	
	private By autosFerreteria;
	private By autos;
	private By ferreteria;
	private By plomeria;
	private By pintura;
	private By herramientas;
	private By cajasOrganizadores;
	private By iluminaion;
	private By electricidad;
	private By seguridad;
	
	private By carnesPescadosMariscos;
	private By PolloPavo;
	private By ResTernera;
	private By cerdo;
	private By prescadosMariscos;
	private By especialidades;
	
	private By cuidadoPersoalBelleza;
	private By cuidadoCabello;
	private By cremasFaciales;
	private By cremaCorporales;
	private By cuidadoBucal;
	private By jabones;
	private By antibacteriales;
	private By talcosDesororantes;
	private By afeitadoDepilacion;
	private By proteccionSolar;
	private By cuidadoParaPies;
	private By cuidadoFemenino;
	private By cuidadoManos;
	private By accesoriosCuidadoPersonal;
	private By electricosBelleza;
	private By maquillaje;
	
	private By frutasVerdudas;
	private By verduras;
	private By frutas;
	private By Organicos;
	private By frutosSecos;
	
	private By jugosBebidas;
	private By Agua;
	private By jugos;
	private By refrescos;
	private By energetizantes;
	private By bebidasCafeTe;
	
	private By juguetes;
	private By juguetesTodasEdades;
	private By diverdionFueraCasa;
	private By ponAjugarSuImaginacion;
	private By disney;
	private By marcasJuguetes;
	
	private By lacteosHuevo;
	private By Leche;
    private By yoghurts;
	private By huevo;
	private By mantequillaMargarina;
	private By cremasJocoques;
	private By gelatinasPostres;
	
	private By modaAcesorios;
	private By fragancias;
	private By lentes;
	private By relojes;
	private By Joyeria;
	private By gorras;
	private By zapatos;
	private By accesoriosDama;
	private By accesoriosCaballero;
	private By ropaDama;
	private By ropaCaballero;
	private By ropaNiño;
	private By ropaNiña;
	private By ropaBebe;
	private By ropaInterior;
	
	private By panaderiaTortilleriaAlimentos;
	private By tortilleria;
	private By panaderia;
	private By pasrelesReposteria;
	private By alimentosPreparados;

	private By quesoSalchichasDeli;
	private By quesos;
	private By salchichoneria;
	private By Gourmet;
	
	public PageCategorias(WebDriver driver) {
		this.driver = driver;
		txtDepartamentos = By.xpath("(//div[contains(text(),'Departamentos')])[1]");
		txtDespensa = By.xpath("(//button[@class='bg-transparent border-0 d-flex w-100 align-items-center font-primary--medium position-relative nav__cat-item'])[1]");
		txtCremasSopas_y_pures = By.xpath("//a[contains(text(),'Cremas, sopas y purés')]");
		txtAzycares_y_endulzantes = By.xpath("//a[contains(text(),'Azúcares y endulzantes')]");
		txtAderezosSalsasYVinages = By.xpath("//a[contains(text(),'Aderezos, salsas y vinagres')]");
		priceProduct = By.xpath("//div[@class='tile-body product-tile--body w-100 p-0']");
		span = By.xpath("//span[@class='font-primary--bold  product-price']");
		AlimentosEnlatados = By.xpath("//a[contains(text(),'Alimentos enlatados')]");
		aceitesYmantecas = By.xpath("//a[contains(text(),'Aceites y mantecas')]");
		CerealesBarrasAvenas = By.xpath("//a[contains(text(),'Cereales, barras')]");
		MermeladasMiel  = By.xpath("//a[contains(text(),'Mermeladas y ')]");
		cafeTeChocolate = By.xpath("//a[contains(text(),'Café, ')]");
		panesPastelillos = By.xpath("//a[contains(text(),'Panes')]");
		arrozFrijoSemillas = By.xpath("//a[contains(text(),'Arroz,')]");
		especiasSazonadores = By.xpath("//a[contains(text(),'Especias')]");
		harinasReposteria = By.xpath("//a[contains(text(),'Harinas y')]");
		botanaTostadas = By.xpath("//a[contains(text(),'Botanas y ')]");
		Galletas = By.xpath("(//a[contains(text(),'Galletas')])[1]");
		dulcesChocolates = By.xpath("//a[contains(text(),'Dulces ')]");
		flanesGelatinas = By.xpath("//a[contains(text(),'Flanes y ge')]");
		leche = By.xpath("(//a[contains(text(),'Leche')])[1]");
		organicos = By.xpath("(//a[contains(text(),'Or')])[1]");
		gourmet = By.xpath("(//a[contains(text(),'Go')])[2]");
		comidaOriental = By.xpath("(//a[contains(text(),'Comi')])[1]");
		
		
		vinosLicores = By.xpath("(//button[@class='bg-transparent border-0 d-flex w-100 align-items-center font-primary--medium position-relative nav__cat-item'])[2]");
		cerveza = By.xpath("//a[contains(text(),'Cerv')]");
		vinos = By.xpath("//a[contains(text(),'Vinos')]");
		destiladoLicores = By.xpath("//a[contains(text(),'Destilado')]");
		
		
		electronica = By.xpath("(//button[@class='bg-transparent border-0 d-flex w-100 align-items-center font-primary--medium position-relative nav__cat-item'])[3]");
		tvVideo = By.xpath("//a[contains(text(),'Tv ')]");
		audio = By.xpath("(//a[contains(text(),'Audio')])[1]");
		instrumentosMusicales = By.xpath("//a[contains(text(),'Instrumentos m')]");
		drones = By.xpath("//a[contains(text(),'Dro')]");
		hogalInteligente = By.xpath("//a[contains(text(),'Hoga')]");
		videoJuegos = By.xpath("//a[contains(text(),'Video')]");
		equipsComputo = By.xpath("//a[contains(text(),'Equipos de c')]");
		apple = By.xpath("//a[contains(text(),'Appl')]");
		impresion = By.xpath("//a[contains(text(),'Impresión')]");
		software = By.xpath("(//a[contains(text(),'Software')])[1]");
		redes = By.xpath("//a[contains(text(),'Redes')]");
		accesoriosComputadora = By.xpath("//a[contains(text(),'Accesorios para comp')]");
		disporitivosAlmecenamiento = By.xpath("//a[contains(text(),'Dispo')]");
		smathWatch = By.xpath("//a[contains(text(),'Smart')]");
		telefonosCelulares = By.xpath("//a[contains(text(),'Teléfonos ce')]");
		telefonosInalambricos = By.xpath("//a[contains(text(),'Teléfonos in')]");
		telefonosAlambricos = By.xpath("//a[contains(text(),'Teléfonos al')]");
		accesoriosTelefonia = By.xpath("//a[contains(text(),'Accesorios de tele')]");
		camara = By.xpath("(//a[contains(text(),'Cámaras')])[1]");
		
		bebes = By.xpath("(//button[@class='bg-transparent border-0 d-flex w-100 align-items-center font-primary--medium position-relative nav__cat-item'])[4]");
		accesoriosBebe = By.xpath("//a[contains(text(),'Accesorios de beb')]");
	    nutricionInfantil = By.xpath("//a[contains(text(),'Nutrición')]");
	    pañalesToallitas = By.xpath("//a[contains(text(),'Pañales y ')]");
		perfumeEhigieneDeBebes = By.xpath("//a[contains(text(),'Perfumeria')]");
		
		farmacia = By.xpath("(//button[@class='bg-transparent border-0 d-flex w-100 align-items-center font-primary--medium position-relative nav__cat-item collapsed'])[5]");
		nebulizadores = By.xpath("//a[contains(text(),'Nebu')]");
		masajeadores = By.xpath("//a[contains(text(),'Masa')]");
		diabeticos = By.xpath("//a[contains(text(),'Diab')]");
		ortopedicos = By.xpath("//a[contains(text(),'Ortop')]");
		materialMedico = By.xpath("//a[contains(text(),'Material m')]");
		antocoagulantes = By.xpath("//a[contains(text(),'Anticoag')]");
		cardiovasculares = By.xpath("//a[contains(text(),'Cardio')]");
		incontinencia = By.xpath("//a[contains(text(),'Incon')]");
		analgesicos = By.xpath("//a[contains(text(),'Analg')]");
		Respiratorios = By.xpath("//a[contains(text(),'Resp')]");
		gastrointestinales = By.xpath("//a[contains(text(),'Gastro')]");
		dermatologicos = By.xpath("//a[contains(text(),'Derma')]");
		vitaminasSuplementos = By.xpath("//a[contains(text(),'Vitaminas')]");
		medicamentos = By.xpath("(//a[contains(text(),'Medicamentos')])[1]");
		medicamentoGenerico = By.xpath("//a[contains(text(),'Medicamento g')]");
		naturistaHerbolarios = By.xpath("//a[contains(text(),'Naturis')]");
		medicamentoInfantilies = By.xpath("(//a[contains(text(),'Medicamentos')])[2]");
		saludSexual = By.xpath("//a[contains(text(),'Salud se')]");
		saludFemenina = By.xpath("//a[contains(text(),'Salud F')]");
		cuidadoLabiosBoca = By.xpath("//a[contains(text(),'Cuidado de labios')]");
		oftalmicosOticos = By.xpath("//a[contains(text(),'Oft')]");
		cuidadoCapilar = By.xpath("//a[contains(text(),'Cuidado ca')]");
		cuidadoPies = By.xpath("//a[contains(text(),'Cuidado de los')]");
		materialCuracion = By.xpath("//a[contains(text(),'Material de')]");
		monitoresSalud = By.xpath("//a[contains(text(),'Monitores de salud')]");
		suerosOrales = By.xpath("//a[contains(text(),'Sueros o')]");
		
		hogarElectrodomesticos = By.xpath("(//button[@class='bg-transparent border-0 d-flex w-100 align-items-center font-primary--medium position-relative nav__cat-item collapsed'])[6]");
		lineaBlanca = By.xpath("//a[contains(text(),'Línea')]");
		climatizacion = By.xpath("//a[contains(text(),'Clim')]");
		enseresCocina = By.xpath("//a[contains(text(),'Enseres de C')]");
		enseresHogar = By.xpath("//a[contains(text(),'Enseres del')]");
		muebles = By.xpath("(//a[contains(text(),'Muebles')])[1]");
		colchones = By.xpath("(//a[contains(text(),'Colchones')])[1]");
		blancos = By.xpath("(//a[contains(text(),'Blancos')])[2]");
		cocina = By.xpath("(//a[contains(text(),'Cocina')])[2]");
		mesa = By.xpath("(//a[contains(text(),'Mesa')])[2]");
		organizacionHogar = By.xpath("//a[contains(text(),'Organi')]");
		decoracion = By.xpath("(//a[contains(text(),'Decoración')])[1]");
		iluminacionDecorativa = By.xpath("(//a[contains(text(),'Ilu')])[1]");
		baño = By.xpath("(//a[contains(text(),'Baño')])[2]");
		jardin = By.xpath("(//a[contains(text(),'Jardín')])[1]");
		asadores = By.xpath("(//a[contains(text(),'Asad')])[1]");
		fiesta = By.xpath("(//a[contains(text(),'Fiesta')])[1]");
		temporadas = By.xpath("(//a[contains(text(),'Tempora')])[2]");
		equipaje = By.xpath("(//a[contains(text(),'Equip')])[2]");
		merceria = By.xpath("(//a[contains(text(),'Mercería')])[1]");
		papeleria = By.xpath("(//a[contains(text(),'Papel')])[1]");
		productosConCausa = By.xpath("(//a[contains(text(),'Produ')])[1]");
		
		limpiezaHogar = By.xpath("(//button[@class='bg-transparent border-0 d-flex w-100 align-items-center font-primary--medium position-relative nav__cat-item collapsed'])[7]");
		limpiadores = By.xpath("(//a[contains(text(),'Limpiadores')])[2]");
		productosParaElHogar = By.xpath("//a[contains(text(),'Productos de papel')]");
		productosDesechablesParaElHogar = By.xpath("//a[contains(text(),'Productos dese')]");
		jarcieria = By.xpath("//a[contains(text(),'Jarci')]");
		aromatizantes = By.xpath("(//a[contains(text(),'Aromatizantes')])[1]");
		
		mascotas = By.xpath("(//button[@class='bg-transparent border-0 d-flex w-100 align-items-center font-primary--medium position-relative nav__cat-item collapsed'])[8]");
		perros = By.xpath("//a[contains(text(),'Perro')]");
		gatos = By.xpath("//a[contains(text(),'Gatos')]");
		aves  = By.xpath("//a[contains(text(),'Aves')]");
		pecesTortugas= By.xpath("//a[contains(text(),'Peces')]");
		otrasMascotas = By.xpath("//a[contains(text(),'Otras')]");
		
		deportesMotos = By.xpath("(//button[@class='bg-transparent border-0 d-flex w-100 align-items-center font-primary--medium position-relative nav__cat-item collapsed'])[9]");
		fitness = By.xpath("//a[contains(text(),'Fitn')]");
		basquetbol = By.xpath("//a[contains(text(),'Basqu')]");
		soccer = By.xpath("//a[contains(text(),'Socc')]");
		ciclismo = By.xpath("//a[contains(text(),'Ciclism')]");
		deportesAcuaticos = By.xpath("//a[contains(text(),'Deportes ac')]");
		campismo = By.xpath("//a[contains(text(),'Campis')]");
		motos = By.xpath("//a[contains(text(),'Motos')]");
		deportesCorrer = By.xpath("//a[contains(text(),'Deportes co')]");
		
		alimentosCongeladosRefrigerados = By.xpath("(//button[@class='bg-transparent border-0 d-flex w-100 align-items-center font-primary--medium position-relative nav__cat-item collapsed'])[10]");
		frutasVErdurasCongeladas = By.xpath("//a[contains(text(),'Frutas y ')]");
		heladosPaletasPostres = By.xpath("//a[contains(text(),'Helados, ')]");
		alimentosCongelados = By.xpath("//a[contains(text(),'Alimentos congelados')]");
		alimentosRefrigerados = By.xpath("//a[contains(text(),'Alimentos refr')]");
		hielo = By.xpath("//a[contains(text(),'Hielo')]");
		
		
		autosFerreteria = By.xpath("(//button[@class='bg-transparent border-0 d-flex w-100 align-items-center font-primary--medium position-relative nav__cat-item collapsed'])[11]");
		autos = By.xpath("//a[contains(text(),'Autos')]");
		ferreteria = By.xpath("//a[contains(text(),'Ferreter')]");
		plomeria = By.xpath("//a[contains(text(),'Plome')]");
		pintura = By.xpath("(//a[contains(text(),'Pintura')])[1]");
		herramientas = By.xpath("(//a[contains(text(),'Herramientas')])[3]");
		cajasOrganizadores = By.xpath("//a[contains(text(),'Cajas y or')]");
		iluminaion = By.xpath("(//a[contains(text(),'Iluminación')])[3]");
		electricidad = By.xpath("//a[contains(text(),'Electricidad')]");
		seguridad = By.xpath("//a[contains(text(),'Seguridad')]");
		
		carnesPescadosMariscos = By.xpath("(//button[@class='bg-transparent border-0 d-flex w-100 align-items-center font-primary--medium position-relative nav__cat-item collapsed'])[12]");
		PolloPavo = By.xpath("//a[contains(text(),'Pollo y p')]");
		ResTernera= By.xpath("//a[contains(text(),'Res y')]");
		cerdo= By.xpath("(//a[contains(text(),'Cerdo')])[1]");
		prescadosMariscos= By.xpath("(//a[contains(text(),'Pescados y ')])[3]");
		especialidades= By.xpath("(//a[contains(text(),'Especialidades')])[1]");
		
		cuidadoPersoalBelleza = By.xpath("(//button[@class='bg-transparent border-0 d-flex w-100 align-items-center font-primary--medium position-relative nav__cat-item collapsed'])[13]");
		cuidadoCabello = By.xpath("//a[contains(text(),'Cuidado del ')]");
		cremasFaciales= By.xpath("//a[contains(text(),'Cremas faciales y')]");
		cremaCorporales= By.xpath("//a[contains(text(),'Cremas corpo')]");
		cuidadoBucal= By.xpath("//a[contains(text(),'Cuidado b')]");
		jabones= By.xpath("//a[contains(text(),'Jabones')]");
		antibacteriales= By.xpath("//a[contains(text(),'Antibacteriales')]");
		talcosDesororantes= By.xpath("//a[contains(text(),'Talcos y ')]");
		afeitadoDepilacion= By.xpath("(//a[contains(text(),'Afeitado y depilación')])[1]");
		proteccionSolar= By.xpath("(//a[contains(text(),'Protección ')])[2]");
		cuidadoParaPies= By.xpath("//a[contains(text(),'Cuidado para pi')]");
		cuidadoFemenino= By.xpath("//a[contains(text(),'Cuidado fem')]");
		cuidadoManos= By.xpath("//a[contains(text(),'Cuidado para man')]");
		accesoriosCuidadoPersonal= By.xpath("//a[contains(text(),'Accesorios de cuidado ')]");
		electricosBelleza= By.xpath("//a[contains(text(),'Eléctricos de belleza')]");
		maquillaje= By.xpath("(//a[contains(text(),'Maquillaje')])[1]");
		
		frutasVerdudas  = By.xpath("(//button[@class='bg-transparent border-0 d-flex w-100 align-items-center font-primary--medium position-relative nav__cat-item collapsed'])[14]");
		verduras = By.xpath("(//a[contains(text(),'Verduras')])[2]");
		frutas  = By.xpath("(//a[contains(text(),'Frutas')])[4]");
		Organicos  = By.xpath("(//a[contains(text(),'Orgánicos')])[2]");
		frutosSecos  = By.xpath("(//a[contains(text(),'Frutos secos')])[1]");
		
		jugosBebidas = By.xpath("(//button[@class='bg-transparent border-0 d-flex w-100 align-items-center font-primary--medium position-relative nav__cat-item collapsed'])[15]");
		Agua = By.xpath("(//a[contains(text(),'Agua')])[2]");
		jugos = By.xpath("(//a[contains(text(),'Jugos')])[3]");
		refrescos = By.xpath("(//a[contains(text(),'Refresco')])[1]");
		energetizantes = By.xpath("(//a[contains(text(),'Energ')])[1]");
		bebidasCafeTe = By.xpath("(//a[contains(text(),'Bebidas')])[1]");
		
		juguetes = By.xpath("(//button[@class='bg-transparent border-0 d-flex w-100 align-items-center font-primary--medium position-relative nav__cat-item collapsed'])[16]");
		juguetesTodasEdades = By.xpath("(//a[contains(text(),'Juguetes para')])[4]");
		diverdionFueraCasa = By.xpath("(//a[contains(text(),'Diversión fuera')])[1]");
		ponAjugarSuImaginacion = By.xpath("(//a[contains(text(),'Pon')])[1]");
		disney = By.xpath("(//a[contains(text(),'Disne')])[1]");
		marcasJuguetes = By.xpath("(//a[contains(text(),'Marcas ')])[1]");
		
		lacteosHuevo  = By.xpath("(//button[@class='bg-transparent border-0 d-flex w-100 align-items-center font-primary--medium position-relative nav__cat-item collapsed'])[17]");
		Leche = By.xpath("(//a[contains(text(),'Leche')])[5]");
	    yoghurts = By.xpath("(//a[contains(text(),'Yoghurts')])[1]");
		huevo = By.xpath("(//a[contains(text(),'Huevo')])[1]");
		mantequillaMargarina = By.xpath("(//a[contains(text(),'Mantequilla')])[1]");
		cremasJocoques = By.xpath("(//a[contains(text(),'Cremas y ')])[1]");
		gelatinasPostres = By.xpath("(//a[contains(text(),'Gelatinas ')])[1]");
		
		modaAcesorios = By.xpath("(//button[@class='bg-transparent border-0 d-flex w-100 align-items-center font-primary--medium position-relative nav__cat-item collapsed'])[18]");
		fragancias = By.xpath("(//a[contains(text(),'Fragancias')])[1]");
		lentes = By.xpath("(//a[contains(text(),'Lentes')])[1]");
		relojes = By.xpath("(//a[contains(text(),'Relojes')])[3]");
		Joyeria = By.xpath("//a[contains(text(),'Joyería')]");
		gorras = By.xpath("(//a[contains(text(),'Gorras')])[2]");
		zapatos = By.xpath("(//a[contains(text(),'Zapatos')])[1]");
		accesoriosDama = By.xpath("(//a[contains(text(),'Accesorios para d')])[1]");
		accesoriosCaballero = By.xpath("(//a[contains(text(),'Accesorios para cab')])[1]");
		ropaDama = By.xpath("(//a[contains(text(),'Ropa para da')])[1]");
		ropaCaballero = By.xpath("(//a[contains(text(),'Ropa para caball')])[1]");
		ropaNiño = By.xpath("(//a[contains(text(),'Ropa para n')])[1]");
		ropaNiña = By.xpath("(//a[contains(text(),'Ropa para n')])[2]");
		ropaBebe = By.xpath("(//a[contains(text(),'Ropa de bebé')])[1]");
		ropaInterior = By.xpath("(//a[contains(text(),'Ropa interior')])[7]");
		
		panaderiaTortilleriaAlimentos = By.xpath("(//button[@class='bg-transparent border-0 d-flex w-100 align-items-center font-primary--medium position-relative nav__cat-item collapsed'])[19]");
		tortilleria = By.xpath("//a[contains(text(),'Tortillería')]");
		panaderia = By.xpath("//a[contains(text(),'Panad')]");
		pasrelesReposteria = By.xpath("//a[contains(text(),'Pasteles y')]");
		alimentosPreparados = By.xpath("//a[contains(text(),'Alimentos pre')]");
		
		quesoSalchichasDeli = By.xpath("(//button[@class='bg-transparent border-0 d-flex w-100 align-items-center font-primary--medium position-relative nav__cat-item collapsed'])[20]");
		quesos = By.xpath("//a[contains(text(),'Quesos')]");
		salchichoneria = By.xpath("//a[contains(text(),'Salchichon')]");
		Gourmet = By.xpath("(//a[contains(text(),'Gourmet')])[2]");
		
		home = By.xpath("//a[@class='common-header__brand-logo']");
	}

	public void ValidarCategoriaDespensa () {
		driver.findElement(txtDepartamentos).click();
		driver.findElement(txtDespensa).click();
		driver.findElement(txtCremasSopas_y_pures).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(txtDespensa).click();
		driver.findElement(txtAzycares_y_endulzantes).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(txtDespensa).click();
		driver.findElement(txtAderezosSalsasYVinages).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(txtDespensa).click();
		driver.findElement(AlimentosEnlatados).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(txtDespensa).click();
		driver.findElement(aceitesYmantecas).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(txtDespensa).click();
		driver.findElement(CerealesBarrasAvenas).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(txtDespensa).click();
		driver.findElement(MermeladasMiel).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(txtDespensa).click();
		driver.findElement(cafeTeChocolate).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(txtDespensa).click();
		JavascriptExecutor jse = ((JavascriptExecutor)driver); 
		WebElement menu = driver.findElement(By.xpath("//ul[@class='list-unstyled m-0 nav__submenu-content position-absolute has-custom-scrollbar nav__cat--level2 js-cat-level2 collapse show']"));
		jse.executeScript("arguments[0].scrollBy(0,300);",menu); 
		driver.findElement(panesPastelillos).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(txtDespensa).click();	
		WebElement menu1 = driver.findElement(By.xpath("//ul[@class='list-unstyled m-0 nav__submenu-content position-absolute has-custom-scrollbar nav__cat--level2 js-cat-level2 collapse show']"));
		jse.executeScript("arguments[0].scrollBy(0,300);",menu1); 
		driver.findElement(arrozFrijoSemillas).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(txtDespensa).click();
		WebElement menu2 = driver.findElement(By.xpath("//ul[@class='list-unstyled m-0 nav__submenu-content position-absolute has-custom-scrollbar nav__cat--level2 js-cat-level2 collapse show']"));
		jse.executeScript("arguments[0].scrollBy(0,300);",menu2); 
		driver.findElement(especiasSazonadores).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(txtDespensa).click();
		WebElement menu3 = driver.findElement(By.xpath("//ul[@class='list-unstyled m-0 nav__submenu-content position-absolute has-custom-scrollbar nav__cat--level2 js-cat-level2 collapse show']"));
		jse.executeScript("arguments[0].scrollBy(0,300);",menu3); 
		driver.findElement(harinasReposteria).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(txtDespensa).click();
		WebElement menu4 = driver.findElement(By.xpath("//ul[@class='list-unstyled m-0 nav__submenu-content position-absolute has-custom-scrollbar nav__cat--level2 js-cat-level2 collapse show']"));
		jse.executeScript("arguments[0].scrollBy(0,300);",menu4); 
		driver.findElement(botanaTostadas).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(txtDespensa).click();
		WebElement menu5 = driver.findElement(By.xpath("//ul[@class='list-unstyled m-0 nav__submenu-content position-absolute has-custom-scrollbar nav__cat--level2 js-cat-level2 collapse show']"));
		jse.executeScript("arguments[0].scrollBy(0,400);",menu5); 
		driver.findElement(Galletas).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(txtDespensa).click();
		WebElement menu6 = driver.findElement(By.xpath("//ul[@class='list-unstyled m-0 nav__submenu-content position-absolute has-custom-scrollbar nav__cat--level2 js-cat-level2 collapse show']"));
		jse.executeScript("arguments[0].scrollBy(0,400);",menu6); 
		driver.findElement(dulcesChocolates).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(txtDespensa).click();
		WebElement menu7 = driver.findElement(By.xpath("//ul[@class='list-unstyled m-0 nav__submenu-content position-absolute has-custom-scrollbar nav__cat--level2 js-cat-level2 collapse show']"));
		jse.executeScript("arguments[0].scrollBy(0,400);",menu7); 
		driver.findElement(flanesGelatinas).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(txtDespensa).click();
		WebElement menu8 = driver.findElement(By.xpath("//ul[@class='list-unstyled m-0 nav__submenu-content position-absolute has-custom-scrollbar nav__cat--level2 js-cat-level2 collapse show']"));
		jse.executeScript("arguments[0].scrollBy(0,400);",menu8); 
		driver.findElement(leche).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(txtDespensa).click();
		WebElement menu9 = driver.findElement(By.xpath("//ul[@class='list-unstyled m-0 nav__submenu-content position-absolute has-custom-scrollbar nav__cat--level2 js-cat-level2 collapse show']"));
		jse.executeScript("arguments[0].scrollBy(0,400);",menu9); 
		driver.findElement(organicos).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(txtDespensa).click();
		WebElement menu10 = driver.findElement(By.xpath("//ul[@class='list-unstyled m-0 nav__submenu-content position-absolute has-custom-scrollbar nav__cat--level2 js-cat-level2 collapse show']"));
		jse.executeScript("arguments[0].scrollBy(0,400);",menu10); 
		driver.findElement(gourmet).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(txtDespensa).click();
		WebElement menu11 = driver.findElement(By.xpath("//ul[@class='list-unstyled m-0 nav__submenu-content position-absolute has-custom-scrollbar nav__cat--level2 js-cat-level2 collapse show']"));
		jse.executeScript("arguments[0].scrollBy(0,600);",menu11);
		driver.findElement(comidaOriental).click();
		validacionDespensa();
	}
	
	public void ValidarCategoriaVinosLicoresCervezas() {
		driver.findElement(txtDepartamentos).click();
		driver.findElement(vinosLicores).click();
		driver.findElement(cerveza).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(vinosLicores).click();
		driver.findElement(vinos).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(vinosLicores).click();
		driver.findElement(destiladoLicores).click();
		validacionDespensa();
	}
	
	public void ValidarCategoriaElectronica() {
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(electronica).click();
		driver.findElement(tvVideo).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(electronica).click();
		driver.findElement(audio).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(electronica).click();
		driver.findElement(instrumentosMusicales).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(electronica).click();
		driver.findElement(drones).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(electronica).click();
		driver.findElement(hogalInteligente).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(electronica).click();
		driver.findElement(videoJuegos).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(electronica).click();
		driver.findElement(equipsComputo).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(electronica).click();
		driver.findElement(apple).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(electronica).click();
		driver.findElement(impresion).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(electronica).click();
		driver.findElement(software).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(electronica).click();
		driver.findElement(redes).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(electronica).click();
		driver.findElement(accesoriosComputadora).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(electronica).click();
		driver.findElement(disporitivosAlmecenamiento).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(electronica).click();
		driver.findElement(smathWatch).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(electronica).click();
		driver.findElement(telefonosCelulares).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(electronica).click();
		driver.findElement(telefonosInalambricos).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(electronica).click();
		driver.findElement(telefonosAlambricos).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(electronica).click();
		driver.findElement(accesoriosTelefonia).click();
		validacionDespensa();
		driver.findElement(home).click();
		driver.findElement(txtDepartamentos).click();
		driver.findElement(electronica).click();
		driver.findElement(camara).click();
		validacionDespensa();
	}
	
	
	public void validacionDespensa() {

		
		List<WebElement> span = driver.findElements(By.xpath("//span[@class='font-primary--bold  product-price']"));		
		    double precio;
			String  strPriceText = "2.00";
			precio = Double.parseDouble(strPriceText);
		
			
		/*	int contador=0;
			while (contador <5) {
				if(precio >=2){
					System.out.println("contador=" + contador);
					try{
						Thread.sleep(8000);
						}
						catch(InterruptedException ie){
						}	
					JavascriptExecutor js = ((JavascriptExecutor) driver); js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
					contador++;
				}
			}
			*/
			
			for ( int contador = 0; contador <19 ; contador ++) {
				if (precio >=2.00) {
					System.out.println("contador=" + contador);
					try{
						Thread.sleep(4000);
						}
						catch(InterruptedException ie){
						}	
					JavascriptExecutor js = ((JavascriptExecutor) driver); js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
					}
                   if (precio <=1.99) {
                	   System.out.println("precios incorrectos");
                   }
				} 			
			}
	}
	

