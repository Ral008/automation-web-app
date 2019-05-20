package com.pe.automation.pageobject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com/")
public class HomePage extends PageObject {
	
	@FindBy(xpath="//a[@class='gb_x gb_Ub']")
	public WebElementFacade menuGoogleApps;
	
	@FindBy(xpath="//a[@id='gb49']//span[@class='gb_k']")
	public WebElementFacade linkDrive;
	
	@FindBy(xpath="//h1[contains(text(),'Todos tus archivos estés')]//following-sibling::a[text()='Ir a Google Drive']")
	public WebElementFacade goGoogleDrive;
	
	@FindBy(id="identifierId")
	public WebElementFacade txtMail;
	
	@FindBy(xpath="//span[@class='RveJvd snByac' and text()='Siguiente']")
	public WebElementFacade btnNext;
	
	@FindBy(name="password")
	public WebElementFacade txtPassword;
	
	private static Logger LOGGER = LoggerFactory.getLogger(HomePage.class);
	
	public void seleccionarMenuGoogleApps() {
		menuGoogleApps.click();
	}
	
	public void seleccionarLinkDrive() {
		linkDrive.click();
	}
	
	public void irAGoogleDrive() {
		goGoogleDrive.click();
	}
	
	public void ingresarEmail(String email) {
		txtMail.type(email);
	}
	
	public void realizarPasoNext() {
		btnNext.click();
	}
	
	public void ingresarPassword(String password) {
		txtPassword.type(password);
	}
	
	public void crearDocumento() {
		LOGGER.info("new file");
	}
	
	public void colocarNombreAlDocumento(String name) {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		LOGGER.info(name+" "+dateFormat.format(date));	
	}

}
