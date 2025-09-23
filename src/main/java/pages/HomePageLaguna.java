package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class HomePageLaguna extends BasePage{

    public By searchBox = By.id("pretraga_rec");
    public By searchButton = By.id("pretraga_submit");


    public HomePageLaguna(WebDriver driver, Duration timeout ){
        super(driver, timeout);

    }

    public void searchBookByName(){
        clearAndType(searchBox, "Onda");
        clickButton(searchButton);

    }

    public void searchBookByAutor(String AutorName){
        clearAndType(searchBox,AutorName);
        clickButton(searchButton);
    }














}
