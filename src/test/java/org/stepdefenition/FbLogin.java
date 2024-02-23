package org.stepdefenition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbLogin extends BaseClass {
	FbLoginPojo f;
	@Given("To launch the chrome browser and maximise the window")
	public void to_launch_the_chrome_browser_and_maximise_the_window() {
		launchBrowser();
		windowMaximize();

	}

	@When("To launch the url of facebook application")
	public void to_launch_the_url_of_facebook_application() {
		launchUrl("https://en-gb.facebook.com/");

	}

	@When("To pass valid username in email filed")
	public void to_pass_valid_username_in_email_filed() {
		WebElement mail = driver.findElement(By.name("email"));
		mail.sendKeys("seleniuminmakes@gmail.com");
	}

	@When("To pass invalid password in password filed")
	public void to_pass_invalid_password_in_password_filed() {
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("");

	}

	@When("To click login button")
	public void to_click_login_button() {
		WebElement log = driver.findElement(By.name("login"));
		log.click();

	}

	@When("To check whether navigate to homepage or not")
	public void to_check_whether_navigate_to_homepage_or_not() {
		System.out.println("To check your login credentials");

	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		closeEntireBrowser();

	}

}
