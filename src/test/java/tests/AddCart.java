package tests;

import baseClass.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddCart extends TestInit {

    @Test
    public void addProductToCart() {
        HomePage homePage = new HomePage(driver);
        homePage.addGoodsd();
        Assert.assertTrue(homePage.buttonOrder().isDisplayed(), "Оформлення замовлення");
    }
}
