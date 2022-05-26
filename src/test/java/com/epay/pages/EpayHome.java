package com.epay.pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class EpayHome {

	SHAFT.GUI.WebDriver driver;
	public EpayHome(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}
	

	String url = "https://epay.de/";
	String title ="we drive the payment journey of the future - epay.de";
	String product = "Products";
	
	By epaylogo = By.cssSelector("div[class='et_pb_module et_pb_image et_pb_image_0_tb_header'] a");
	By changelanguage = By.cssSelector("ul[id='menu-submenu-top'] a[title='Deutsch'] span[class='wpml-ls-display']");
	By allowallcookies = By.xpath("//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']");
	By english = By.cssSelector("ul[id='menu-submenu-top'] ul[class='sub-menu'] span[class='wpml-ls-display']");
	By products = By.xpath("//ul[@id='menu-main-menu-en']//a[normalize-space()='Products & Solutions']");
    By company = By.xpath("(//a[normalize-space()='Company'])[1]");
    By career =  By.xpath("(//a[normalize-space()='Career'])[1]");
    


	public void navigate() {

		driver.browser().navigateToURL(url);
	}

	public void title() {
		
		  
		  driver.assertThat().browser().title().contains(title).perform();
	}

	public void hoverToDe() {

		driver.element().hover(changelanguage);

	}

	public void changeToEnglish() {

		driver.element().click(english);
	}

	public void allowCookies() {

		driver.element().click(allowallcookies);
	}

	public void isEpayLogoDisplayed() {

		driver.assertThat().element(epaylogo).isVisible().perform();
		
	}

	

	public void isLanguageChanged() {

		driver.assertThat().element(products).text().contains(product).perform();
	}
	
	public void hoverCompany() {
		driver.element().hover(company);
	}
	
	public void clickCareer() {
		driver.element().click(career);
	}
	

}
