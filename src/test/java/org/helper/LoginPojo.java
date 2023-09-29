package org.helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	// non parameterized
		public LoginPojo() {
		PageFactory.initElements(driver, this);
		}
		
		// private webElement
		
		
		@FindBy(name="customer[email]")
		private WebElement txtUser;
		
		@FindBy(name="customer[password]")
		private WebElement passwrd;
		
		@FindBy(xpath="//button[@class=\"o-btn c-login-form__btn p-customer__btn\"]")
		private WebElement btnLogin;
		
		// getters

		public WebElement getTxtUser() {
			return txtUser;
		}

		public WebElement getPasswrd() {
			return passwrd;
		}

		public WebElement getBtnLogin() {
			return btnLogin;
		}

}
