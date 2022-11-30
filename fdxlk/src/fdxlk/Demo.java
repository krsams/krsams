package fdxlk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		Pom p = new Pom (driver);
		p.login_button();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		p.login_button();
	}
		
		
		
		
	}

