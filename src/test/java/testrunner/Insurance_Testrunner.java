package testrunner;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/resources/features/Insurance.feature"},
        glue = {"landingPage_stepdefinitions","apphooks"},
                 plugin= {"pretty" ,
                         "html:target/creport/cucumber",
                         "json:target/creport/cucumber.json",
                          "junit:target/creport/cucumber.xml"}
        
        )
public class Insurance_Testrunner  extends AbstractTestNGCucumberTests{
	
	
}