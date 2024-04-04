package org.stepdefenition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signInPojo extends BaseClass {
  public void signInpojo() {
	  PageFactory.initElements(driver, this);
  }
  @FindBy(xpath = "//a[text()='Create new account']")
  private WebElement createNewAcc;
	
  @FindBy(xpath = "(//input[@type='text'])[2]")
  private WebElement firstNametextbox;
  
  @FindBy(name = "lastname")
  private WebElement SecondNametextbox;
  
  @FindBy(name = "reg_email__")
  private WebElement mobileoremailtextbox;
  
  @FindBy(name = "reg_passwd__")
  private WebElement newpassword;

public WebElement getCreateNewAcc() {
	return createNewAcc;
}

public WebElement getFirstNametextbox() {
	return firstNametextbox;
}

public WebElement getLastNametextbox() {
	return SecondNametextbox;
}

public WebElement getMobileoremailtextbox() {
	return mobileoremailtextbox;
}

public WebElement getNewpassword() {
	return newpassword;
}
  
}

