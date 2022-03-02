package com.opensource.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Admin {

	// Instancias de objeto
	private String username;
	private String password;
	private String userNoExist;
	private String msgUserNoExist;
	private String user;
	private String newUser;
	private String newPass;

	@BeforeTest
	public void beforeTest() {

		// Test Data
		username = "Admin";
		password = "admin123";
		userNoExist = "XYZ";
		msgUserNoExist = "No Records Found";
		user = "Admin A";
		newUser = "Tefis1987";
		newPass = "Tefis22$%&";
	}

	@AfterTest
	public void afterTest() {
	}

	@Test
	public void tc001AdminSearchEmployee() {

		// Step 1
		Reporter.log("Open Browser \"OrangeHRM\" web page");
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		// Step 2
		Reporter.log("Enter Username, Password and click Login");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();

		// Step 3
		Reporter.log("Validate that you have logged in successfully");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));

		// Step 4
		Reporter.log("Click Admin - Go to the admin page");
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 5
		Reporter.log("Search username in field \"Username\"");
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(username);

		// Step 6
		Reporter.log("Click Search");
		driver.findElement(By.id("searchBtn")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Seleccionar un campo obligatorio

		// Step 7
		Reporter.log("Verify username exist in table");
		String actualValue = driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
		Assert.assertEquals(actualValue, username);

		// Step 8
		Reporter.log("Log out");
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'logout')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 9
		Reporter.log("Close Browser");
		driver.close();
	}

	@Test
	public void tc002AdminSearchEmployeeNotExist() {

		// Step 1
		Reporter.log("Open Browser \"OrangeHRM\" web page");
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		// Step 2
		Reporter.log("Enter Username, Password and click Login");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();

		// Step 3
		Reporter.log("Validate that you have logged in successfully");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));

		// Step 4
		Reporter.log("Click Admin - Go to the admin page");
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 5, 6 y 7
		findUser(driver, userNoExist);		
		
		// Step 8
		Reporter.log("Log out");
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'logout')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 9
		Reporter.log("Close Browser");
		driver.close();		
	}

	private void findUser(WebDriver driver, String userNoExist) {
		// Step 5
		Reporter.log("Search username in field \"Username\"");
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(userNoExist);
		
		// Step 6
		Reporter.log("Click Search");
		driver.findElement(By.id("searchBtn")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// Step 7
		Reporter.log("Verify username is not exist in table");
		
		// AssertEquals
		String msgTable = driver.findElement(By.xpath("//tbody/tr")).getText();
		Assert.assertEquals(msgTable,msgUserNoExist);
	}
	
	@Test
	public void tc003AdminAddNewUser() {

		// Step 1
		Reporter.log("Open Browser \"OrangeHRM\" web page");
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		// Step 2
		Reporter.log("Enter Username, Password and click Login");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();

		// Step 3
		Reporter.log("Validate that you have logged in successfully");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));

		// Step 4
		Reporter.log("Click Admin - Go to the admin page");
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 5
		Reporter.log("Click Add");
		driver.findElement(By.id("btnAdd")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// Step 6
		Reporter.log("Enter valid Employee Name");
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(user);
		
		// Step 7
		Reporter.log("Enter valid username");
		driver.findElement(By.id("systemUser_userName")).sendKeys(newUser);
		
		// Step 8
		Reporter.log("Enter new password");
		driver.findElement(By.id("systemUser_password")).sendKeys(newPass);
		
		// Step 9
		Reporter.log("Enter confirm password");
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(newPass);
		pause();
		
		// Step 10
		Reporter.log("Click Save");
		driver.findElement(By.id("btnSave")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//SIN ESTE WAIT FALLA
	
		// Step 11
		Reporter.log("Search username in field \"Username\"");
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(newUser);
	
		// Step 12
		Reporter.log("Click Search");
		driver.findElement(By.id("searchBtn")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 13
		Reporter.log("Verify username exist in table");
		String actualValue = driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
		Assert.assertEquals(actualValue, newUser);

		// Step 14
		Reporter.log("Log out");
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'logout')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 15
		Reporter.log("Close Browser");
		driver.close();
	}

	private void pause() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void tc004AdminDeleteUser() {

		// Precondición: Create New User
		tc003AdminAddNewUser();
		
		// Step 1
		Reporter.log("Open Browser \"OrangeHRM\" web page");
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		// Step 2
		Reporter.log("Enter Username, Password and click Login");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();

		// Step 3
		Reporter.log("Validate that you have logged in successfully");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));

		// Step 4
		Reporter.log("Click Admin - Go to the admin page");
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 5
		Reporter.log("Search username in field \"Username\"");
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(newUser);

		// Step 6
		Reporter.log("Click Search");
		driver.findElement(By.id("searchBtn")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 7
		Reporter.log("Verify username exist in table");
		String actualValue = driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
		Assert.assertEquals(actualValue, newUser);
		
		// Step 8
		Reporter.log("Select User");
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]")).click();
		
		// Step 9
		Reporter.log("Click Delete");
		driver.findElement(By.id("btnDelete")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// Step 10
		Reporter.log("Validate pop-window is displayed: \"Delete Records?\"");
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("deleteConfModal")));
		
		// Step 11
		Reporter.log("Click Ok to confirm delete user");
		driver.findElement(By.id("dialogDeleteBtn")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// Step 12
		Reporter.log("Validate in table that user was delete successfully");
		findUser(driver, newUser);		

		// Step 13
		Reporter.log("Log out");
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'logout')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// Step 14
		Reporter.log("Close Browser");
		driver.close();
	}
}