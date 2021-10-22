package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public WebDriver driver;
	public Properties prop;

	public WebDriver initializerDriver() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"D:\\Qualitest\\Selinum\\Qualicoach\\src\\main\\java\\resources\\data.properties");

		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Qualitest\\Selinum\\Introduction\\chromedriver.exe");

			driver = new ChromeDriver();
		}

		else if (browserName.equals("firefox")) {

			System.out.println("Set properties for firefox");

		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;

	}

}
