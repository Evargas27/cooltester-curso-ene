package com.opensource.qa;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import poc.Admin;
import base.Base;
import poc.Login;

public class AdminPOM {
	/*
	 * Objects instances
	 */

	WebDriver driver;
	Base base;
	Login login;
	Admin admin;
	String username, password, msgNoRecords, userNotExist, employeeName, newUser, newPassword, confpassword, status, value, invalidPass, msgInvalidPass;
	String jsonCredentials = "Credentials";
	String jsonAdminTestData = "AdminTestData";

	@BeforeTest
	public void beforeTest() throws FileNotFoundException {
		base = new Base(driver);
		driver = base.chromeDriverSetup();
		login = new Login(driver);
		admin = new Admin(driver);

		// Test Data
		username = base.getJSONData(jsonCredentials, "username");
		password = base.getJSONData(jsonCredentials, "password");
		userNotExist = base.getJSONData(jsonAdminTestData, "userNotExist");
		msgNoRecords = base.getJSONData(jsonAdminTestData, "msgNoRecords");
		employeeName = base.getJSONData(jsonAdminTestData, "employeeName");
		newUser = base.getJSONData(jsonAdminTestData, "newUser");
		newPassword = base.getJSONData(jsonAdminTestData, "newPassword");
		confpassword = base.getJSONData(jsonAdminTestData, "confPassword");
		value = base.getJSONData(jsonAdminTestData, "value");
		status = base.getJSONData(jsonAdminTestData, "status");
		invalidPass = base.getJSONData(jsonCredentials, "invalidPass");
		msgInvalidPass = base.getJSONData(jsonCredentials, "msgInvalidPass");
	}

	@Test
	public void tc001AdminSearchEmployeePOM() {

		// STEP 1, 2, 3
		login.loginOrange(username, password);

		// STEP 4, 5, 6
		admin.searchUser(username);

		// STEP 7
		admin.validateUsernameTable(username);

		// STEP 8, 9
		login.logOut();
	}

	@Test
	public void tc003AdminAddNewUserPOM() {
	
		// STEP 1, 2, 3
		login.loginOrange(username, password);

		// STEP 4, 5, 6, 7, 8, 9, 10
		admin.addUser(employeeName, newUser, newPassword, confpassword);
				
		// STEP 11, 12
		admin.searchUserAdd(newUser);

		// STEP 13
		admin.validateUsernameTable(newUser);

		// STEP 14, 15
		login.logOut();
	}
	
	@Test
	public void tc005AdminCreateUserDisabledPOM() {
	
		// STEP 1, 2, 3
		login.loginOrange(username, password);

		// STEP 4, 5, 6, 7, 8, 9, 10
		admin.addUser(employeeName, newUser, newPassword, confpassword, value);
				
		// STEP 11, 12
		admin.searchUserAdd(newUser);

		// STEP 13
		admin.validateStatus(status);

		// STEP 14, 15
		login.logOut();
	}	
	
	@Test
	public void tc007ValidateInvalidPassword() {
		
		// STEP 1, 2, 3, 4
		login.loginOrange(username, invalidPass, msgInvalidPass);
	}	
	
	@AfterTest
	public void afterTest() {
	}

}
