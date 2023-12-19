package pageObjectsUserRegistration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilsPackage.UtilsCompo;

public class MealPreparationTime extends UtilsCompo {
	WebDriver driver;
	public MeatPage meat;
	public MealPreparationTime(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@class='624fe1f4ac82160af58d959e']")
	WebElement ele;
	public MeatPage mealPreparationTime() {
		driver.findElement(By.xpath("//a[@class='624fe1f4ac82160af58d959e']")).click();
	    meat=new MeatPage(driver);
	    return meat;
		
		
	}

}
