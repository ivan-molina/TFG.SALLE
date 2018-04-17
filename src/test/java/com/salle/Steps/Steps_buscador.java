package com.salle.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.salle.pantallas.Pantalla_Home;

public class Steps_buscador {
	
	public WebDriver driver;
	public Pantalla_Home ph;
	
	public Steps_buscador(WebDriver driver) {
		this.driver = driver;
		ph  = new Pantalla_Home(driver);
	
	}
	
	public void Despliega_buscador(WebDriver driver) {
		try {
			ph.getbuscador().click();
			
		}catch(Exception e) {
			System.out.println("Error al clicar en buscador");
		}
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("edit-search-block-form--2")));	
	}
	
	public void Escriu_buscador(WebDriver driver) {
		try {
			driver.findElement(By.id("edit-search-block-form--2")).click();
			driver.findElement(By.xpath("//*[@id=\"edit-search-block-form--2\"]")).sendKeys("David Vernet");
			driver.findElement(By.id("edit-submit--3")).click();
				
		}catch(Exception e) {
			System.out.println("Error al escriure en el buscador");
			System.out.println(e);
		}
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[5]/div[1]/div/div/section/div/div[2]/div[3]/div/div/ol/li[2]/h3/a")));	
	}
	
	public void Escriu_buscador_wrong(WebDriver driver) {
		try {
			driver.findElement(By.id("edit-search-block-form--2")).click();
			driver.findElement(By.xpath("//*[@id=\"edit-search-block-form--2\"]")).sendKeys("Chipirones");
			driver.findElement(By.id("edit-submit--2")).click();
				
		}catch(Exception e) {
			System.out.println("Error al escriure en el buscador");
			System.out.println(e);
		}
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[5]/div[1]/div/div/section/div/div[2]/div[3]/div/div/ol/li[2]/h3/a")));	
		driver.findElements(By.tagName("Chipirones"));	
	}
	
}
