package org.stepdefinition;

import org.helper.BaseClass;
import org.helper.LoginPojo;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;

public class loginstepdefinition extends BaseClass {
	@Given("User should launch the browser and url")
	public void user_should_launch_the_browser_and_url()  {
		
	}
	@When("User should enter invalid username and valid password")
	public void user_should_enter_invalid_username_and_valid_password() throws InterruptedException {
		WebElement account = driver.findElement(By.xpath("//a[@title='Account']"));
		Thread.sleep(2000);
		account.click();
		LoginPojo l=new LoginPojo();
		WebElement txtUser = l.getTxtUser();
		filltextbox(txtUser,"kumba.manivannan530@gmail.com");
		WebElement txtPass = l.getPasswrd();
		filltextbox(txtPass, "Greens@123");
		
	}
	@When("User should click the login button")
	public void user_should_click_the_login_button() {
		LoginPojo l=new LoginPojo();
		WebElement btnLogin = l.getBtnLogin();
		btnLogin.click();
		
	}
	@When("User should print the title of your page")
	public void user_should_print_the_title_of_your_page() {
	    System.out.println(driver.getTitle());
	}
	
	
	@Then("User should navigate to incorrect credential page")
	public void user_should_navigate_to_incorrect_credential_page() {
		
		String currenturl=driver.getCurrentUrl();
		Assert.assertTrue(currenturl, true);
	}

@When("User should enter valid username and invalid password")
public void userShouldEnterValidUsernameAndInvalidPassword() {
	LoginPojo l=new LoginPojo();
	WebElement txtUser = l.getTxtUser();
	filltextbox(txtUser,"Kumaresh");
	WebElement txtPass = l.getPasswrd();
	filltextbox(txtPass, "kumaresh@123");
}

//feature2

//@Given("User should launch the browser and the url")
//public void userShouldLaunchTheBrowserAndTheUrl() {
//}
//@When("User should click the forgetten password link")
//public void userShouldClickTheForgettenPasswordLink() {
//}
//@When("User should enter invalid mobile number in the text box")
//public void userShouldEnterInvalidMobileNumberInTheTextBox() {
//}  
//@When("User should click the search button")
//public void userShouldClickTheSearchButton() {
//}
//@When("User should click the forgotten password link")
//public void userShouldClickTheForgottenPasswordLink() {
//}
}
