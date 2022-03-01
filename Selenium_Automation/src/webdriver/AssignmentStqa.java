package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentStqa {

	public static void main(String[] args) {
		WebDriver driver;
	      //Giving local Path
	      
	      System.setProperty("webdriver.chrome.driver",".\\browserdrivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.stqatools.com/demo/index.php");
			driver.manage().window().maximize();
			
driver.findElement(By.name("studentname")).sendKeys("SreeRam");
driver.findElement(By.id("fathername")).sendKeys("Dasaradha");
driver.findElement(By.id("paddress")).sendKeys("Ayodhya");
driver.findElement(By.name("personaladdress")).sendKeys("Same as above");

Select city = new Select(driver.findElement(By.name("City")));
city.selectByVisibleText("NEW DELHI");

Select course = new Select(driver.findElement(By.name("Course")));
course.selectByVisibleText("MCA");

Select dis = new Select(driver.findElement(By.name("District")));
dis.selectByVisibleText("UP");

Select state = new Select(driver.findElement(By.name("State")));
state.selectByVisibleText("NEW DELHI");
}
	

	}


