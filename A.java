package D;

import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	WebDriver driver;
	@Test
	public void a() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\apple\\Desktop\\SS\\chromedriver.exe")		; 
   driver=new ChromeDriver(); 
   driver.manage().window().maximize();
   driver.get("https://www.flipkart.com/");
   List <WebElement> m=  driver.findElements(By.xpath("//input"));
   System.out.println(m.size());
   
		
	}

}
