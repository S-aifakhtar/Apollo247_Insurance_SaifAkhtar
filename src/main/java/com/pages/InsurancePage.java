package com.pages;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.WebElement;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;
public class InsurancePage extends Utility{
	
	@FindBy(xpath="//*[@id=\"__next\"]/div/div/div[2]/div[1]/div/div[1]/div[1]/div")
	private WebElement Search;
	
	@FindBy(xpath="//*[@id=\"__next\"]/div/div/div[2]/div[1]/div/div[1]/div[1]/div/input")
	private WebElement SearchType;
	
public InsurancePage() throws IOException {
	PageFactory.initElements(driver,this);
}

public String validateInsurancePageTitle() {
	return driver.getTitle();
}
public void search()
{
	Search.click();
	
}
public void searchType(String string) {
	SearchType.sendKeys(string);
}





}
