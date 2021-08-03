package com.orangehrm_hybridframework.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//object repository
	//page layer
	
	@FindBy(name = "txtUsername")
	WebElement text_user;
	
	@FindBy(name = "txtPassword")
	WebElement text_pass;
	
	@FindBy(id = "btnLogin")
	WebElement loginBtn;
	
	WebDriver driver;
	
	//init all WebElement on Login Page
	
	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public void setUsername(String username) {
		text_user.clear();
		text_user.sendKeys(username);
	}
	
	public void setPassword(String password) {
		text_pass.clear();
		text_pass.sendKeys(password);
	}
	
	public DashboardPage clickOnLoginBtn() {
		loginBtn.click();
		return new DashboardPage(driver);
	}

}
