package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement search() {
        return findLocftor("//input[@name='search']");
    }

    public WebElement buttonBy() {
        return waitClickbleElement("//span[@class='buy-button__label ng-star-inserted']");
    }

    public WebElement buttonOrder() {
        return waitClickbleElement("//span[@data-testid='cart-receipt-submit-order']");
    }

    public WebElement buttonCart() {
        return findLocftor("//button[@class='header-cart__button']");
    }

    public WebElement elementDelete() {
        return findLocftor("//button[@aria-controls='cartProductActions0']");
    }

    public WebElement buttonDelete() {
        return waitClickbleElement("//button[@class='button button--medium button--with-icon button--link']");
    }

    public WebElement closeCart() {
        return waitClickbleElement("//div[@data-testid='modal-header']//button");
    }

    public WebElement cartIsEmpty() {
        return waitClickbleElement("//div//h4[@class='cart-dummy__heading']");
    }

    public void addGoodsd() {
        navigate("https://rozetka.com.ua/");
        search().sendKeys("Кавомашина PHILIPS Series 4400 LatteGo EP4449/70\n");
        buttonBy().click();
    }

}
