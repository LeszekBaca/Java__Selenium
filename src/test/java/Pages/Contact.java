package Pages;

import org.openqa.selenium.WebDriver;

public class Contact {
    private WebDriver driver;
    private String url = "https://alan-systems.com/pl/dla-biznesu-kontakt/";

    public Contact(WebDriver driver) {
        this.driver = driver;
    }
    public String getUrl() {
        return url;
    }
}
