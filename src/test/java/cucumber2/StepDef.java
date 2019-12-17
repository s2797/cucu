package cucumber2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	@Given("User navigates to the URL")
	public void user_navigates_to_the_URL() {
		System.out.println("User opens the login page");
	}
	   

	@Given("Enters the username {string} and Enter the password {intl }")
	public void enters_the_username_and_Enter_the_password(String username, int passwd) {
		System.out.println("The username is "+username);
		System.out.println("The password is "+passwd);
		
	}
	  
	

	@When("User clicks on login")
	public void user_clicks_on_login() {
		System.out.println("user clicks on login");
		
	  
	}

	@Then("User is taken to Home page")
	public void user_is_taken_to_Home_page() {
		System.out.println("User is taken to homepage");
	 
	}

}
