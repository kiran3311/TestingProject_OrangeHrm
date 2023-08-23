package testCases;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;
	public static Properties p = new Properties();
	public static FileReader fr;

	@BeforeTest
	public void setUp() throws IOException {
		fr = new FileReader(System.getProperty("user.dir") + "\\src\\test\\java\\utilities\\config.properties");
		p.load(fr);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}

	@AfterTest
	public void tearDown() throws InterruptedException {
		String currUrl = driver.getCurrentUrl();
		if(currUrl != p.getProperty("url")) {
			driver.findElement(By.xpath(p.getProperty("logoutDrop_loc"))).click();
			Thread.sleep(2000);
			List<WebElement> menuList = driver.findElements(By.xpath(p.getProperty("logoutOpt_loc")));
			for (WebElement x : menuList) {
				String menuListText = x.getText();
				if (menuListText.equals("Logout")) {
					x.click();
					break;
				}
			}
		}
		driver.close();
		driver.quit();
	}
	
	@AfterSuite
	public void closeSuite() {
		driver.quit();
	}

}
