package com.epay.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.epay.pages.EpayCareer;
import com.epay.pages.EpayHome;
import com.epay.pages.EpayStellenangebote;
import com.epay.pages.EpayVacancies;
import com.shaft.driver.SHAFT;

public class TestCases {

	SHAFT.GUI.WebDriver driver;
	EpayHome home;
	EpayCareer career;
	EpayVacancies vacancies;
	EpayStellenangebote stelle;

	@BeforeClass

	public void setup() {
		driver = new SHAFT.GUI.WebDriver();
		home = new EpayHome(driver);
		career = new EpayCareer(driver);
		vacancies = new EpayVacancies(driver);
		stelle = new EpayStellenangebote(driver);
		home.navigate();
		home.allowCookies();
	}

	@Test(priority = 1)
	public void validatePageTitle() {
		home.title();
	}

	@Test(priority = 2)

	public void validateEpaylogoDisplayed() {
		
		home.isEpayLogoDisplayed();
	}

	@Test(priority = 3)

	public void validateChangeLanguageToEnglish() {
		home.hoverToDe();
		home.changeToEnglish();
		home.isLanguageChanged();

	}

	@Test(priority = 4)
	public void validateNavigationToCareerPage() {
		home.hoverCompany();
		home.clickCareer();
		career.isCareerPageLoaded();
	}

	@Test(priority = 5)
	public void validateNavigationToVacanciesPage() {

		career.clickToTheJobAds();
		vacancies.isVacanciesPageLoaded();

	}

	@Test(priority = 6)
	public void validateNavigationToQaJobAd() {

		vacancies.QaJobAd();
		stelle.isQaPageLoaded();

	}

	@Test(priority = 7)

	public void validateImageUsingAI() {

		stelle.isImageMatchesrefrence();

	}

	@Test(priority = 8)

	public void validateCareerTitleisCorrect() {

		stelle.isCareerTitleCorrect();

	}

	@Test(priority = 9)

	public void validateApplyNow() {

		stelle.applyNow();

	}
	
	@Test(priority = 10)

	public void validatePageContents() {

      stelle.doWhatYouLove();
      stelle.showUs();
      stelle.benefits();
	}
	

	@Test(priority = 11)

	public void validateVisualcheckBenefits() {

      stelle.listOfBenefita();
	}	
}
