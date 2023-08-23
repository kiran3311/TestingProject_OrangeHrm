package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Candidate_edit extends BaseTest {

	// TC13 -- Validate delete record functionality

	@Test
	public void tc_013() throws InterruptedException {
		driver.get(p.getProperty("url"));
		driver.findElement(By.xpath(p.getProperty("username_loc"))).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath(p.getProperty("passward_loc"))).sendKeys(p.getProperty("passward"));
		driver.findElement(By.xpath(p.getProperty("login_loc"))).click();
		driver.findElement(By.linkText(p.getProperty("recruitment_loc"))).click();
		driver.findElement(By.xpath(p.getProperty("deleteCandidate_loc"))).click();
		driver.findElement(By.xpath(p.getProperty("confirmDeleteCandidate_loc"))).click();

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

	// TC14--Validate multiple records deleting functionality
	@Test
	public void tc_014() throws InterruptedException {
		driver.get(p.getProperty("url"));
		driver.findElement(By.xpath(p.getProperty("username_loc"))).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath(p.getProperty("passward_loc"))).sendKeys(p.getProperty("passward"));
		driver.findElement(By.xpath(p.getProperty("login_loc"))).click();
		driver.findElement(By.linkText(p.getProperty("recruitment_loc"))).click();
		driver.findElement(By.xpath(p.getProperty("selectCandidate1_loc"))).click();
		driver.findElement(By.xpath(p.getProperty("selectCandidate2_loc"))).click();
		driver.findElement(By.xpath(p.getProperty("deleteMultipleCandidate_loc"))).click();
		driver.findElement(By.xpath(p.getProperty("confirmDeleteCandidate_loc"))).click();

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

	// TC15-- Validate view action functionality
	@Test
	public void tc_015() throws InterruptedException {
		driver.get(p.getProperty("url"));
		driver.findElement(By.xpath(p.getProperty("username_loc"))).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath(p.getProperty("passward_loc"))).sendKeys(p.getProperty("passward"));
		driver.findElement(By.xpath(p.getProperty("login_loc"))).click();
		driver.findElement(By.linkText(p.getProperty("recruitment_loc"))).click();
		driver.findElement(By.xpath(p.getProperty("candidateView_loc"))).click();

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

	// TC16 -- Validate download functionality
	@Test
	public void tc_016() throws InterruptedException {
		driver.get(p.getProperty("url"));
		driver.findElement(By.xpath(p.getProperty("username_loc"))).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath(p.getProperty("passward_loc"))).sendKeys(p.getProperty("passward"));
		driver.findElement(By.xpath(p.getProperty("login_loc"))).click();
		driver.findElement(By.linkText(p.getProperty("recruitment_loc"))).click();

		try {
			WebElement downloadBtn = driver.findElement(By.xpath(p.getProperty("candidateDown_loc")));
			boolean checkBtn = downloadBtn.isDisplayed();
			if (checkBtn) {
				downloadBtn.click();
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
		} catch (NoSuchElementException e) {
			System.out.println("Download option not available on this page");
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
}
