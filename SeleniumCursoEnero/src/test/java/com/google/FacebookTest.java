package com.google;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class FacebookTest {

	public static WebDriver driver;

	@BeforeTest
	public void beforeTest() {
	}

	@Test
	public void facebookTest1() {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://es-la.facebook.com/");
		driver.manage().window().maximize();

		Assert.assertEquals(driver.getTitle(), "Facebook - Inicia sesión o regístrate");
		
		System.out.println("Prueba superada");
	}
	
	@Test
	public void facebookTest2() {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://es-la.facebook.com/");
		driver.manage().window().maximize();

		Assert.assertEquals(driver.getCurrentUrl(), "https://es-la.facebook.com/");
		
		System.out.println("Prueba superada URL");
	}
	
	@Test
	public void facebookTest3() {

//		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
//		driver = new ChromeDriver();
//
//		driver.get("https://es-la.facebook.com/");
//		driver.manage().window().maximize();

//		1- Text box para ingresar el correo electrónico. --> //*[@id="email"]
//		2- Text box para ingresar la contraseña. --> //*[@id="pass"]
//		3- Botón iniciar sesión. --> //button[@name="login"]
//		4- Botón "¿Olvidaste tu contraseña?". --> //*[contains(@href,'recover')]
//		5- Label "Crea una página para una celebridad, una marca o un negocio.". --> //*[contains(@href,'registration')]
		
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}
}