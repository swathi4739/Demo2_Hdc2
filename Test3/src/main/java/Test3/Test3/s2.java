package Test3.Test3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class s2 {

	public static WebDriver getDriver(String br) {
		// TODO Auto-generated method stub
if(br.contentEquals("CRM"))
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\Documents\\Selenium\\BrowserDrivers\\chromedriver.exe");
	return new ChromeDriver();
}
else if(br.contentEquals("IEE"))
{
	System.setProperty("webdriver.IE.driver","‪C:\\Users\\Public\\Documents\\Selenium\\BrowserDrivers\\IEDriverServer.exe");
	return new InternetExplorerDriver();
}
else if(br.contentEquals("FF"))
{
	System.setProperty("webdriver.gecko.driver","‪‪C:\\Users\\Public\\Documents\\Selenium\\BrowserDrivers\\geckodriver.exe");
	return new FirefoxDriver();
}
else
return null;

}
	}


