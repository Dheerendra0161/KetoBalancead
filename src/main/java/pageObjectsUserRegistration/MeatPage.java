package pageObjectsUserRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilsPackage.UtilsCompo;

public class MeatPage extends UtilsCompo{
	WebDriver driver;
	VeggiesPage veggies;
	
	public MeatPage (WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id='624fe27dac82160af58d959f']")
	WebElement ele;
	@FindBy(xpath="//*[@id='624fe289ac82160af58d95a2']")
	WebElement ele1;
	@FindBy(xpath="//*[@id='624fe291ac82160af58d95a4']")
	WebElement ele2;
	@FindBy(id="Continue")
	WebElement ele3;
	
	public VeggiesPage meat() {
		ele.click();
		actionClass(0,800);
		ele1.click();
		ele2.click();
		ele3.click();
		veggies=new VeggiesPage(driver);
		return veggies;
		
	}

}
