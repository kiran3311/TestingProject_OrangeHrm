package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Vacancy_edit extends BaseTest {

//TC24--Validate edit vacancy functionality
	@Test
	public void tc_024() throws InterruptedException {
		driver.get(p.getProperty("url"));
		driver.findElement(By.xpath(p.getProperty("username_loc"))).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath(p.getProperty("passward_loc"))).sendKeys(p.getProperty("passward"));
		driver.findElement(By.xpath(p.getProperty("login_loc"))).click();
		driver.findElement(By.linkText(p.getProperty("recruitment_loc"))).click();
		driver.findElement(By.xpath(p.getProperty("vacancyBtn_loc"))).click();
		driver.findElement(By.xpath(p.getProperty("vacEdit_loc"))).click();
		
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

// TC25--Validate delete vacancy functionality
	@Test
	public void tc_025() throws InterruptedException {
		driver.get(p.getProperty("url"));
		driver.findElement(By.xpath(p.getProperty("username_loc"))).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath(p.getProperty("passward_loc"))).sendKeys(p.getProperty("passward"));
		driver.findElement(By.xpath(p.getProperty("login_loc"))).click();
		driver.findElement(By.linkText(p.getProperty("recruitment_loc"))).click();
		driver.findElement(By.xpath(p.getProperty("vacancyBtn_loc"))).click();
		driver.findElement(By.xpath(p.getProperty("vacDelete_loc"))).click();
		driver.findElement(By.xpath(p.getProperty("vacDeleteConfirm_loc"))).click();
		
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
