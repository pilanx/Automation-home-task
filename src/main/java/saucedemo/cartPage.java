package saucedemo;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import lombok.experimental.Accessors;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@Getter
@Accessors(fluent = true)
public class cartPage {
    final private SelenideElement removeButton = $(By.id("remove-sauce-labs-fleece-jacket"));
    final private ElementsCollection itemList = $$(byClassName("cart_list"));
    final private SelenideElement checkoutButton = $(withText("Checkout"));

}
