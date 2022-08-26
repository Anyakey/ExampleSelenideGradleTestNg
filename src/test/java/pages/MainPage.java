package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    SelenideElement popupYesBtn = $(".yes");
    SelenideElement sideMenuBtn = $(".menu-btn");
    SelenideElement sideMenuText = $(".mob_container > div.menu-block >.menu-block-heading");
    SelenideElement menuSignInBtn = $(".menu-block > a");
    SelenideElement aboutUsLink = $( "body > div.left_menu.js-left-menu.on > div > div.mob_container > div.menu_list > a:nth-child(8)");

    public MainPage openMainPage() {
        open(baseUrl);
        return this;
    }

    public MainPage popupYesBtnClick() {
        popupYesBtn.shouldBe(visible).click();
        return this;
    }

    public MainPage sideMenuBtnClick() {
        sideMenuBtn.shouldBe(visible).click();
        return this;
    }

    public void checkSideMenuText(String word) {
        sideMenuText.shouldHave(exactText(word));
    }

    public void checkMenuSignInBtn() {
        menuSignInBtn.shouldBe(visible).shouldBe(exist);
    }

    public AboutUsPage clickAboutUsLink() {

        aboutUsLink.shouldBe(visible).click();
        return new AboutUsPage();
    }
}


