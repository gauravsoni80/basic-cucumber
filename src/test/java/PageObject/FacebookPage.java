package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import constants.XPath;

public class FacebookPage {
	
	 WebElement element;
	 WebDriver driver;
	 
	 public FacebookPage(WebDriver rDriver) {
		 driver = rDriver;
		 PageFactory.initElements(driver, this);
	 }
	
	public void userName(String name) {
		element = driver.findElement(By.xpath(XPath.USER));
		element.sendKeys(name);
	}
	
	public void password(String pwd) {
		element = driver.findElement(By.xpath(XPath.PASSWORD));
		element.sendKeys(pwd);
	}
	public void loginButton() {
		element = driver.findElement(By.xpath(XPath.BUTTON));
		element.click();
	}
}
