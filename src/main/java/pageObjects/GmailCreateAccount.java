package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GmailCreateAccount {
	private final WebDriver driver;
	private By firstname = By.id("FirstName");
	private By passwd = By.id("Passwd");
	private By passwdagain = By.id("PasswdAgain");
	private By birthday = By.id("BirthDay");
	private By birthyear = By.id("BirthYear");
	private By recoveryPhoneNumber = By.id("RecoveryPhoneNumber");
	private By skipCaptcha = By.id("SkipCaptcha");
	private By submitButton = By.id("submitbutton");
	private By termsOfService = By.id("TermsOfService");
	
	public GmailCreateAccount(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterFirstName(String firstName){
		driver.findElement(firstname).sendKeys(firstName);
	}
	
	public void enterPassword(String password){
		driver.findElement(passwd).sendKeys(password);
	}
	
	public void enterPasswdAgain(String password){
		driver.findElement(passwdagain).sendKeys(password);
	}
	public void enterBirthDay(String BirthDay){
		driver.findElement(birthday).sendKeys(BirthDay);
	}
	
	public void enterBirthYear(String BirthYear){
		driver.findElement(birthyear).sendKeys(BirthYear);
	}
	public void enterRecoveryPhoneNumber(String recoveryPhNumber){
		driver.findElement(recoveryPhoneNumber).sendKeys(recoveryPhNumber);
	}
	
}
