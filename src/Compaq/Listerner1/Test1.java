package Compaq.Listerner1;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;




@Listeners(ListenerReport.class)
public class Test1 
{
@Test
public void searchProduct()
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\workspace\\JavaSelenium\\server\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.jdwilliams.co.uk/");
driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
Assert.assertTrue(true);
}

@Test
public void fbNotifications()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\workspace\\JavaSelenium\\server\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	Assert.assertTrue(true);
}


}
