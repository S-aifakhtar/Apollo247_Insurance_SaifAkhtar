package insurancepage_stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import com.pages.InsurancePage;
import com.pages.LandingPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InsurancepageSteps {
	public LandingPage ldp;
	public InsurancePage ins;
	  public void objectMethod() throws IOException {
	        ldp = new LandingPage();
	        ins = new InsurancePage();
	    }
	  @Given("Chrome is opened and  Apollo247 app is opened")
	  public void chrome_is_opened_and_apollo247_app_is_opened() throws IOException, InterruptedException {
		  objectMethod();

	        Thread.sleep(5000);
	        
	        System.out.print("***********Website is Opening************");

	        String actualtitle = ldp.validateLandinPageTitle();

	        String expectedtitle = "Apollo 247 - Online Doctor Consultation & Book Lab Tests at Home";

	        assertEquals(expectedtitle, actualtitle);

	        System.out.println(actualtitle);

	        Thread.sleep(5000);
	  }
	  @When("User click on the Insurance page")
	  public void user_click_on_the_insurance_page() throws IOException, InterruptedException {
		  objectMethod();

	      //  Thread.sleep(2000);

	        ldp.InsurancePageNavigation();
	        
	        Thread.sleep(5000);
	  }
	  @When("User navigate on the Insurance page")
	  public void user_navigate_on_the_insurance_page() throws IOException, InterruptedException {
		  objectMethod();
		   String actualtitle = ins.validateInsurancePageTitle();

	        String expectedtitle = "";

	        assertEquals(expectedtitle, actualtitle);

	        System.out.println(actualtitle);

	        Thread.sleep(5000);
	  }
	  @Then("User enters in Search Insurer {string}")
	  public void user_enters_in_search_insurer(String string) throws InterruptedException, IOException {
		  objectMethod();
			Thread.sleep(1000);
			ins.search();
			ins.searchType(string);
			Thread.sleep(2000);
	  }
	  @Then("It display the list of Insurer available")
	  public void it_display_the_list_of_insurer_available() throws Exception {
		  objectMethod();
			LandingPage.captureScreenshot();
			Thread.sleep(5000);
	  }
	  @Then("It shows No result found")
	  public void it_shows_no_result_found() throws Exception {
		  objectMethod();
			LandingPage.captureScreenshot();
			Thread.sleep(5000);
	  }
}
