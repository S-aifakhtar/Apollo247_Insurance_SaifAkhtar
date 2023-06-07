package insurancepage_stepdefinitions_excel;

import static org.testng.Assert.assertEquals;
import com.utility.Config;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import com.pages.InsurancePage;
import com.pages.LandingPage;
import com.utility.ExcelReader;
import com.utility.Utility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InsurancepageSteps_excel extends Utility {
	public LandingPage ldp;
	public InsurancePage ins;
	 ExcelReader reader;
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
	  @Then("User enters in Search Insurer from sheetname {string} and rownumber {int}")
	  public void user_enters_in_search_insurer_from_sheetname_and_rownumber(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
		  objectMethod();
			Thread.sleep(1000);
			reader = new ExcelReader();
	        List<Map<String,String>> testData = reader.getData(Config.excelPath, sheetName);
	        String str = testData.get(rowNumber).get("Insurer");
			ins.search();
			ins.searchType(str);
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
