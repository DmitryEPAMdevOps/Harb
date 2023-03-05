package workItems.pages.searchField;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class SearchFieldPage{
    /**
     * Testing SearchString
     */
    private  final SelenideElement searchField = $(byXpath("//a[@href='/ru/search/']"));
    private  final SelenideElement searchFieldAndWriteText=$(byXpath("//input[@name='q']"));

    public void clickSearchField(String value){
        searchField.click();
        searchFieldAndWriteText.val(value).pressEnter();
    }
}
