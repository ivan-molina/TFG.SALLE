package com.salle.test.funcionales.estudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.salle.Steps.Steps_acces_estudy;
import com.salle.pantallas.Pantalla_Home;

public class Test_acces {
	public WebDriver driver = new ChromeDriver();
	public Pantalla_Home ph = new Pantalla_Home(driver);
	public Steps_acces_estudy sae = new Steps_acces_estudy(driver);
	
	 @BeforeClass
	  public void beforeClass() {
		  ph.getSalleUrl(driver);
	  }
	
	  @AfterClass
	  public void afterClass() {
		  driver.quit();
	  }
	  
	  @Test(priority = 0)
	  public void Test_negativo() {
		 sae.Entra_Alumnos(driver);
		 sae.clickenacceso(driver);
		  
	  }
	  
	  @Test(priority = 1)
	  public void Test_positivo() {
		  
		 
	  }
}
