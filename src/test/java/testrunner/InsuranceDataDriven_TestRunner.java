package testrunner;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"src/test/resources/features/Insurancedatadriven.feature"},
		glue = {"insurancepage_stepdefinitions", "apphooks"},
				 plugin= {"pretty" ,
						 "html:cucumber_report/cucumber",
						 "json:cucumber_report/cucumber.json",
				 		 "junit:cucumber_report/cucumber.xml"}
				 
		)
public class InsuranceDataDriven_TestRunner extends AbstractTestNGCucumberTests {

}
