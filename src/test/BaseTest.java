package test;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import browser.Browser;
import planeta.Planeta;

public class BaseTest {
	
protected static Planeta planeta;
	
	@BeforeClass
	public static void setup() {
		planeta = new Planeta();
	}
	
	@AfterClass
	public static void cleanup() {
		Browser.getBrowser().quit();
	}
	
	@Before
	public void testSetup() {
		Browser.getBrowser().get("https://planetasport.rs/customer/account/login/");
	}

}
