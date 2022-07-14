package impresion;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.messages.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;

public class utilizafile {

	generaEvidencias generaEvidencias;
	
	public void PasoDelScript(String descripcionPaso, WebDriver driver) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, HeadlessException, AWTException {
		generaEvidencias.OpenFile(1, descripcionPaso);
		generaEvidencias.screenshoot(driver);
	}
	
	public void InicializaFile() throws HeadlessException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, AWTException {
		generaEvidencias.defineVariables();
	}
	public void GeneraEvidencia(String NombreArchivo) throws InterruptedException, InvalidFormatException, IOException, HeadlessException, AWTException {
		// TODO Auto-generated constructor stub
		generaEvidencias.CloseFile(NombreArchivo);

		}

}
