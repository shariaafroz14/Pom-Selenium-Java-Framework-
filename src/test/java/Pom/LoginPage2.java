package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	
	  //using page factory //
	
	 WebDriver driver;
	 // constructor
	 LoginPage2(WebDriver d)
	 {
		 driver=d;
		 //this method will create the web Element//
		 PageFactory.initElements(driver,this);
		 
	 }
	 
	 //identify web Elements//
	 
	 //identify user name
	 
	 @FindBy(id="user-name")
	 WebElement username;
	 
	 @FindBy(id="password")
	 WebElement password;
	 
	 @FindBy(id="login-button")
	 WebElement loginBtn;
	 
	 public void enterusername(String uname)
	    {
	    	username.sendKeys(uname);
	    }
	    public void enterPassword(String pwd)
	    
	    {
	    	password.sendKeys(pwd);
	    }
	   
		public void clickOnLoginBtn() {
			{
			loginBtn.click();

            }

		}
}