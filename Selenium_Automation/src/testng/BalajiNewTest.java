package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BalajiNewTest {
	@Test
	public void f() throws Exception {
		WebDriver driver;
		// open chrome browser
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// type the collegeweeklive signup url
		driver.get("https://collegeweeklive.com/go-signup");

		driver.findElement(By.name("firstName")).sendKeys("sriRam");
		driver.findElement(By.name("lastName")).sendKeys("Ravikula");
		driver.findElement(By.name("emailAddress")).sendKeys("Ayodhya@gmail.com");
		driver.findElement(By.name("phoneNumber")).sendKeys("9194945656");

		Select coc = new Select(driver.findElement(By.id("country")));
		coc.selectByVisibleText("INDIA");

		Select attendtype = new Select(driver.findElement(By.name("attendeeType")));

		attendtype.selectByVisibleText("Student Looking for Graduate Degree");
		Thread.sleep(2000);

		driver.findElement(By.id("questions[q_135]")).click();
		driver.findElement(By.id("questions[q_136]")).click();
		driver.findElement(By.id("questions[q_137]")).click();

	}
}
