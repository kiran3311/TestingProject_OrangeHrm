package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Vacancy_add extends BaseTest {

	// TC22--Validate add vacancy functionaliy
	@Test
	public void tc_022() throws InterruptedException {
		driver.get(p.getProperty("url"));
		driver.findElement(By.xpath(p.getProperty("username_loc"))).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath(p.getProperty("passward_loc"))).sendKeys(p.getProperty("passward"));
		driver.findElement(By.xpath(p.getProperty("login_loc"))).click();
		driver.findElement(By.linkText(p.getProperty("recruitment_loc"))).click();
		driver.findElement(By.xpath(p.getProperty("vacancyBtn_loc"))).click();
		driver.findElement(By.xpath(p.getProperty("vacAddBtn_loc"))).click();
		driver.findElement(By.xpath(p.getProperty("vacAddName_loc"))).sendKeys(p.getProperty("vacAddName_val"));
		driver.findElement(By.xpath(p.getProperty("vacAddJobtitledrop_loc"))).click();
		List<WebElement> list = driver.findElements(By.xpath(p.getProperty("vacAddJobtitleOpt_loc")));
		for (WebElement option : list) {
			String optText = option.getText();
			if (optText.equals("QA Engineer")) {
				option.click();
				break;
			}
		}

		driver.findElement(By.xpath(p.getProperty("vacDesc_loc"))).sendKeys(p.getProperty("vacDesc_val"));
		driver.findElement(By.xpath(p.getProperty("vacAddHm_loc"))).sendKeys("paul");
		List<WebElement> list2 = driver.findElements(By.xpath(p.getProperty("vacAddHmOpt_loc")));
		for (WebElement option : list2) {
			String optText = option.getText();
			if (optText.equals("Paul Collings")) {
				option.click();
				break;
			}
		}

		driver.findElement(By.xpath(p.getProperty("vacAddNop_loc"))).sendKeys(p.getProperty("vacAddNop_val"));
		driver.findElement(By.xpath(p.getProperty("vacAddSave_loc"))).click();

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

	// TC23-- Validate cancel button of vacancy creation form page
	@Test
	public void tc_023() throws InterruptedException {
		driver.get(p.getProperty("url"));
		driver.findElement(By.xpath(p.getProperty("username_loc"))).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath(p.getProperty("passward_loc"))).sendKeys(p.getProperty("passward"));
		driver.findElement(By.xpath(p.getProperty("login_loc"))).click();
		driver.findElement(By.linkText(p.getProperty("recruitment_loc"))).click();
		driver.findElement(By.xpath(p.getProperty("vacancyBtn_loc"))).click();
		driver.findElement(By.xpath(p.getProperty("vacAddBtn_loc"))).click();
		driver.findElement(By.xpath(p.getProperty("vacAddCancel_loc"))).click();

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
}
