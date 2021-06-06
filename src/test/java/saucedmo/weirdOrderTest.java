package saucedmo;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;
import saucedemo.cartPage;
import saucedemo.checkoutPage;
import saucedemo.homePage;
import saucedemo.loginPage;

import static com.codeborne.selenide.Condition.checked;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class weirdOrderTest extends baseTest {
    loginPage loginPage = new loginPage();
    homePage homePage = new homePage();
    cartPage cartPage = new cartPage();
    checkoutPage checkoutPage = new checkoutPage();
    @Test
    void weirdOrderTest() {
        open(Configuration.baseUrl);
        loginPage.usernameField().val(loginPage.username());
        loginPage.passwordField().val(loginPage.password());
        loginPage.loginButton().click();
        homePage.sortContainer().click();
        homePage.priceHightoLow().click();
        homePage.storeItem().get(2).click();
        homePage.storeItem().last().click();
        homePage.storeItem().get(2).shouldHave(text("Remove"));
        homePage.storeItem().last().shouldHave(text("Remove"));
        homePage.cartBade().shouldHave(text("2"));
        homePage.cartBade().click();
        cartPage.itemList().shouldHaveSize(1);
        cartPage.removeButton().click();
        cartPage.itemList().shouldHaveSize(1);
        cartPage.checkoutButton().click();
        checkoutPage.firstName().val("Ilan");
        checkoutPage.laseName().val("Zaslawsky");
        checkoutPage.postalCode().val("55555");
        checkoutPage.continueButton().click();
        checkoutPage.itemTotal().shouldHave(text("7.99"));
        checkoutPage.finishButton().click();
        checkoutPage.finalMessage().shouldHave(text("Your order has been dispatched,\n" +
                "and will arrive just as fast as the pony can get there!"));





    }
}
