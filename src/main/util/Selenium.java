public class Selenium {
	
	private WebDriver driver;
	
	public Selenium (){
		driver = new WebDriver();
	}
	
	/**
	* Navigate to specified URL.
	* @param url to navigate to.
	**/
	public void goToUrl(String url) {
        driver.get(url);
    }
	
	/**
     * Simulates typing keys into the specified xpath
     *
     * @param xpath xpath of text field to send keys to
     * @param keys  keys to send to xpath
     */
    public void sendKeys(String xpath, String keys) {
        driver.findElement(By.xpath(xpath)).sendKeys(keys);
    }
	
	/**
     * Clicks the specified xpath.
     * Assume that the click function simulates a left mouse click.
     *
     * @param xpath xpath to click
     */
    public void clickByXpath(String xpath) {
        click(By.xpath(xpath));
    }
	
}