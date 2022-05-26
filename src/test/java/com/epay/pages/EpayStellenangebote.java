package com.epay.pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class EpayStellenangebote {

	SHAFT.GUI.WebDriver driver;

	public EpayStellenangebote(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	String qaurl = "https://epay.de/en/stellenangebote/qa-tester-qa-analyst-m-f-d/";
	String qades = "QA Tester / QA Analyst (m/f/d)";
	By hrimage = By.cssSelector("img[title='j.Hechenberger']");
	By applynow = By.cssSelector(".et_pb_button.et_pb_button_1.btn-inline.et_pb_bg_layout_light");
	By qacareer = By.xpath("//h1[@id='candidateProfileTitle']");
	By dowhat = By.xpath("//h3[normalize-space()='Do, what you love']");
	By showus = By.xpath("//h3[contains(text(),'Show us, what you’ve got')]");
	By benfits = By.xpath("//h3[normalize-space()='Our Benefits']");
    By ben1 = By.cssSelector(".et_pb_row.et_pb_row_4.et_pb_row_4col");
    By ben2 = By.cssSelector(".et_pb_row.et_pb_row_5.et_pb_row_4col");
    By ben3 = By.cssSelector(".et_pb_row.et_pb_row_6.et_pb_row_4col");
	public void isQaPageLoaded() {

		driver.assertThat().browser().url().equals(qaurl);

	}

	public void isImageMatchesrefrence() {

		driver.assertThat().element(hrimage).matchesReferenceImage().perform();
	}

	public void isCareerTitleCorrect() {

		driver.assertThat().element(qacareer).text().equals(qades);
	}

	public void applyNow() {

		driver.assertThat().element(applynow).isEnabled().perform();
        
	}
	
	public void doWhatYouLove() {
		driver.assertThat().element(dowhat).text().contains("Do, what you love").perform();
		
	}
	
	public void showUs() {
		
		driver.assertThat().element(showus).text().contains("Show us, what you’ve got").perform();
	}
	
	public void benefits() {
		driver.assertThat().element(benfits).text().contains("Our Benefits").perform();
	}
	
	public void listOfBenefita() {
		driver.assertThat().element(ben1).matchesReferenceImage().perform();
		driver.assertThat().element(ben2).matchesReferenceImage().perform();
		driver.assertThat().element(ben3).matchesReferenceImage().perform();
	}
}
