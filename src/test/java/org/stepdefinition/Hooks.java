package org.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.utilities.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{
	
	@Before
	public void beforeScenario() {
		
		System.out.println("Scenario Starts...");
	
	}	
	
	@After
	public void afterScenario(Scenario S) throws IOException {
		
		if(S.isFailed()) {
			TakesScreenshot ts=(TakesScreenshot)driver;
			byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
			S.embed(screenshot, "image/png");
		}
		
	 String Str = S.getName();
	 String name = Str.replaceAll(" ", "_");
	 takeSnap(name);
	 System.out.println("Sceanrio ends...");

	}
	
}

