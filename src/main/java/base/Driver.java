package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utils.ReadProperties;

public class Driver extends ReadProperties {

	static WebDriver driver;
	public static String chromeDriverPath;

	public void setDriver(String browserType, String appUrl) {

		if (browserType.equalsIgnoreCase("firefox")) {
			initFirefox();
		} else if (browserType.equalsIgnoreCase("chrome")) {
			initChrome(chromeDriverPath);
		} else {
			initFirefox();
		}
		setDriverProperty();
		driver.get(appUrl);
	}

	public void setDriverProperty() {
		driver.manage().window().maximize();
	}

	private void initFirefox() {

		driver = new FirefoxDriver();

	}

	private void initChrome(String chromeDriverPath) {
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);

		driver = new ChromeDriver();

	}

	public static WebDriver getDriver() {

		return driver;
	}

}
