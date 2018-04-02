package com.salle.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.salle.pantallas.Pantalla_Home;

public class Steps_buscador {
	
	public WebDriver driver;
	public Pantalla_Home ph;
	Actions actions = new Actions(driver);
	
	public Steps_buscador(WebDriver driver) {
		this.driver = driver;
		ph  = new Pantalla_Home(driver);
	
	}
	
	public void Despliega_buscador(WebDriver driver) {
		try {
			ph.getbuscador().click();
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("edit-search-block-form--2")));	
		}catch(Exception e) {
			System.out.println("Error al clicar en buscador");
		}
	}
	
	public void Escriu_buscador(WebDriver driver) {
		try {
			driver.findElement(By.id("edit-search-block-form--2")).click();
			//actions.moveToElement();
			driver.findElement(By.id("search-block-form")).sendKeys("chipirones");
			driver.findElement(By.id("edit-submit--2")).click();
		}catch(Exception e) {
			System.out.println("Error al escriure en el buscador");
			System.out.println(e);
		}
	}
	
}
