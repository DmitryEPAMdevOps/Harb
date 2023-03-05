package workItems.pages.items;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private final SelenideElement allThreadsLink = $(byAttribute("href","/ru/all/"));
    private final SelenideElement development = $(byAttribute("href","/ru/flows/develop/"));
    private final SelenideElement administration = $(byAttribute("href","/ru/flows/admin/"));
    private final SelenideElement design = $(byAttribute("href","/ru/flows/design/"));
    private final SelenideElement management = $(byAttribute("href","/ru/flows/management/"));
    private final SelenideElement marketing = $(byAttribute("href","/ru/flows/marketing/"));
    private final SelenideElement popsci = $(byAttribute("href","/ru/flows/popsci/"));



    /**
     * Testing work items
     */

    public void clickFirstItems() {
        allThreadsLink.click();
    }
    public void clickSecondItems() {
        development.click();
    }
    public void clickThirdItems() {
        administration.click();
    }
    public void clickFourthItems() {
        design.click();
    }
    public void clickFifthItems() {
        management.click();
    }
    public void clickSixthItems() {
        marketing.click();
    }
    public void clickSeventhItems() {
        popsci.click();
    }

}

