package org.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbsigninPojo extends BaseClass{
	public FbsigninPojo() {
		PageFactory.initElements(driver, this);
		}
	//private Elements
	@FindBy(xpath="//a[@data-testid='open-registration-form-button']")
    private WebElement createAcnt;
    
	@FindBy(xpath = "(//body[@dir='ltr'])[1]")
     private WebElement firstName;
		
	@FindBy(xpath = "(//input[@data-type='text'])[2]")
	private WebElement surName;
	
	@FindBy(xpath= "(//input[@data-type='text'])[3]")
	private WebElement moboremail;
	
	@FindBy(xpath= "//input[@data-type='password']")
	private WebElement passwrd;
	
	//getters to access webelements outside the class
	
    public WebElement getCreateAcnt() {
    	return createAcnt;
    }

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getSurName() {
		return surName;
	}

	public WebElement getMoboremail() {
		return moboremail;
	}

	public WebElement getPasswrd() {
		return passwrd;
	}
	

	
	
	
	
	
	

	

}
