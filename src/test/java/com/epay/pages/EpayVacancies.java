package com.epay.pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class EpayVacancies {
	SHAFT.GUI.WebDriver driver;

	public EpayVacancies(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	String vacurl = "https://epay.de/en/vacancies/";
	By qa = By.cssSelector("a[href='https://epay.de/en/stellenangebote/qa-tester-qa-analyst-m-f-d/']");

	public void isVacanciesPageLoaded() {

		driver.assertThat().browser().url().equals(vacurl);

	}

	public void QaJobAd() {

		driver.element().click(qa);

	}

}
