package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fbnewacnt extends BaseClass {
	FbsigninPojo s;

	@When("User has to open the facebook application Url")
	public void user_has_to_open_the_facebook_application_Url() {
		launchBrowser();
		windowMaximize();
		launchUrl("https://en-gb.facebook.com/");
	}
	
	@When("User has to click the Create new account button")
	public void user_has_to_click_the_Create_new_account_button() {
		WebElement createAcnt = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		createAcnt.click();
	}
	{try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}


	@When("User has to fill the priyasri field")
	public void userHasToFillThePriyasriField() {
		s = new FbsigninPojo();
		passText("asdsfg", s.getFirstName());
	}

	@When("User has to fill the sumo field")
	public void userHasToFillTheSumoField() {
		s = new FbsigninPojo();
		passText("sur", s.getSurName());
	}

	@When("User has to fill the oops@gmail.com field")
	public void user_has_to_fill_the_oops_gmail_com_field() {
		s = new FbsigninPojo();
		passText("em", s.getMoboremail());
	}

	@When("User has to fill the gfgfgf field")
	public void user_has_to_fill_the_gf_field() {
		s = new FbsigninPojo();
		passText("pwd", s.getPasswrd());
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		//closeEntireBrowser();

	}

}