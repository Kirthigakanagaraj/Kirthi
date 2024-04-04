package org.stepdefenition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Icicbankpage extends BaseClass{
	@Given("To launch the edge browser and maximize the window")
	public void to_launch_the_edge_browser_and_maximize_the_window() {
	   launchBrowser();
	   windowMaximize();
	}

	@When("To launch the Url of the mynthra application")
	public void to_launch_the_Url_of_the_mynthra_application() {
	    launchUrl("https://www.icicibank.com/");
	}
	@When("To click the login button")
	public void to_click_the_login_button() {
		WebElement login = driver.findElement(By.xpath("//span[text()='Login']"));
		login.click();
	    }

	@When("To check wether it navigate to the homepage or not")
	public void to_check_wether_it_navigate_to_the_homepage_or_not() {
	    System.out.println("To check your login credentials");
	}
	@Then("To close the browser")
	public void to_close_the_browser() {
	    //closeEntireBrowser();
	}


}


