package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHrmLogout {

	WebDriver driver;
	By uid = By.xpath("//input[@name=\"username\"]");
	By pwd = By.xpath("//input[@name=\"password\"]");
	By login = By.xpath("//button[@type=\"submit\"]");
	By adminModule = By.xpath("//img[@alt=\"profile picture\"]/parent::span");
	By logout = By.xpath("//a[text()=\"Logout\"]");
	By dashboard = By.xpath("//h6[text()=\"Dashboard\"]");

	public OrangeHrmLogout(WebDriver driver) {
		this.driver = driver;
	}

	public void setUsername(String username) {
		driver.findElement(uid).sendKeys(username);
	}

	public void setPassword(String password) {
		driver.findElement(pwd).sendKeys(password);
	}

	public void clickLogin() {
		driver.findElement(login).click();
	}

	public void clickAdmin() {
		driver.findElement(adminModule).click();
	}

	public void clickLogout() {
		driver.findElement(logout).click();
	}
	public boolean checkHome() {
		boolean atHome =driver.findElement(dashboard).isDisplayed();
		return atHome;
	}
	public boolean loginDisplayed() {
		boolean atLogin = driver.findElement(login).isDisplayed();
		return atLogin;
	}
}
