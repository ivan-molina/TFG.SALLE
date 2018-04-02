package com.salle.test.funcionales.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.salle.Steps.Steps_buscador;
import com.salle.Steps.Steps_header;
import com.salle.pantallas.Pantalla_Home;

public class Test_buscador {
	
	public WebDriver driver = new ChromeDriver();
	public Steps_buscador sb = new Steps_buscador(driver);
	public Pantalla_Home ph = new Pantalla_Home(driver);
	
	 @BeforeTest
	  public void beforeClass() {
		  ph.getSalleUrl(driver);
	  }
	
	  @AfterTest(alwaysRun = true)
	  public void afterClass() {
		  driver.quit();
	  }
	  
	  @Test(priority = 0)
	  public void Test_negativo() {
		  sb.Despliega_buscador(driver);
		  sb.Escriu_buscador(driver);
	  }
	  @Test(priority = 1)
	  public void Test_positivo() {
		  
	  }
	  
	
}
