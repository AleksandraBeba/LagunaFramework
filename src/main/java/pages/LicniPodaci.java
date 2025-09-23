package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LicniPodaci extends BasePage{

    private By inputFieldImeIPrezime = By.id("ime-k");
    private By inputFieldEmail = By.id("email-k");
    private By inputFieldTelefon = By.id("telefon-k");
    private By inputFieldUlica = By.id("ulica-pomoc");
    private By inputFieldBrojUlice = By.id("broj-k");
    private By daljeButton = By.id("korpa-dalje");

    private By drzavaPolje = By.xpath("(//div[@class=\"selectize-control single\"])[1]");
    private By drzavaPadajuciMeni = By.cssSelector("div.option[data-value='1']");

    private By postanskiBrojPolje =  By.xpath("(//*[@placeholder=\"Izaberite poštanski broj i mesto\"])[2]");
    private By postanskiBrojPadajuciMeni = By.xpath("(//*[@data-value=\"31310 Čajetina\"])[1]");


    public LicniPodaci(WebDriver driver, Duration timeout) {
        super(driver,timeout );
    }


    public void unosPodataka (){
        clearAndType(inputFieldImeIPrezime,"Aleksandra Spasenic");
        clearAndType(inputFieldEmail,"alexandraspasenic13@gmial.com");
        clearAndType(inputFieldUlica, "Aleksandra Karadjordjevica");
        clearAndType(inputFieldBrojUlice,"46");
        clearAndType(inputFieldTelefon,"062 656465");
        izaberiDrzavu();
        izaberiMesto();
        clickButton(daljeButton);

    }

    public void izaberiDrzavu(){
        wait.until(ExpectedConditions.elementToBeClickable(drzavaPolje)).click();
        wait.until(ExpectedConditions.elementToBeClickable(drzavaPadajuciMeni)).click();

    }

    public void izaberiMesto(){
//        waitForClickability(postanskiBrojPolje3).click();
        clearAndType(postanskiBrojPolje,"Cajetina");
        clickButton(postanskiBrojPadajuciMeni);
    }










}
