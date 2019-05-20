package com.pe.automation.steps;

import com.pe.automation.pageobject.HomePage;

import net.thucydides.core.annotations.Step;

public class GoogleSteps {
	
	HomePage homePage;
	
	@Step
	public void openPage() {
		homePage.open();		
	}
	
	@Step
	public void accederAlMenuDeGoogleApps() {
		homePage.seleccionarMenuGoogleApps();		
	}
	
	@Step
	public void accederAlDrive() throws InterruptedException {
		Thread.sleep(5000);
		homePage.seleccionarLinkDrive();
		Thread.sleep(5000);
		homePage.irAGoogleDrive();
	}
	
	@Step
	public void ingresarEmail(String email) {
		homePage.ingresarEmail(email);
		homePage.realizarPasoNext();
	}
	
	@Step
	public void ingresarPassword(String password) {
		homePage.ingresarPassword(password);
		homePage.realizarPasoNext();
	}
	
	@Step
	public void crearDocumento() {
		homePage.crearDocumento();
	}
	
	@Step
	public void colocarNombreAlDocumento(String name) {
		homePage.colocarNombreAlDocumento(name);
	}
	

}
