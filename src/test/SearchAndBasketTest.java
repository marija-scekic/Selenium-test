package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import browser.Browser;

public class SearchAndBasketTest extends BaseTest2 {
	
	WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), 10);
	
	@Test
	public void SearchWithInvalidData() {
		Browser.getBrowser().get("https://planetasport.rs/");
		planeta.getHomePage().getSearchField().sendKeys("GALAKSIJA");
		wait.until(ExpectedConditions.elementToBeClickable(planeta.getHomePage().getSearchButton()));
		planeta.getHomePage().getSearchButton().click();
		
		assertEquals("Your search returned no results." , planeta.getHomePage().getNoResultsMesaage().getText());
		
	}
	
	@Test
	public void SearchWithValidData() {
		Browser.getBrowser().get("https://planetasport.rs/");
		planeta.getHomePage().getSearchField().sendKeys("GALAXY 5 W FY6746");
		wait.until(ExpectedConditions.elementToBeClickable(planeta.getHomePage().getSearchButton()));
		planeta.getHomePage().getSearchButton().click();
		
		assertEquals("PATIKE GALAXY 5 W - FY6746" , planeta.getHomePage().getItem().getText());
	}
	
	@Test
	public void AddItemWithoutSize() {
		Browser.getBrowser().get("https://planetasport.rs/patike-galaxy-5-w-fy6746.html");
		wait.until(ExpectedConditions.elementToBeClickable(planeta.getItemPage().getAddToBasketButton()));
		planeta.getItemPage().getAddToBasketButton().click();
		
		assertEquals("Odaberite velièinu" , planeta.getItemPage().getSizeErrorMessage().getText());
	}
	
	@Test
	public void AddItemWithSize() {
		Browser.getBrowser().get("https://planetasport.rs/patike-galaxy-5-w-fy6746.html");
		wait.until(ExpectedConditions.elementToBeClickable(planeta.getItemPage().getSizeButton()));
		planeta.getItemPage().getSizeButton().click();
		wait.until(ExpectedConditions.elementToBeClickable(planeta.getItemPage().getAddToBasketButton()));
		planeta.getItemPage().getAddToBasketButton().click();
		
		assertNotNull(planeta.getBasketPage().getPopUpBasket());
		assertNotNull(planeta.getBasketPage().getItemInBasket());
	}
	
	@Test
	public void DeleteItemButtonFuncionalityTest() {
		Browser.getBrowser().get("https://planetasport.rs/patike-galaxy-5-w-fy6746.html");
		wait.until(ExpectedConditions.elementToBeClickable(planeta.getItemPage().getSizeButton()));
		planeta.getItemPage().getSizeButton().click();
		wait.until(ExpectedConditions.elementToBeClickable(planeta.getItemPage().getAddToBasketButton()));
		planeta.getItemPage().getAddToBasketButton().click();
		wait.until(ExpectedConditions.elementToBeClickable(planeta.getBasketPage().getDeleteButton()));
		planeta.getBasketPage().getDeleteButton().click();
		
		assertNotNull(planeta.getDeleteFromBasketPopUpPage().getDeleteFromBasketPopUp());
		assertEquals("Da li ste sigurni da hoæete da uklonite ovaj artikal iz korpe?", planeta.getDeleteFromBasketPopUpPage().getDeleteMessage().getText());
		assertEquals("Otkaži" , planeta.getDeleteFromBasketPopUpPage().getCancelButton().getText());
		assertEquals("OK" , planeta.getDeleteFromBasketPopUpPage().getOkButton().getText());
		
	}
	
	@Test
	public void CancelButtonFuncionalityTest() {
		Browser.getBrowser().get("https://planetasport.rs/patike-galaxy-5-w-fy6746.html");
		wait.until(ExpectedConditions.elementToBeClickable(planeta.getHomePage().getBasketButton()));
		planeta.getHomePage().getBasketButton().click();
		wait.until(ExpectedConditions.elementToBeClickable(planeta.getBasketPage().getDeleteButton()));
		planeta.getBasketPage().getDeleteButton().click();
		wait.until(ExpectedConditions.elementToBeClickable(planeta.getDeleteFromBasketPopUpPage().getOkButton()));
		planeta.getDeleteFromBasketPopUpPage().getOkButton().click();
		
		assertNotNull(planeta.getBasketPage().getPopUpBasket());
		assertNotNull(planeta.getBasketPage().getItemInBasket());
		
	}
	
	@Test
	public void OkButtonFuncionalityTest() {
		Browser.getBrowser().get("https://planetasport.rs/patike-galaxy-5-w-fy6746.html");
		wait.until(ExpectedConditions.elementToBeClickable(planeta.getHomePage().getBasketButton()));
		planeta.getHomePage().getBasketButton().click();
		wait.until(ExpectedConditions.elementToBeClickable(planeta.getBasketPage().getDeleteButton()));
		planeta.getBasketPage().getDeleteButton().click();
		wait.until(ExpectedConditions.elementToBeClickable(planeta.getDeleteFromBasketPopUpPage().getOkButton()));
		planeta.getDeleteFromBasketPopUpPage().getOkButton().click();
		
		assertNotNull(planeta.getBasketPage().getPopUpBasket());
		assertEquals("Nemate artikle u korpi." , planeta.getBasketPage().getNoItemsMessage().getText());
		
	}

}
