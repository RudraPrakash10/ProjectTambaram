package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="@src\\test\\resources\\Failed\\failedscenario.txt",glue="org.stepdefinition",monochrome=true,dryRun=false,
snippets= SnippetType.UNDERSCORE,tags= {"@Hotelfunctionality"})

public class TestReRunner {
	
	

}
