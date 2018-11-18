package a;

import org.testng.asserts.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.*;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@Test
public class a {
	public void login ()
	{

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\MY\\SeleniumResources\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/");
		driver.findElement(By.name("uid")).sendKeys("mngr155951");
		driver.findElement(By.name("password")).sendKeys("rUgYpEz");
		driver.findElement(By.name("btnLogin")).click();


		List<WebElement> MenuList=driver.findElements(By.tagName("li"));
		for (WebElement li : MenuList)
		{
			if (li.getText().equals("New Customer")) 
			{
				li.click();
				break;
			}
		}

		WebElement customerName = driver.findElement(By.xpath("//input[@name='name']"));
		//WebDriverWait wait = new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.visibilityOf(customerName));
		customerName.sendKeys("Janani");

		driver.findElement(By.xpath("//input[@name='rad1'][2]")).click();
		driver.findElement(By.name("dob")).sendKeys("05102018");
		driver.findElement(By.name("addr")).sendKeys("No89 kandy road");
		driver.findElement(By.name("city")).sendKeys("colombo");
		driver.findElement(By.name("state")).sendKeys("Sri Lanka");
		driver.findElement(By.name("pinno")).sendKeys("123456");
		driver.findElement(By.name("telephoneno")).sendKeys("0112566651");
		driver.findElement(By.name("emailid")).sendKeys("janani4@test.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("sub")).click();

		WebElement sucessmsg=driver.findElement(By.xpath("//input[@class='heading3']"));
		if(sucessmsg.equals("Customer Registered Successfully!!!"))
		{
			System.out.println("Account created Successfuly");
		}



	}  





	//driver.close();
}

