package class_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mmtrip {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\virsundr\\eclipse-workspace\\assignment\\driver\\chromedriver.exe");
	ChromeDriver cdriver = new ChromeDriver();
	cdriver.get("https://www.makemytrip.com");
	Options op = cdriver.manage();
	Window win = op.window();
	win.maximize();
	WebElement fromCity = cdriver.findElement(By.cssSelector("input[id='fromCity']"));
	fromCity.click();

	Actions ac = new Actions(cdriver);
	// Method1 -1:
	// ac.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	// Method2 - given below
	ac.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN);
	ac.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN);

	// ac.sendKeys(Keys.ENTER).build().perform();
	ac.sendKeys(Keys.ENTER);
	// ac.build();
	ac.perform();

	WebElement toCity = cdriver.findElement(By.cssSelector("input[id='toCity']"));
	// ac.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
	// .sendKeys(Keys.ENTER).build().perform();
	ac.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

    }

}
