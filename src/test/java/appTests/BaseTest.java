package appTests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;

import java.time.Duration;

public class BaseTest {

    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static BasePage basePage;


    @BeforeClass
    public static void beforeAll() {

        driver = new EdgeDriver();

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//        maksimalo cekanje ucitavanja stranice
        driver.manage().window().maximize();
        basePage = new BasePage(driver, Duration.ofSeconds(10));
//        // maksimalno vreme za asinhrono JS izvršavanje

    }

    @Before
    public void beforeEach() throws InterruptedException {
        driver.get("https://www.laguna.rs/");
        driver.findElement(By.xpath("//a[@onclick=\"setCookie('zaKolacice','zaKolacice',3000); $('#gdpr-box').hide();\"]")).click();
        Thread.sleep(2000);

    }

    @After
    public void afterEach() {
//        driver.manage().deleteAllCookies();
    }

    @AfterClass
    public static void afterAll() {
        driver.quit();
    }



















}
