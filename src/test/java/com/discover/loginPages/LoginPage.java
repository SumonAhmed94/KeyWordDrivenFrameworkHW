package com.discover.loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	
	WebDriver driver;
	
public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

@FindBy(how=How.ID, using="userid-content")
WebElement userNameID;
public WebElement userNameMethod(String enteryourusername) {
	userNameID.sendKeys(enteryourusername);
	return userNameID;
}

@FindBy(how=How.ID, using="password-content")
WebElement passwordID;
public WebElement passwordMethod(String enteryourpassword) {
	passwordID.sendKeys(enteryourpassword);
	return passwordID;
}	
public WebElement dropDown(WebElement dropdown, String enterCard) {
		
		Select select = new Select(dropdown);
		select.selectByVisibleText(enterCard);
		return dropdown;
	
}
		@FindBy(how=How.XPATH, using="//*[@id='content-choose-card-button']/span[1]") private WebElement enterCard;
		public void dropDown() {		
			enterCard.click();
			WebElement CreditCard=enterCard.findElement(By.xpath("//*[@id='ui-id-2']"));
			CreditCard.click();		
			//WebElement login=enterCard.findElement(By.xpath("//*[@id='log-in-button']"));
			//login.click();
	
}
		@FindBy(how=How.XPATH, using="//*[@id='log-in-button']") WebElement loginButtonClick;
		public void Login() {
			loginButtonClick.submit();
		}

	

}

