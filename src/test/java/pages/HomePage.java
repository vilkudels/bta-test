package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage {
    public static final SelenideElement travelMenuItem = $$("a.item.quick-menu-btn").filterBy(text("Ceļojumi")).first();
}