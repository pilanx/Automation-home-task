package saucedemo;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import lombok.experimental.Accessors;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

@Getter
@Accessors(fluent = true)
public class checkoutPage {
    private final SelenideElement firstName = $(byId("first-name"));
    private final SelenideElement laseName = $(byId("last-name"));
    private final SelenideElement postalCode = $(byId("postal-code"));
    private final SelenideElement continueButton = $(byId("continue"));
    private final SelenideElement itemTotal = $(By.className("summary_subtotal_label"));
    private final SelenideElement finishButton = $(byId("finish"));
    private final SelenideElement finalMessage = $(byClassName("complete-text"));
}
