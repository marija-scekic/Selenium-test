package pages;

import org.openqa.selenium.WebElement;

public class ItemPage extends BasePage{
	
	public WebElement getAddToBasketButton () {
		return findElement("//body/div[2]/main[1]/div[3]/div[1]/div[1]/div[6]/form[1]/div[3]/div[1]/div[1]/div[3]/div[1]");
	}
	
	public WebElement getSelectSizeButton () {
		return findElement("//span[contains(text(),'Odaberite velièinu')]");
	}
	
	public WebElement getSizeButton () {
		return findElement("//div[@id='option-label-size-158-item-33']");
	}
	
	public WebElement getSizeErrorMessage () {
		return findElement("//span[contains(text(),'Odaberite velièinu')]");
	}

}
