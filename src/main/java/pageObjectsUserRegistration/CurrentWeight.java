package pageObjectsUserRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilsPackage.UtilsCompo;

public class CurrentWeight extends UtilsCompo {
	WebDriver driver;
    public PerfectWeight targetweight;
	public CurrentWeight(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[text()='kg']")
	 WebElement ele;
	@FindBy(xpath="//*[@id=\"root\"]/div/main/div/div/div/div/div[2]/div[2]/div/label/input")
	 WebElement eleSend;
	@FindBy(id="continue")
	 WebElement ele1;

	public PerfectWeight currentWeight() {
		ele.click();
		eleSend.sendKeys("89");
		ele1.click();
		targetweight=new PerfectWeight(driver);
		return targetweight;
	}
}
