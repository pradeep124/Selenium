package org.travelodge.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import org.travelodge.Basedriver.Basedriverclass;


public class Page_login  extends Basedriverclass {
	
	
	@FindBy(xpath = "//*[@id='triggerLoginPopOver']")
	WebElement login;

	@FindBy(xpath = ".//*[@data-validator='authentication_email_corporate']")
	WebElement email;
	
	@FindBy(xpath = ".//*[@data-validator='authentication_password_corporate']")
	WebElement password;

	@FindBy(xpath = "(.//*[@action='/login']//button)[2]")
	WebElement submit;
	
	@FindBy(xpath = "//*[@id='desktopBannerWrapped']/div/div[3]/div[1]/button[1]")
	WebElement cookiepopup;
	
	@FindBy(xpath = "//*[@id=\"ensCloseBanner\"]")
	WebElement cookiepopup2;
	
	
	public WebElement getCookiepopup2() {
		return cookiepopup2;
	}

	public void setCookiepopup2(WebElement cookiepopup2) {
		this.cookiepopup2 = cookiepopup2;
	}

	public Page_login() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCookiepopup() {
		return cookiepopup;
	}

	public void setCookiepopup(WebElement cookiepopup) {
		this.cookiepopup = cookiepopup;
	}

	public WebElement getLogin() {
		System.out.println(" login");
		return login;
	}

	public void setLogin(WebElement login) {
		this.login = login;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}
	
}
