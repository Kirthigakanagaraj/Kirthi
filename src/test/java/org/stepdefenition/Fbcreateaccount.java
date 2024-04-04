package org.stepdefenition;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.*;
public class Fbcreateaccount extends BaseClass{
	signInPojo s;
	@Given("To launch the browser and maximise the window")
	public void to_launch_the_browser_and_maximise_the_window() {
	    launchBrowser();
	    windowMaximize();
	}

	@When("To launch url of fb application")
	public void to_launch_url_of_fb_application() {
	    launchUrl("https://www.facebook.com/");
	}
    @When("To click the creat new button button")
	public void to_click_the_creat_new_button_button() {
		WebElement account = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		account.click();

	}
    @When("To pass firstname in firstname text box")
	public void to_pass_firstname_in_firstname_text_box(DataTable d) throws InterruptedException {
		Thread.sleep(3000);
		List<String> l = d.asList();
		 s = new signInPojo();
		    passText(l.get(2), s.getFirstNametextbox());

	}
    @When("To pass second name in second text box")
	public void to_pass_second_name_in_second_text_box() {
		s = new signInPojo();
	    passText("jay",s.getLastNametextbox());

	}

	@When("To pass mobileno or email in email text box")
	public void to_pass_mobileno_or_email_in_email_text_box(DataTable d) {
		List<List<String>> l = d.asLists();
		s = new signInPojo();
		passText(l.get(1).get(2),s.getMobileoremailtextbox());

	}

	@When("To create new password using new password text box")
	public void to_create_new_password_using_new_password_text_box() {
		s = new signInPojo();
		passText("keerthu",s.getNewpassword());
	}

	@Then("to close the edge browser")
	public void to_close_the_edge_browser() {
	   closeEntireBrowser();
	}


}
