package workItems.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.open;

public class BaseClass {
    public void setup(){
        Configuration.timeout = 8000;
        Configuration.browser = "chrome";
        Configuration.startMaximized=true;
        Configuration.headless = false;

    }
    @BeforeClass
    public void init(){
        setup();
        open("https://habr.com/ru/all/");
    }
    @AfterClass
    public void ternDown(){
        Selenide.closeWebDriver();
    }
}
