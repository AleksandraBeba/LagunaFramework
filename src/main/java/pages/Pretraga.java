package pages;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Pretraga extends BasePage {

    private By bookLocator = By.xpath(("//*[text()=\"Onda\"]"));
    private By dugmeDodajUKorpu = By.id("dugme-korpa");
    private By toastMessage = By.xpath("//*[contains(text(),'Knjiga je dodata u korpu')]");
    private By dugmeKorpa = By.id("korpa_broj");
    protected By daljeButton = By.id("korpa-dalje");



    //    Konstruktor
    public Pretraga(WebDriver driver, Duration timeout) {
        super(driver, timeout);
    }


    public void verifyBookAddedToCartMessage() {
        By toastMessage = By.xpath("//*[contains(text(),'dodata u korpu')]");

        // Čekaj da se pojavi
        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
        System.out.println("Poruka prikazana: " + message.getText());

        // Čekaj da nestane
        wait.until(ExpectedConditions.invisibilityOfElementLocated(toastMessage));
    }

   public void selectBook(String bookTitle){
        waitForVisibility(bookLocator).click();
        clickButton(dugmeDodajUKorpu);
        waitForVisibility(toastMessage).isDisplayed();
        waitForVisibility(dugmeKorpa).click();
        waitForVisibility(daljeButton).click();


   }






}