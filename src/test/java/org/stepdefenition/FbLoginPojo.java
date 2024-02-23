package org.stepdefenition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FbLoginPojo {
	public FbLoginPojo() {
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(xpath = "//input[@aria-label='Password']")
	private WebElement password;
	
	@FindBy(name = "login")
	private WebElement loginBtn;

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void setLoginBtn(WebElement loginBtn) {
		this.loginBtn = loginBtn;
	}

}
