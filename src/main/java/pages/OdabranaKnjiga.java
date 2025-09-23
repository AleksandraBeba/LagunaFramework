package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OdabranaKnjiga extends BasePage {

    private By dodajUKorpuButton = By.id("dugme-korpa");
    private By oKnjizi = By.xpath("//*[@aria-controls=\"oknjizitab\"]");


    public OdabranaKnjiga(WebDriver driver, Duration timeout){
        super(driver, timeout);
    }







}
