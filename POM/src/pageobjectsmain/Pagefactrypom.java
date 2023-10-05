package pageobjectsmain;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactoryFinder;

public class Pagefactrypom {

	
	
	@FindBy(how = How.NAME,using = "email")
	public static WebElement username;
	@FindBy(name="password")
	public static WebElement password;
	@FindBy(id="submitBTN")
	public static WebElement loginbutton;
}
