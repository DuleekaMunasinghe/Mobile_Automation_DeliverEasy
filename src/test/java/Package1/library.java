package Package1;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class library {

	public static void ScrollUp(AndroidDriver driver) {
		int height = driver.manage().window().getSize().getHeight();
		int width = driver.manage().window().getSize().getWidth();

		int strtX = (int) (0.5 * width);
		int endX = strtX;

		int strtY = (int) (0.7 * height);
		int endY = (int) (0.1 * height);

		TouchAction action = new TouchAction(driver);

		action
		.longPress(PointOption.point(strtX, strtY))
		.moveTo(PointOption.point(endX, endY))
		.release()
		.perform();
	}


}
