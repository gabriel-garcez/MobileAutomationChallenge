package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;

import org.junit.Test;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import managers.AndroidDriverManager;

public class stepsSpeed {
	
	
	private AndroidDriver<MobileElement> driver;


	@Test
	
	@Given("the app is open in Speed")
	public void the_app_is_open_in_speed() throws MalformedURLException, InterruptedException {
		driver = AndroidDriverManager.createCapabilities();
		MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Search");
		el1.click();

		MobileElement el2 = (MobileElement) driver.findElementById("com.ba.universalconverter:id/search_src_text");
		el2.sendKeys("speed");
		
		(new TouchAction(driver)).tap(993, 2055).perform();
		
		MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.TextView");
		el3.click();

	    
	}
	
	
	@When("select Mile per Minute in the first dropdown")
	public void select_mile_per_minute_in_the_first_dropdown() {
		MobileElement el5 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"Drop down\"])[1]");
		el5.click();
		MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.TextView[1]");
		el6.click();		
	}
	
	
	@When("select Mile per hour in the second dropdown")
	public void select_mile_per_hour_in_the_second_dropdown() {
		MobileElement el7 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"Drop down\"])[2]");
		el7.click();
		MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.RelativeLayout[13]/android.widget.TextView[1]");
		el8.click();	
	}
	
	@When("inform valid values to convert")
	public void inform_valid_values_to_convert() {
		MobileElement el9 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]");
		el9.click();
		MobileElement el10 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.Button[1]");
		el10.click();
	}
	
	@Then("the convertion of Mile per minute to Mile per hour should be displayed")
	public void the_convertion_of_mile_per_minute_to_mile_per_hour_should_be_displayed() {
		MobileElement el11 = (MobileElement) driver.findElementById("com.ba.universalconverter:id/target_value");
		String value = el11.getText();
		assertEquals("600", value);
	}

	}

