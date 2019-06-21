package video.downloader.loaders;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyDriver {

	private static final String FIREFOX = "firefox";
	private static final String CHROME = "chrome";

	private static final String PATH_FIREFOX_DRIVER = "C:\\GeckoDriver.exe";

	private static final String PATH_CHROME_DRIVER = "C:\\Program Files\\chromedriver_win32\\chromedriver.exe";
	public static WebDriver driver;

	// configuration des propriétés du système (sélection du navigateur)
	public MyDriver(String browser) {
		super();
		try {
			switch (browser) {
			case FIREFOX:
				System.setProperty("webdriver.firefox.marionette", PATH_FIREFOX_DRIVER);
				System.out.println("Loading Firefox WebDriver");
				driver = new FirefoxDriver();
				break;

			case CHROME:
				System.setProperty("webdriver.chrome.driver", PATH_CHROME_DRIVER);
				System.out.println("Loading Chrome WebDriver");
				driver = new ChromeDriver();
				break;

			default:
				System.setProperty("webdriver.chrome.driver", PATH_CHROME_DRIVER);
				System.out.println("Loading Chrome WebDriver");
				driver = new ChromeDriver();
				break;
			}

			setDriverProperties();

		} catch (Exception e) {
			System.out.println(String.format(
					"A problem was detected while loading the driver of your test for the browser: %s", browser));
			System.out.println(e);
		} finally {

		}

	}

	// instanciation de Chrome
	public MyDriver() {
		super();
		new MyDriver("chrome");
	}

	// retourne un driver par défaut
	public WebDriver getDriver() {
		if (driver == null) {
			new MyDriver();
			return driver;
		}
		return driver;
	}

	private void setDriverProperties() {
		// agrandissement de la page à la taille maxi de l'écran
		driver.manage().window().maximize();
		// Implicit wait - used to set the default waiting time throughout the program
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static void closeDriver() {
		driver.close(); // closes a single window
	}

	public static void quitDriver() {
		driver.quit(); // closes all windows
	}

}
