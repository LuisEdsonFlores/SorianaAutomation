package pages;

import org.openqa.selenium.WebDriver;

public class PageCerrarNavegador {
	private WebDriver driver;

	public PageCerrarNavegador (WebDriver driver) {
		this.driver = driver;
	}
	
	public void cerrarNavegador () {
    driver.quit();
	}

}
