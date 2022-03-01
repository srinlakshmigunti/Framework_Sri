package webdriver;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_SampleAssignment {

	public static void main(String[] args) throws Exception 
	{
      WebDriver driver;
      //Giving local Path
      
      System.setProperty("webdriver.chrome.driver",".\\browserdrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		//using link text
		//driver.findElement(By.linkText("Create new account")).click();
      //using partial link text
		  driver.findElement(By.partialLinkText("ew")).click();
		  Thread.sleep(3000);
		//Generating random month from 0 to 12 
		  Random r = new Random();
		  int monthNum = r.nextInt(11);
		  System.out.println("month Num is:" + monthNum);
		  
		  //select the month from drop down
		  Select month = new Select(driver.findElement(By.name("birthday_month")));
		  
		 // month.selectByVisibleText("Mar");
		  month.selectByIndex(monthNum);
		  //Generating date of the birth 
		  Random d = new Random();
		  int dob = d.nextInt(31);
		  System.out.println("Date of birth is:" + dob);
		  
		  Select dof = new Select(driver.findElement(By.name("birthday_day")));
		dof.selectByIndex(dob);
		
		Select bdy = new Select(driver.findElement(By.name("birthday_year")));
		bdy.selectByVisibleText("2021");
	}

}
