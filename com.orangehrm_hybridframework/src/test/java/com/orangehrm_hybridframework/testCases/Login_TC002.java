package com.orangehrm_hybridframework.testCases;

import org.testng.annotations.Test;

import com.orangehrm_hybridframework.pageObject.LoginPage;
import com.orangehrm_hybridframework.testBase.TestBase;

public class Login_TC002 extends TestBase{
	
	@Test
	public void login_TC002() {
		LoginPage login= new LoginPage(driver);
		
		//this is for sheet name= Sheet1 
//		String uname = excelDataProvider.getStringCellData("Sheet1", 1, 0);
//		String upass = excelDataProvider.getStringCellData("Sheet1", 1, 1);
//		login.setUsername(uname);
//		login.setPassword(upass);
//		login.clickOnLoginBtn();
		
		//this is for sheet index
		login.setUsername(excelDataProvider.getStringCellData(0, 1, 0));
		login.setPassword(excelDataProvider.getStringCellData(0, 1, 1));
		login.clickOnLoginBtn();
	}	
}
