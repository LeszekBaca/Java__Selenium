package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForBusiness {

    private WebDriver driver;
    private String url = "https://alan-systems.com/pl/dla-biznesu/";

    public ForBusiness(WebDriver driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public WebElement forBusiness(){
        return driver.findElement(By.cssSelector("a[class='nav-link active'][href='https://alan-systems.com/pl/dla-biznesu/']"));
    }

    public WebElement aboutUs(){
        return driver.findElement(By.cssSelector("a[class='nav-link '][href='https://alan-systems.com/pl/dla-biznesu-o-nas/']"));
    }

    public WebElement offer(){
        return driver.findElement(By.cssSelector("a[class='nav-link '][href='https://alan-systems.com/pl/dla-biznesu-oferta/']"));
    }

    public WebElement contact(){
        return driver.findElement(By.cssSelector("a[class='nav-link '][href='https://alan-systems.com/pl/dla-biznesu-kontakt/']"));
    }

    public WebElement forCandidates(){
        return driver.findElement(By.cssSelector("a[class='nav-link '][href='https://alan-systems.com/pl/dla-kandydatow/']"));
    }
}

