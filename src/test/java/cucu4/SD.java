package cucu4;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD {
	@Given("User navigates to the URL")
	public void user_navigates_to_the_URL() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("User opens the login page");
	}
	

	@Given("Enters the username {string} and Enter the password {int}")
	public void enters_the_username_and_Enter_the_password(String username, int passwd) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("The username is "+username);
		System.out.println("The password is "+passwd);
	}
	

	@When("User clicks on login")
	public void user_clicks_on_login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("user clicks on login");
	}

	@Then("User is taken to Home page")
	public void user_is_taken_to_Home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("User is taken to homepage");
	}


}
