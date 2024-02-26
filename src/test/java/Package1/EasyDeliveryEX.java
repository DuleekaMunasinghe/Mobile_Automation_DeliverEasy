package Package1;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.DriverManager;
import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class EasyDeliveryEX {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		@SuppressWarnings({ "deprecation", "unused" })
		URL url = new URL("http://localhost:4723/wd/hub");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "10");
		capabilities.setCapability("appActivity", "nz.co.delivereasy.MainActivity");
		capabilities.setCapability("appPackage", "nz.co.delivereasy");

		AndroidDriver driver = new AndroidDriver(url, capabilities);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.getSessionId());

//		driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"address\"]")).sendKeys("11 Adelaide Street Petone, Lower Hutt");
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"address\"]")).sendKeys("11 Percy Kinsman Cresent");
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"address\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"11 Percy Kinsman CrescentRiverstone Terraces, Upper Hutt\"]")).click();
//		driver.findElement(By.xpath("//android.widget.TextView[@text=\"11 Adelaide StreetPetone, Lower Hutt\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		driver.findElement(By.xpath("//android.widget.Button[@text=\"Search\"]")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.hideKeyboard();
//		driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"search_bar\"]")).sendKeys("Burger");
//		driver.findElement(By.xpath("(//android.widget.Button[@text=\"Search\"])[1]")).click();
//		

		List<WebElement> APIDemoList = driver.findElements(By.xpath("//android.widget.TextView"));
		scrollUpText lib = new scrollUpText();
		lib.scrollTillElement("Aroy Thai (Upper Hutt)", driver);
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Aroy Thai (Upper Hutt)\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		System.out.println("++++++++++++++++++++");
//		driver.findElement(By.xpath("//android.widget.TextView[@text=\"DIRTY BURGER PETONE\"]")).click();


		List<WebElement> APIDemoList1 = driver.findElements(By.xpath("//android.widget.TextView"));
		scrollUpText lib1 = new scrollUpText();
		lib1.scrollTillElement("Chicken Skewers (4pcs)", driver);
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Chicken Skewers (4pcs)\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("(//android.widget.TextView[@text=\"GF on request\"])[3]")).click();
		

		System.out.println("=================");
	}

}
