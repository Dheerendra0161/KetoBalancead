package pageObjectsUserRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilsPackage.UtilsCompo;

public class SpendYourDay extends UtilsCompo {
	WebDriver driver;
	MultipleAnswers answer;
	public SpendYourDay(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id='6253ffa58c1d51ca9bf5f61d']")
	WebElement ele;
	public MultipleAnswers spendYourDay() {
		ele.click();
		answer= new MultipleAnswers(driver);
		return answer;
	}

}
