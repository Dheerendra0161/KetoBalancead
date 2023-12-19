package pageObjectsUserRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilsPackage.UtilsCompo;

public class LastHappy extends UtilsCompo{
	WebDriver driver;
	public MealPreparationTime time;
	public LastHappy (WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Never")
	WebElement ele;
	public MealPreparationTime lastHappy() {
		ele.click();
	    time=new  MealPreparationTime(driver);
	    return time;
	}

}
