package org.samsungmobile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.samsungproject.BaseClass;

public class MobilePageLocators extends BaseClass {
	
	public MobilePageLocators() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//span[@class='gnb__depth1-link-text'])[1]" )
	private WebElement mobile;
	
	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getSmartphone() {
		return smartphone;
	}

	public WebElement getGalaxyz() {
		return galaxyz;
	}

	public WebElement getBuynow() {
		return buynow;
	}

	public WebElement getCont1() {
		return cont1;
	}
    
	public WebElement getCont2() {
		return cont2;
	}
	@FindBy(xpath = "(//span[@class='gnb__depth2-link-text'])[2]" )
	private WebElement smartphone;
	
	@FindBy(xpath = "//a[@an-la='mobile:smartphones:galaxy z']" )
	private WebElement galaxyz;
	
	@FindBy(xpath = "//a[@data-modeldisplay='Galaxy Z Fold3 5G']" )
	private WebElement buynow;
	
    @FindBy(xpath = "(//a[text()='CONTINUE'])[1]")
    private WebElement cont1;
    
    @FindBy(xpath = "(//a[@title='Continue'])[1]")
    private WebElement cont2;
    @FindBy(xpath = " //a[text()=' ACCEPT ']")
    private WebElement cookie;

	public WebElement getCookie() {
		return cookie;
		
	}
	
	@FindBy(xpath ="//div[@id='desktopBannerWrapped']//button[@class='ng-binding'][1]")
	private WebElement dontallow;
	

	public WebElement getDontallow() {
		
		
		
		return dontallow;
	}
}
