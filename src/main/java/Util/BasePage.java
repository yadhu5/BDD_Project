package Util;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
WebDriver driver;


public void waitforelement(WebDriver driver,int timeInSecond,WebElement Locator) {
	WebDriverWait wait = new WebDriverWait(driver,timeInSecond);
	wait.until(ExpectedConditions.visibilityOf(Locator));
}

public int randomGenerator(int value1) {
	Random ran = new Random(999);
	int value = ran.nextInt(value1);
	return value;
}
}