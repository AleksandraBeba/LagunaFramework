package appTests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.HomePageLaguna;
import pages.LicniPodaci;
import pages.OdabranaKnjiga;
import pages.Pretraga;

import java.time.Duration;

public class TestPorucivanjeKnjige extends BaseTest {



     HomePageLaguna homePageLaguna = new HomePageLaguna(driver, Duration.ofSeconds(10));
     Pretraga pretraga = new Pretraga(driver,Duration.ofSeconds(10));
     OdabranaKnjiga odabranaKnjiga = new OdabranaKnjiga(driver, Duration.ofSeconds(10));
    LicniPodaci licniPodaci = new LicniPodaci(driver, Duration.ofSeconds(10));


    @org.junit.Test
    public void pretraga() throws InterruptedException {
        homePageLaguna.searchBookByName();
        pretraga.selectBook("Onda");
        licniPodaci.unosPodataka();
        Thread.sleep(5000);
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()=\"Izaberite način plaćanja i dostave:\"]"))).isDisplayed());
        System.out.println("Bravo legendoooo");
        System.out.println("Ovo radi");























//        pretraga.clickButton();

//        homePageLaguna.clickButton(By.xpath("//*[@src=\"_img/korice/4061/onda-momo_kapor_s.jpg\"]"));
//        Assert.assertTrue(driver.findElement(By.xpath("")));

    }
}
