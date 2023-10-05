package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjectsmain.Loginpagemodel;

public class LoginTestcase {

	@Test
	public void loginphppage() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chrome driver\\new\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
			 
	      driver.manage().window().maximize();
	
	        driver.get("https://www.phptravels.net/login");	
	        
	       
	        Loginpagemodel.userName(driver).sendKeys("user@phptravels.com");    //pomclass 
	        Loginpagemodel.Password(driver).sendKeys("demouser");
	         Loginpagemodel.loginButton(driver).click();
	        }
	
	
	
	
	
	
	
	
	
	
}
