package login;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cg.model.LoginPageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefN {
	LoginPageFactory loginPage;
	public StepDefN() {
		loginPage = new LoginPageFactory();
	}
	WebDriver driver;
	@Given("^User is on Login Page$")
	public void user_is_on_Login_Page() throws Throwable {
		//System.setProperty("webdriver.chrome.driver", "D:\\BDD");
		driver = new FirefoxDriver();
		driver.get("D:\\BDD\\HotelBookingDemo\\login.html");
		loginPage = new LoginPageFactory(driver);
		System.out.println("Page Loaded in Browser");
	}

	@When("^username and password is blank$")
	public void username_and_password_is_blank() throws Throwable {
		WebElement userNameTxt = driver.findElement(By.name("userName"));
		userNameTxt.sendKeys("");
		WebElement loginBtn = driver.findElement(By.className("btn"));
		loginBtn.click();
	}

	@Then("^Display error message 'Please enter Username'$")
	public void display_error_message_Please_enter_Username() throws Throwable {
		WebElement divEle = driver.findElement(By.id("userErrMsg"));
		String actualErrorMsg = divEle.getText();
		String expErrorMsg = "* Please enter userName.";
		Assert.assertEquals(expErrorMsg, actualErrorMsg);
	}
	@When("^username is given but password is blank$")
	public void username_is_given_but_password_is_blank() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//    throw new PendingException();
		WebElement userTxt = driver.findElement(By.name("userName"));
		WebElement pwdTxt = driver.findElement(By.name("userPwd"));
		WebElement loginBtn = driver.findElement(By.className("btn"));
		userTxt.sendKeys("Swetha");
		pwdTxt.sendKeys("");
		loginBtn.click();

	}

	@Then("^Display error message 'Please enter password'$")
	public void display_error_message_Please_enter_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//	    throw new PendingException();
		WebElement divEle = driver.findElement(By.id("pwdErrMsg"));
		String actualErrorMsg = divEle.getText();
		String expErrorMsg = "* Please enter password.";
		Assert.assertEquals(expErrorMsg, actualErrorMsg);
	}
	@When("^username and password are invalid$")
	public void username_and_password_are_invalid() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//    throw new PendingException();
		WebElement userTxt = driver.findElement(By.name("userName"));
		WebElement pwdTxt = driver.findElement(By.name("userPwd"));
		WebElement loginBtn = driver.findElement(By.className("btn"));
		userTxt.sendKeys("swetha");
		pwdTxt.sendKeys("swetha");
		loginBtn.click();
	}

	@Then("^Display alert message 'Invalid login'$")
	public void display_alert_message_Invalid_login() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//	    throw new PendingException();
		String actualErrorMsg = driver.switchTo().alert().getText();
		String expErrorMsg = "Invalid login! Please try again!";
		Assert.assertEquals(expErrorMsg, actualErrorMsg);
	}
	@When("^username and password are valid$")
	public void username_and_password_are_valid() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
		WebElement userTxt = driver.findElement(By.name("userName"));
		WebElement pwdTxt = driver.findElement(By.name("userPwd"));
		WebElement loginBtn = driver.findElement(By.className("btn"));
		userTxt.sendKeys("Swetha");
		pwdTxt.sendKeys("Swetha");
		loginBtn.click();
	}

	@Then("^go to registration form$")
	public void go_to_registration_form() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
		driver.navigate().to("D:\\BDD\\HotelBookingDemo\\hotelbooking.html");
	}
	@Given("^User is on Hotelbooking page$")
	public void user_is_on_Hotelbooking_page() throws Throwable {
		driver=new FirefoxDriver();
		driver.get("D:\\BDD\\HotelBookingDemo\\hotelbooking.html");
		System.out.println("page loaded in browser");

	}

	@When("^firstname is blank$")
	public void firstname_is_blank() throws Throwable {
		WebElement firstName=driver.findElement(By.id("txtFirstName"));
		firstName.sendKeys("");
		WebElement submitBtn=driver.findElement(By.id("btnPayment"));
		submitBtn.click();

	}

	@Then("^Display alertbox 'Please enter first name'$")
	public void display_alertbox_Please_enter_first_name() throws Throwable {
		String actErrMsg=driver.switchTo().alert().getText();
		String expErrMsg="Please fill the First Name";
		Assert.assertEquals(expErrMsg, actErrMsg);
		driver.switchTo().alert().accept();
		driver.close();

	}

	@When("^lastname is blank$")
	public void lastname_is_blank() throws Throwable {
		WebElement firstName=driver.findElement(By.id("txtFirstName"));
		firstName.sendKeys("Swetha");
		WebElement lastName=driver.findElement(By.id("txtLastName"));
		lastName.sendKeys("");
		WebElement submitBtn=driver.findElement(By.id("btnPayment"));
		submitBtn.click();


	}

	@Then("^Display alertbox 'Please enter last name'$")
	public void display_alertbox_Please_enter_last_name() throws Throwable {
		String actErrMsg=driver.switchTo().alert().getText();
		String expErrMsg="Please fill the Last Name";
		Assert.assertEquals(expErrMsg, actErrMsg);
		driver.switchTo().alert().accept();
		driver.close();

	}
	@When("^email is blank$")
	public void email_is_blank() throws Throwable {
		WebElement firstName=driver.findElement(By.id("txtFirstName"));
		firstName.sendKeys("Swetha");
		WebElement lastName=driver.findElement(By.id("txtLastName"));
		lastName.sendKeys("Panga");
		WebElement eMail=driver.findElement(By.id("txtEmail"));
		eMail.sendKeys("");
		WebElement submitBtn=driver.findElement(By.id("btnPayment"));
		submitBtn.click();

	}

	@Then("^Display alertbox 'Please enter email'$")
	public void display_alertbox_Please_enter_email() throws Throwable {
		String actErrMsg=driver.switchTo().alert().getText();
		String expErrMsg="Please fill the Email";
		Assert.assertEquals(expErrMsg, actErrMsg);
		driver.switchTo().alert().accept();
		driver.close();

	}
	@When("^email is invalid$")
	public void email_is_invalid() throws Throwable {
		WebElement firstName=driver.findElement(By.id("txtFirstName"));
		firstName.sendKeys("Swetha");
		WebElement lastName=driver.findElement(By.id("txtLastName"));
		lastName.sendKeys("Panga");
		WebElement eMail=driver.findElement(By.id("txtEmail"));
		eMail.sendKeys("xyz*jhx.com");
		WebElement submitBtn=driver.findElement(By.id("btnPayment"));
		submitBtn.click();


	}

	@Then("^Display alertbox 'Please enter valid email id'$")
	public void display_alertbox_Please_enter_valid_email_id() throws Throwable {
		String actErrMsg=driver.switchTo().alert().getText();
		String expErrMsg="Please enter valid Email Id.";
		Assert.assertEquals(expErrMsg, actErrMsg);
		driver.switchTo().alert().accept();
		driver.close();

	}
	@When("^mobile number is blank$")
	public void mobile_number_is_blank() throws Throwable {
		WebElement firstName=driver.findElement(By.id("txtFirstName"));
		firstName.sendKeys("Swetha");
		WebElement lastName=driver.findElement(By.id("txtLastName"));
		lastName.sendKeys("Panga");
		WebElement eMail=driver.findElement(By.id("txtEmail"));
		eMail.sendKeys("pangaswethareddy@gmail.com");
		WebElement mobNum=driver.findElement(By.id("txtPhone"));
		mobNum.sendKeys("");

		WebElement submitBtn=driver.findElement(By.id("btnPayment"));
		submitBtn.click();

	}

	@Then("^Display alertbox 'Please enter mobile number'$")
	public void display_alertbox_Please_enter_mobile_number() throws Throwable {
		String actErrMsg=driver.switchTo().alert().getText();
		String expErrMsg="Please fill the Mobile No.";
		Assert.assertEquals(expErrMsg, actErrMsg);
		driver.switchTo().alert().accept();
		driver.close();

	}

	@When("^mobile number is invalid$")
	public void mobile_number_is_invalid() throws Throwable {
		WebElement firstName=driver.findElement(By.id("txtFirstName"));
		firstName.sendKeys("Swetha");
		WebElement lastName=driver.findElement(By.id("txtLastName"));
		lastName.sendKeys("Panga");
		WebElement eMail=driver.findElement(By.id("txtEmail"));
		eMail.sendKeys("pangaswethareddy@gmail.com");
		WebElement mobNum=driver.findElement(By.id("txtPhone"));
		mobNum.sendKeys("9245665");

		WebElement submitBtn=driver.findElement(By.id("btnPayment"));
		submitBtn.click();

	}

	@Then("^Display alertbox 'Please enter valid mobile number'$")
	public void display_alertbox_Please_enter_valid_mobile_number() throws Throwable {
		String actErrMsg=driver.switchTo().alert().getText();
		String expErrMsg="Please enter valid Contact no.";
		Assert.assertEquals(expErrMsg, actErrMsg);
		driver.switchTo().alert().accept();
		//driver.close();

	}



}
