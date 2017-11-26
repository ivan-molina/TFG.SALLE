package com.salle.pantallas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pantalla_Alumnos {
	
	public WebDriver driver; 
	
	//************************************************************************
	//Creamos nuestro Factory con todos los elementos que usaremos en la HOME*
	//************************************************************************
	
	@FindBy(id = "yui_3_17_2_1_1511708693449_147")
	private WebElement xpath_Pantalla_Alumnos_Titulo_Menu;
	
	//*****************************************************************************
	//Instanciamos el constructor de la clase junto con el constructor del Factory*
	//*****************************************************************************
		
	public Pantalla_Alumnos(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement get_Alumnos_cabecera() {
		return xpath_Pantalla_Alumnos_Titulo_Menu;
	}
	
}
