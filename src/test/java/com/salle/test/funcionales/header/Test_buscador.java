package com.salle.test.funcionales.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.salle.Steps.Steps_buscador;
import com.salle.pantallas.Pantalla_Home;

public class Test_buscador {
	
	public WebDriver driver = new ChromeDriver();
	public Steps_buscador sb = new Steps_buscador(driver);
	public Pantalla_Home ph = new Pantalla_Home(driver);
	
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
		  sb.Despliega_buscador(driver);
		  sb.Escriu_buscador_wrong(driver);
		  
	  }
	  
	  @Test(priority = 1)
	  public void Test_positivo() {
		  sb.Despliega_buscador(driver);
		  sb.Escriu_buscador(driver);
		 
	  }
	  
	
}
