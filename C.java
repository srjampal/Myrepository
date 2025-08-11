package C;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class C {
	WebDriver driver;
	@Test
	public void a() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\apple\\Desktop\\SS\\chromedriver.exe")	;
	driver= new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
  List  <WebElement> m=	driver.findElements(By.xpath("(//table[@id='product'])[1]//th"));
     System.out.println(m.size());
     List  <WebElement> p=	driver.findElements(By.xpath("(//table[@id='product'])[1]//tr"));
   System.out.println("no of rows:"+p);
 WebElement  n=	driver.findElement(By.xpath("(//table[@id='product'])[1]//tr[2]/td[1]"));
	System.out.println(n);
	}

}
