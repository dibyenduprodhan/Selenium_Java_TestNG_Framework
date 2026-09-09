package BaseClass;

import org.openqa.selenium.WebDriver;

public class BasePage {
	public WebDriver driver;
	//basepage constructor
	public BasePage(WebDriver driver) {
		this.driver=driver;
	}
}
