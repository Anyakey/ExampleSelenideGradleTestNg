package pages;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class AboutUsPage {
    public void openAboutPage() {
        open(Configuration.baseUrl + "/about");
    }
    public void checkTitle() {
        assertThat(title(), equalTo("Про компанію - Кінотеатр Multiplex | Київ, Харків, Дніпро, Херсон і вся Україна"));
    }
}
