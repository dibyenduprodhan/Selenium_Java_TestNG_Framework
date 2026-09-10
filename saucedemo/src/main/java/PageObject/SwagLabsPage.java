package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BaseClass.BasePage;

public class SwagLabsPage extends BasePage{
	//constructor
	public SwagLabsPage(WebDriver driver) {
		super(driver);
	}
	
	private By totalItems=By.xpath("//div[@class='inventory_item']");
	private By itemNames=By.xpath("//div[@class='inventory_item_name ']");
	private By itemsPrice=By.xpath("//div[@class='inventory_item_price']");
	
	
	public List<WebElement> inventoryItems() {
		return driver.findElements(totalItems);
	}
	
	public List<WebElement> inventoryItemName() {
		return driver.findElements(itemNames);
	}
	
	public List<WebElement> inventoryItemPrice() {
		return driver.findElements(itemsPrice);
	}
	//lowest price item
	public WebElement getLowestPriceItem() {

	    List<WebElement> products = driver.findElements(
	            By.className("inventory_item")
	    );

	    double lowestPrice = Double.MAX_VALUE;
	    WebElement lowestItem = null;

	    for (WebElement product : products) {

	        String priceText = product
	                .findElement(By.className("inventory_item_price"))
	                .getText();

	        double price = Double.parseDouble(
	                priceText.replace("$", "")
	        );

	        if (price < lowestPrice) {
	            lowestPrice = price;
	            lowestItem = product;
	        }
	    }

	    return lowestItem;
	}

	public WebElement getLowestPriceItem1() {
		// TODO Auto-generated method stub
		return null;
	}

}
