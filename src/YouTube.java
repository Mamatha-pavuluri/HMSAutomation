import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class YouTube {
	public static WebDriver driver;
	public static void OpenUrl()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		
		driver=new FirefoxDriver();
		driver.get("http://youtube.com");
		driver.manage().window().maximize();
		
	}
	public static void verifyLogin() throws Exception {
		driver.findElement(By.name("search_query")).sendKeys("Bhadra movie");
		Thread.sleep(5000);
		driver.findElement(By.name("search_query")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Bhadra Telugu")).click();
	}
	

	public static void main(String[] args) throws Exception{
		OpenUrl();
		verifyLogin();
	}

}
