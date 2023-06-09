package Pages;

import org.openqa.selenium.WebDriver;

public class ForCandidaes {

    private String url =  "https://alan-systems.com/pl/dla-kandydatow/";

    private WebDriver driver;

    public ForCandidaes(WebDriver driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }


}
