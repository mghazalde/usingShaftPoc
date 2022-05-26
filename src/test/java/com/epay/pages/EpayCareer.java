package com.epay.pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class EpayCareer {
	SHAFT.GUI.WebDriver driver;

	public EpayCareer(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	String car = "career";
	By tothejobads = By.cssSelector(".et_pb_button.et_pb_button_0.et_pb_bg_layout_light");

	public void clickToTheJobAds() {

		driver.element().click(tothejobads);
	}

	public void isCareerPageLoaded() {

		driver.assertThat().browser().url().contains(car).perform();

	}

}
