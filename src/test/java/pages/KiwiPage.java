package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KiwiPage {

    public KiwiPage() {
        PageFactory.initElements((WebDriver) Driver.getAndroidDriver(), this);
    }

    @FindBy(xpath = "(//*[@class='android.widget.Button'])[4]")
    public WebElement misafirButonu;
    @FindBy(xpath = "//*[@text='Return']")
    public WebElement returnButonu;

    @FindBy(xpath = "//*[@text='One way']")
    public WebElement oneWayButonu;

    @FindBy(xpath = "//*[@text='From:']")
    public WebElement fromButonu;

    @FindBy(xpath = "//*[@content-desc='Clear All']")
    public WebElement XButonu;

    @FindBy(xpath = "//*[@class='android.widget.EditText']")
    public WebElement ulkeMetinKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.Button'])[2]")
    public WebElement kalkisvarisulkesisecmeButonu;

    @FindBy(xpath = "//*[@text='Choose']")
    public WebElement chooseButonu;

    @FindBy(xpath = "//*[@text='To:']")
    public WebElement toButonu;

    @FindBy(xpath = "//*[@text='Departure:']")
    public WebElement departureButonu;

    @FindBy(xpath = "//*[@text='Set date']")
    public WebElement setDateButonu;

    @FindBy(xpath = "(//*[@text='Search'])[1]")
    public WebElement searchButonu;

    @FindBy (xpath ="//*[@text='Stops']" )
    public WebElement stopsButton;

    @FindBy (xpath ="//*[@text='Best']" )
    public WebElement bestButton;

    @FindBy (xpath ="//*[@text='Cheapest']" )
    public WebElement cheapestButton;

    @FindBy(xpath = "(//*[@class='android.view.View'])[7]")//text='Nonstop' calısmazsa bunu da dene
    public WebElement nonStopButonu;

    @FindBy(xpath = "(//*[@class='android.widget.TextView'])[12]")
    public WebElement fiyatBilgisi;








}
