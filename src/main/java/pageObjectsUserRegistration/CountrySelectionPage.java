package pageObjectsUserRegistration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilsPackage.UtilsCompo;

public class CountrySelectionPage extends UtilsCompo {
    WebDriver driver;
    public GenderSelectionPage gender;

    @FindBy(xpath = "//img[@alt='usa']")
    WebElement USA;

    @FindBy(xpath = "//img[@alt='uk']")
    WebElement UK;

    @FindBy(xpath = "//a[@href='https://ca.ketobalanced.com']")
    WebElement CA;

    @FindBy(xpath = "//a[@href='https://aus.ketobalanced.com']")
    WebElement AUS;

    public CountrySelectionPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public GenderSelectionPage countrySelection(String countryCode) {
        switch (countryCode.toUpperCase()) {
            case "USA":
                USA.click();
                break;
            case "UK":
                UK.click();
                break;
            case "CA":
                CA.click();
                break;
            case "AUS":
                AUS.click();
                break;
            default:
                throw new IllegalArgumentException("Invalid country code: " + countryCode);
        }
        gender = new GenderSelectionPage(driver);
        return gender;
    }
}
