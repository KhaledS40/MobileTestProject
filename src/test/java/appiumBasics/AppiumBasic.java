package appiumBasics;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumBasic {

	@Test
	public void appiumTest() throws MalformedURLException, URISyntaxException {

		// first we create object of Android driver, IOSDriver
		// we first write Appium code -> then send it to Appium Server -> then send to
		// Mobile to test

		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("KhaledPhone");
		AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
		System.out.println("this is an example");
	}
}
