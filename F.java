package B;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class F {
	@Test
	public void a() {
		System.setProperty("webdrvier.chrome.driver",
				"C:\\Users\\apple\\Desktop\\SS\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		String a=driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(a);
	String b=	driver.getTitle();
	System.out.println(b);
		
	}

}
