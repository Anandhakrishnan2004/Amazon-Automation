package com.amazon.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

 public class PageObjects {

WebDriver driver = null;
//storing locators into variables
By SignButton = By.xpath("//*[@id=\"nav-link-accountList\"]");
By Signin = By.linkText("Sign in");
By Email = By.name("email");
By ContinuBut = By.xpath("//input[@id='continue']");
By Password = By.xpath("//input[@id=\"ap_password\"]");
By Submit = By.id("signInSubmit");
By button_searchDropdownBox = By.id("searchDropdownBox");
By textbox_search = By.id("twotabsearchtextbox");
By searchsubmitbutton = By.xpath("//*[@id=\"nav-search-submit-button\"]");
By clickonProduct = By.linkText("Apple iPhone 14 Plus 128GB Starlight");
By Buynow = By.xpath("//input[@id=\"buy-now-button\"]");
By fullname = By.xpath("//*[@id=\"address-ui-widgets-enterAddressFullName\"]");
By phonenumber = By.xpath("//*[@id=\"address-ui-widgets-enterAddressPhoneNumber\"]");
By postalcode = By.xpath("//*[@id=\"address-ui-widgets-enterAddressPostalCode\"]");
By housenumber = By.xpath("//*[@id=\"address-ui-widgets-enterAddressLine1\"]");
By Local = By.xpath("//*[@id=\"address-ui-widgets-enterAddressLine2\"]");

By Useaddress = By.xpath("//*[@id=\"address-ui-widgets-form-submit-button\"]/span/input");
public PageObjects (WebDriver driver) {

this.driver = driver;

}
//calling all the variables created
public void clickSignButton() {
	//assertion is used to confirm the sign in button
	Assert.assertTrue(driver.findElement(SignButton).isDisplayed());
	driver.findElement(SignButton).click();;
}

public void clickSigninButton() {
	//assertion is used to confirm the Sign in
	Assert.assertTrue(driver.findElement(Signin).isDisplayed());
	driver.findElement(Signin).click();
}


public void SendEmail(String Text) {
	//assertion is used to confirm the email
	Assert.assertTrue(driver.findElement(Email).isDisplayed());
	driver.findElement(Email).sendKeys("seleniumprojectpractice@gmail.com");
}
public void continueButton() {	
	//assertion is used to confirm the continue button
	Assert.assertTrue(	driver.findElement(ContinuBut).isDisplayed());
	driver.findElement(ContinuBut).click();
}
public void SendPass(String Text) {
	//assertion is used to confirm the password
	Assert.assertTrue(driver.findElement(Password).isDisplayed());
	driver.findElement(Password).sendKeys("@java2004");
}
public void submit() {
	//assertion is used to confirm the submit button
	Assert.assertTrue(driver.findElement(Submit).isDisplayed());
	driver.findElement(Submit).click();
}

public void clicksearchDropdownBoxButton() {
	//assertion is used to confirm the search box
	//Assert.assertTrue(driver.findElement (button_searchDropdownBox).isDisplayed());
driver.findElement (button_searchDropdownBox).click(); 
}


public void setTextInSearchBox(String product) {
	//assertion is used to confirm the send keys
	Assert.assertTrue(driver.findElement (textbox_search).isDisplayed());

driver.findElement (textbox_search).sendKeys("Apple iPhone 14 Plus Starlight"); 
}
public void clickonSearchBox() {
	//assertion is used to confirm the search submit button
	Assert.assertTrue(driver.findElement(searchsubmitbutton).isDisplayed());
	driver.findElement(searchsubmitbutton).click();
}
public void clickonProduct() {
	//assertion is used to confirm the click on product
	Assert.assertTrue(driver.findElement(clickonProduct).isDisplayed());
	driver.findElement(clickonProduct).click();
}
public void buynowbutton() {
	//assertion is used to confirm the buy now button
	Assert.assertTrue(driver.findElement(Buynow).isDisplayed());
	driver.findElement(Buynow).click();
}

	public void enterfullname(String name)	{
		//assertion is used to confirm the send keys
		Assert.assertTrue(driver.findElement(fullname).isDisplayed());

		driver.findElement(fullname).sendKeys("Anandh");
	}
	
	public void enterphonemunber( String Phonenumber)	{
		//assertion is used to confirm the send keys
		Assert.assertTrue(driver.findElement(phonenumber).isDisplayed());
		driver.findElement(phonenumber).sendKeys("7994370602");
	}
	
	public void enterpostalcode( String Postalcode)	{
		//assertion is used to confirm the send keys
		Assert.assertTrue(driver.findElement(postalcode).isDisplayed());
		driver.findElement(postalcode).sendKeys("695024");
	}	
	public void Enterhousenumber(String houseno) {
		//assertion is used to confirm the send keys
		Assert.assertTrue(driver.findElement(housenumber).isDisplayed());
		driver.findElement(housenumber).sendKeys("konnor");
	}
	public void enterlocaladress(String localad) {
		//assertion is used to confirm the send keys
		Assert.assertTrue(driver.findElement(Local).isDisplayed());
		driver.findElement(Local).sendKeys("koratty");
	}
	
	public void Clickuseaddress() {
		//assertion is used to confirm the use this address button
		Assert.assertTrue(driver.findElement(Useaddress).isDisplayed());
		driver.findElement(Useaddress).click();
	}

}

 
 
 
 
 
 
 
 
 
 
 
 