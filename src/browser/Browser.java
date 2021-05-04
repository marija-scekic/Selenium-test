package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Browser {
	
private static ChromeDriver browser;
	
	public static ChromeDriver getBrowser() {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium webdriver\\chromedriver.exe");
        if (browser == null) {
        	browser = new ChromeDriver(ops);
        	}
        
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        
        return browser;		
       
	}


}
