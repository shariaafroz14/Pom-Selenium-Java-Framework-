package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver= new ChromeDriver();
		 
		 //create Object of loginPage//
		 
		 LoginPage2 LoginPg = new LoginPage2(driver);
		 
		 //open url//
		 
		 driver.get("https://www.saucedemo.com/");
		 LoginPg.enterusername("standard_user");
		 LoginPg.enterPassword("secret_sauce");
		 LoginPg.clickOnLoginBtn();
		 
	}
}
