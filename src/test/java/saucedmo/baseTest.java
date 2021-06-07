package saucedmo;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;

import java.util.List;

public class baseTest {
    static {
        Configuration.startMaximized = true;
        Configuration.baseUrl = "https://www.saucedemo.com/inventory.html";
    }

}
