package tests;

import baseClass.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteFromCart extends TestInit {
    @Test
    public void deleteProduct() {
        HomePage homePage = new HomePage(driver);
        homePage.addGoodsd();
        homePage.closeCart().click();
        homePage.buttonCart().click();
        homePage.elementDelete().click();
        homePage.buttonDelete().click();
        Assert.assertTrue(homePage.cartIsEmpty().isDisplayed(),"Кошик не є порожнім");
    }
}
