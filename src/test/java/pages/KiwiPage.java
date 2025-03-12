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







}
