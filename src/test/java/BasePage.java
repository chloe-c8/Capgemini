import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	@Test
	public void goToGoogleHomepage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "/C:/Users/Nick/Documents/chromedriver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		driver.wait();
		driver.quit();


	}

}
