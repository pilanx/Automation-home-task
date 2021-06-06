package saucedemo;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import lombok.experimental.Accessors;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@Getter
@Accessors(fluent = true)
public class homePage {
private final SelenideElement sortContainer = $(byClassName("product_sort_container"));
private final SelenideElement priceHightoLow = $(byText("Price (high to low)"));
private final ElementsCollection storeItem = $$("button");
private final SelenideElement cartBade = $(byClassName("shopping_cart_badge"));

}
