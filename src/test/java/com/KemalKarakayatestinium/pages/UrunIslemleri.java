package com.KemalKarakayatestinium.pages;

import com.KemalKarakayatestinium.Methodlarim.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class UrunIslemleri{
    Methods methods;
    Logger logger = LogManager.getLogger(UrunIslemleri.class);
    public UrunIslemleri(){
        methods = new Methods();
    }

    public void UrunSecme() {
        methods.sendKeys(By.cssSelector("#search-input"),"Oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitbySeconds(2);
        logger.info("Oyuncak Aratıldı.");
        methods.scrollWithAction(By.xpath("(//div[@class='publisher'])[9]"));
        methods.waitbySeconds(1);
        methods.click(By.xpath("(//i[@class='fa fa-heart'])[5]"));
        methods.click(By.xpath("(//i[@class='fa fa-heart'])[6]"));
        methods.click(By.xpath("(//a[@onclick='addToFavorites(494781);'])[2]"));
        methods.click(By.xpath("(//i[@class='fa fa-heart'])[8]"));
        methods.waitbySeconds(2);
        Assert.assertTrue(methods.favoriEklenmeKontrolu(By.cssSelector(".swal2-title.ky-swal-title-single>a")));
        methods.click(By.cssSelector(".logo-text>a>img"));
        methods.waitbySeconds(3);
        logger.info("Anasayfaya dönüldü");
        methods.click(By.xpath("(//a[@href='puan-katalogu'])[1]"));
        methods.scrollWithAction(By.cssSelector(".heading-links>a"));
        methods.waitbySeconds(2);
        methods.click(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.waitbySeconds(2);
        methods.selectByText(By.cssSelector(".product-filter-header>div>select"),"Yüksek Oylama");
        methods.waitbySeconds(2);
        methods.click(By.xpath("//span[text()='Tüm Kitaplar']"));
        methods.waitbySeconds(1);
        methods.click(By.xpath("//a[text()='Hobi']"));
        methods.waitbySeconds(1);
        methods.randomUrunSec();
        methods.waitbySeconds(3);
        methods.scrollWithAction(By.cssSelector(".info-text"));
        methods.waitbySeconds(2);
        methods.click(By.cssSelector(".sprite__product.icon__cta-fast"));
        methods.waitbySeconds(2);
        methods.scrollWithAction(By.cssSelector(".container_12"));
        methods.click(By.xpath("//a[text()='Listelerim']"));
        methods.waitbySeconds(1);
        methods.click(By.xpath("//a[text()='Favorilerim']"));
        methods.waitbySeconds(2);
        methods.scrollWithAction(By.cssSelector(".pagination"));
        methods.waitbySeconds(2);
        methods.click(By.xpath("(//a[@onclick='removeFromFavorites(494781);'])[2]"));
        methods.waitbySeconds(2);
        methods.click(By.cssSelector(".fl>h4"));
        methods.waitbySeconds(4);
        methods.click(By.id("js-cart"));
        methods.waitbySeconds(2);
        methods.clearText();
        methods.waitbySeconds(1);
        methods.sendKeys(By.cssSelector(".quantity>form>input"),"2");
        methods.click(By.cssSelector(".button.red"));
        methods.waitbySeconds(2);


    }

}
