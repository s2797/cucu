package cucu5;

import java.awt.List;

import gherkin.ast.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD {
	@Given("I want to give names")
	public void i_want_to_give_names(DataTable dt) {
		List<Map<String,String>>list=dt.asMaps(String.class,String.class);
		for(int i=0;i<list.size;i++)
		{
			System.out.print(list.get(i).get("name"));
			System.out.print(list.get(i).get("Password"));
			
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
