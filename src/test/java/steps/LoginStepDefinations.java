package steps;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Page.AddNewAccountPage;
import Page.DashboardPage;
import Page.DatabasePage;
import Page.LoginPage;
import Util.BrowserFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinations {
	WebDriver driver;
	LoginPage loginpage;
	DashboardPage dashboardpage;
	AddNewAccountPage addnewaccountpage;

	@Given("^User is in the loginpage$")
	public void User_is_in_the_loginpage() {
		driver = BrowserFactory.init();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		addnewaccountpage = PageFactory.initElements(driver, AddNewAccountPage.class);
		dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
		driver.get("https://techfios.com/billing/?ng=admin/");

	}

	@When("^User enter the login information as \"([^\"]*)\"$")
	public void user_enter_the_login_information_as(String username) {
		loginpage.insertusername(username);
	}

	@When("^User enter the password information as \"([^\"]*)\"$")
	public void user_enter_the_password_information_as(String password) {
		loginpage.insertpassword(password);
	}

	@When("^User click login button$")
	public void user_click_login_button() {
		loginpage.clickonSigninField();
	}

	@When("^User enter the login information from database$")
	public void User_enter_the_login_information_from_database() throws ClassNotFoundException, SQLException {

		loginpage.insertusername(DatabasePage.getData("username"));
	}

	@When("^User enter the password information from database$")
	public void User_enter_the_password_information_from_database() throws ClassNotFoundException, SQLException {
		loginpage.insertpassword(DatabasePage.getData("password"));
	}

	@When("^user enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_the_and(String username, String password) {
		loginpage.enterCredentials(username, password);

	}

	@Then("^User land on login Page$")
	public void user_land_on_login_Page() {

	}

	@Then("^User click on Bank and Cash button$")
	public void user_click_on_Bank_and_Cash_button() {
		dashboardpage.ClickBankandCash();
	}

	@Then("^User click on New Account$")
	public void user_click_on_New_Account() {
		dashboardpage.ClickNewAccount();
	}

	@Then("^User can add the information \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_can_add_the_information_and_and_and_and_and_and(String accountTittle, String Description,
			String initialBalance, String accountNumber, String contactPerson, String phoneNumber, String internetUrl) {
		addnewaccountpage.insertaccounttitlefield(accountTittle);
		addnewaccountpage.insertdescriptionfield(Description);
		addnewaccountpage.insertinitialbalancefield(initialBalance);
		addnewaccountpage.insertaccountnumberfield(accountNumber);
		addnewaccountpage.insertcontactpersonfield(contactPerson);
		addnewaccountpage.insertphonenumberfield(phoneNumber);
		addnewaccountpage.insertinterneturl(internetUrl);

	}

	@Then("^User click submit button$")
	public void user_click_submit_button() {

		addnewaccountpage.clicksubmitbutton();
		
		
		BrowserFactory.teardown();
	}
}