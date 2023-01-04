package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HeaderTest {

	@Test
	public void login() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.researchgate.net/");
		driver.findElement(By.cssSelector("a[href*='login']")).click();
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("user@an.coms");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("useer348348384348384");
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).getText());
		//driver.quit();
		try {
			driver.close();
		} catch (Exception e) {
			
		}
	}
}
