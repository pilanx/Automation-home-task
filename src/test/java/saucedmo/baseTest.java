package saucedmo;

import com.codeborne.selenide.Configuration;

public class baseTest {
    static {
        Configuration.startMaximized = true;
        Configuration.baseUrl = "https://www.saucedemo.com/inventory.html";
    }
}
