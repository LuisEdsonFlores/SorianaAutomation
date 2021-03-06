package pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class PageConfirmacionOrden {
	
	private WebDriver driver;

	
	private By GraciasPorTuCompra;
	
	
	public PageConfirmacionOrden (WebDriver driver) {
        this.driver = driver;
        
		GraciasPorTuCompra = By.xpath("//div[@class='d-flex justify-content-center font-size-20 font-size-lg-32 mb-5 font-primary--semi-bold']");

	}
	
	public void ConfirmacionDeOrden() throws IOException {
		try{
			Thread.sleep(6000);
			}
			catch(InterruptedException ie){
			}	
		
		TakesScreenshot miScreen = ((TakesScreenshot)driver);
		File destinoArchivo = new File ("..\\Soriana\\CapturasDePantalla\\screen.png");
		File archivo = miScreen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(archivo, destinoArchivo);

		String actualTitle = driver.getTitle();
		String expectedTitle = "Confirmación de pedido | Soriana";
		if(driver.findElements(GraciasPorTuCompra).size()!=0){
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("la orden se finco correctamente");
		}
		else {
			System.out.println("la orden NO se finco correctamente");

		}
	}
	
	
}
