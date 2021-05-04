package pages;

import org.openqa.selenium.WebElement;

public class LogInPage extends BasePage {
	
	public WebElement getEmailField () {
		return findElement("//input[@id='email']");
	}
	
	public WebElement getPassField () {
		return findElement("//body/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[3]/div[1]/input[1]");
	}
	
	public WebElement getLogInButton () {
		return findElement("//body/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[4]/div[1]/button[1]");
	}
	
	public WebElement getEmailEmptyError () {
		return findElement("//div[@id='email-error']");
	}
	
	public WebElement getPassEmptyError () {
		return findElement("//div[@id='pass-error']");
	}
	
	public WebElement getLogoutButton () {
		return findElement("//header/div[1]/div[1]/ul[1]/li[2]/a[1]");
	}
	
	public WebElement getAccountError () {
		return findElement("//body/div[2]/main[1]/div[2]/div[2]/div[1]/div[1]");
	}
	
	public WebElement getForgotPassButton () {
		return findElement("//body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[4]/div[2]/a[1]/span[1]");
	}
	
	public WebElement getLogInWithFacebookButton () {
		return findElement("//a[contains(text(),'Login with Facebook')]");
	}
	
	public WebElement getSignInWithGoogleButton () {
		return findElement("//body/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[5]/ul[1]/li[2]/div[1]/div[1]");
	}
	

}
