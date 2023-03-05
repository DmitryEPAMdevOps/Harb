package workItems.pages.items;

import com.codeborne.selenide.ElementsCollection;
import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$$;

public class OpenPages  {

    private  final ElementsCollection allThreads = $$(byXpath("//h2[@class='tm-article-snippet__title tm-article-snippet__title_h2']"));

    public void checkingElementsOnThePage(){
        allThreads.shouldHave(size(20));
    }
}
