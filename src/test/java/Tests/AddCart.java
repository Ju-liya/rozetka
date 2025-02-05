package Tests;

import BaseClass.BasePage;
import BaseClass.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddCart extends TestInit {

    @Test
    public void addProductToCart() {
        HomePage homePage = new HomePage(driver);
        homePage.getUrl("https://rozetka.com.ua/");
        homePage.search().sendKeys("Кавомашина PHILIPS Series 4400 LatteGo EP4449/70\n");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement buyButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[@class='buy-button__label ng-star-inserted']")));
        homePage.buttonBy().click();

        Assert.assertTrue(homePage.buttonOrder().isDisplayed(), "Оформлення замовлення");
        homePage.closeCart().click();
    }

    @Test
    public void deleteProduct() {
        HomePage homePage = new HomePage(driver);
        homePage.buttonCart().click();
        homePage.elementDelete().click();
        homePage.buttonDelete().click();
        Assert.assertTrue(homePage.cartIsEmpty().isDisplayed(),"Кошик не є порожнім");

    }
}
