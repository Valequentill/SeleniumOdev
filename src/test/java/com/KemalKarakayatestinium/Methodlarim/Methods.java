package com.KemalKarakayatestinium.Methodlarim;

import com.KemalKarakayatestinium.driver.AnaTestim;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Methods {
    WebDriver driver;
    FluentWait<WebDriver> wait;
    Logger logger = LogManager.getLogger(Methods.class);
    JavascriptExecutor jsdriver;


    public Methods(){
        driver = AnaTestim.driver;
        wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofMillis(300)).ignoring(NoSuchFieldException.class);
        jsdriver = (JavascriptExecutor) driver;
    }

    public WebElement findElement(By xd){
        return wait.until(ExpectedConditions.presenceOfElementLocated(xd));
    }

    public void click(By xd){
        findElement(xd).click();
    }

    public void waitbySeconds(long seconds){
        try{
            Thread.sleep(seconds*1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void sendKeys(By xd, String text){
        findElement(xd).sendKeys(text);
    }

    public void clearText(){
        Actions action = new Actions(driver);
        action.click(driver.findElement(By.cssSelector(".quantity>form>input"))).sendKeys(Keys.BACK_SPACE).build().perform();
    }

    public void scrollWithAction(By xd){
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(xd)).build().perform();
    }


    public boolean loginKontrolu(By xd){
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(xd));
            logger.info("Giris Basarili");
            return true;
        }catch (Exception e){
            logger.info("Giris Basarisiz " + e.getMessage());
            return false;
        }
    }

    public boolean logoutKontrolu(By xd){
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(xd));
            logger.info("Başarıyla Çıkıldı");
            return true;
        }catch (Exception e){
            logger.info("Çıkış yapılamadı  " + e.getMessage());
            return false;
        }
    }



    public boolean favoriEklenmeKontrolu(By xd){
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(xd));
            logger.info("Seçilenler Favorilere Eklendi");
            return true;
        }catch (Exception e){
            logger.info("Favorilere Ekleme Başarısız " + e.getMessage());
            return false;
        }
    }
    public Select getSelect(By xd){
        return new Select(findElement(xd));
    }

    public void selectByText(By xd, String text){
        getSelect(xd).selectByVisibleText(text);
    }

    public void randomUrunSec (){
        List<WebElement> listem = driver.findElements(By.xpath("//li[@class='mg-b-10']"));
        Random random = new Random();
        int urunSayisi = random.nextInt(listem.size());
        listem.get(urunSayisi).click();
    }

    public void selectFromDropdown(){
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='address-zone-id']"));
        Select select = new Select(dropdown);
        select.selectByIndex(3);

    }

    public void selectFromDropdown2(){
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='address-county-id']"));
        Select select = new Select(dropdown);
        select.selectByIndex(5);

    }

    public void selectFromDropdown3(){
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='credit-card-expire-date-month']"));
        Select select = new Select(dropdown);
        select.selectByIndex(5);

    }
    public void selectFromDropdown4(){
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='credit-card-expire-date-year']"));
        Select select = new Select(dropdown);
        select.selectByIndex(5);

    }

    public boolean isElementVisible(By xd){
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(xd));
            logger.info("Geçersiz Kart Bilgileri");
            return true;
        }catch (Exception e){
            logger.info("Doğru Kart Bilgileri" + e.getMessage());
            return false;
        }
    }

    public void cikis(){
        WebElement element = driver.findElement(By.cssSelector(".menu.top.login"));
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
        click(By.xpath("//a[text()='Çıkış']"));

    }



}
