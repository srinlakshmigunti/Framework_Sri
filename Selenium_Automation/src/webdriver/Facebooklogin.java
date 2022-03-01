package webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {

	public static void main(String[] args) {
		//CREATE WEBDriver Object / Reference Name
//	open the chrome browser
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				              "C:\\workspace\\Selenium_Automation\\browserdrivers\\chromedriver.exe");
	driver = new ChromeDriver();
//	type the Fb Url
	driver.get("https://www.facebook.com/");
//	type user name and password
	driver.findElement(By.id("email")).sendKeys("abcdef");
	driver.findElement(By.name("pass")).sendKeys("####");
	
//	click on login button
	driver.findElement(By.name("login")).click();
//  click on account button to select logout button

	
	}

}
