package cucumber1;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class StepDefinition {
	@Given("Enter the url")
	public void enter_the_url() {
		System.out.println("Test Me App is opened ");
	   
	}

	@Given("Enter username")
	public void enter_username() {
		System.out.println("Enter the username ");
		   
	   
	}

	@Given("enter password")
	public void enter_password() {
		System.out.println("enter the password");
		   
	   
	}


	@When("Click on login Button")
	public void click_on_login_Button() {
		System.out.println("click on login button");
		   
	   
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
		System.out.println("home page is displayed ");
		   
	   
	}


}
