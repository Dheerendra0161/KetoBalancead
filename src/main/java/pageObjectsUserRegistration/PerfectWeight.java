package pageObjectsUserRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilsPackage.UtilsCompo;

public class PerfectWeight extends UtilsCompo {
	WebDriver driver;
	YourAge age;

	public PerfectWeight(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
   @FindBy(xpath="//*[@id=\"root\"]/div/span/main/div/div/div/div/div[2]/div[2]/div/label/input")
   WebElement eleSend;
   @FindBy(id="continue")
   WebElement ele;
	public YourAge perfectWeight() {
		eleSend.sendKeys("77");
		ele.click();
		age=new YourAge(driver);
		return age;
		
	}

}
