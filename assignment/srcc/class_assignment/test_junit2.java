package class_assignment;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test_junit2 {

    ChromeDriver cdriver = null;
    // test_junit registration = new test_junit();

    @BeforeClass
    public static void launch_browser_before_class() {
	System.out.println("Execution of before_Class");

    }

    @Before
    public void before() {
	System.out.println("Execution of before method");

	System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\virsundr\\eclipse-workspace\\assignment\\driver\\chromedriver.exe");
	cdriver = new ChromeDriver();
	cdriver.get("https://facebook.com");
	Options op = cdriver.manage();
	Window win = op.window();
	win.maximize();

    }

    @Test
    public void test_method() {
	System.out.println("Execution of test method");

	test_junit2 registration = new test_junit2();

	WebElement firstname = cdriver.findElement(By.cssSelector("input[id='u_0_l']"));
	firstname.sendKeys("Deepak");
	WebElement surname = cdriver.findElement(By.cssSelector("input#u_0_n"));
	surname.sendKeys("Sharma");
	WebElement emailormobile = cdriver.findElement(By.cssSelector("input#u_0_q"));
	emailormobile.sendKeys("automation#@gmail.com");
	WebElement e_confirmation = cdriver.findElement(By.cssSelector("input[id='u_0_t']"));
	e_confirmation.sendKeys("automation#@gmail.com");

	WebElement password = cdriver.findElement(By.cssSelector("input[name='reg_passwd__']"));
	password.sendKeys("automation@123");

	WebElement birthday_day = cdriver.findElement(By.cssSelector("select[aria-label='Day']"));
	registration.drop_down_birthday(birthday_day, "31");

	WebElement birthday_month = cdriver.findElement(By.cssSelector("select[aria-label='Month']"));
	registration.drop_down_birthday(birthday_month, "Oct");

	WebElement birthday_year = cdriver.findElement(By.cssSelector("select[aria-label='Year']"));
	registration.drop_down_birthday(birthday_year, "1977");

	WebElement gender_radio_1 = cdriver.findElement(By.cssSelector("input#u_0_6"));
	gender_radio_1.click();

	WebElement signup = cdriver.findElement(By.cssSelector("button#u_0_15"));
	if (signup.isDisplayed() & signup.isEnabled()) {
	    signup.click();
	    System.out.println("User is redirecting to it's dashboard");
	}

    }

    @After
    public void after() {
	System.out.println("This is after method");
    }

    @AfterClass
    public static void after_class() {
	System.out.println("This is after_Class method");
    }

    public void drop_down_birthday(WebElement birthdate, String visibletext) {
	Select birth_date = new Select(birthdate);
	birth_date.selectByVisibleText(visibletext);
    }

}
