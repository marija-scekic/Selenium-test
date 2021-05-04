package pages;

import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
	
	public WebElement getSearchField () {
		return findElement("//input[@id='search']");
	}
	
	public WebElement getSearchButton () {
		return findElement("//header/div[2]/div[5]/div[2]/form[1]/div[2]/button[1]");
	}
	
	public WebElement getItem () {
		return findElement("//a[contains(text(),'PATIKE GALAXY 5 W - FY6746')]");
	}
	
	public WebElement getNoResultsMesaage () {
		return findElement("//div[contains(text(),'Your search returned no results.')]");
	}
	
	public WebElement getBasketButton () {
		return findElement("//header/div[2]/div[3]/a[1]");
	}
	
	

}
