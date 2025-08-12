package D;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;
import org.testng.util.TimeUtils;

public class B {
	WebDriver driver;
	@Test
	public void a() throws IOException {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\apple\\Desktop\\SS\\chromedriver.exe")		; 
		   driver=new ChromeDriver(); 
		   driver.manage().window().maximize();
		   driver.get("https://www.flipkart.com/");
		   File a= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   File b= new File("C:\\Users\\apple\\Desktop\\New folder\\m.jpg");
		   FileHandler.copy(a, b);	
		 List  <WebElement> d=  driver.findElements(By.xpath("//a"));
		 System.out.println(d.size());
	}

}
