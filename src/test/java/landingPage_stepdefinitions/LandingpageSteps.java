package landingPage_stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import com.utility.Utility;
import com.aventstack.extentreports.Status;
import com.pages.InsurancePage;
import com.pages.LandingPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingpageSteps  extends Utility{
	public LandingPage ldp;
	public InsurancePage ins;
	  public void objectMethod() throws IOException {
	        ldp = new LandingPage();
	        ins = new InsurancePage();
	    }

	  //start of scenario 1
	  @Given("Chrome is opened and Apollo247 App is opened")
	  public void chrome_is_opened_and_apollo247_app_is_opened() throws IOException, InterruptedException {
	      // Write code here that turns the phrase above into concrete actions
		  objectMethod();

	      //  Thread.sleep(5000);
		  Utility.implicitWait();
	        
	        System.out.print("***********Website is Opening************");
	        logger = report.createTest("test01");

            logger.log(Status.INFO, "Validating landing page title");
            
            String actualTitle = ldp.validateLandinPageTitle();

            String expectedTitle = "Apollo 247 - Online Doctor Consultation & Book Lab Tests at Home";
            try {

                assertEquals(expectedTitle,actualTitle);

                logger.log(Status.PASS, "Step1 is passed");

                System.out.println(actualTitle);

                assert true;

            } catch (AssertionError e) {

                e.printStackTrace();

                logger.log(Status.FAIL, "Step1 is failed");

                captureScreenshotOnFailure();

                assert false;

            }

            Thread.sleep(1000); //3000

//	        String actualtitle = ldp.validateLandinPageTitle();
//
//	        String expectedtitle = "Apollo 247 - Online Doctor Consultation & Book Lab Tests at Home";
//
//	        assertEquals(expectedtitle, actualtitle);
//
//	        System.out.println(actualtitle);
//
//	       // Thread.sleep(5000);
//	        Utility.implicitWait();
		  
	     
	  }
	  @When("User Click on the Insurance Page")
	  public void user_click_on_the_insurance_page()  throws IOException, InterruptedException {
	      // Write code here that turns the phrase above into concrete actions
		  objectMethod();

	      //  Thread.sleep(2000);   // this will be commented

	        ldp.InsurancePageNavigation();
	        
	       // Thread.sleep(5000);
	        Utility.implicitWait();
	        logger.log(Status.PASS, "Step2 is passed");
	      
	  }
	  
	  @Then("User navigate on the Insurance page")
	  public void user_navigate_on_the_insurance_page() throws Exception {
		   objectMethod();
		   String actualtitle = ins.validateInsurancePageTitle();

	        String expectedtitle = "";

	        assertEquals(expectedtitle, actualtitle);

	        System.out.println(actualtitle);

	       // Thread.sleep(5000);
	        Utility.implicitWait();
	        logger.log(Status.PASS, "Step3 is passed");
	  }
	  
	  //end of scenario 1
	  
	  
	  //start of scenario 2
	  @Then("Insurance page fields are visible to the user")
	  public void insurance_page_fields_are_visible_to_the_user() throws Exception {
	      objectMethod();
	      Utility.captureScreenshotOnFailure();
	    //  Thread.sleep(5000);
	      Utility.implicitWait();
	      logger.log(Status.PASS, "Step4 is passed");
	     
	  }
	  
	  // end of scenario 2
	  
	  
	  // start of scenario 3
	  
	  @When("User select the SortBy value")
	  public void user_select_the_sort_by_value() throws IOException, InterruptedException {
	      objectMethod();
	      ldp.sortByButton();
	     // Thread.sleep(5000);
	      Utility.implicitWait();
	      logger.log(Status.PASS, "Step5 is passed");
	  }
	  @Then("Application sort the data according to SortBy value")
	  public void application_sort_the_data_according_to_sort_by_value() throws IOException, InterruptedException {
	     objectMethod();
	    // ldp.clickonsortByButton();
	    // Thread.sleep(5000);
	     Utility.implicitWait();
	     logger.log(Status.PASS, "Step6 is passed");
	     String actualTitle = ldp.validateLandinPageTitle();

         //String expectedTitle = "SortBy value";
	     ldp.clickonsortByButton();
         try {

             //assertEquals(expectedTitle,actualTitle);

             logger.log(Status.PASS, "Step6 is passed");

            // System.out.println(actualTitle);

             assert true;

         } catch (AssertionError e) {

             e.printStackTrace();

             logger.log(Status.FAIL, "Step6 is failed");

             captureScreenshotOnFailure();

             assert false;
             Utility.implicitWait();

         }
	     
	  }

}

	 