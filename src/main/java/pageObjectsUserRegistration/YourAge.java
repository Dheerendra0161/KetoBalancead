package pageObjectsUserRegistration;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilsPackage.UtilsCompo;

public class YourAge extends UtilsCompo{
	WebDriver driver;
	public OccasionYouWantToLoseWeight occasion;
	public YourAge (WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@class='hgtcm']")
	WebElement ele1;
	@FindBy(id="continue")
	WebElement ele2;
	@FindBy(id="continue")
	WebElement ele3;
	public OccasionYouWantToLoseWeight yourAge() throws Throwable {
		ele1.sendKeys("34");
		ele2.click();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.linkText("Summary of your overall wellness")));
		Thread.sleep(1000);
		ele3.click();
		occasion= new  OccasionYouWantToLoseWeight(driver);
		return occasion;
		
	}

}
