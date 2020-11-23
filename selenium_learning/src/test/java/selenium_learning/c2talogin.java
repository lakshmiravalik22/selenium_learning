package selenium_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class c2talogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.get("https://c2ta.co.in/register/");
 driver.findElement(By.id("reg_username")).sendKeys("lakshmi");
 driver.findElement(By.id("reg_email")).sendKeys("lakshmiravali16s@gmail.com");
driver.findElement(By.id("reg_password")).sendKeys("Admin@123");
driver.findElement(By.xpath("//*[@id=\"post-306\"]/div/div/div/div/div/form/p/button")).click();

}
}




