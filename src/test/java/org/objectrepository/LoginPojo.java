package org.objectrepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class LoginPojo extends BaseClass {

	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private List<WebElement> user;
	
	@FindBy(id = "password")
	private List<WebElement> pass;
	
	@FindBy(id = "login")
	private List<WebElement> log;

	public List<WebElement> getUser() {
		return user;
	}

	public List<WebElement> getPass() {
		return pass;
	}

	public List<WebElement> getLog() {
		return log;
	}
	
}
