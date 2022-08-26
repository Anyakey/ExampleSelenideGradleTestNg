import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.MainPage;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPageTests extends BaseTest {
    MainPage mainPage = new MainPage();

    @BeforeTest
    public void closePopup() {
        mainPage.openMainPage()
                .popupYesBtnClick();
    }

    @Test
    public void checkMenuBtn() {
        mainPage.openMainPage()
                .sideMenuBtnClick()
                .checkSideMenuText("ОСОБИСТИЙ КАБІНЕТ");
    }

    @Test
    public void checkMenuSignInBtn() {
        mainPage.openMainPage()
                .sideMenuBtnClick()
                .checkMenuSignInBtn();
    }

    @Test
    public void checkMenuAboutUsLink() {
        mainPage.openMainPage()
                .sideMenuBtnClick()
                .clickAboutUsLink()
                .checkTitle();
    }
}
