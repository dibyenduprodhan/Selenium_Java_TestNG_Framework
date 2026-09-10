package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BaseClass.BasePage;

public class SwagLabsPage extends BasePage {

    public SwagLabsPage(WebDriver driver) {
        super(driver);
    }

    private By totalItems = By.className("inventory_item");
    private By itemPrice = By.className("inventory_item_price");
    private By addToCartButton = By.className("btn_inventory");

    public void addLowestPriceItemToCart() {

        List<WebElement> products = driver.findElements(totalItems);

        double lowestPrice = Double.MAX_VALUE;
        WebElement lowestItem = null;

        for (WebElement product : products) {

            String priceText = product.findElement(itemPrice).getText();

            double price = Double.parseDouble(
                    priceText.replace("$", "")
            );

            if (price < lowestPrice) {
                lowestPrice = price;
                lowestItem = product;
            }
        }

        lowestItem.findElement(addToCartButton).click();
    }
}