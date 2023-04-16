package Steps;

import org.openqa.selenium.WebDriver;

import PageObject.FacebookPage;
import Utils.Utility;
import io.cucumber.java.*;
import io.cucumber.java.en.*;
//
public class Step {
	
	WebDriver driver;
	FacebookPage fbPage;
	
	@AfterStep
	public void afterSuite() {
		System.out.println("lskjdflkds");
	}
	
	@Given("OPEN BROWSER")
	public void testing() throws Exception {
		System.out.println("starting....");
		driver = Utility.driver();
		driver.get(Utility.getProperty("url"));
		fbPage = new FacebookPage(driver);
	}
	
	@When("^FB LOGIN USER AS (.+) AND (.+)$")
	public void fb_login_user_as(String s1,String s2) {
	  System.out.print(s1);
	  System.out.print(s2);
	  fbPage.userName(s1);
	  fbPage.password(s2);
	}

	@Then("FB LOGIN BUTTON CLICK")
	public void fb_login_button_click() throws Exception {
	   fbPage.loginButton();
	   Thread.sleep(20000L);
	}

	@Then("BROWSER CLOSE")
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}

}
