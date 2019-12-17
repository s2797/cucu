package cucu3;


	import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(monochrome=true,plugin= {"pretty","json:cucumber-reports.json"})
		public class Runner {
	

	


}
