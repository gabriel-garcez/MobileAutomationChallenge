package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import managers.AndroidDriverManager;

public class stepsDimension {
	
	
	private AndroidDriver<MobileElement> driver;
	
	
	@Test

	@Given("^the app is open in Lenght$")
	public void the_app_is_open_in_Lenght() throws Throwable {
		driver = AndroidDriverManager.createCapabilities();
 
	}

	@When("^select Meter in the first dropdown$")
	public void select_Meter_in_the_first_dropdown() throws Throwable {
		MobileElement el1 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"Drop down\"])[1]");
		el1.click();
		
		Thread.sleep(8000);
		
		TouchAction action = new TouchAction(driver);
		action.press(458, 307);
		action.moveTo(444, 1753);
		action.release();
		action.perform();
		
		TouchAction action2 = new TouchAction(driver);
		action2.press(458, 307);
		action2.moveTo(444, 1753);
		action2.release();
		action2.perform();
		
		MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.RelativeLayout[3]/android.widget.TextView[1]");
		el2.click();
		
	}
	

	@When("^select Foot in the second dropdown$")
	public void select_Foot_in_the_second_dropdown() throws Throwable {
		MobileElement el3 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"Drop down\"])[2]");
		el3.click();
		MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.RelativeLayout[12]/android.widget.TextView[1]");
		el4.click();

	}

	@When("^inform a valid value$")
	public void inform_a_valid_value() throws Throwable {
		MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]");
		el5.click();
		MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.Button[1]");
		el6.click();
	}

	@Then("^the convertion of Meter to Foot should be displayed$")
	public void the_convertion_of_Meter_to_Foot_should_be_displayed() throws Throwable {
		MobileElement el7 = (MobileElement) driver.findElementById("com.ba.universalconverter:id/target_value");
		String value = el7.getText();
		assertEquals("32.8084", value);
}

}
