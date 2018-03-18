package com.salle.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.salle.pantallas.Pantalla_Alumnos;
import com.salle.pantallas.Pantalla_Empresas;
import com.salle.pantallas.Pantalla_Home;
import com.salle.pantallas.Pantalla_Nuevos_Alumnos;
import com.salle.pantallas.Pantalla_Universidades;
import com.salle.tools.Esenciales;

public class Steps_header {
	public WebDriver driver;
	public Pantalla_Home ph;
	public Pantalla_Nuevos_Alumnos phn;
	public Esenciales esen = new Esenciales();
	public Pantalla_Alumnos a;
	public Pantalla_Empresas pe;
	public Pantalla_Universidades pu;
	
	public Steps_header(WebDriver driver) {
		this.driver = driver;
		ph  = new Pantalla_Home(driver);
		phn = new Pantalla_Nuevos_Alumnos(driver);
		a = new Pantalla_Alumnos(driver);
		pe = new Pantalla_Empresas(driver);
		pu = new Pantalla_Universidades(driver);
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
	
	public void Step2_Entra_Alumnos(WebDriver driver) {
		
		try {
			
			System.out.println("=====================================");
			System.out.println("STEP 2: Entra pantalla Alumnos");
			
			ph.getHeader_Alumnos().click();
						
			//Guardamos el handle del driver de la pantalla principal
			String originalWindowHandle = driver.getWindowHandle();
			esen.cambiaPestaña(driver);

			//Verificamos el handle posicionado en la nueva pestaña
			esen.ValidaUrl(driver, "https://estudy.salle.url.edu/?lang=es");

			//Volvemos a la Pestaña principal de la prueba (HOME)
			driver.switchTo().window(originalWindowHandle);
			
			System.out.println("TEST_STEP 2 Resultado = OK");
			
		}catch(Exception e) {
			System.out.println("TEST_STEP 2 Resultado = KO");
			System.out.println(e);
		}
	}
	
	public void Step3_Entra_Alumni(WebDriver driver) {
		
		try {
			
			System.out.println("=====================================");
			System.out.println("STEP 3: Entra pantalla Alumni");
			
			ph.getHeader_Alumni().click();
						
			//Guardamos el handle del driver de la pantalla principal
			String originalWindowHandle = driver.getWindowHandle();
			esen.cambiaPestaña(driver);

			//Verificamos el handle posicionado en la nueva pestaña
			esen.ValidaUrl(driver, "http://alumni.salleurl.edu/");

			//Volvemos a la Pestaña principal de la prueba (HOME)
			driver.switchTo().window(originalWindowHandle);
			
			System.out.println("TEST_STEP 3 Resultado = OK");
			
		}catch(Exception e) {
			System.out.println("TEST_STEP 3 Resultado = KO");
			System.out.println(e);
		}
		
	}
	
	public void Step4_Entra_Empresas(WebDriver driver) {
		
		try {
			
			WebDriverWait wait = new WebDriverWait(driver, 10);
			
			System.out.println("=====================================");
			System.out.println("STEP 4: Entra pantalla Empresas");
			
			ph.getHeader_Empresas().click();
			
			wait.until(ExpectedConditions.elementToBeClickable(pe.get_Alumni_cabecera()));
			System.out.println("TEST_STEP 4 Resultado = OK");
			
		}catch(Exception e) {
			System.out.println("TEST_STEP 4 Resultado = KO");
			System.out.println(e);
		}
	}
	
	public void Step5_Entra_Universidades(WebDriver driver) {
		
		try {
			
			WebDriverWait wait = new WebDriverWait(driver, 10);
			
			System.out.println("=====================================");
			System.out.println("STEP 5: Entra pantalla Universidades");
			
			ph.getHeader_Empresas().click();
			
			wait.until(ExpectedConditions.elementToBeClickable(pu.get_Universidades_cabecera()));
			System.out.println("TEST_STEP 5 Resultado = OK");
			
		}catch(Exception e) {
			System.out.println("TEST_STEP 5 Resultado = KO");
			System.out.println(e);
		}
	}
	
	public void Step6_Entra_Escuelas(WebDriver driver) {
		
		try {
			
			WebDriverWait wait = new WebDriverWait(driver, 10);
			
			System.out.println("=====================================");
			System.out.println("STEP 6: Entra pantalla Escuelas");
			
			ph.getHeader_Escuela().click();
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]/div[1]/div/div/aside/section/div/div[1]/div/ul/li")));
			System.out.println("TEST_STEP 6 Resultado = OK");
			
		}catch(Exception e) {
			System.out.println("TEST_STEP 6 Resultado = KO");
			System.out.println(e);
		}
	}
	
}
