package userRegistrationTset;

import org.testng.annotations.Test;

import baseComponent.BaseCompo;
import pageObjectsUserRegistration.BackToPlans;
import pageObjectsUserRegistration.BodyType;
import pageObjectsUserRegistration.ChooseBodyType;
import pageObjectsUserRegistration.CountrySelectionPage;
import pageObjectsUserRegistration.CurrentWeight;
import pageObjectsUserRegistration.EnterYourEmail;
import pageObjectsUserRegistration.GenderSelectionPage;
import pageObjectsUserRegistration.GotIt;
import pageObjectsUserRegistration.HowActive;
import pageObjectsUserRegistration.HowTall;
import pageObjectsUserRegistration.LastHappy;
import pageObjectsUserRegistration.MealPreparationTime;
import pageObjectsUserRegistration.MeatPage;
import pageObjectsUserRegistration.MultipleAnswers;
import pageObjectsUserRegistration.NeedToGetInShape;
import pageObjectsUserRegistration.OccasionYouWantToLoseWeight;
import pageObjectsUserRegistration.OtherFoodItems;
import pageObjectsUserRegistration.PerfectWeight;
import pageObjectsUserRegistration.Plans;
import pageObjectsUserRegistration.ShedSomeExtraWeight;
import pageObjectsUserRegistration.SpendYourDay;
import pageObjectsUserRegistration.TargetZones;
import pageObjectsUserRegistration.VeggiesPage;
import pageObjectsUserRegistration.WantToAchieve;
import pageObjectsUserRegistration.YourAge;
import pageObjectsUserRegistration.YourEvent;
import pageObjectsUserRegistration.YourWeight;

public class UserRegestrationTest extends BaseCompo {
	CountrySelectionPage country;
	GenderSelectionPage gender;
	ChooseBodyType bodytype;
	WantToAchieve achieve;
	TargetZones zones;
	BodyType body;
	LastHappy happy;
	MealPreparationTime time;
	MeatPage meat;
	VeggiesPage veggies;
	OtherFoodItems item;
	HowActive active;
	SpendYourDay day;
	MultipleAnswers answer;
	ShedSomeExtraWeight weight;
	HowTall tall;
	CurrentWeight currntwgt;
	PerfectWeight targetweight;
	YourAge age;
	OccasionYouWantToLoseWeight occasion;
	YourEvent event;
	NeedToGetInShape shape;
	YourWeight yourweight;
	EnterYourEmail mail;
	Plans plns;
	BackToPlans backplans;
	GotIt gotit;

	@Test
	public void userRegistration() throws Throwable {
		country = begin.letsBegin();
		gender = country.countrySelection();
		body = gender.genderSelction();
		bodytype = body.bodyType();
		achieve = bodytype.choseBodyType();
		zones = achieve.wantToAchieve();
		happy = zones.targetZones();
		time = happy.lastHappy();
		meat = time.mealPreparationTime();
		veggies = meat.meat();
		item = veggies.veggiesPage();
		active = item.otherFoodItems();
		day = active.howActive();
		answer = day.spendYourDay();
		weight = answer.multipleAnswers();
		tall = weight.shedSomeExtraWeight();
		currntwgt=tall.howTall();
		targetweight=currntwgt.currentWeight();
		age=targetweight.perfectWeight();
		occasion=age.yourAge();
		event=occasion.occasionYouWantToLoseWeight();
		shape=event.yourEvent();
		yourweight=shape.needToGetInShape();
		mail=yourweight.yourWeight();
		plns=mail.enterYourEmail();
		backplans=plns.plans();
		gotit=backplans.backToPlans();
		gotit.gotIt();
	}
}
