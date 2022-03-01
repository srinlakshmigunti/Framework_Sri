package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLink_FB {
	public static void main(String[] args) {
     WebDriver driver;
     //.= project directory
     String path = ".\\browserdrivers\\chromedriver.exe";
    		 System.setProperty("webdriver.chrome.driver", path);
    		 driver = new ChromeDriver();
    		 driver.get("https://www.facebook.com/");
    		 
    		driver.findElement(By.id("email")).sendKeys("abcdefgh@qwer");
    		driver.findElement(By.name("pass")).sendKeys("####");
    		//click on Forgot Password Hyperlink	
    		 driver.findElement(By.linkText("Forgot password?")).click();
	}

}
