package com.eCom.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtitity {
	private static final int minWait=10;
	public static void waitForElementToBeVisible(WebDriver driver, WebElement we) {
		WebDriverWait wd = new WebDriverWait(driver, minWait);
		wd.until(ExpectedConditions.visibilityOf(we));
	}
	public static void waitForElementToBeClickable(WebDriver driver, WebElement we) {
		WebDriverWait wd = new WebDriverWait(driver, minWait);
		wd.until(ExpectedConditions.visibilityOf(we));
	}
}
