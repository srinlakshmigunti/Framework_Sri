package webdriver;
   import org.openqa.selenium.By;
   import org.openqa.selenium.WebDriver;
   import org.openqa.selenium.chrome.ChromeDriver;
 public class AssignmetJRIt {
	public static void main(String[] args) {
     WebDriver driver;
	  String path = ".\\browserdrivers\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", path);
		 driver = new ChromeDriver();
		    driver.get("https://www.justrechargeit.com/");
		     driver.findElement(By.id("jriTop_signin9")).click();
		      driver.findElement(By.id("txtUserName")).sendKeys("asdfgh@abc");
		   	    driver.findElement(By.name("txtPasswd")).sendKeys("####");
    //driver.close();
	}

	
}
