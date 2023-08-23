package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Candidate_add extends BaseTest {

	// TC11-- Validate working of Add candidate functionality
	@Test
	public void tc_011() throws InterruptedException {
		driver.get(p.getProperty("url"));
		driver.findElement(By.xpath(p.getProperty("username_loc"))).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath(p.getProperty("passward_loc"))).sendKeys(p.getProperty("passward"));
		driver.findElement(By.xpath(p.getProperty("login_loc"))).click();
		driver.findElement(By.linkText(p.getProperty("recruitment_loc"))).click();
		driver.findElement(By.xpath(p.getProperty("addCandidateBtn_loc"))).click();
		driver.findElement(By.xpath(p.getProperty("addFname_loc"))).sendKeys(p.getProperty("addFname_val"));
		driver.findElement(By.xpath(p.getProperty("addMname_loc"))).sendKeys(p.getProperty("addMname_val"));
		driver.findElement(By.xpath(p.getProperty("addLname_loc"))).sendKeys(p.getProperty("addLname_vale"));
		driver.findElement(By.xpath(p.getProperty("addVacancyDrop_loc"))).click();
		List<WebElement> list = driver.findElements(By.xpath(p.getProperty("addVacancyOpt_loc")));
		for (WebElement option : list) {
			String optText = option.getText();
			if (optText.equals("Software Tester")) {
				option.click();
				break;
			}
		}

		driver.findElement(By.xpath(p.getProperty("addEmail_loc"))).sendKeys(p.getProperty("addEmail_val"));
		driver.findElement(By.xpath(p.getProperty("addContact_loc"))).sendKeys(p.getProperty("addContact_val"));
		driver.findElement(By.xpath(p.getProperty("addKey_loc"))).sendKeys(p.getProperty("addKey_val"));
		driver.findElement(By.xpath(p.getProperty("addCandSave_loc"))).click();

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

	// TC12-- Validate cancel button functionality
	@Test
	public void tc_012() throws InterruptedException {
		driver.get(p.getProperty("url"));
		driver.findElement(By.xpath(p.getProperty("username_loc"))).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath(p.getProperty("passward_loc"))).sendKeys(p.getProperty("passward"));
		driver.findElement(By.xpath(p.getProperty("login_loc"))).click();
		driver.findElement(By.linkText(p.getProperty("recruitment_loc"))).click();
		driver.findElement(By.xpath(p.getProperty("addCandidateBtn_loc"))).click();
		driver.findElement(By.xpath(p.getProperty("addCandidateCancel_loc"))).click();

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
