package com.salle.pantallas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pantalla_Alumni {

	public WebDriver driver; 
	
	//************************************************************************
	//Creamos nuestro Factory con todos los elementos que usaremos en la HOME*
	//************************************************************************
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[1]/div/div/div/div/ul/li[3]/a")
	private WebElement xpath_Pantalla_Alumni_Titulo_Menu;
	
	//*****************************************************************************
	//Instanciamos el constructor de la clase junto con el constructor del Factory*
	//*****************************************************************************
		
	public Pantalla_Alumni(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement get_Alumni_cabecera() {
		return xpath_Pantalla_Alumni_Titulo_Menu;
	}
	
	
}
