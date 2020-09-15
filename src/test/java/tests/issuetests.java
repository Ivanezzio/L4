package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class issuetests {


    @Test
    public void createNewIssue() {
        Configuration. holdBrowserOpen = true;
        open("https://github.com");
        $(".header-search-input").click();
        $(".header-search-input").sendKeys("ivanezzio/L4");
        $(".header-search-input").submit();
        $(By.linkText("Ivanezzio/L4")).click();
        $(withText("Issues")).click();




    }


}

