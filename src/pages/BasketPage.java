package pages;

import org.openqa.selenium.WebElement;

public class BasketPage extends BasePage {
	
	public WebElement getPopUpBasket () {
		return findElement("//div[@id='ui-id-1']");
	}
	
	public WebElement getItemInBasket () {
		return findElement("//a[contains(text(),'PATIKE GALAXY 5 W - FY6746')]");
	}
	
	public WebElement getDeleteButton () {
		return findElement("//header/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[4]/div[2]/a[1]");
	}
	
	public WebElement getNoItemsMessage () {
		return findElement("//strong[contains(text(),'Nemate artikle u korpi.')]");
	}

}
