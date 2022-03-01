package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Balagitemp_Assignment {

	public static void main(String[] args) {
		
		WebDriver driver;
	     //.= project directory
	     String path = ".\\browserdrivers\\chromedriver.exe";
	    		 System.setProperty("webdriver.chrome.driver", path);
	    		 driver = new ChromeDriver();
	    		 driver.navigate().to("https://tirupatibalaji.ap.gov.in/#/registration");
	    		 //driver.navigate().to("https://collegeweeklive.com/go-signup");
	    
	   driver.manage().window().maximize();
	   
	 driver.findElement(By.name("fName")).sendKeys("SriRam");	
	 //driver.findElement(By.name("lastName")).sendKeys("Ikswakula");
    // driver.findElement(By.id("phoneNumber")).sendKeys("9199887766");
	// driver.findElement(By.id("country")).sendKeys("UNITED STATES") ;
	    //driver.findElement(By.linkText("Terms and Conditions")).click();
     //driver.close();
	}

}
