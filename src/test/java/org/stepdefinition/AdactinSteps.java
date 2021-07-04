package org.stepdefinition;

import org.junit.Assert;
import org.objectrepository.BookHotelPojo;
import org.objectrepository.ConfirmationPojo;
import org.objectrepository.HotelConfirmPojo;
import org.objectrepository.LoginPojo;
import org.objectrepository.SearchHotelPojo;
import org.utilities.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdactinSteps extends BaseClass {

	@Given("User is in Adactin page")
	public void user_is_in_Adactin_page() {

		launchBrowser();
		maximizeWindow();
		loadUrl("https://adactin.com/HotelApp/");
	
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String userName, String password) {

		LoginPojo l = new LoginPojo();

		type(l.getUser().get(0), userName);
		type(l.getPass().get(0), password);

	}

	@When("User clicks login button")
	public void user_clicks_login_button() {

		LoginPojo l = new LoginPojo();
		btnClick(l.getLog().get(0));

	}

	@Then("User verify sucess message")
	public void user_verify_sucess_message() {

		System.out.println("Successfully login");
	}

	@When("User Select {string}and{string}and{string}and{string}and{string}and{string}")
	public void user_Select_and_and_and_and_and(String location, String hotel, String roomtype, String numberofrooms,
			String adultsperroom, String childperroom) {

		SearchHotelPojo l2 = new SearchHotelPojo();

		selectByVisibleText(l2.getLocation().get(0), location);
		selectByVisibleText(l2.getHotels().get(0), hotel);
		selectByVisibleText(l2.getRoomtype().get(0), roomtype);
		selectByVisibleText(l2.getRooms().get(0), numberofrooms);
		selectByVisibleText(l2.getAdult_room().get(0), adultsperroom);
		selectByVisibleText(l2.getChild_room().get(0), childperroom);

	}

	@When("User click search button")
	public void user_click_search_button() throws InterruptedException {

		SearchHotelPojo l2 = new SearchHotelPojo();

		btnClick(l2.getSubmit().get(0));
		Thread.sleep(3000);

	}

	@When("User select the hotel")
	public void user_select_the_hotel() {

		HotelConfirmPojo l3 = new HotelConfirmPojo();

		btnClick(l3.getRadio().get(0));
	}

	@When("User click the continue button")
	public void user_click_the_continue_button() throws InterruptedException {

		HotelConfirmPojo l3 = new HotelConfirmPojo();

		btnClick(l3.getContinue().get(0));
		Thread.sleep(3000);

	}

	@When("User enter {string}and{string}and{string}and{string}and{string}and{string}and{string}and{string}")
	public void user_enter_and_and_and_and_and_and_and(String firstName, String lastName, String billingAddress,
			String creditCardNo, String creditCardType, String expiryMonth, String expiryYear, String cvvNumber) {

		BookHotelPojo l4 = new BookHotelPojo();
		
		type(l4.getFname().get(0), firstName);
		type(l4.getLname().get(0), lastName);
		type(l4.getAddress().get(0), billingAddress);
		type(l4.getCcnum().get(0), creditCardNo);
		selectByVisibleText(l4.getCardtype().get(0), creditCardType);
		selectByVisibleText(l4.getMonth().get(0), expiryMonth);
		selectByVisibleText(l4.getYear().get(0), expiryYear);
		type(l4.getCvv().get(0), cvvNumber);

	}

	@When("User click booknow button")
	public void user_click_booknow_button() throws InterruptedException {
		
		BookHotelPojo l4 = new BookHotelPojo();
		
		btnClick(l4.getBook().get(0)); 
		Thread.sleep(10000);
		
	}

	@When("User is in bokoking confirmation page")
	public void user_is_in_bokoking_confirmation_page() {

	String url = driver.getCurrentUrl();
	Assert.assertTrue("User is in confirm page", url.contains("BookingConfirm"));
	
	} 

	@Then("User clicks logout button")
	public void user_clicks_logout_button() throws InterruptedException {
		
	ConfirmationPojo l5 = new ConfirmationPojo();
		
    btnClick(l5.getLogout().get(0));
    Thread.sleep(3000);

	}

}
