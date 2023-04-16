package Utils;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.firefox.*;

import io.github.bonigarcia.wdm.*;
import java.io.*;
import java.util.*;

public class Utility {
	
	private static WebDriver driver;
	
	public static WebDriver driver() throws Exception {
		if(getProperty("browser").equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--disable-notifications");
			driver = new ChromeDriver(chromeOptions);
		}
		else if(getProperty("browser").equals("edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions edgeOptions = new EdgeOptions();
			driver = new EdgeDriver(edgeOptions);
		}
		
		else if(getProperty("browser").equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions fireFoxOptions = new FirefoxOptions();
			fireFoxOptions.addArguments("--disable-notifications");
			driver = new FirefoxDriver(fireFoxOptions);
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	public static String getProperty(String property) throws Exception {
		File f = new File(System.getProperty("user.dir")+"/src/test/resources/application.properties");
		FileInputStream fs = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(fs);
		return prop.getProperty(property);
	}

}
