package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SadrzajKorpe extends BasePage {

    protected By daljeButton = By.id("korpa-dalje");


    public SadrzajKorpe(WebDriver driver, Duration timeout) {
        super(driver, timeout);
    }



}