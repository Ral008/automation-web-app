package com.pe.automation.definition;

import com.pe.automation.steps.GoogleSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GoogleDefinition {
	
	@Steps
	GoogleSteps googleSteps;
	
	@Given("^la pagina de google$")
	public void la_pagina_de_google() {
		googleSteps.openPage();
	}

	@When("^vamos al menu de Google Apps$")
	public void vamos_al_menu_de_Google_Apps() {
		googleSteps.accederAlMenuDeGoogleApps();
	}

	@When("^seleccionamos Drive$")
	public void seleccionamos_Drive() throws InterruptedException {
		googleSteps.accederAlDrive();
	}

	@When("^accedemos a la cuenta de google con usuario \"([^\"]*)\"$")
	public void accedemos_a_la_cuenta_de_google_con_usuario(String email) {
		googleSteps.ingresarEmail(email);
	}

	@When("^clave \"([^\"]*)\"$")
	public void clave(String password) throws InterruptedException {
		googleSteps.ingresarPassword(password);
		Thread.sleep(8000);
	}

	@Then("^creamos un documento equivalente al de Microsoft Word$")
	public void creamos_un_documento_equivalente_al_de_Microsoft_Word() {
		googleSteps.crearDocumento();
	}

	@Then("^nombramos el documento con \"([^\"]*)\"$")
	public void nombramos_el_documento_con(String fileName) {
		googleSteps.colocarNombreAlDocumento(fileName);
	}

}
