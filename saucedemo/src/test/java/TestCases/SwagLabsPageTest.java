package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseTestcases.BaseTest;
import PageObject.SwagLabsPage;

public class SwagLabsPageTest extends BaseTest {
	
		@Test
		public void intenvoryTest() {
			System.out.println("2. Test driver = " + driver);
			SwagLabsPage spage=new SwagLabsPage(driver);
			 System.out.println("3. Page driver = " + spage.driver);
			List<WebElement> items=spage.inventoryItems();
			List<WebElement> itemName=spage.inventoryItemName();
			List<WebElement> itemPrice=spage.inventoryItemPrice();
			
			//total items
			System.out.println(items.size());
			
			//itemsname
			
			for(WebElement iname:itemName) {
				System.out.println(iname.getText());
			}
			
			//itemsPrice
			
			for(WebElement iprice:itemPrice) {
				System.out.println(iprice.getText());
			}
			
		}
		
		@Test
		public void selectLowestPriceItem() {

		    SwagLabsPage spage = new SwagLabsPage(driver);

		    WebElement lowestItem = spage.getLowestPriceItem();

		    System.out.println(
		        "Lowest price item: " +
		        lowestItem.findElement(By.className("inventory_item_name")).getText()
		    );

		    System.out.println(
		        "Price: " +
		        lowestItem.findElement(By.className("inventory_item_price")).getText()
		    );

		    lowestItem.findElement(
		        By.id("add-to-cart-sauce-labs-onesie")
		    ).click();
		}
}
