package Pages;

import org.openqa.selenium.WebDriver;

public class AboutUs {
    private WebDriver driver;
    private String url = "https://alan-systems.com/pl/dla-biznesu-o-nas/";

    public AboutUs(WebDriver driver) {
        this.driver = driver;
    }
    public String getUrl() {
        return url;
    }

}

