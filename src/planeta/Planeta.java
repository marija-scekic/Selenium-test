package planeta;

import pages.BasketPage;
import pages.DeleteFromBasketPopUpPage;
import pages.HomePage;
import pages.ItemPage;
import pages.LogInPage;

public class Planeta {
	
	private HomePage homePage;
	private LogInPage logInPage;
	private ItemPage itemPage;
	private BasketPage basketPage;
	private DeleteFromBasketPopUpPage deleteFromBasketPopUpPage;
	
	public HomePage getHomePage() {
		if (homePage == null) {
			homePage = new HomePage();
		}
		return homePage;
	}
	
	public LogInPage getLogInPage () {
		if (logInPage == null) {
			logInPage = new LogInPage ();
		}
		return logInPage;
	}
	
	public ItemPage getItemPage () {
		if (itemPage == null) {
			itemPage = new ItemPage ();
		}
		return itemPage;
	}
	
	public BasketPage getBasketPage () {
		if (basketPage == null) {
			basketPage = new BasketPage ();
		}
		return basketPage;
	}
	
	public DeleteFromBasketPopUpPage getDeleteFromBasketPopUpPage () {
		if (deleteFromBasketPopUpPage == null) {
			deleteFromBasketPopUpPage = new DeleteFromBasketPopUpPage ();
		}
		return deleteFromBasketPopUpPage;
	}

}
