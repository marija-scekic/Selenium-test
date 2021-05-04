package pages;

import org.openqa.selenium.WebElement;

public class DeleteFromBasketPopUpPage extends BasePage {
	
	public WebElement getDeleteFromBasketPopUp () {
		return findElement("//body/div[7]/div[1]");
	}
	
	public WebElement getDeleteMessage () {
		return findElement("//div[contains(text(),'Da li ste sigurni da hoæete da uklonite ovaj artik')]");
	}
	
	public WebElement getCancelButton () {
		return findElement("//span[contains(text(),'Otkaži')]");
	}
	
	public WebElement getOkButton () {
		return findElement("//body[1]/div[7]/aside[2]/div[2]/footer[1]/button[2]/span[1]");
	}
	
	


}
