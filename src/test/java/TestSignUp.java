import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSignUp {
	
	private SignUpPage signUpPage;
	private TemplatesPage templates;
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		// Instantiate page objects here
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://venngage.com/templates");
	}
	
	@Test(dataProvider = "accounts")
	public void testSignUp(Account account){
		// Write test steps here
		templates = new TemplatesPage(driver);
		signUpPage = templates.clickTheSignUp();
		signUpPage.newSignUp(account);
		Assert.assertTrue(signUpPage.getGreetingText().contains("Let's personalize your page"));
	}
	
	@DataProvider(name="accounts")
	public Object[][] accountData() {
		Account account = new Account("QA", "test", "qa.testframework@venngage,com", "123456");
		Object[][] data = new Object[][] {{account}};
		return data;
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
