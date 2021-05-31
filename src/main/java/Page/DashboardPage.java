package Page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;




public class DashboardPage {
	
	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//h2[contains(text(),' Dashboard ')]")
	WebElement DASBOARD_PAGE;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Bank & Cash')]")
	WebElement BANK_CASH;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'New Account')]")
	WebElement NEW_ACCOUNT;
	
	

	public void verifyingthedeshboardpage() {
//		waitForElement(driver,3,DASBOARD_PAGE);
		Assert.assertEquals(DASBOARD_PAGE.getText(), "Dashboard", "Page not found");
	}

	public void ClickBankandCash() {
		BANK_CASH.click();
	}

	public void ClickNewAccount() {
		NEW_ACCOUNT.click();


	

		
	}
	
}