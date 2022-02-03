package managers;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AndroidDriverManager {
	
	public static AndroidDriver<MobileElement> createCapabilities() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("deviceName", "Pixel_4_API_28");
	    desiredCapabilities.setCapability("automationName", "uiautomator2");
	    desiredCapabilities.setCapability("appPackage", "com.ba.universalconverter");
	    desiredCapabilities.setCapability("appActivity", "com.ba.universalconverter.MainConverterActivity");
	    desiredCapabilities.setCapability("ensureWebviewsHavePages", true);
	    
	     AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
	     
	     return driver;
		
	    
	    
	}

}
