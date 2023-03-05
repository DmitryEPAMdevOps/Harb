package workItems.test;
import org.testng.annotations.Test;
import workItems.pages.items.MainPage;
import workItems.pages.items.OpenPages;
import workItems.pages.searchField.AfterEnteringInTheSearchFieldPage;
import workItems.pages.searchField.FirstArticle;
import workItems.pages.searchField.SearchFieldPage;

public class TestClass extends BaseClass{
    MainPage mainPage = new MainPage();
    OpenPages openPages = new OpenPages();
    SearchFieldPage searchFieldPage = new SearchFieldPage();
    AfterEnteringInTheSearchFieldPage afterEnteringInTheSearchFieldPage = new AfterEnteringInTheSearchFieldPage();
    FirstArticle firstArticle = new FirstArticle();
    private static final String SEARCH_VALUE = "Привет";
    /**
     * Проверка работы айтем
     */
    @Test
    public void testWorkItems() {
        mainPage.clickFirstItems();
        openPages.checkingElementsOnThePage();

        mainPage.clickSecondItems();
        openPages.checkingElementsOnThePage();

        mainPage.clickThirdItems();
        openPages.checkingElementsOnThePage();

        mainPage.clickFourthItems();
        openPages.checkingElementsOnThePage();

        mainPage.clickFifthItems();
        openPages.checkingElementsOnThePage();

        mainPage.clickSixthItems();
        openPages.checkingElementsOnThePage();

        mainPage.clickSeventhItems();
        openPages.checkingElementsOnThePage();
    }

    /**
     * Проверяет работу поисковой строки, выводит в консоль назания найденных статей
     */
    @Test
    public void testWorkSearchField(){
        searchFieldPage.clickSearchField(SEARCH_VALUE);
        afterEnteringInTheSearchFieldPage
                .getTitle();

    }

    /**
     * Открывает первую статью в поиске и берет инфу о пользоватете
     */

    @Test
    public void openFirstArticle(){
        searchFieldPage.clickSearchField(SEARCH_VALUE);
        afterEnteringInTheSearchFieldPage.openFirstArticle();
        firstArticle.infoUser();
    }

    /**
     * Вводит в поисковую строку Слово "привет" и ищет самые короткие статьи для прочтения.
     */
    @Test
    public void shortArticle(){
        searchFieldPage.clickSearchField(SEARCH_VALUE);
        afterEnteringInTheSearchFieldPage.gettingTheShortiesArticle();
    }
}
