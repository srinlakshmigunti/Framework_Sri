package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JRINewTest {
  @Test
  public void f() throws Exception {
	  WebDriver driver;

		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(" https://www.justrechargeit.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("txtUserName")).sendKeys("snlg0308@gmail.com");
		driver.findElement(By.id("txtPasswd")).sendKeys("123456");
		driver.findElement(By.id("txtCaptcha"));
		driver.findElement(By.name("imgbtnSignin")).click();
		driver.quit();
		

}
  }
  

