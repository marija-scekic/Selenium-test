package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class LogInTest extends BaseTest {
	

	@Test
	public void LoginWithEmptyFieldsTest() {
		planeta.getLogInPage().getLogInButton().click();

		assertEquals("Ovo polje je obavezno", planeta.getLogInPage().getEmailEmptyError().getText());
		assertEquals("Ovo polje je obavezno", planeta.getLogInPage().getPassEmptyError().getText());
		
	}
	
	@Test
	public void LoginWithoutEmailTest() {
		planeta.getLogInPage().getPassField().sendKeys("PlaviPassword");
		planeta.getLogInPage().getLogInButton().click();
		
		assertEquals("Ovo polje je obavezno", planeta.getLogInPage().getEmailEmptyError().getText());
		
	}
	
	@Test
	public void LoginWithoutPassTest() {
		planeta.getLogInPage().getEmailField().sendKeys("plavatufna@gmail.com");
		planeta.getLogInPage().getLogInButton().click();
		
		assertEquals("Ovo polje je obavezno", planeta.getLogInPage().getPassEmptyError().getText());
		
	}
	
	@Test
	public void LoginWithInvalidEmailFormatTest() {
		planeta.getLogInPage().getEmailField().sendKeys("plavatufnaatgmaildotcom");
		planeta.getLogInPage().getPassField().sendKeys("PlaviPassword");
		planeta.getLogInPage().getLogInButton().click();
		
		assertEquals("Molimo Vas unesite validan e-mail.", planeta.getLogInPage().getEmailEmptyError().getText());
		
		
	}
	
	@Test
	public void LoginWithInvalidEmailAndPassTest() {
		planeta.getLogInPage().getEmailField().sendKeys("marija.scekic1216@gmail.com");
		planeta.getLogInPage().getPassField().sendKeys("TestPassword");
		planeta.getLogInPage().getLogInButton().click();
		
		assertEquals("", planeta.getLogInPage().getPassField().getText());
		assertNotNull(planeta.getLogInPage().getAccountError());
		
		
	}
	
	@Test
	public void LoginWithValidEmailAndInvalidPassTest() {
		planeta.getLogInPage().getEmailField().sendKeys("plavatufna@gmail.com");
		planeta.getLogInPage().getPassField().sendKeys("TestPassword");
		planeta.getLogInPage().getLogInButton().click();
		
		assertEquals("", planeta.getLogInPage().getPassField().getText());
		assertNotNull(planeta.getLogInPage().getAccountError());
		
		
	}
	
	@Test
	public void LoginWithInvalidEmailAndValidPassTest() {
		planeta.getLogInPage().getEmailField().sendKeys("marija.scekic1216@gmail.com");
		planeta.getLogInPage().getPassField().sendKeys("PlaviPassword");
		planeta.getLogInPage().getLogInButton().click();
		
		assertEquals("", planeta.getLogInPage().getPassField().getText());
		assertNotNull(planeta.getLogInPage().getAccountError());
		
		
	}
	
	@Test
	public void LoginWithValidEmailAndPassTest() {
		planeta.getLogInPage().getEmailField().sendKeys("plavatufna@gmail.com");
		planeta.getLogInPage().getPassField().sendKeys("PlaviPassword");
		planeta.getLogInPage().getLogInButton().click();
		
		assertEquals("Moj nalog", browser.Browser.getBrowser().getTitle());
		planeta.getLogInPage().getLogoutButton().click();
	
	}
	
	@Test
	public void ForgotPassButonFuncionalityTest() {
		planeta.getLogInPage().getForgotPassButton().click();
		
		assertEquals("Zaboravili ste lozinku?" , browser.Browser.getBrowser().getTitle());
	}
	
	@Test
	public void LogInWithFacebookButtonFuncionalityTest() {
		planeta.getLogInPage().getLogInWithFacebookButton().click();
		
		assertEquals("Пријављивање на Фејсбук | Фејсбук" , browser.Browser.getBrowser().getTitle());
		
	}
	
	@Test
	public void SignInWithGoogleButtonFuncionalityTest() {
		planeta.getLogInPage().getSignInWithGoogleButton().click();
		
		assertEquals("Пријављивање – Google налози", browser.Browser.getBrowser().getTitle());
	}

}
