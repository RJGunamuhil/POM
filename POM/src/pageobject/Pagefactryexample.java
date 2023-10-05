package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjectsmain.Loginpagemodel;
import pageobjectsmain.Pagefactrypom;

public class Pagefactryexample {

	
	
	
	
	
	
	
	
	@Test
	public void pagefactryex() {
		
			
			System.setProperty("webdriver.chrome.driver", "D:\\automation\\chrome driver\\new\\chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
				 
		      driver.manage().window().maximize();
		
		      driver.get("https://www.phptravels.net/login");
		   
	
		      PageFactory.initElements(driver, Pagefactrypom.class);//its avoid each and everytime driver given
		   
		     
		      Pagefactrypom.username.sendKeys("user@phptravels.com");    
		      Pagefactrypom.password.sendKeys("demouser");
		      Pagefactrypom.loginbutton.click();
		
		
		
		
		
		
	}
	
	
}
