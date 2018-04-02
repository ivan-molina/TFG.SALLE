package com.salle.test.funcionales.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.salle.Steps.Steps_header;
import com.salle.pantallas.Pantalla_Home;

public class Test_buscador {
	
	public WebDriver driver = new ChromeDriver();
	public Pantalla_Home ph = new Pantalla_Home(driver);
	private Steps_header sh = new Steps_header(driver);
	
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
		  
		  
		  
	  }
	  @Test(priority = 1)
	  public void Test_positivo() {
		  
	  }
	  
	
}
