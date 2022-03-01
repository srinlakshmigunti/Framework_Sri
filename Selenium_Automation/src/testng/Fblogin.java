package testng;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fblogin {
  @Test
  public void f() {
	  
	  WebDriver driver;
		
		//Chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//Edge driver
		System.setProperty("webdriver.edge.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new EdgeDriver();
		
		//Fireforx driver
		System.setProperty("webdriver.gecko.driver", " .\\browserdrivers\\chromedriver.exe\";");
		driver = new FirefoxDriver();		

		driver.navigate().to("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement>allhyperlink = driver.findElement((By.tagName("a"));
		System.out.println("np.of links:  " + allhyperlink.size());
		for (WebElement abc : allhyperlink) {
			System.out.println(abc.getText());
		}
		
		
  }
}
