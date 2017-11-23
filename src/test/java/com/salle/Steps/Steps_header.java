package com.salle.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.salle.pantallas.Pantalla_Home;
import com.salle.pantallas.Pantalla_Nuevos_Alumnos;

public class Steps_header {
	public WebDriver driver;
	public Pantalla_Home ph;
	public Pantalla_Nuevos_Alumnos phn;
	
	public Steps_header(WebDriver driver) {
		this.driver = driver;
		ph  = new Pantalla_Home(driver);
		phn = new Pantalla_Nuevos_Alumnos(driver);
	}
		
	public void Step1_Entra_Nuevos_Alumnos(WebDriver driver) {
		
		try {
			
			System.out.println("=====================================");
			System.out.println("STEP 1: Entra pantalla Nuevos Alumnos");
			
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(ph.getHeader_LogoSalle()));
			
			ph.getHeader_NuevosAlumnos().click();
			
			wait.until(ExpectedConditions.elementToBeClickable(phn.get_Nuevos_Alumnos_cabecera()));
			System.out.println("TEST_STEP 1 Resultado = OK");
			
		}catch(Exception e) {
			System.out.println("TEST_STEP 1 Resultado = KO");
			System.out.println(e);
		}
	}
	
}
