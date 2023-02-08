package com.amazon.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.amazon.pageobjects.PageObjects_002;
import com.amazon.utilities.Dataprovider;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TC_002 {
private static WebDriver driver;

//before method setting for the test case
@BeforeMethod
public void beforemethod() {

	System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") +"//Drivers//msedgedriver.exe");
	 driver = new EdgeDriver();
driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
driver.get("https://www.amazon.in/"); //getting site link
driver.manage().window().maximize(); 
}

@Test(dataProvider = "TC_002",dataProviderClass = Dataprovider.class)
public static void TestCase1(String email, String id , String product) throws Exception {
	 ExtentReports extent=new ExtentReports();
	  ExtentSparkReporter spark=new ExtentSparkReporter("C:\\Users\\anandhakrishnan.b\\eclipse-Workspaces\\reportAnandhu.html");
	  extent.attachReporter(spark);
	  ExtentTest test=extent.createTest("Verify the Daily Deals functionality");
	   
//creating action method 
Actions act = new Actions(driver);

PageObjects_002 PageObj = new PageObjects_002(driver);


//calling clickSigninButton in order to click sign-in button  
Thread.sleep(2000);
PageObj.clickSigninButton();

//calling SendEmail in order to send mail id
Thread.sleep(2000);
PageObj.SendEmail(email);

//calling continueButton in order to click on continue button
Thread.sleep(2000);
PageObj.continueButton();

// calling SendPass in order send password
Thread.sleep(2000);
PageObj.SendPass(id);

//calling submit in order to click submit
Thread.sleep(3000);
PageObj.submit();

//calling clicksearchDropdownBoxButton in order to click on search
Thread.sleep(2000);
PageObj.clicksearchDropdownBoxButton();
	
//calling setTextInSearchBox in order to send data
PageObj.setTextInSearchBox(product);

//calling clickonSearchBox in order to click on search
PageObj.clickonSearchBox();

//calling clickonProduct in order to click on product
PageObj.clickonProduct();

//using actions method in order to click on the buy now button which is in the new tab
Thread.sleep(2000);
driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
WebElement Buynow= driver.findElement(By.xpath("//*[@id=\"buy-now-button\"]"));
act.moveToElement(Buynow).click().build().perform();

PageObj.Clickuseaddress();
//test completed


/* After the test completed the account is signed out */


driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
Thread.sleep(2000);
driver.navigate().back();
driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
WebElement Youraccount = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span/span"));
WebElement Signout = driver.findElement(By.xpath("//*[@id=\"nav-item-signout\"]/span"));
Thread.sleep(2000);
act.moveToElement(Youraccount).build().perform();
Thread.sleep(2000);
act.moveToElement(Signout).click().build().perform();

driver.quit();
extent.flush();

}

public static WebDriver getDriver() {
	return driver;
}
public static void setDriver(WebDriver driver) {
	TC_002.driver = driver;
}
}