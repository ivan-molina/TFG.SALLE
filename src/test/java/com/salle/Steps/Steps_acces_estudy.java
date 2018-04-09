package com.salle.Steps;

import org.openqa.selenium.WebDriver;

import com.salle.pantallas.Pantalla_Alumnos;
import com.salle.pantallas.Pantalla_Empresas;
import com.salle.pantallas.Pantalla_Home;
import com.salle.pantallas.Pantalla_Nuevos_Alumnos;
import com.salle.pantallas.Pantalla_Universidades;
import com.salle.tools.Esenciales;

public class Steps_acces_estudy {
	public WebDriver driver;
	public Pantalla_Home ph;
	public Pantalla_Nuevos_Alumnos phn;
	public Esenciales esen = new Esenciales();
	public Pantalla_Alumnos a;
	public Pantalla_Empresas pe;
	public Pantalla_Universidades pu;
	
	public Steps_acces_estudy(WebDriver driver) {
		this.driver = driver;
		ph  = new Pantalla_Home(driver);
		a = new Pantalla_Alumnos(driver);
		
	}
	
	public void Entra_Alumnos(WebDriver driver) {
			
		try {	
			
			ph.getHeader_Alumnos().click();				
			//Guardamos el handle del driver de la pantalla principal
			String originalWindowHandle = driver.getWindowHandle();
			esen.cambiaPestaña(driver);
			
		}catch(Exception e) {
			System.out.println("TEST_STEP 2 Resultado = KO");
			System.out.println(e);
		}
			
		//Verificamos el handle posicionado en la nueva pestaña
		esen.ValidaUrl(driver, "https://estudy.salle.url.edu/?lang=es");
	}
	
	public void clickenacceso(WebDriver driver) {
		
		a.get_Pantalla_Alumnos_Acceso().submit();
		
		
	}
		
}
