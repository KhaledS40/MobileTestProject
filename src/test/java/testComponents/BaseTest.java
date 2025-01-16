package testComponents;

import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class BaseTest {

    public static WebDriver driver;
    public WebDriver initializeDriver(){

        Properties prop = new Properties();

        return driver;
    }
}
