package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;
    protected JavascriptExecutor js;



    //KONSTRUKTOR
    public BasePage(WebDriver driver, Duration timeout){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, timeout);
        this.actions = new Actions(driver);
        this.js = (JavascriptExecutor) driver;
    }


    public void navigateTo(String url){
        driver.get(url);
    }



//Metoda za klik
    public void clickButton(By locator) {
        driver.findElement(locator).click();
    }

    public void inputField (By locator){
        driver.findElement(locator).sendKeys("");
    }


//Metoda za ispisivanje teksta
    public void typeText(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }


//Metoda za vracanje teksta
    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }


//Metoda za vidljivost i vracanje elementa
    public WebElement waitForVisibility(By locator) {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        }


//Metoda za cekanje da element postane vidljiv pa onda izabran
    public WebElement waitForClickability(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }


//Metoda za prazno polje i unos teksta u praznom polju
    public void clearAndType(By locator, String text) {
        WebElement element = waitForVisibility(locator);
        element.clear();
        element.sendKeys(text);
    }


    public void scrollToElement(By locator) {
        WebElement element = waitForVisibility(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

////Metoda za odabir iz padajuceg menija. OprionText-upisujemo zeljeno
    public void selectFromDropdown (By locator, String optionText){
        WebElement droppdown = waitForVisibility(locator);

        Select object = new Select(droppdown);
        object.selectByVisibleText(optionText);
    }





}
