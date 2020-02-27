package RunnerClass;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

  @RunWith(Cucumber.class)
  
  @CucumberOptions(
		  
		  features ="C:\\Users\\alef1\\eclipse-workspace\\BDD_Cucumber\\src\\"
		  		+ "main\\java\\Feature\\dataDriven.feature",
		  glue = {"StepDefinations"},
		  plugin= {"pretty", "html:test-output", "json:json_output/Cucumber.json"},
		  monochrome= true,
		  dryRun=false
		  
		  )










public class CrmDataDrivenRunner {

}
