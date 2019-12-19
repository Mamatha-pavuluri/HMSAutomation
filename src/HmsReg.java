import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.openqa.selenium.support.ui.Select;

public class HmsReg {
public static WebDriver driver;
public static void OpenUrl()
{
	System.setProperty("webdriver.gecko.driver", "D:\\\\Selenium\\\\geckodriver.exe");
driver=new FirefoxDriver();
driver.get("http://www.seleniumbymahesh.com//");
driver.manage().window().maximize();
}

public static void verifyLogin()
{
driver.findElement(By.linkText("HMS")).click();
driver.findElement(By.name("username")).sendKeys("admin");
driver.findElement(By.name("password")).sendKeys("admin");
driver.findElement(By.name("submit")).click();
//driver.findElement(By.name("passwod")).sendKeys(Keys.ENTER);
}
public  static void Register() throws Exception

{
driver.findElement(By.linkText("Registration")).click();
driver.findElement(By.linkText("Perminent Registration")).click();
new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Self");
new Select(driver.findElement(By.name("TITLE"))).selectByIndex(1);
driver.findElement(By.name("PNT_NAME")).sendKeys("Ganesh");
new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByIndex(5);
new Select(driver.findElement(By.name("RELATION"))).selectByValue("Brother");
driver.findElement(By.name("image")).sendKeys("D:\\Selenium\\@ Ganesh gi @.jpg");
driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("Aadhar");
driver.findElement(By.name("DOB")).sendKeys("01-02-1996");
driver.findElement(By.name("AGE")).sendKeys("25");
new Select (driver.findElement(By.name("NATIONALITY"))).selectByVisibleText("Indian");
new Select(driver.findElement(By.name("SEX"))).selectByVisibleText("Male");
new Select(driver.findElement(By.name("IS_MLC"))).selectByIndex(1);
new Select(driver.findElement(By.name("MTRL_STATUS"))).selectByVisibleText("Single");
driver.findElement(By.name("LAST_NAME")).sendKeys("Practice");
new Select(driver.findElement(By.name("EDUCATION"))).selectByVisibleText("B.Tech");
new Select(driver.findElement(By.name("RELIGION"))).selectByVisibleText("Hindu");
new Select(driver.findElement(By.name("OCCUPATION"))).selectByVisibleText("Employee");
new Select(driver.findElement(By.name("BLOOD_GRP_CODE"))).selectByVisibleText("B+");
new Select(driver.findElement(By.name("PLANGUAGE"))).selectByVisibleText("Telugu");
new Select(driver.findElement(By.name("CITIZENSHIP"))).selectByVisibleText("Indian");
new Select(driver.findElement(By.name("SC_PROOF"))).selectByVisibleText("No");
driver.findElement(By.name("ADDRESS1")).sendKeys("Nellore");
driver.findElement(By.name("MOBILE_NO")).sendKeys("9898982345");
new Select(driver.findElement(By.name("COUNTRY_CODE"))).selectByVisibleText("India");
driver.findElement(By.name("ZIP")).sendKeys("500038");

new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Brother");
driver.findElement(By.name("image")).sendKeys("D:\\Selenium\\@ Ganesh gi @.jpg");
driver.findElement(By.name("submit")).click();
driver.switchTo().alert().accept();
Thread.sleep(8000);


}
public static void LogOut() throws Exception {
	driver.findElement(By.linkText("Logout")).click();
} 
	public static void main(String[] args)throws Exception {
OpenUrl();
verifyLogin();
Register();
	LogOut();
	}
	

}
