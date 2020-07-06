public class RegisterPage {
	
	private Selenium selenium;
	
	// Add XPaths here
	private static final String firstNameInput = "/html/body/div[1]/div/div/div/div[2]/div[2]/form/div[1]/div/div[1]/input";
	
	
	public RegisterPage(){
		this.selenium = Selenium();
	}
	
	// Create a function that takes an Account and simulates signing up using Selenium actions.
}