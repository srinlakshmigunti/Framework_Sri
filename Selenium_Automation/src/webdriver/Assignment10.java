package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment10 {

	public static void main(String[] args)throws Exception {
		
WebDriver driver;
System.setProperty("webdriver.chrome.driver",".\\browserdrivers\\chromedriver.exe");
driver = new ChromeDriver();
driver.navigate().to("https://www.justrechargeit.com");
driver.manage().window().maximize();
driver.findElement(By.linkText("Create New Account")).click();
//wait statement
Thread.sleep(5000);
//driver.findElement(By.name("signup_name")).sendKeys("abcdef");
//driver.findElement(By.name("signup_mobileno")).sendKeys("9198989898");
//driver.findElement(By.name("signup_email")).sendKeys("snlg0308@gmail.com");
//driver.findElement(By.name("signup_password")).sendKeys("selenium");
//WebElement radio1=driver.findElement(By.id("checkbox1"));
//WebElement radio2=driver.findElement(By.id("checkbox"));
//radio1.click();
//radio2.click();


	}

}
