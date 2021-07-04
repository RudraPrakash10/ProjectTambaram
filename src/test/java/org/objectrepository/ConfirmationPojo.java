package org.objectrepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class ConfirmationPojo extends BaseClass {

	public ConfirmationPojo() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "search_hotel")
	private List<WebElement> searchhotel;

	@FindBy(id = "logout")
	private List<WebElement> logout;

	public List<WebElement> getLogout() {
		return logout;
	}

	public List<WebElement> getSearchhotel() {
		return searchhotel;

	}

}
