import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TemplatesPage extends Selenium{
	
	WebDriver driver;
	// Add XPaths here
	@FindBy(xpath="(//div[contains(@class,'templates__btnGrn-')])[1]//button[@data-hover='Sign Up']")
	WebElement template;
	@FindBy(id="layouts")
	WebElement layOutsTemplate;
	@FindBy(xpath = "(//div[contains(@class,templates__hoverSettings--)[1]")
	WebElement preview;
	
	
	public TemplatesPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Create a function that clicks on the Sign Up button
	public SignUpPage clickTheSignUp() {
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		js.executeScript("arguments[0].click();", template);
		return new SignUpPage(driver);
	}


}