package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Vacancy_search extends BaseTest {

	// TC17--Validate if user able to search with job title
	@Test
	public void tc_017() throws InterruptedException {
		driver.get(p.getProperty("url"));
		driver.findElement(By.xpath(p.getProperty("username_loc"))).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath(p.getProperty("passward_loc"))).sendKeys(p.getProperty("passward"));
		driver.findElement(By.xpath(p.getProperty("login_loc"))).click();
		driver.findElement(By.linkText(p.getProperty("recruitment_loc"))).click();
		driver.findElement(By.xpath(p.getProperty("vacancyBtn_loc"))).click();
		WebElement search = driver.findElement(By.xpath(p.getProperty("vacancySearch_loc")));
		driver.findElement(By.xpath(p.getProperty("vacJobtitle_loc"))).click();
		List<WebElement> list = driver.findElements(By.xpath(p.getProperty("vacJobtitleOpt_loc")));
		for (WebElement option : list) {
			String optText = option.getText();
			if (optText.equals("GM")) {
				option.click();
				break;
			}
		}
		search.click();

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

	// TC18-- Validate if user able to search with vacancy post name

	@Test
	public void tc_018() throws InterruptedException {
		driver.get(p.getProperty("url"));
		driver.findElement(By.xpath(p.getProperty("username_loc"))).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath(p.getProperty("passward_loc"))).sendKeys(p.getProperty("passward"));
		driver.findElement(By.xpath(p.getProperty("login_loc"))).click();
		driver.findElement(By.linkText(p.getProperty("recruitment_loc"))).click();
		driver.findElement(By.xpath(p.getProperty("vacancyBtn_loc"))).click();
		WebElement search = driver.findElement(By.xpath(p.getProperty("vacancySearch_loc")));
		driver.findElement(By.xpath(p.getProperty("vacPostDrop_loc"))).click();
		List<WebElement> list = driver.findElements(By.xpath(p.getProperty("vacPostOpt_loc")));
		for (WebElement option : list) {
			String optText = option.getText();
			if (optText.equals("Software Engineer")) {
				option.click();
				break;
			}
		}
		search.click();

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

	// TC19-- Validate if user able to search with Hiring manager
	@Test
	public void tc_019() throws InterruptedException {
		driver.get(p.getProperty("url"));
		driver.findElement(By.xpath(p.getProperty("username_loc"))).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath(p.getProperty("passward_loc"))).sendKeys(p.getProperty("passward"));
		driver.findElement(By.xpath(p.getProperty("login_loc"))).click();
		driver.findElement(By.linkText(p.getProperty("recruitment_loc"))).click();
		driver.findElement(By.xpath(p.getProperty("vacancyBtn_loc"))).click();
		WebElement search = driver.findElement(By.xpath(p.getProperty("vacancySearch_loc")));
		driver.findElement(By.xpath(p.getProperty("vacHmdrop_loc"))).click();
		List<WebElement> list = driver.findElements(By.xpath(p.getProperty("vacHmopt_loc")));
		for (WebElement option : list) {
			String optText = option.getText();
			if (optText.equals("Odis Adalwin")) {
				option.click();
				break;
			}
		}
		search.click();

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

	// TC20--Validate if user to search with status
	@Test
	public void tc_020() throws InterruptedException {
		driver.get(p.getProperty("url"));
		driver.findElement(By.xpath(p.getProperty("username_loc"))).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath(p.getProperty("passward_loc"))).sendKeys(p.getProperty("passward"));
		driver.findElement(By.xpath(p.getProperty("login_loc"))).click();
		driver.findElement(By.linkText(p.getProperty("recruitment_loc"))).click();
		driver.findElement(By.xpath(p.getProperty("vacancyBtn_loc"))).click();
		WebElement search = driver.findElement(By.xpath(p.getProperty("vacancySearch_loc")));
		driver.findElement(By.xpath(p.getProperty("vacStatusDrop_loc"))).click();
		List<WebElement> list = driver.findElements(By.xpath(p.getProperty("vacStatusOpt_loc")));
		for (WebElement option : list) {
			String optText = option.getText();
			if (optText.equals("Active")) {
				option.click();
				break;
			}
		}
		search.click();

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

	// TC21-- Validate reset vacancy search functionality

	@Test
	public void tc_021() throws InterruptedException {
		driver.get(p.getProperty("url"));
		driver.findElement(By.xpath(p.getProperty("username_loc"))).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath(p.getProperty("passward_loc"))).sendKeys(p.getProperty("passward"));
		driver.findElement(By.xpath(p.getProperty("login_loc"))).click();
		driver.findElement(By.linkText(p.getProperty("recruitment_loc"))).click();
		driver.findElement(By.xpath(p.getProperty("vacancyBtn_loc"))).click();
		driver.findElement(By.xpath(p.getProperty("vacStatusDrop_loc"))).click();
		List<WebElement> list = driver.findElements(By.xpath(p.getProperty("vacStatusOpt_loc")));
		for (WebElement option : list) {
			String optText = option.getText();
			if (optText.equals("Active")) {
				option.click();
				break;
			}
		}
		driver.findElement(By.xpath(p.getProperty("vacResetBtn_loc"))).click();

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
