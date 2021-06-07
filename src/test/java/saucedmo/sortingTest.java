package saucedmo;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import org.testng.annotations.Test;
import saucedemo.homePage;
import saucedemo.loginPage;

import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.open;

public class sortingTest extends baseTest {
    saucedemo.loginPage loginPage = new loginPage();
    saucedemo.homePage homePage = new homePage();
    @Test
    void sortingTest(){
        open(Configuration.baseUrl);
        loginPage.usernameField().val(loginPage.username());
        loginPage.passwordField().val(loginPage.password());
        loginPage.loginButton().click();
        homePage.sortContainer().click();
        homePage.priceLowtoHigh().click();
        is_stored(homePage.allitemList());

    }
    final private boolean is_stored (ElementsCollection elements){
        List<String> pricesString = elements.texts();
        List<Integer> pricesInt = pricesString.stream().collect(Collectors.toList(Integer::parseInt));
        for (int i = pricesInt.size(); i >= pricesInt.get(i);i++){
            if (pricesInt.get(i) >= pricesInt.get(i)-1){
                return false;
            }
        }
        return true;
    }
}
