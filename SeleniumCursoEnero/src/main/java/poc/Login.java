package poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base;
import base.GlobalVariables;

public class Login extends Base {

	public Login(WebDriver driver) {
		super(driver);
	}

	/*
	 * Objects
	 */
	private By txtUsername = By.id("txtUsername");
	private By txtPassword = By.id("txtPassword");
	private By btnLogin = By.id("btnLogin");
	private By lnkWelcome = By.xpath("//a[@id='welcome']");
	private By lnkLogout = By.xpath("//a[contains(@href, 'logout')]");
	private By lblInvalidCredentials = By.id("spanMessage");

	/*
	 * Customize methods
	 */
	public void loginOrange(String username, String password) {
		reporterLog("Login into Orange HRM Portal");
		launchBrowser(GlobalVariables.QA_URL);
		type(txtUsername, username);
		type(txtPassword, password);
		click(btnLogin);
		waitForElementPresent(lnkWelcome);
	}

	public void logOut() {
		reporterLog("Log Out of Orange");
		click(lnkWelcome);
		click(lnkLogout);
		implicitWait();
		closeBrowser();

	}
	
	public void loginOrange(String username, String password, String msgInvalidCredentials) {
		reporterLog("Login into Orange HRM Portal");
		launchBrowser(GlobalVariables.QA_URL);
		type(txtUsername, username);
		type(txtPassword, password);
		click(btnLogin);
		implicitWait();
		
		String msgActual = getText(lblInvalidCredentials);
		assertEquals(msgActual, msgInvalidCredentials);
	}
	
}