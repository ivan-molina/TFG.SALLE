package com.salle.pantallas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pantalla_Nuevos_Alumnos {
	
	private String url = "http://www.salleurl.edu/es";
	public WebDriver driver; 
	
	//************************************************************************
	//Creamos nuestro Factory con todos los elementos que usaremos en la HOME*
	//************************************************************************
	
	@FindBy(xpath = "/html/body/div[5]/div[1]/div/div/aside/section/div/div[1]/div/ul/li")
	private WebElement xpath_Pantalla_NuevosAlumnos_Titulo_Menu;
	
	//*****************************************************************************
	//Instanciamos el constructor de la clase junto con el constructor del Factory*
	//*****************************************************************************
		
	public Pantalla_Nuevos_Alumnos(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement get_Nuevos_Alumnos_cabecera() {
		return xpath_Pantalla_NuevosAlumnos_Titulo_Menu;
	}
}
