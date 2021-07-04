package org.objectrepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class HotelConfirmPojo extends BaseClass {

	public HotelConfirmPojo() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private List<WebElement> radio;

	@FindBy(id = "continue")
	private List<WebElement> Continue;

	public List<WebElement> getRadio() {
		return radio;
	}

	public List<WebElement> getContinue() {
		return Continue;
	}

	
	
}
