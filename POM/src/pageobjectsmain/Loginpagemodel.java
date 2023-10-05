package pageobjectsmain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpagemodel {


   public static WebElement userName(WebDriver driver) {//static is used because its avoid dependency injection (we don't want to create object in main class page
                                                                                                //easily call Pom class class name
   return driver.findElement(By.name("email"));	
	}

	public static WebElement Password(WebDriver driver) {     //driver is passed from main class to here taken an this webelement because driver is initialize in main class

		return driver.findElement(By.name("password"));
	}
	public static WebElement loginButton(WebDriver driver) {
		return driver.findElement(By.id("submitBTN"));            //return is used beacause method is not void its an webelement method so we used void didnt return any thing

	}

}





