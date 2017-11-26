package com.salle.test.funcionales.header;

import org.testng.annotations.Test;

import com.salle.Steps.Steps_header;
import com.salle.pantallas.Pantalla_Home;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class Test_HeaderTest {
	public WebDriver driver = new ChromeDriver();
	public Pantalla_Home ph = new Pantalla_Home(driver);
	private Steps_header sh = new Steps_header(driver);
	
	
	  @BeforeClass
	  public void beforeClass() {
		  ph.getSalleUrl(driver);
	  }
	
	  @AfterClass(alwaysRun = true)
	  public void afterClass() {
		  driver.quit();
	  }
	  
	  @Test
	  public void Header_Accesos() {
		  sh.Step1_Entra_Nuevos_Alumnos(driver);
		  sh.Step2_Entra_Alumnos(driver);
		  sh.Step3_Entra_Alumni(driver);
		  sh.Step4_Entra_Empresas(driver);
		  sh.Step5_Entra_Universidades(driver);

	  }

}
