package workItems.pages.searchField;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class FirstArticle {
    private  final SelenideElement userName = $(byXpath("//div[@class='tm-article-snippet tm-article-presenter__snippet tm-article-snippet']//a[@class='tm-user-info__username']"));
    private  final SelenideElement userKarma = $(byXpath("//div[@class='tm-karma__votes tm-karma__votes_positive']"));
    public void infoUser(){
        String name = userName.text();
        String karma = userKarma.text();
        System.out.println("The username of the person who wrote the article: " + name);
        System.out.println("Karma of the user who wrote the article: " + karma);
    }
}
