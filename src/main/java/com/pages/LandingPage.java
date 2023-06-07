package com.pages;


import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;

	public class LandingPage extends Utility 
	{
		
		@FindBy(xpath="//*[text()='Insurance']")
		private WebElement insurance;
		
		@FindBy(xpath="//input[@placeholder='Search Insurer']")
		private WebElement searchbutton;
		
		@FindBy(xpath="//*[@id='__next']/div/div/div[2]/div[1]/div/div[2]/div[1]/ul/li/div/div[1]")
		private WebElement sortbybutton;
		
		@FindBy(xpath="//li[text()='Premium - Highest to Lowest']")
		private WebElement selectbutton;
		

		
		public LandingPage() throws IOException
		{
			PageFactory.initElements(driver, this);
		
		} 
		public InsurancePage InsurancePageNavigation() throws IOException 
		{
			insurance.click();
			return new InsurancePage();
		}
		public String validateLandinPageTitle()
		{
			return driver.getTitle(); 
		} 
		
		public void sortByButton() {
			sortbybutton.click();
		}
		public void clickonsortByButton() {
			selectbutton.click();
		}
		
		public static void captureScreenshot() throws Exception {
			
			Date currentDate = new Date();
			String screenshotFileName = currentDate.toString().replace(" ", "-").replace(":", "-");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File binaryFile = ts.getScreenshotAs(OutputType.FILE);
			
			//Make sure screenshots folder is already created at the project level
			File imageFile = new File(screenshotsPath + screenshotFileName + ".png"); 
			FileUtils.copyFile(binaryFile, imageFile);
			
		}
}
