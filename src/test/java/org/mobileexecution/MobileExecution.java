package org.mobileexecution;

import org.samsungmobile.MobilePageLocators;
import org.samsungproject.BaseClass;
import org.testng.annotations.Test;

public class MobileExecution extends MobilePageLocators{
	@Test

	public static void mobilePage() {
    BaseClass.url("https://www.samsung.com/in/");
	BaseClass.wait(10);
	if(new MobilePageLocators().getCookie().isDisplayed()) {
		BaseClass.press(new MobilePageLocators().getCookie());
	}

	BaseClass.moveToElement(new MobilePageLocators().getMobile());
	BaseClass.moveToElement(new MobilePageLocators().getSmartphone());	
	BaseClass.press(new MobilePageLocators().getGalaxyz());
	BaseClass.press(new MobilePageLocators().getBuynow());
//	if(new MobilePageLocators().getCont1().isEnabled()) {
//		BaseClass.press(new MobilePageLocators().getCont1());
//	}else {
//		
//	}
	BaseClass.press(new MobilePageLocators().getCont1());
	BaseClass.press(new MobilePageLocators().getCont2());
if(new MobilePageLocators().getDontallow().isDisplayed()) {
	BaseClass.press(new MobilePageLocators().getDontallow());
}
	BaseClass.check(new MobilePageLocators().getDontallow());

}
}
