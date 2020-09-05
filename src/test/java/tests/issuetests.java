package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class issuetests {


    @Test
    public void createNewIssue() {
        Configuration. holdBrowserOpen = true;
        open("https://github.com");
        //$(".header-search-input").click();
        //$(".header-search-input").     sendKeys("");



    }


}

