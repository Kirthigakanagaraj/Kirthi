package org.stepdefenition;

import cucumber.api.java.Before;
import cucumber.api.java.After;

public class HooksClass extends BaseClass {
	@Before(order = 1)
	//precondition
	private void precondition1() {
		launchBrowser();
		System.out.println("launch the browser");
}
	@Before(order = 2)
	private void precondition3() {
		windowMaximize();
		System.out.println("max the window");
	}
	@Before(order = 3, value = "@tag2")
	private void precondition2() {
		System.out.println("precondition3");
		
	}
	@After(order = 2,value = "@tag2")
	//postcondition
	private void postcondition4() {
		System.out.println("Take screen shot of scenarios");

	}
	@After(order = 1)
	//postcondition
	private void postcondition3() {
		closeEntireBrowser();
		System.out.println("close entire browser");

}
}
