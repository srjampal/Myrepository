package A;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class a {
	
	  public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\apple\\Desktop\\AA\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://mvnrepository.com/");
			driver.manage().window().maximize();
		
	}

}
