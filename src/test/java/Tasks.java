import Pages.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Tasks {


    private ChromeDriver driver;
    private String baseUrl = "https://alan-systems.com/pl/";

    private WebDriverWait wait;


    private HomePage homePage;

    private ForBusiness forBusiness;

    private ForCandidaes forCandidaes;

    private AboutUs aboutUs;

    private Offer offer;

    private Contact contact;

    @BeforeClass
    public void setUp() {
        // ChromeOptions options = new ChromeOptions();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);

        wait = new WebDriverWait(driver, Duration.ofSeconds(2));

        homePage = new HomePage(driver);

        forBusiness = new ForBusiness(driver);

        forCandidaes = new ForCandidaes(driver);

        aboutUs = new AboutUs(driver);

        offer = new Offer(driver);

        contact = new Contact(driver);


    }

    @Test
    public void checkingPushButtonOnMainPageTest() throws Exception {

        driver.get(homePage.getBaseUrl());
        Assert.assertEquals(driver.getCurrentUrl(), homePage.getBaseUrl());

        homePage.findOutMorePushButton().click();
        Assert.assertEquals(driver.getCurrentUrl(), forBusiness.getUrl());

        driver.get(homePage.getBaseUrl());
        Assert.assertEquals(driver.getCurrentUrl(), homePage.getBaseUrl());

        homePage.jumpOnBoardPushButton().click();
        Assert.assertEquals(driver.getCurrentUrl(), forCandidaes.getUrl());

        driver.get(homePage.getBaseUrl());
        Assert.assertEquals(driver.getCurrentUrl(), homePage.getBaseUrl());
    }

    @Test
    public void checkingPushButtonsOnForBusinessPage() throws Exception {

        driver.get(forBusiness.getUrl());
        forBusiness.forBusiness().click();
        Assert.assertEquals(driver.getCurrentUrl(), forBusiness.getUrl());

        driver.get(forBusiness.getUrl());
        forBusiness.aboutUs().click();
        Assert.assertEquals(driver.getCurrentUrl(), aboutUs.getUrl());


        driver.get(forBusiness.getUrl());
        forBusiness.offer().click();
        Assert.assertEquals(driver.getCurrentUrl(), offer.getUrl());


        driver.get(forBusiness.getUrl());
        forBusiness.contact().click();
        Assert.assertEquals(driver.getCurrentUrl(), contact.getUrl());


        driver.get(forBusiness.getUrl());
        forBusiness.forCandidates().click();
        Assert.assertEquals(driver.getCurrentUrl(), forCandidaes.getUrl());


    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
