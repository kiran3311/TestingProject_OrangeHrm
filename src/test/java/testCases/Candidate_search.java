package testCases;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Candidate_search extends BaseTest {

	// TC001- login
	@Test
	public void tc_001() throws InterruptedException {
		driver.get(p.getProperty("url"));
		driver.findElement(By.xpath(p.getProperty("username_loc"))).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath(p.getProperty("passward_loc"))).sendKeys(p.getProperty("passward"));
		driver.findElement(By.xpath(p.getProperty("login_loc"))).click();
		driver.findElement(By.linkText(p.getProperty("recruitment_loc"))).click();
		
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

	// TC02--Validate if user able to search with job title
	@Test
	public void tc_002() throws InterruptedException {
		driver.get(p.getProperty("url"));
		driver.findElement(By.xpath(p.getProperty("username_loc"))).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath(p.getProperty("passward_loc"))).sendKeys(p.getProperty("passward"));
		driver.findElement(By.xpath(p.getProperty("login_loc"))).click();
		driver.findElement(By.linkText(p.getProperty("recruitment_loc"))).click();
		WebElement search = driver.findElement(By.xpath(p.getProperty("candidateSearch_loc")));
		driver.findElement(By.xpath(p.getProperty("jobtitle_loc"))).click();
		List<WebElement> list = driver.findElements(By.xpath(p.getProperty("jobtitleoptions_loc")));

		for (WebElement option : list) {
			String optionText = option.getText();
			System.out.println(optionText);
			if (optionText.equals("VP - Client Services")) {
				option.click();
				search.click();
				break;
			}
		}

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

	// TC03--Validate if user able to search with vacancy
	@Test
	public void tc_003() throws InterruptedException {
		driver.get(p.getProperty("url"));
		driver.findElement(By.xpath(p.getProperty("username_loc"))).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath(p.getProperty("passward_loc"))).sendKeys(p.getProperty("passward"));
		driver.findElement(By.xpath(p.getProperty("login_loc"))).click();
		driver.findElement(By.linkText(p.getProperty("recruitment_loc"))).click();
		WebElement search = driver.findElement(By.xpath(p.getProperty("candidateSearch_loc")));
		driver.findElement(By.xpath(p.getProperty("vacancy_loc"))).click();

		List<WebElement> list = driver.findElements(By.xpath(p.getProperty("vacancyOption_loc")));
		for (WebElement option : list) {
			String optText = option.getText();
			System.out.println(optText);
			if (optText.equals("Software Engineer")) {
				option.click();
				try {
					search.click();
				} catch (StaleElementReferenceException e) {
					search = driver.findElement(By.xpath(p.getProperty("candidateSearch_loc")));
					search.click();
				}
				break;

			}
		}

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

	// TC04--Validate if user able to search with Hiring manager
	@Test
	public void tc_004() throws InterruptedException {
		driver.get(p.getProperty("url"));
		driver.findElement(By.xpath(p.getProperty("username_loc"))).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath(p.getProperty("passward_loc"))).sendKeys(p.getProperty("passward"));
		driver.findElement(By.xpath(p.getProperty("login_loc"))).click();
		driver.findElement(By.linkText(p.getProperty("recruitment_loc"))).click();
		WebElement search = driver.findElement(By.xpath(p.getProperty("candidateSearch_loc")));
		driver.findElement(By.xpath(p.getProperty("hiringManager_loc"))).click();
		List<WebElement> list = driver.findElements(By.xpath(p.getProperty("hiringmanagerOption_loc")));
		for (WebElement option : list) {
			String optText = option.getText();
			System.out.println(optText);
			if (optText.equals("Odis Adalwin")) {
				option.click();
				search.click();
				break;
			}
		}

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

	// TC05--Validate if user able to search with Status
	@Test
	public void tc_005() throws InterruptedException {
		driver.get(p.getProperty("url"));
		driver.findElement(By.xpath(p.getProperty("username_loc"))).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath(p.getProperty("passward_loc"))).sendKeys(p.getProperty("passward"));
		driver.findElement(By.xpath(p.getProperty("login_loc"))).click();
		driver.findElement(By.linkText(p.getProperty("recruitment_loc"))).click();
		WebElement search = driver.findElement(By.xpath(p.getProperty("candidateSearch_loc")));
		driver.findElement(By.xpath(p.getProperty("status_loc"))).click();
		List<WebElement> list = driver.findElements(By.xpath(p.getProperty("statusOption_loc")));
		for (WebElement option : list) {
			String optText = option.getText();
			if (optText.equals("rejected")) {
				option.click();
				search.click();
				break;
			}
		}

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

	// TC06--Validate if user able to search with Candidate Name
	@Test
	public void tc_006() throws InterruptedException {
		driver.get(p.getProperty("url"));
		driver.findElement(By.xpath(p.getProperty("username_loc"))).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath(p.getProperty("passward_loc"))).sendKeys(p.getProperty("passward"));
		driver.findElement(By.xpath(p.getProperty("login_loc"))).click();
		driver.findElement(By.linkText(p.getProperty("recruitment_loc"))).click();
		WebElement search = driver.findElement(By.xpath(p.getProperty("candidateSearch_loc")));
		driver.findElement(By.xpath(p.getProperty("candidateName_loc"))).sendKeys(p.getProperty("candidateName_val"));
		
		List<WebElement> li = driver.findElements(By.xpath(p.getProperty("candidateNameOption_loc")));
		for(WebElement option : li) {
			String optText = option.getText();
			if(optText.equals(p.getProperty("candidateName_val"))) {
				option.click();
				search.click();
				break;
			}
			else {
				System.out.println("Name not available");
				
			}
		}
		

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

	// TC07--Validate if user able to search with Keywords
	@Test
	public void tc_007() throws InterruptedException {
		driver.get(p.getProperty("url"));
		driver.findElement(By.xpath(p.getProperty("username_loc"))).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath(p.getProperty("passward_loc"))).sendKeys(p.getProperty("passward"));
		driver.findElement(By.xpath(p.getProperty("login_loc"))).click();
		driver.findElement(By.linkText(p.getProperty("recruitment_loc"))).click();
		WebElement search = driver.findElement(By.xpath(p.getProperty("candidateSearch_loc")));
		driver.findElement(By.xpath(p.getProperty("keyword_loc"))).sendKeys(p.getProperty("keyword_val"));
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

	// TC08-- Validate if user able to search with Date of application
	@Test
	public void tc_008() throws InterruptedException {
		driver.get(p.getProperty("url"));
		driver.findElement(By.xpath(p.getProperty("username_loc"))).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath(p.getProperty("passward_loc"))).sendKeys(p.getProperty("passward"));
		driver.findElement(By.xpath(p.getProperty("login_loc"))).click();
		driver.findElement(By.linkText(p.getProperty("recruitment_loc"))).click();
		WebElement search = driver.findElement(By.xpath(p.getProperty("candidateSearch_loc")));
		driver.findElement(By.xpath(p.getProperty("doafrom_loc"))).sendKeys(p.getProperty("doafrom_val"));
		driver.findElement(By.xpath(p.getProperty("doato_loc"))).sendKeys(p.getProperty("doato_val"));
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

	// TC09--- Validate if user able to search with method of application
	@Test
	public void tc_009() throws InterruptedException {
		driver.get(p.getProperty("url"));
		driver.findElement(By.xpath(p.getProperty("username_loc"))).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath(p.getProperty("passward_loc"))).sendKeys(p.getProperty("passward"));
		driver.findElement(By.xpath(p.getProperty("login_loc"))).click();
		driver.findElement(By.linkText(p.getProperty("recruitment_loc"))).click();
		WebElement search = driver.findElement(By.xpath(p.getProperty("candidateSearch_loc")));
		driver.findElement(By.xpath(p.getProperty("moa_loc"))).click();
		List<WebElement> list = driver.findElements(By.xpath(p.getProperty("moaOption_loc")));
		for (WebElement option : list) {
			String optText = option.getText();
			if (optText.equals("Manual")) {
				option.click();
				search.click();
				break;
			}
		}

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

	// TC10-- Validate working of reset button
	@Test
	public void tc_010() throws InterruptedException {
		driver.get(p.getProperty("url"));
		driver.findElement(By.xpath(p.getProperty("username_loc"))).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath(p.getProperty("passward_loc"))).sendKeys(p.getProperty("passward"));
		driver.findElement(By.xpath(p.getProperty("login_loc"))).click();
		driver.findElement(By.linkText(p.getProperty("recruitment_loc"))).click();
		driver.findElement(By.xpath(p.getProperty("doafrom_loc"))).sendKeys(p.getProperty("doafrom_val"));
		driver.findElement(By.xpath(p.getProperty("doato_loc"))).sendKeys(p.getProperty("doato_val"));
		driver.findElement(By.xpath(p.getProperty("reset_loc"))).click();

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
