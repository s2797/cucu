package cucu6;


import java.util.List;
import java.util.Map;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD {
	@Given("I want to give names")
	public void i_want_to_give_names(io.cucumber.datatable.DataTable data) {
		List<Map<String,String>>  obj = data.asMaps(String.class,String.class);
		for(int i=0;i<obj.size();i++) {
			System.out.print(obj.get(i).get("name"));
			System.out.print(" ");
			System.out.println(obj.get(i).get("Password"));
		}
	   
	}

	@Given("Some other action")
	public void some_other_action() {
	   
	}

	@When("I complete action")
	public void i_complete_action() {
	   
	}

	@Then("I finish")
	public void i_finish() {
	
	}



}
