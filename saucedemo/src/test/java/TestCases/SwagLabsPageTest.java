package TestCases;

import org.testng.annotations.Test;

import BaseTestcases.BaseTest;
import PageObject.SwagLabsPage;

public class SwagLabsPageTest extends BaseTest {

    @Test
    public void selectLowestPriceItem() {

        SwagLabsPage spage = new SwagLabsPage(driver);

        spage.addLowestPriceItemToCart();
        System.out.println("new changes");
    }
}