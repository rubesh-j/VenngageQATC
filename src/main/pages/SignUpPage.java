import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends Selenium {
	
	@FindBy(id="user_first_name")
	WebElement firstName;
	@FindBy(id="user_last_name")
	WebElement lastName;
	@FindBy(id="user_email")
	WebElement email;
	@FindBy(id="user_password")
	WebElement password;
	@FindBy(id="btn_register")
	WebElement signUp;
	@FindBy(xpath = "//div[contains(@class,'styles__greeting--')]/h3")
	WebElement greetingText;
	WebDriver driver;
	// Add XPaths here
	private static final String firstNameInput = "/html/body/div[1]/div/div/div/div[2]/div[2]/form/div[1]/div/div[1]/input";
	
	
	public SignUpPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void newSignUp(Account account)
	{
		sendKeys(firstName, account.getFirstName());
		sendKeys(lastName, account.getLastName());
		sendKeys(email,account.getEmail());
		sendKeys(password,account.getPassword());
		click(signUp);
	}
	
	public String getGreetingText() {
		return greetingText.getText();
	}
	// Create a function that takes an Account and simulates signing up using Selenium actions. (Refer to Selenium.java)
	
	
}