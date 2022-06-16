package impresion;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.apache.poi.xwpf.model.XWPFHeaderFooterPolicy;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText;

import io.cucumber.messages.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;

public class generaEvidencias {

	static XWPFDocument doc;
	static XWPFParagraph title;
	static XWPFRun run;
	
	public static void defineVariables () throws IOException, HeadlessException, AWTException, InvalidFormatException {
		doc = new XWPFDocument();
		title = doc.createParagraph();
		run = title.createRun();
		
		CTSectPr sectPr = doc.getDocument().getBody().addNewSectPr();
		XWPFHeaderFooterPolicy policy = new XWPFHeaderFooterPolicy(doc, sectPr);

        
		CTP ctpHeader = CTP.Factory.newInstance();
		CTR ctrHeader = ctpHeader.addNewR();/*
		CTText ctHeader = ctrHeader.addNewR();*/
		String autor = "Cucumber";
		String datos = "Reporte de evidencias de ejecución de pruebas automatizadas";
		String version = "V1.0";
		String headerText = autor +"||" + datos +"||" +version;
 		
		
		
		}
	
	
}
