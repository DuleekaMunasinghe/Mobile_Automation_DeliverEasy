package Package1;

import static org.junit.Assert.*;

import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class TestDeliverEasyApp {
	AndroidDriver driver;

	@Before
	public void setUp() throws Exception {
		@SuppressWarnings({ "deprecation", "unused" })
		URL url = new URL("http://localhost:4723/wd/hub");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "10");
		capabilities.setCapability("appActivity", "nz.co.delivereasy.MainActivity");
		capabilities.setCapability("appPackage", "nz.co.delivereasy");

		driver = new AndroidDriver(url, capabilities);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.getSessionId());
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("=================");
//		driver.close();
		
	}

	@Test
	public void test() {
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"address\"]")).sendKeys("11 Percy Kinsman Cresent");
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"address\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"11 Percy Kinsman CrescentRiverstone Terraces, Upper Hutt\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Restaurant\"]")).click();
		
		List<WebElement> APIDemoList = driver.findElements(By.xpath("//android.widget.TextView"));
		scrollUpText lib = new scrollUpText();
		lib.scrollTillElement("Aroy Thai (Upper Hutt)", driver);
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Aroy Thai (Upper Hutt)\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		System.out.println("++++++++++++++++++++");

		List<WebElement> APIDemoList1 = driver.findElements(By.xpath("//android.widget.TextView"));
		scrollUpText lib1 = new scrollUpText();
		lib1.scrollTillElement("Chicken Skewers (4pcs)", driver);
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Chicken Skewers (4pcs)\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Prawn Spring Rolls (5pcs)\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//android.widget.TextView[@text='grated vegetables, glass noodles, sweet chilli sauce (deep fried)']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"View cart\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"View cart\"]")).click();
		

	}

}
