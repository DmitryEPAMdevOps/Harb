package workItems.pages.searchField;
import com.codeborne.selenide.*;
import java.util.List;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class AfterEnteringInTheSearchFieldPage {
    private final ElementsCollection titleOfArticle = $$(byXpath("//a[@class='tm-article-snippet__title-link']"));
    private final ElementsCollection articleSnippet= $$(".tm-article-snippet.tm-article-snippet");

    public void getTitle() {
        titleOfArticle.shouldBe(CollectionCondition.size(19));
        List<String> x = titleOfArticle.texts();
        for (String ff : x) {
            System.out.println(ff);
        }
    }

    public void openFirstArticle() {
        titleOfArticle.first().click();
    }


    public void gettingTheShortiesArticle() {
        titleOfArticle.shouldBe(CollectionCondition.size(19));
        int minReadingTime = Integer.MAX_VALUE;
        SelenideElement fastestArticle = null;

        for (SelenideElement article : articleSnippet) {
            SelenideElement readingTimeElement = article.$(".tm-article-reading-time__label");
            String readingTimeText = readingTimeElement.text();
            int readingTime = Integer.parseInt(readingTimeText.replace(" ", "").replace("мин", ""));
            if (readingTime <= minReadingTime) {
                minReadingTime = readingTime;
                fastestArticle = article;
                SelenideElement titleLink = fastestArticle.$(".tm-article-snippet__title-link");
                System.out.println(titleLink.text());
            }

        }


    }
}

