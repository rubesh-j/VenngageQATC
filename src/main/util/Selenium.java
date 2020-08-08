import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Selenium {
	
	// Assume that the WebDriver manages browser actions.
	//private WebDriver driver;
	
	public Selenium (){
		
	}
	
	
	


	/**
	* Navigate to specified URL.
	* @param url to navigate to.
	**/
	public void goToUrl(WebDriver driver, String url) {
        driver.get(url);
    }
	
	/**
     * Simulates typing keys into the specified xpath
     *
     * @param xpath xpath of text field to send keys to
     * @param keys  keys to send to xpath
     */
    public void sendKeys(WebElement element, String keys) {
       // driver.findElement(By.xpath(xpath)).sendKeys(keys);
    	element.sendKeys(keys);
    }
	
	/**
     * Clicks the specified xpath.
     * Assume that the click function simulates a left mouse click.
     *
     * @param xpath xpath to click
     */
    public void click(WebElement element ) {
    	//driver.findElement(By.xpath(xpath)).click();
    	element.click();
    }
    
    public void waitForElement(WebDriver driver, WebElement element) {
    	WebDriverWait wait = new WebDriverWait(driver, 20);
    	wait.until(ExpectedConditions.visibilityOf(element));
    }
    
    public void sleep() {
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
}