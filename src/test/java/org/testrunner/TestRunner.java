package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilities.JvmReport;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature Files",glue="org.stepdefinition",monochrome=true,dryRun=false,
snippets= SnippetType.UNDERSCORE,tags= {"@Hotelfunctionality"},
plugin= {"pretty",
		"html:src\\test\\resources\\Reports",
		"json:src\\test\\resources\\Reports\\output.json",
		"junit:src\\test\\resources\\Reports\\adactin.xml",
		"rerun:src\\test\\resources\\Failed\\failedscenario.txt"})

public class TestRunner {

	@AfterClass
	public static void jvmReportGeneration() {
		
		JvmReport.generateJvmReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\output.json");
	
	}
}
