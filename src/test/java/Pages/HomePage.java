package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;

    private String baseUrl = "https://alan-systems.com/pl/";

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getBaseUrl() {
        return baseUrl;
    }


    public WebElement findOutMorePushButton(){
        //return driver.findElement(By.xpath("//a[@href='/dla-biznesu/' and @class='btn secondary text-uppercase big']"));
        return driver.findElement(By.cssSelector("a[class='btn secondary text-uppercase big'][href='/dla-biznesu/']"));
    }

    public WebElement jumpOnBoardPushButton(){
        //return driver.findElement(By.xpath("//a[@href='/dla-kandydatow/' and @class='btn secondary text-uppercase big']"));
        return driver.findElement(By.cssSelector("a[class='btn secondary text-uppercase big'][href='/dla-kandydatow/']"));
    }
}
