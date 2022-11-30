package fdxlk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {

	@FindBy(xpath="//div[.='login']")
	
	private WebElement ele;
  public Pom (WebDriver driver)
 
	{
		PageFactory.initElements(driver, this);
		
	}
	
public void login_button()

{
	ele.click();
}
		
		
	
}
