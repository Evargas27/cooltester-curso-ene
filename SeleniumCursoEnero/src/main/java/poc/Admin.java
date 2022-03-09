package poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.Base;

public class Admin extends Base{

	public Admin(WebDriver driver) {
		super(driver);
	}
	
	/*
	 * Objects
	 */
	
	private By lnkAdminHeader = By.xpath("//a[@id='menu_admin_viewAdminModule']");
	private By txtUsername = By.id("searchSystemUser_userName");
	private By btnSearch = By.id("searchBtn");
	private By tblUsername = By.xpath("//tbody/tr[1]/td[2]");
	
	//Objects Add
	private By btnAdd = By.id("btnAdd");
	private By txtEmployeeName = By.id("systemUser_employeeName_empName");
	private By txtNewUser = By.id("systemUser_userName");
	private By sddUserStatus = By.id("systemUser_status");
	private By txtPassword = By.id("systemUser_password");
	private By txtConfPassword = By.id("systemUser_confirmPassword");
	private By btnSave = By.id("btnSave");
	private By tblUserStatus = By.xpath("//tbody/tr[1]/td[5]");

	/*
	 * Customize methods
	 */
	public void searchUser(String username) {
		reporterLog("Searching username..."+username);
		click(lnkAdminHeader);
		type(txtUsername, username);
		click(btnSearch);
		implicitWait();	
	}
	
	public void validateUsernameTable(String expectedUser) {
		reporterLog("Validate username "+expectedUser);
		String actualUsername = getText(tblUsername);
		Assert.assertEquals(actualUsername, expectedUser);
	}

	public void addUser(String employeeName, String newUser, String newPassword, String confPassword) {
		reporterLog("Add user");
		click(lnkAdminHeader);
		implicitWait();
		click(btnAdd);
		implicitWait();
		type(txtEmployeeName, employeeName);
		type(txtNewUser, newUser);
		type(txtPassword, newPassword);
		type(txtConfPassword, confPassword);
		hardWait();
		click(btnSave);
	}
	
	public void addUser(String employeeName, String newUser, String newPassword, String confPassword, String value) {
		reporterLog("Add user");
		click(lnkAdminHeader);
		click(btnAdd);
		implicitWait();
		type(txtEmployeeName, employeeName);
		type(txtNewUser, newUser);
		select(sddUserStatus, value);
		type(txtPassword, newPassword);
		type(txtConfPassword, confPassword);
		click(btnSave);
	}	
	
	public void searchUserAdd(String newUser) {
		reporterLog("Searching username..."+newUser);
		type(txtUsername, newUser);
		click(btnSearch);
		implicitWait();	
	}
	
	public void validateStatus(String expectedStatus) {
		reporterLog("Verify username is Disabled Status in table");		
		String actualStatus = getText(tblUserStatus);
		Assert.assertEquals(actualStatus, expectedStatus);
	}
}
