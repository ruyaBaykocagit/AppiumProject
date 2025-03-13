package tests.day03;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KiwiPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class Kiwi {
    AndroidDriver<AndroidElement> driver = Driver.getAndroidDriver();
    KiwiPage page = new KiwiPage();

    @Test
    public void kiwiTest() throws InterruptedException {


// uygulamanin yuklendigi dogrulanir
        Assert.assertTrue(driver.isAppInstalled("com.skypicker.main"));

        //uygulamanin basariyla acildigi dogrulanir
        Thread.sleep(2000);
        Assert.assertTrue(page.misafirButonu.isDisplayed());


        // misafir olarak devam et e tiklanir
        Thread.sleep(2000);
        page.misafirButonu.click();


        // ardindan gelecek olan 3 adimda da yesil butona basilarak devam edilir
        Thread.sleep(2000);
        /*
        TouchAction action=new TouchAction<>(driver);
        for (int i = 0; i <3 ; i++) {
            action.press(PointOption.point(550,2060)).release().perform();

         */

        for (int i = 0; i < 3; i++) {
            ReusableMethods.koordinatTiklamaMethodu(550, 2060, 300);
        }// bu methodla yazılmıs halı dıgerı manuel yazılmıs halıdır

// Trip type,one way olarak secilir
        Thread.sleep(2000);
        page.returnButonu.click();
        Thread.sleep(2000);
        page.oneWayButonu.click();

// kalkis ulkesi secenegine tiklanir ve default olan ulke kaldirilir
        Thread.sleep(2000);
        page.fromButonu.click();
        Thread.sleep(2000);
        page.XButonu.click();

// kalkis yapilacak ulke/sehir girilir ve sec e tiklanir
        Thread.sleep(2000);
        if (driver.isKeyboardShown()) {
            page.ulkeMetinKutusu.click();
            driver.getKeyboard().pressKey("Ankara");
        } else {
            page.ulkeMetinKutusu.sendKeys("Ankara");// bu onceki satırda da telefonun tuslarından yazmak ıcın kullanılan method pressKey()
        }
        Thread.sleep(2000);
        page.kalkisvarisulkesisecmeButonu.click();
        page.chooseButonu.click();

// varis ulkesi secenegine tiklanir ve gidilecek ulke girilir
        Thread.sleep(2000);
        page.toButonu.click();
        if (driver.isKeyboardShown()) {
            page.ulkeMetinKutusu.click();
            driver.getKeyboard().pressKey("Frankfurt");
        } else {
            page.ulkeMetinKutusu.sendKeys("Frankfurt");// bu onceki satırda da telefonun tuslarından yazmak ıcın kullanılan method pressKey()
        }
        Thread.sleep(2000);
        page.kalkisvarisulkesisecmeButonu.click();
        Thread.sleep(2000);
        page.chooseButonu.click();

// gidis tarihi 28 Mart olarak secilir ve set date e tiklanir
        page.departureButonu.click();
        Thread.sleep(2000);
        //ReusableMethods.koordinatTiklamaMethodu(800,1400,500); // Boyle dırek 28 martta tıklar ancak asagı kaydırmak gerekırse asagıdakı gıbı yaparız
        TouchAction action=new TouchAction<>(driver);
        action.press(PointOption.point(560,1490)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
                        .moveTo(PointOption.point(560,400)).release().perform();
        ReusableMethods.koordinatTiklamaMethodu(803,1400,500); // Kaydırarak tarih secmek

        page.setDateButonu.click();

        // search butonuna tiklanir
        Thread.sleep(2000);
        page.searchButonu.click();

// en  ucuz ve aktarmasiz filtrelemeleri yapilir
        Thread.sleep(2000);
        page.bestButton.click();
        Thread.sleep(2000);
        page.cheapestButton.click();
        Thread.sleep(2000);
        page.stopsButton.click();
        Thread.sleep(2000);
        page.nonStopButonu.click();


// gelen bilet fiyati kaydedilir ve kullanicin telefonuna sms olarak gonderilir
        String fiyatBilgisi=page.fiyatBilgisi.getText();
        driver.sendSMS("1111112222","Sectiginiz biletin fiyat bilgisi" + fiyatBilgisi);



    }
}