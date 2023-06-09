package Pages;

import org.openqa.selenium.WebDriver;

public class Offer {
    private WebDriver driver;
    private String url = "https://alan-systems.com/pl/dla-biznesu-oferta/";

    public Offer(WebDriver driver) {
        this.driver = driver;
    }
    public String getUrl() {
        return url;
    }
}
