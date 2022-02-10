package pages.components;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class PlaceholderComponent {
    public void clickOn(String locator) {
        $(byText(locator)).click();
    }
}
