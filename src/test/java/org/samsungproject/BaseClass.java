package org.samsungproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public static WebDriver driver;
@BeforeClass
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogesh\\Maven\\FrameWork\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	public static void url(String url) {
		driver.manage().window().maximize();
		driver.get(url);

	}

	public static WebElement findElementByAB(By ab) {
		return driver.findElement(ab);

	}

	public static void data(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void press(WebElement element) {
		element.click();
	}
	public static void check(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
	}
	public static void moveToElement(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	public static void wait(int a) {
driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);
}
}













